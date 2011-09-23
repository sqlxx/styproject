package com.xifttt.engine;

public interface ActionExpression {
	
	public ActionExpression followedBy(ActionBean successFollower, ActionBean failureFollower);

}
