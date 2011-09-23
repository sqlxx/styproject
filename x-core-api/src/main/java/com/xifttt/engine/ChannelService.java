package com.xifttt.engine;

import java.util.Collection;

public interface ChannelService {
	
	
	
	/**
	 * This method is called back by Engine.
	 * @param condition
	 */
	public void addCondition(ConditionBean condition);
	/**
	 * This method is called back by Engine.
	 * @param condition
	 */
	public void removeCondition(ConditionBean condition);
	
	public boolean validateCondition(ConditionBean condition);
	/**
	 * This method is called back by Engine.
	 * @param action
	 */
	public void runAction(ActionBean action, Collection<Event> params);
	
	public boolean validateAction(ActionBean action);

}
