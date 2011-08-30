package com.xifttt.engine;

public interface Registration {

	public void deregister();
	
	public void conditionSatisfied(long contionId);
	
	public void actionCompleted(long actionId, boolean succeeded, String message);
}
