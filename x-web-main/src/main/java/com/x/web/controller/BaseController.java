/**
 * 
 */
package com.x.web.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.x.web.exception.ServiceException;

/**
 * @author sqlxx
 *
 */
public class BaseController {
    
    @ExceptionHandler
    public @ResponseBody String handle(ServiceException e) {
        return "Service Exception " + e.getMessage() + " " + e.toString();
    }
}
