package com.x.core.engine;

import com.x.core.serviceprovider.EventDefinition;

public interface EventFactory {

	public String getEventSymbolicName();
	
	public Event createEvent();
}
