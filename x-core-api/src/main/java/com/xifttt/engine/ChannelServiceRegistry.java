package com.xifttt.engine;

/**
 * ChannelServices is supposed to interact this class.
 * 
 * @author Jimmy
 *
 */
public interface ChannelServiceRegistry {
	
	public Registration register(ChannelService channelService);

}
