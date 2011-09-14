package com.xifttt.engine;

import java.util.Collection;

public interface ChannelService {
	
	
	
	/**
	 * This method is called back by Engine.
	 * @param condition
	 */
	public void setCondition(ConditionBean condition);
	/**
	 * This method is called back by Engine.
	 * @param condition
	 */
	public void unsetCondition(ConditionBean condition);
	/**
	 * This method is called back by Engine.
	 * @param action
	 */
	public void runAction(ActionBean action, Collection<Event> params);

}
