package com.x.core.serviceprovider;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @see com.x.core.engine.ServiceRegistry
 * @author Jimmy
 */
public interface ServiceDescriptor extends Descriptor, Serializable{
	
	/**
	 * @return symbolic name which is unique in the scope of service provider
	 * it belongs to.
	 */
	public String getSimbolicName();
	

	
	
	/**
	 * @return definition of the events that will be pushed to the Engine from
	 * this Service.
	 */
	public List<EventDefinition> getEventDefinitions();

	/** 
	 * @return descriptor of the ActionServices provided by this Service.
	 */
	public List<Descriptor> getActionServiceDescriptors();
}
