package com.xifttt.engine;

import java.util.Map;

/**
 * This interface is supposed to be implemented by the web layer.
 * 
 * @author Jimmy
 *
 */
public interface Action {
	/** 
	 * @return non-zero. 0 is reserved for N/A.
	 */
	public long getId();
	
	/**
	 * Optional
	 * 
	 * @return 
	 * <li>0 indicates Engine/ChannelService has to query the database to figure out the ActionService id;</li>
	 * <li>non-zero: Engine can make use of the ActionService id directly, which saves performance</li>
	 * 
	 */
	public long getActionServiceId();
	
	/**
	 * Optional
	 * 
	 * @return 
	 * <li>0 indicates Engine has to query the database to figure out the ChannelService id;</li>
	 * <li>non-zero: Engine can make use of the ChannelService id directly, which saves performance</li>
	 * 
	 */
	public long getChannelServiceId();
	
	/**
	 * The extraParams will be passed to ChannelService.
	 * 
	 * The web layer might be able to collect the action parameters
	 * so that the ChannelService doesn't have to query the database
	 * again to retrieve the parameters, which saves performance.
	 * 
	 * 
	 * @return
	 */
	public Map<String, ?> getExtraParams();
}
