package com.x.core.engine.internal;

import java.util.List;

public interface ServiceProviderDescriptor extends ExtServiceDescriptor{
	
	
	List<ChannelServiceDescriptor> getChannelServiceDescriptors();
}
