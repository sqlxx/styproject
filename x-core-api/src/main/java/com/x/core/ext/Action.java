package com.x.core.ext;

import java.util.List;

import com.x.core.engine.ext.ActionArgumentProvider;



public interface Action extends Product{

	
	/**
	 * This method is invoked by Engine when Trigger is matched.
	 * 
	 * @param arguments .
	 */
	public void perform(List<ActionArgumentProvider> arguments);
	


}
