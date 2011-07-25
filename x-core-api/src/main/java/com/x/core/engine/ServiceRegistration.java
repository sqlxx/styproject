package com.x.core.engine;

import java.util.List;

/**
 * Service can obtain a ServiceRegistration after calling 
 * {@link ServiceRegistry#register(com.x.core.service.Descriptor, com.x.core.service.ServiceDescriptor, com.x.core.service.ServiceFactory)}
 * @author Jimmy
 */
public interface ServiceRegistration {
	

	/**
	 * This method is supposed to be invoked when a Service is uninstalled
	 * from the OSGi platform.
	 */
	public void deregister();
	/**
	 * 
	 * @return List of EventFactory that is available to the Service
	 * to inject events into the Engine.
	 */
	public List<EventFactory> getEventFactories();
	
}
