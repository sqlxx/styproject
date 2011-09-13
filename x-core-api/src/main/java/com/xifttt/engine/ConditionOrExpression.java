package com.xifttt.engine;

public class ConditionOrExpression implements ConditionExpression{

	private ConditionExpression leftOperand;
	private ConditionExpression rightOperand;

	public ConditionOrExpression(ConditionExpression leftOperand, ConditionExpression rightOperand) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;

	}

}
