package com.xifttt.engine;

import java.util.Map;
/**
 * This interface is supposed to be implemented by the web layer.
 * 
 * @author Jimmy
 *
 */
public class ConditionBean {
	

	private long id;
	

	private long conditionServiceId;
	

	private long channelServiceId;
	

	public Map<String, ?> extraParams;
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
	 * <li>0 indicates Engine/ChannelService has to query the database to figure out the ConditionService id;</li>
	 * <li>non-zero: Engine can make use of the ConditionServiceId directly, which saves performance</li>
	 * 
	 */
	public long getConditionServiceId() {
		return conditionServiceId;
	}

	public void setConditionServiceId(long conditionServiceId) {
		this.conditionServiceId = conditionServiceId;
	}
	/**
	 * Optional
	 * 
	 * @return 
	 * <li>0 indicates Engine has to query the database to figure out the ChannelService id;</li>
	 * <li>non-zero: Engine can make use of the ChannelServiceId directly, which saves performance</li>
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
	 * The web layer might be able to collect the condition parameters
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
