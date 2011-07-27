package com.x.core.engine.internal;

public interface LogicalConditionOpt {
	
	public enum Type {
		And,
		Or
	}

	LogicalConditionOpt and(Condition c);
	LogicalConditionOpt or(Condition c);


	
}
