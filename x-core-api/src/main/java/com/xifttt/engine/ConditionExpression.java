package com.xifttt.engine;



public interface ConditionExpression {
	

	public ConditionExpression and(ConditionBean conditionBean, long combinationWindow);
	
	public ConditionExpression or(ConditionBean conditionBean);
	
	
	 
	

}
