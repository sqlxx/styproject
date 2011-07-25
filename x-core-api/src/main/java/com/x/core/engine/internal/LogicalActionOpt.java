package com.x.core.engine.internal;

public interface LogicalActionOpt {
	LogicalActionOpt ifSucceededThenPerform(Action a);
	LogicalActionOpt ifFailedThenPerform(Action a);
	
}
