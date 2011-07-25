package com.x.core.serviceprovider;

import java.net.URL;
import java.util.Map;
/**
 * Requirement usually represents a form that user needs to fill. For example,
 * when user wants to create a gmail Service, we needs to redirect
 * the user to the Google Open Authorization page. User will have to enter user
 * name, password and click grant access button etc. This is a Requirement.
 * Another example, when user wants to create a Condition on a timer, a page will be displayed to
 * let user fill the date, time etc. This page is a requirement.
 * 
 * NOTE: user may request the Requirement multiple times but without completing them; 
 * So there might be a number of created Requirement instances which never get
 * completed. If you keep references of the Requirement instances somewhere you might
 * have a memory leak.
 * 
 * 
 * 
 * @author Jimmy
 *
 */
public interface Requirement {

	
	/**
	 * 
	 * @param callbackUrl - after user submit the form service provider should
	 * guarantee that the callbackUrl is invoked.
	 * 
	 * Example: A user wants to create a gmail Service. Engine will pass in the
	 * callbackUrl to this method which in turn returns the URL of the Google
	 * Open Authorization page that user will be redirected to.
	 * 
	 * @return url that Engine should invoke to for the page of the Requirement.
	 * 
	 */
	public URL getUrl(URL callbackUrl);
	
	/**
	 * 
	 * @param reqId - the id that Engine wants to associate with the 
	 * Service, Condition or etc that is created for the Requirement.
	 * 
	 * @param params - the parameters that service provider sends back via the
	 * callbackUrl.
	 * @return RequirementCompletion - {@link RequirementCompletion}
	 */
	public RequirementCompletion submit(long reqId, Map<String, String> params);

	
}
