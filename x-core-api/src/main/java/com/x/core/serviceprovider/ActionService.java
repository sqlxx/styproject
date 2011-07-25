package com.x.core.serviceprovider;

import java.util.List;

import com.x.core.engine.ActionArgumentProvider;


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
