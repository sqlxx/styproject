package com.xifttt.engine;

import java.util.Map;

public interface ActionParam {

	long getConditionServiceId();
	
	Map<String, ?> getParams();
	
	
}
