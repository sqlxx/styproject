package com.xifttt.engine;


public interface Engine {

	
	public Registration register(ChannelService channelService) ;
	
	public void setTask(Task task, boolean enableImmediately) ;
	
	public void unsetTask(Task task) ;

	public void disableTask(long taskId) ;
	
	public void enableTask(long taskId) ;

}
