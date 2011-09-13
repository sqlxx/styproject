package com.xifttt.engine;

import java.util.Map;

/**
 * 
 * 
 * @author Jimmy
 *
 */
public class ActionBean {
	

	private long id;
	

	private long actionServiceId;
	

	private long channelServiceId;
	

	private Map<String, ?> extraParams;
	
	/** 
	 * @return non-zero. 0 is reserved for N/A.
	 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	/**
	 * Optional
	 * 
	 * @return 
	 * <li>0 indicates Engine/ChannelService has to query the database to figure out the ActionService id;</li>
	 * <li>non-zero: Engine can make use of the ActionService id directly, which saves performance</li>
	 * 
	 */
	public long getActionServiceId() {
		return actionServiceId;
	}

	public void setActionServiceId(long actionServiceId) {
		this.actionServiceId = actionServiceId;
	}
	/**
	 * Optional
	 * 
	 * @return 
	 * <li>0 indicates Engine has to query the database to figure out the ChannelService id;</li>
	 * <li>non-zero: Engine can make use of the ChannelService id directly, which saves performance</li>
	 * 
	 */
	public long getChannelServiceId() {
		return channelServiceId;
	}

	public void setChannelServiceId(long channelServiceId) {
		this.channelServiceId = channelServiceId;
	}
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
	public Map<String, ?> getExtraParams() {
		return extraParams;
	}

	public void setExtraParams(Map<String, ?> extraParams) {
		this.extraParams = extraParams;
	}
	
	
	
}
