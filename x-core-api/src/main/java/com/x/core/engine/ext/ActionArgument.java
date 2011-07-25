package com.x.core.engine.ext;

import java.util.Locale;
import java.util.Enumeration;

import com.x.core.ext.Value;

public interface ActionArgument {

	String getSymbolicName();
	
	String getName(Enumeration<Locale> locales);
	String getDescription(Enumeration<Locale> locales);
	
	EventFieldType getType();
	
	
	Value getValue();
	
	
}