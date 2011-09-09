/**
 * 
 */
package com.x.web.dao.hibernate;

import java.util.Date;

import junit.framework.Assert;

import org.springframework.transaction.TransactionStatus;

import com.x.web.constant.ActivationType;
import com.x.web.constant.UserStatus;
import com.x.web.domain.Activation;
import com.x.web.domain.User;

/**
 * @author sqlxx
 *
 */
public class ActivationDAOTest extends BaseTestCase {
    private ActivationDAO ad;
    private UserDAO ud;
    
    /* (non-Javadoc)
     * @see com.x.web.dao.hibernate.BaseTestCase#setUp()
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        ad = (ActivationDAO) ac.getBean("activationDAO");
        ud = (UserDAO) ac.getBean("userDAO");
    }
    
    /* (non-Javadoc)
     * @see junit.framework.TestCase#tearDown()
     */
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testSave() {
        TransactionStatus status = tm.getTransaction(null);
        User user = new User();
        user.setUsername("sqlxx");
        user.setEmail("sqlxx@sina.com");
        user.setPlainPassword("test");
        user.setLastLogin(new Date());
        user.setStatus(UserStatus.INACTIVE);
        ud.saveOrUpdate(user);
        
        Activation activation = new Activation();
        activation.setType(ActivationType.ACTIVATE_USER);
        activation.setVerifyString("testverifystring");
        activation.setUserId(user.getId());
        ad.saveOrUpdate(activation);
        
        Activation act = ad.findActivation("testverifystring", ActivationType.ACTIVATE_USER);
        assertEquals(user.getId(), act.getUserId());
        
        tm.rollback(status);
    }
    
}
