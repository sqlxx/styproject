package com.x.core.engine.internal;

public interface LogicalActionOpt {

	
	public enum Type {
		IfSucceedThenPerform,
		IfFailedThenPerform,
		WhateverPerform
	}
	
	
	LogicalActionOpt ifSucceededThenPerform(Action a);
	LogicalActionOpt ifFailedThenPerform(Action a);
	LogicalActionOpt whateverPerform(Action a);
	
}
