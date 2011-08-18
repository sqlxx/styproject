/**
 * 
 */
package com.x.web.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author sqlxx
 *
 */
public class FlashMap {
    public static final String FLASH_MAP_ATTRIBUTE = "FLASH_MAP";
    private static final String MESSAGE_KEY = "message";
    
    @SuppressWarnings("unchecked")
    public static Map<String, Object> getCurrent(HttpServletRequest request) {
        HttpSession session = request.getSession(); 
        Map<String, Object> flash = (Map<String, Object>) session.getAttribute(FLASH_MAP_ATTRIBUTE);
        if (flash == null) {
            flash = new HashMap<String, Object>();
            session.setAttribute(FLASH_MAP_ATTRIBUTE, flash);
        }
        return flash;
    }
    
    private FlashMap() {
        
    }
    
    public static void put(String key, Object value) {
        getCurrent(getRequest(RequestContextHolder.currentRequestAttributes())).put(key, value);
    }

    public static void setInfoMessage(String info) {
        put(MESSAGE_KEY, new Message(Message.MessageType.info, info));
    }

    public static void setWarningMessage(String warning) {
        put(MESSAGE_KEY, new Message(Message.MessageType.warning, warning));
    }

    public static void setErrorMessage(String error) {
        put(MESSAGE_KEY, new Message(Message.MessageType.error, error));
    }

    public static void setSuccessMessage(String success) {
        put(MESSAGE_KEY, new Message(Message.MessageType.success, success));
    }

    private static HttpServletRequest getRequest(RequestAttributes requestAttributes) {
        return ((ServletRequestAttributes)requestAttributes).getRequest();
    }


}
