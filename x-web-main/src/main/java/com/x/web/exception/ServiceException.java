/**
 * 
 */
package com.x.web.exception;

/**
 * @author sqlxx
 *
 */
@SuppressWarnings("serial")
public class ServiceException extends BaseException {

    public ServiceException() {
        
        super();
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }
}
