package com.xifttt.engine;

public interface ActionExpression {
	
	public ActionExpression onSuccessRun(ActionBean actionBean);
	
	public ActionExpression onFailureRun(ActionBean actionBean);

}
