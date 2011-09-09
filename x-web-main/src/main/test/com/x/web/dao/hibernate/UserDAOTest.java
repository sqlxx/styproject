/**
 * 
 */
package com.x.web.dao.hibernate;

import java.util.Date;

import junit.framework.Assert;

import org.springframework.transaction.TransactionStatus;

import com.x.web.constant.UserStatus;
import com.x.web.domain.User;

/**
 * @author sqlxx
 *
 */
public class UserDAOTest extends BaseTestCase {
    
    private UserDAO ud;
    
    /* (non-Javadoc)
     * @see com.x.web.dao.hibernate.BaseTestCase#setUp()
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        ud = (UserDAO) ac.getBean("userDAO");
    }
    
    /* (non-Javadoc)
     * @see junit.framework.TestCase#tearDown()
     */
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testSaveAndQuery() {
        TransactionStatus status = tm.getTransaction(null);
        //Create a user
        User user = new User();
        user.setEmail("test@test.com");
        user.setPlainPassword("testpw");
        user.setStatus(UserStatus.INACTIVE);
        user.setUsername("testuser");
        user.setLastLogin(new Date());
        
        user = ud.saveOrUpdate(user);
        assertNotNull(user.getId());
        
        //Query the user
        User result = ud.findByUsernameOrActiveEmail("testuser");
        assertNotNull(result);
        assertEquals(user.getUsername(), result.getUsername());
        
        //Change email & last login timestamp
        result.setEmail("test2@test.com");
        Date lastLogin = new Date();
        result.setLastLogin(lastLogin);
        result.setStatus(UserStatus.ACTIVE);
        ud.saveOrUpdate(result);
        
        //Query again
        User result1 = ud.findByUsernameOrActiveEmail("test2@test.com");
        assertNotNull(result1);
        assertEquals(lastLogin, result1.getLastLogin());
     
        tm.rollback(status);
    }
    
}
