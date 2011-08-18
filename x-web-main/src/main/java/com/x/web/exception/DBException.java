package com.x.web.exception;

/**
 * 
 * @author sqlxx
 *
 */
@SuppressWarnings("serial")
public class DBException extends BaseException {
	
    public DBException() {
    	super();
    }

    public DBException(String message) {
    	super(message);
    }

    public DBException(String message, Throwable cause) {
        super(message, cause);
    }

    public DBException(Throwable cause) {
        super(cause);
    }

}
