package com.x.web.dao.hibernate;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.x.web.constant.UserStatus;
import com.x.web.domain.User;
/**
 * 
 * @author sqlxx
 *
 */
@Repository
public class UserDAO extends BaseDAO<User, Long> {
    public User findByUsernameOrActiveEmail(String usernameOrEmail) {
        return  findOneByQuery("from User where username = ? or (email = ? and status != " + UserStatus.INACTIVE.ordinal() + ")", usernameOrEmail, usernameOrEmail);
    }
    
    public User findByUsername(String userName) {
        return  findOneByCriteria(Restrictions.eq("username", userName));
    }
    
    public User findByUsernameAndEmail(String userName, String email) {
        return  findOneByQuery("from User where username = ? and email = ?", userName, email);
    }
    
    public User findByEmail(String email) {
        return  findOneByCriteria(Restrictions.eq("email", email));
    }
}
