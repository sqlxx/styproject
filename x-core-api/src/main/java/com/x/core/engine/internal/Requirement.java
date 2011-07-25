package com.x.core.engine.internal;

import java.net.URL;
import java.util.Map;

public interface Requirement {

	
	
	public URL getUrl(URL callbackUrl);
	
	public RequirementCompletion submit(Map<String, String> params);

	
}
