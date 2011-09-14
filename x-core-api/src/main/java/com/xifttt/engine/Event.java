package com.xifttt.engine;

import java.util.Map;

public class Event {
	
	private long timestamp;

	private long channelServiceId;
	private long conditionServiceId;
	
	
	private Map<String, ?> params;
	
	public Event(long timestamp,
				 long channelServiceId, 
				 long conditionServiceId,
				 Map<String, ?> params){
		
		this.timestamp = timestamp;
		this.channelServiceId = channelServiceId;
		this.conditionServiceId = conditionServiceId;
		this.params = params;
	}

	public long getChannelServiceId() {
		return channelServiceId;
	}
	
	public long getConditionServiceId(){
		return conditionServiceId;
	}
	
	public Map<String, ?> getParams(){
		return params;
	}

}
