/**
 * 
 */
package com.x.web.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import com.x.web.constant.ActivationType;

/**
 * @author sqlxx
 *
 */
@Entity
public class Activation {
    @Id
    private String verifyString;
    private Long userId; 
    private Date createdDatetime = new Date();
    private ActivationType type;
    
    @Enumerated(EnumType.ORDINAL)
    public ActivationType getType() {
        return type;
    }
    public void setType(ActivationType type) {
        this.type = type;
    }
    public String getVerifyString() {
        return verifyString;
    }
    public void setVerifyString(String verifyString) {
        this.verifyString = verifyString;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Date getCreatedDatetime() {
        return createdDatetime;
    }
    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }
    
}
