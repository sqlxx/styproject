package com.x.core.engine.internal;

import java.util.Date;
import java.util.Map;

public interface Resource {

	long getId();
	
	/**
	 * Please call this method when user want to discard the created
	 * Product.
	 */
	public void destroy();
	
	public Date getLastModified();
	
	
	
}
