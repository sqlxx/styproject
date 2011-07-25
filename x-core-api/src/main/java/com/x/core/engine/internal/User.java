package com.x.core.engine.internal;

import java.util.List;

public interface User extends Resource{


	
	public List<Task> getCreatedTasks();
	
	public List<Feed> getCreatedFeeds();
	
	public List<ChannelService> getCreatedChannelServices();
	
	
}
