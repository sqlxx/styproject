package com.x.core.engine.internal;

import java.util.List;

public interface Trigger {

	LogicalConditionOpt where(Condition c);
	
	List<Condition> getConditions();
	
	List<LogicalConditionOpt.Type> getRelationship();
	
}
