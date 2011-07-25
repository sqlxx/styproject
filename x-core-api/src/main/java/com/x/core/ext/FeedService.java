package com.x.core.ext;

/**
 * FeedService is for the user to provide events. 
 * Example: 
 * We may create a TrafficInfo Service where user can input traffic event 
 * e.g. car accident he just saw into the system. So the users that are 
 * interested at such event can be notified.
 * 
 * @author Jimmy
 *
 */
public interface FeedService extends Product {
	

	public Requirement getFeedCreationRequirement();
	
	
	public Feed retrieveFeed(long feedId);


}
