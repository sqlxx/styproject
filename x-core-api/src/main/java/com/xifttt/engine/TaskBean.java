package com.xifttt.engine;


/**
 * 
 * 
 * @author Jimmy
 *
 */
public class TaskBean {
	
	private long conditionCombinationWindow;
	
	private long livePeriod;
	
	private com.xifttt.engine.ConditionExpression conditionExpression;
	private com.xifttt.engine.ActionExpression actionExpression;
	
	

	/**
	 * @param livePeriod seconds
	 */
	public void setLivePeriod(long livePeriod) {
		this.livePeriod = livePeriod;
	}
	
	 
	public long getLivePeriod(){
		return this.livePeriod;
	}
	


	
	


	
	
	public com.xifttt.engine.ConditionExpression getConditionExpression() {
		return conditionExpression;
	}


	public void setConditionExpression(com.xifttt.engine.ConditionExpression conditionExpression) {
		this.conditionExpression = conditionExpression;
	}


	public com.xifttt.engine.ActionExpression getActionExpression() {
		return actionExpression;
	}


	public void setActionExpression(com.xifttt.engine.ActionExpression actionExpression) {
		this.actionExpression = actionExpression;
	}


 

}
