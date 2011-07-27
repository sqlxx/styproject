package com.x.core.engine.internal;

import java.util.List;

public interface ChannelServiceDescriptor extends ExtServiceDescriptor{
	
	
	ServiceProviderDescriptor getParent();
	
	List<ConditionServiceDescriptor> getConditionServiceDescriptors();
	
	List<ActionServiceDescriptor> getActionServiceDescriptors();
	
	List<FeedServiceDescriptor> getFeedServiceDescriptors();
	

}
