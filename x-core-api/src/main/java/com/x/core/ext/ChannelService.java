package com.x.core.ext;

/**
 * Service represents for e.g. gmail while com.google is a service provider.
 * 
 * A Service instance serves a user; while a user can have multiple instances
 * of a Service. For example, a user may have two gmail accounts. Engine will request
 * ServiceFactory to create two instances of the gmail Service for the two gmail
 * accounts respectively.
 * 
 * @author Jimmy
 */
public interface ChannelService extends Product {
	

	/**
	 * @param symbolic name of the ConditionService that is requested by the user.
	 * @return null if activation is not required.
	 * For example, a timer Service can be used by anyone without activation.
	 */
	public Requirement getConditionServiceCreationRequirement(String symbolicName);
	/**
	 * @param symbolic name of the ActionService that is requested by the user.
	 * @return null if activation is not required.
	 */	
	public Requirement getActionServiceCreationRequirement(String symbolicName);
	/**
	 * @param symbolic name of the FeedService that is requested by the user.
	 * @return null if activation is not required.
	 */	
	public Requirement getFeedServiceCreationRequirement(String symbolicName);
	
	
	/**
	 * @param serviceId - {@link Requirement#submit(long, java.util.Map)}
	 * @return ConditionService that was created.
	 */
	public ConditionService retrieveConditionService(long serviceId);
	
	/**
	 * @param serviceId - {@link Requirement#submit(long, java.util.Map)}
	 * @return
	 */
	public ActionService retrievActionService(long serviceId);
	
	
	public FeedService retrievFeedService(long serviceId);


	
	
	
	
	
	
	
	
	
	
	//It seems not necessary.
	/**
	 * This method is called when the Engine determines that this
	 * Service instance is going to be kicked out from cache. 
	 * Usually it indicates a user has been logged out or session expired.
	 * 
	 * If the core wants to use this Service instance again later on
	 * {@link ServiceFactory#retrieveService(long)} will be called.
	
	public void release();
	 */

}
