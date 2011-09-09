/**
 * 
 */
package com.x.web.dao.hibernate;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.x.web.constant.ActivationType;
import com.x.web.domain.Activation;

/**
 * @author sqlxx
 *
 */
@Repository
public class ActivationDAO extends BaseDAO<Activation, String> {
    public Activation findActivation(String verifyStr, ActivationType type) {
        return findOneByCriteria(Restrictions.and(Restrictions.eq("verifyString", verifyStr), Restrictions.eq("type", type)));
    }
}
