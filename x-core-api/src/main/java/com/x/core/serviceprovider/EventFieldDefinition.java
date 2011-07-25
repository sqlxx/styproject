package com.x.core.serviceprovider;

import java.util.Enumeration;
import java.util.Locale;

import com.x.core.engine.EventFieldType;

public interface EventFieldDefinition {
	
	public boolean isComparable();
	
	public boolean isVisible();
	
	public String getSymbolicName();
	
	public String getName(Enumeration<Locale> locales);
	
	public String getDescription(Enumeration<Locale> locales);
	
	public EventFieldType getType();

}
