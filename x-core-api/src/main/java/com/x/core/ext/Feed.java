package com.x.core.ext;

import com.x.core.engine.ext.Event;

/**
 * A Feed equals to an event that entered by user via FeedService.
 * @author Jimmy
 */
public interface Feed extends Product{
	/**
	 * This method is called by Engine to ask the service provider
	 * to fill the event that was just entered by the user.
	 * @param event
	 */
	public void setUpEvent(Event event );
}
