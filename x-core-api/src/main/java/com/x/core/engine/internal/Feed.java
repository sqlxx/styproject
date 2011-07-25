package com.x.core.engine.internal;

public interface Feed extends ExtProduct{

	FeedService getFeedService();
	
	long getInfluencedConditionNumber();
	long getInfluencedTaskNumber();
	long getInfluencedActionNumber();
	long getInfluencedUserNumber();
}
