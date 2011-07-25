package com.x.core.serviceprovider;

import com.x.core.engine.EventMatcher;


public interface Condition extends Product{
	/**
	 * Engine calls this method to get the matching rules that user
	 * just input via service provider's Requirement page.
	 * @param matcher
	 */
	public void setUpEventMatcher(EventMatcher matcher);


	

}
