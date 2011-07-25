package com.x.core.ext;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @see com.x.core.engine.ext.ServiceRegistry
 * @author Jimmy
 */
public interface ChannelServiceDescriptor extends ServiceDescriptor, Serializable{
	
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
	public List<ServiceDescriptor> getActionServiceDescriptors();
}
