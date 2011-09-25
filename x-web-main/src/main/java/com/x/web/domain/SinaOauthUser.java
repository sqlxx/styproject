/**
 * 
 */
package com.x.web.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author sqlxx
 *
 */
@Entity
public class SinaOauthUser implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Id
    private Long sinaUserId;
    private Long userId;
    private String token;
    private String tokenSecret;
    private Date updatedDate = new Date();
    

    public Long getSinaUserId() {
        return sinaUserId;
    }
    public void setSinaUserId(Long sinaUserId) {
        this.sinaUserId = sinaUserId;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public String getTokenSecret() {
        return tokenSecret;
    }
    public void setTokenSecret(String tokenSecret) {
        this.tokenSecret = tokenSecret;
    }
    public Date getUpdatedDate() {
        return updatedDate;
    }
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    
    
    
}
