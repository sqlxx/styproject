package com.x.web.exception;

/**
 * 
 * @author sqlxx
 *
 */
@SuppressWarnings("serial")
public class AuthException extends ServiceException {
	
    public AuthException() {
    	
    	super();
    }

    public AuthException(String message) {
    	super(message);
    }

    public AuthException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthException(Throwable cause) {
        super(cause);
    }

}
