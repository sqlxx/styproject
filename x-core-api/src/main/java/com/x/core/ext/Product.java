package com.x.core.ext;

import java.util.Enumeration;
import java.util.Locale;
/**
 * Product represents a Service, Condition and etc.
 * 
 * 
 * @author Jimmy
 *
 */
public interface Product {
	
	/**
	 * This method is invoked when user is trying to modify a Product that was
	 * created.
	 *  
	 * @return null if it cannot be edited. e.g. a user feeding event cannot be
	 * edited once it's created.
	 */
	public Requirement getEditionRequirement();
	/**
	 * This method is invoked when user is trying to remove a Product that was
	 * created.
	 *  
	 * @return null if don't need user's further input.
	 */
	public Requirement getRemovalRequirement();
	
	public String getDistiguisher(Enumeration<Locale> locales);
	
	public void destroy();
}
