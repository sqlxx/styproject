package com.x.core.engine.internal;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Jimmy
 *
 */
public interface Engine {
	
	 
	/**
	 * This method is called when user has been successfully authenticated.
	 * This authentication is managed and maintained by the Web module. 
	 * @param uid - user id.
	 * @return User that was created and associated with the uid.
	 */
	public User retrieveUser(long uid);
	/**
	 * Create a new user.
	 * @return User.
	 */
//	public User createUser(long uid);
	/**
	 * @return the descriptors of all available service providers.
	 */
	public List<ServiceProviderDescriptor> getServiceProviderDescriptors();
	
	/**
	 * 
	 * @param user
	 * @param serviceDescriptor
	 * @return
	 */
	public Requirement getChannelServiceCreationRequirement(
			User user, ChannelServiceDescriptor serviceDescriptor );
	
	

	/**
	 * Create a Task for a user.
	 * @param user
	 * @param trigger
	 * @param shot
	 * @return
	 */
	Task createTask(User user, Trigger trigger, Shot shot);
	
	Trigger createTrigger();
	
	Shot createShot();
	
}
