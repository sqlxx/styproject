package com.xifttt.engine;

public class ActionBeanExpression implements ActionExpression{

	private ActionBean actionBean;

	public ActionBeanExpression(ActionBean actionBean){
		this.actionBean = actionBean;
		
	}
}
