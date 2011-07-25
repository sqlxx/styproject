package com.x.core.serviceprovider;

import com.x.core.engine.Event;

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
