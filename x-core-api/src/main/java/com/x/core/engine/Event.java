package com.x.core.engine;

import java.util.List;

public interface Event {
	
	public String getSchemaSymbolicName();
	
	public List<EventField> getEventFields();
	
	
	
	
	void emit();

}
