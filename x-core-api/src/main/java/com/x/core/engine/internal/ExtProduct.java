package com.x.core.engine.internal;

import java.util.Enumeration;
import java.util.Locale;
/**
 * 
 * @author Jimmy
 *
 */
public interface ExtProduct extends Resource {



	
	public Requirement getEditionRequirement();
	/**
	 * Usually this method returns null which indicates user doesn't
	 * have to fill additional forms to get the Product removed.
	 * 
	 */
	public Requirement getRemovalRequirement();
	/**
	 * 
	 * @param locales
	 * @return
	 */
	public String getDistiguisher(Enumeration<Locale> locales);
	

}
