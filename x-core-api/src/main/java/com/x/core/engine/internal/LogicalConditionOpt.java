package com.x.core.engine.internal;

public interface LogicalConditionOpt {

	LogicalConditionOpt and(Condition c);
	LogicalConditionOpt or(Condition c);
	LogicalConditionOpt not(Condition c);
	
}
