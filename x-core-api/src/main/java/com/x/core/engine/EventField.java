package com.x.core.engine;

import com.x.core.serviceprovider.EventFieldDefinition;
import com.x.core.serviceprovider.Value;

public interface EventField {

	EventFieldDefinition getEventFieldDefinition();
	
	public void setDisplayableValue(Value v);
	
	
	
}
