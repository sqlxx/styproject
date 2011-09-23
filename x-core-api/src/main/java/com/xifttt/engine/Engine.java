package com.xifttt.engine;



public interface Engine {

	
	public Registration register(long id, ChannelService channelService) throws EngineException;
	
	public void addTask(TaskBean task, boolean enableImmediately) ;
	
	public void removeTask(TaskBean task) ;

	public void disableTask(long taskId) ;
	
	public void enableTask(long taskId) throws EngineException;
	
	public ConditionExpression createConditionExpression(ConditionBean conditionBean);
	
	public ActionExpression createActionExpression(ActionBean actionBean);

}
