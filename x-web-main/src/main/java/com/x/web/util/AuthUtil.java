package com.x.web.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.x.web.constant.ActivationType;
import com.x.web.exception.AuthException;
/**
 * 
 * @author sqlxx
 *
 */
public class AuthUtil {
    
    private static final Logger log = LoggerFactory.getLogger(AuthUtil.class);
	private static final String pwdSalt = "xWeb$3301!";
	
	public static String encodePassword(String password) {
		if (password == null || password.trim().length() == 0)
			return null;
		
		try {
		    MessageDigest md = MessageDigest.getInstance("SHA");
			return bytes2Hex(md.digest((password + pwdSalt).getBytes()));  
		} catch (NoSuchAlgorithmException e) {
			//it should not possible to happen.
			throw new AuthException(e.getMessage(), e);
		}  
		
	}
	
	public static String generateVerifyString(String username, String email, ActivationType at) {
	    log.debug("generate verify string with {}:{}:{}", new String[]{username, email, at.name()});
	   
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            DateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");
            return bytes2Hex(md.digest((username + ":" + email + ":" + at.name() + ":" + df.format(new Date())).getBytes()));  
        } catch (NoSuchAlgorithmException e) {
            //it should not possible to happen.
            throw new AuthException(e.getMessage(), e);
        }  
	}
	
    private static String bytes2Hex(byte[] bts) {
		String des = "";
		String tmp = null;
		for (int i = 0; i < bts.length; i++) {
			tmp = (Integer.toHexString(bts[i] & 0xFF));
			if (tmp.length() == 1) {
				des += "0";
			}
			des += tmp;
		}
		return des;
    }
    


}
