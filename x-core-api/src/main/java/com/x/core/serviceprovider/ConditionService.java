package com.x.core.serviceprovider;


public interface ConditionService extends Product {
	
	
	
	public Requirement getConditionCreationRequirement();
	
	public Condition retrieveCondition(long conditionId);
	
	
	
	
	
	/**
	 * This method is called when the core determines that this
	 * ConditionService instance is going to be kicked out from cache.
	 * 
	 * If the core wants to use this Service instance again later on
	 * {@link Service#retrieveService(long)} will be called.
	 */
	public void release();

}
