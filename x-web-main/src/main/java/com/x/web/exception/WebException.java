/**
 * 
 */
package com.x.web.exception;

/**
 * @author sqlxx
 *
 */
@SuppressWarnings("serial")
public class WebException extends BaseException {
    public WebException() {
        
        super();
    }

    public WebException(String message) {
        super(message);
    }

    public WebException(String message, Throwable cause) {
        super(message, cause);
    }

    public WebException(Throwable cause) {
        super(cause);
    }
}
