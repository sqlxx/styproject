package com.x.web.util;

import com.x.web.constant.ActivationType;

import junit.framework.TestCase;

public class AuthUtilTest extends TestCase {
	public void testEncodePassword() {
		assertEquals("7b0119ca2a6cfc708ed4f306e4a831ecdbb76889", AuthUtil.encodePassword("Test"));
		assertEquals("068c666289e97a1e3013162a2869c40d122c2887", AuthUtil.encodePassword("Java01!!"));
		assertEquals("58db52f09d764bbc1d6762e86f2d43e829f0518b", AuthUtil.encodePassword("Java01!!#$@!#@$^%&&^"));
	}
	
	public void testGenerateVerifyString() {
	    String verifyString1 = AuthUtil.generateVerifyString("sqlxx", "sqlxx@sina.com", ActivationType.ACTIVATE_USER);
	    assertNotNull(verifyString1);
	    assertEquals(32, verifyString1.length());
	    System.out.println(verifyString1);
	    
        String verifyString2 = AuthUtil.generateVerifyString("sqlxx", "xxlsq@163.com", ActivationType.ACTIVATE_USER);
        assertNotNull(verifyString2);
        assertEquals(32, verifyString2.length());
        assertFalse(verifyString2.equals(verifyString1));
        System.out.println(verifyString2);
        
        
        String verifyString3 = AuthUtil.generateVerifyString("sqlxx", "sqlxx@a.com", ActivationType.ACTIVATE_USER);
        assertNotNull(verifyString3);
        assertEquals(32, verifyString3.length());
        assertFalse(verifyString3.equals(verifyString2));
        System.out.println(verifyString3);
	    
	}
}


