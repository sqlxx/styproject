package com.xifttt.engine;

public class ConditionAndExpression implements ConditionExpression{

	private ConditionExpression leftOperand;
	private ConditionExpression rightOperand;

	public ConditionAndExpression(ConditionExpression leftOperand, ConditionExpression rightOperand) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

}
