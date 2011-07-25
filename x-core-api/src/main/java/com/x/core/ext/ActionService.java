package com.x.core.ext;

import java.util.List;

import com.x.core.engine.ext.ActionArgumentProvider;


public interface ActionService extends Product {
	
	

	/**
	 * @param arguments - that can be used when user is filling the Action's 
	 * Requirement form.
	 * 
	 * @return Requirement
	 */
	public Requirement getActionCreationRequirement(List<ActionArgumentProvider> arguments);
	

	public Action retrieveAction(long actionId);


}
