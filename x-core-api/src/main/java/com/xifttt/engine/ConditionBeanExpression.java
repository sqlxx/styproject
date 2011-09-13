package com.xifttt.engine;

public class ConditionBeanExpression implements ConditionExpression{

	private ConditionBean conditionBean;

	public ConditionBeanExpression(ConditionBean conditionBean){
		this.conditionBean = conditionBean;
	}
}
