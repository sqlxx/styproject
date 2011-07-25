package com.x.core.engine.internal;

import java.util.Enumeration;
import java.util.Locale;

import com.x.core.engine.CompletionState;

public interface RequirementCompletion {
	public CompletionState getCompletionState();
	
	public String getCompletionMessage(Enumeration<Locale> locales);
	
	public ExtProduct getProduct();
	
	
}
