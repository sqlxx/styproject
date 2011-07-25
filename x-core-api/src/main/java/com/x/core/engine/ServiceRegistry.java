package com.x.core.engine;

import com.x.core.serviceprovider.Descriptor;
import com.x.core.serviceprovider.ServiceDescriptor;
import com.x.core.serviceprovider.ServiceFactory;

/**
 * Service provider uses this interface to register Services into
 * the Engine.
 * 
 * A service provider can have multiple Services which probably
 * don't come up at once. So new Services should be able to added
 * continuously. Engine would take care of the correlation as long
 * as the ServiceProviderDescriptor's symbolicName remains the same.
 * 
 * For example: Google is a service provider while gmail and gtalk 
 * can be two Services. They can be registered one after another weeks
 * later.
 *  
 * 
 * 
 * Upon registration Engine stores the information of the descriptor,
 * hence any modification on the descriptor later on won't propagate 
 * the changes to Engine unless register again.
 * 
 * ServiceRegistry is published as an OSGi service which can be looked
 * up by it's class name.
 * 
 * @author Jimmy
 */
public interface ServiceRegistry {

	/**
	 * Register a Service to the Engine.
	 * 
	 * @param serviceProviderDescriptor
	 * @param serviceDescriptor
	 * @param factory - Engine will use this to create Service for user.
	 * @return ServiceRegistration. 
	 */
	public ServiceRegistration register(
			Descriptor serviceProviderDescriptor,
			ServiceDescriptor serviceDescriptor, 
			ServiceFactory factory);
	
}
