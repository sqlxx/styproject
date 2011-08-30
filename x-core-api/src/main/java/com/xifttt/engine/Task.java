package com.xifttt.engine;

import java.util.Collection;
/**
 * This interface is supposed to be implemented by the web layer.
 * 
 * @author Jimmy
 *
 */
public interface Task {
	
	public Collection<Condition> getConditions();
	public Collection<Action> getActions();
	
	/**
	 * @return seconds
	 */
	public long getConditionCombinationWindow();
	
	/**
	 * @return seconds
	 */
	public long getLivePeriod();
	
	/**
	 * 
	 * expression := and_expression | or_expression | condition
	 * and_expression := '(' expression 'and' expression ')'
	 * or_expression := '(' expression 'or' expression ')'  
	 * 
	 * condition := number
	 * digit := '0' | '1' | ... '9'
	 * number := digit | digit number
	 *  
	 * 
	 * 
	 * Example:
	 * (111 and (112 or 113))
	 * @return
	 */
	public String getTriggerRule();
	
	
	/**
	 * expression := action | multi_action_expression
	 * multi_action_expression := action ':' '(' success_expression '/' failure_expression '/' whatever_expression ')'
	 * succeed_expression := '' | expression
	 * failure_expression := '' | expression
	 * whatever_expression := '' | expression
	 * 
	 * action := number
	 * digit := '0' | '1' | ... '9'
	 * number := digit | digit number
	 * 
	 * Example:
	 * 111:(112/113/)
	 * 
	 * Explanation: if 111 succeeded execute 112; otherwise execute 113
	 * 
	 * 
	 * @return
	 */
	public String getShotRule();

}
