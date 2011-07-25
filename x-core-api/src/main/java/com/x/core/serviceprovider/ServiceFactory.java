package com.x.core.serviceprovider;




/**
 * Engine uses registered ServiceFactory to create the instances of Services.
 * 
 * @author Jimmy
 *
 */
public interface ServiceFactory {
	
	/**
	 * 
	 * @param serviceSymbolicName - the identifier of the Service.
	 * @return Requirement {@link Requirement} 
	 */
	public Requirement getServiceCreationRequirement(String serviceSymbolicName);

	/**
	 * 
	 * @param serviceId - {@link Requirement#submit(long, java.util.Map)} 
	 * @return Service that was created.
	 */
	public Service retrieveService(long serviceId);
	
	
}
