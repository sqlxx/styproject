/**
 * 
 */
package com.x.web.dao.hibernate;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.x.web.domain.SinaOauthUser;

/**
 * @author sqlxx
 *
 */
@Repository
public class SinaOauthUserDAO extends BaseDAO<SinaOauthUser, Long> {
    public SinaOauthUser findByUserId(Long userId) {
        return  findOneByCriteria(Restrictions.eq("userId", userId));
    }
}
