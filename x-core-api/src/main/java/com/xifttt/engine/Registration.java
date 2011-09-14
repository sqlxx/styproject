package com.xifttt.engine;

import java.util.Map;

public interface Registration {

	public void deregister();
	
	public void conditionSatisfied(long contionId, long conditionServiceId, Map<String, ?> outputParams);
	
	public void actionCompleted(long actionId, long actionServiceId, boolean succeeded, String message);
}
