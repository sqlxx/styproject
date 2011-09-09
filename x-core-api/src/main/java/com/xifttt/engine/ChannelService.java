package com.xifttt.engine;

import java.util.Collection;

public interface ChannelService {
	
	/** 
	 * @return non-zero. 0 is reserved for N/A.
	 */
	public long getId();
	
	/**
	 * This method is called back by Engine.
	 * @param condition
	 */
	public void setUpCondition(Condition condition);
	/**
	 * This method is called back by Engine.
	 * @param action
	 */
	public void runAction(Action action, Collection<ActionParam> params);

}
