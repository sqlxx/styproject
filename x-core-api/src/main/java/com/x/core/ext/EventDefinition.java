package com.x.core.ext;

import java.util.Enumeration;
import java.util.List;
import java.util.Locale;

/**
 * This interface is user by Engine to figure out what kind of the Event that
 * the Service will provide.
 * 
 * @author Jimmy
 */
public interface EventDefinition {
	/**
	 * 
	 * @return symbolic name which is required to be unique within the scope
	 * of the Service.
	 */
	public String getSymbolicName();
	
	public String getName(Enumeration<Locale> locales);
	
	public List<EventFieldDefinition> getEventFieldDefinitions();
	
	public List<ServiceDescriptor> getConditionServiceDescriptors();
	
	public List<ServiceDescriptor> getFeedServiceDescriptors();

}
