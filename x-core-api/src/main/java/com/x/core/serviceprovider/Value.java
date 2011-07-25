package com.x.core.serviceprovider;

import java.util.Enumeration;
import java.util.Locale;

public interface Value {

	public int getInt();
	public long getLong();
	public double getDouble();
	public float getFloat();
	public String getString();
	
	public String getAppearance(Enumeration<Locale> locales);
	
}
