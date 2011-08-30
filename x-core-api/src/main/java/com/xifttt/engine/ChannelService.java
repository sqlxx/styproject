package com.xifttt.engine;

public interface ChannelService {
	
	/** 
	 * @return non-zero. 0 is reserved for N/A.
	 */
	public long getId();
	
	/**
	 * This method is called back by Engine.
	 * @param condition
	 */
	public void setUpConditoin(Condition condition);
	/**
	 * This method is called back by Engine.
	 * @param action
	 */
	public void runAction(Action action);

}
