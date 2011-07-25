package com.x.core.ext;

import com.x.core.engine.ext.EventMatcher;


public interface Condition extends Product{
	/**
	 * Engine calls this method to get the matching rules that user
	 * just input via service provider's Requirement page.
	 * @param matcher
	 */
	public void setUpEventMatcher(EventMatcher matcher);


	

}
