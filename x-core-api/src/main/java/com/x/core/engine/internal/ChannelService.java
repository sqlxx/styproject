package com.x.core.engine.internal;




public interface ChannelService extends ExtService {	
	

	public Requirement getServiceCreationRequirement(
			ConditionServiceDescriptor descriptor);
	
	public Requirement getServiceCreationRequirement(
			ActionServiceDescriptor descriptor);

	public Requirement getServiceCreationRequirement(
			FeedServiceDescriptor descriptor);
	
	public ConditionService getCreatedConditionServices();
	
	public ActionService getCreatedActionServices();
	
	public FeedService getCreatedFeedServices();
}
