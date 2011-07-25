package com.x.core.engine.ext;


public interface EventFactory {

	public String getEventSymbolicName();
	
	public Event createEvent();
}
