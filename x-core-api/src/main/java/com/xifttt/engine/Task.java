package com.xifttt.engine;

import java.util.Collection;
/**
 * 
 * 
 * @author Jimmy
 *
 */
public class Task {
	
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
	


	/**
	 * @param conditionCombinationWindow seconds
	 */
	public void setConditionCombinationWindow(long conditionCombinationWindow) {
		this.conditionCombinationWindow = conditionCombinationWindow;
	}


	public long getConditionCombinationWindow(){
		return this.conditionCombinationWindow;
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
