package com.x.core.engine.ext;

import java.util.List;

public interface Event {
	
	public String getSymbolicName();
	
	public List<EventField> getEventFields();
	
	
	
	
	void emit();

}
