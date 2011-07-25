package com.x.core.engine.internal;

import java.net.URL;
import java.util.Enumeration;
import java.util.Locale;

public interface ExtServiceDescriptor {
	
	
	public boolean isActive();

	
	public String getName(Enumeration<Locale> locales);
	
	public String getDescription(Enumeration<Locale> locales);
	
	public URL getLogo();
	



	
	public boolean isActivationRequired();	
	
}
