package com.x.core.serviceprovider;

import java.util.Enumeration;
import java.util.Locale;

import com.x.core.engine.CompletionState;

/**
 * @see Requirement
 * @author Jimmy
 *
 */
public interface RequirementCompletion {
	
	public CompletionState getCompletionState();
	/**
	 * 
	 * @param locales - returned from user's browser.
	 * @return message based on the locales listed in the order of user preference.
	 */
	public String getCompletionMessage(Enumeration<Locale> locales);
	/**
	 * This method will be called if {@link CompletionState} is Succeeded.
	 * @return Product - it can be a instance of Service, Condition or etc.
	 */
	public Product getProduct();
	
	
}
