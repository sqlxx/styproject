package com.x.core.engine.internal;

import java.util.List;

public interface Shot {
	
	LogicalActionOpt perform(Action a);
	
	List<Action> getActions();
	
	List<LogicalActionOpt.Type> getRelationship();
}
