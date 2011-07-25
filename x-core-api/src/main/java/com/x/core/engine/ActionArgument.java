package com.x.core.engine;

import java.util.Locale;
import java.util.Enumeration;

import com.x.core.serviceprovider.Value;

public interface ActionArgument {

	String getSymbolicName();
	
	String getName(Enumeration<Locale> locales);
	String getDescription(Enumeration<Locale> locales);
	
	EventFieldType getType();
	
	
	Value getValue();
	
	
}