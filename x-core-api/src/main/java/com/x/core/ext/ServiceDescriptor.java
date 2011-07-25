package com.x.core.ext;

import java.net.URL;
import java.util.Locale;
import java.util.Map;

public interface ServiceDescriptor {
	/**
	 * 
	 * @return symbolic name which is an identifier of the service in the Engine.
	 * 
	 * For service provider the symbolic name must be unique universally; while
	 * for the Service the symbolic name only requires to be unique within the 
	 * the scope of the service provider.
	 * 
	 * For example: com.google can be the symbolic name of the Google while
	 * mail and talk can be the symbolic names of gmail service and gtalk services
	 * respectively.
	 * 
	 */
	public String getSimbolicName();
	
	/**
	 * We might want to show some Service which may haven't been available
	 * to use on the web. It's kind of advertising.   
	 * @return false if we want the Service to be shown but not be used.
	 */
	public boolean isActive();
	
	/**
	 * @param locales - the locales returned from browser in the order of preference.
	 * @return - name which will be displayed on the web page based on 
	 * browser's locale setting.
	 *  
	 */
	public Map<Locale, String> getNames();
	
	/**
	 * @param locales - {@link ServiceDescriptor#getName}
	 * @return brief description based on browser's locale setting.
	 */
	public Map<Locale, String> getDescriptions();
	
	/**
	 * @return url of the logo image. Engine will read and store the image 
	 * immediately at the registration of an Service. So the URL should be 
	 * readable for Engine.
	 */
	public URL getLogo();
	/**
	 * 
	 * @return whether a Service requires an activation. For service provider,
	 * Engine will ignore this. 
	 */
	public boolean isActivationRequired();
}
