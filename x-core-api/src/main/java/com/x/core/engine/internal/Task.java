package com.x.core.engine.internal;

import java.util.List;


public interface Task extends Resource {

	Trigger getTrigger();
	
	Shot getShot();
	
	List<TaskExecutionRecord> getExecutionHistory();
	
	boolean isActive();
	
	void setActive(boolean active);
	
	
	
}
