package com.x.core.engine.internal;

public interface Trigger {

	LogicalConditionOpt where(Condition c);
	
	//TODO how to return the Condition list and show their relationship.
}
