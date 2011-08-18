/**
 * 
 */
package com.x.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.WebRequest;

import com.x.web.exception.ServiceException;
import com.x.web.util.Message;

/**
 * @author sqlxx
 *
 */
public class BaseController {
    
    @ExceptionHandler
    public @ResponseBody String handle(ServiceException e) {
        return "Service Exception " + e.getMessage() + " " + e.toString();
    }
    
    protected void setErrorMessage(String message) {
        setRequestMessage(Message.MessageType.error, message);
    }
    
    protected void setInfoMessage(String message) {
        setRequestMessage(Message.MessageType.info, message);
    }
    
    protected void setSuccessMessage(String message) {
        setRequestMessage(Message.MessageType.success, message);
    }
    
    protected void setWarnningMessage(String message) {
        setRequestMessage(Message.MessageType.warning, message);
    }
    
    private void setRequestMessage(Message.MessageType msgType, String message) {
        getRequest().setAttribute("message", new Message(msgType, message));
    }
    
    private HttpServletRequest getRequest() {
        return ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
    }

}
