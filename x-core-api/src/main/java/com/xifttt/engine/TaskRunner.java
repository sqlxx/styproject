package com.xifttt.engine;

/**
 * Web layer is supposed to interact with this class for the task execution.
 * 
 * @author Jimmy
 *
 */
public interface TaskRunner {
	
	public void run(Task task);
	public void disable(long taskId);
	public void enable(long taskId);

}
