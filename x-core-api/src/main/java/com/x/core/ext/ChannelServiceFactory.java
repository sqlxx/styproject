package com.x.core.ext;




/**
 * Engine uses registered ServiceFactory to create the instances of Services.
 * 
 * @author Jimmy
 *
 */
public interface ChannelServiceFactory {
	
	/**
	 * 
	 * @param serviceSymbolicName - the identifier of the Service.
	 * @return Requirement {@link Requirement} 
	 */
	public Requirement getChannelServiceCreationRequirement(String serviceSymbolicName);

	/**
	 * 
	 * @param serviceId - {@link Requirement#submit(long, java.util.Map)} 
	 * @return Service that was created.
	 */
	public ChannelService retrieveChannelService(long serviceId);
	
	
}
