package com.x.core.engine.internal;

public interface Shot {
	
	LogicalActionOpt perform(Action a);
	
	//TODO how to return the Action list and show their relationship.
}
