package com.x.core.engine.internal;

import java.util.Enumeration;
import java.util.Locale;

public interface TaskExecutionRecord extends Resource{

	String getName(Enumeration<Locale> locales);
	
	boolean succeeded();
	
	String getMessage(Enumeration<Locale> locales);
	
}
