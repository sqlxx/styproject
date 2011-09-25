package com.x.web.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.x.web.constant.OauthSource;
import com.x.web.constant.UserStatus;
import com.x.web.util.AuthUtil;

/**
 * 
 * @author sqlxx
 *
 */
@Entity
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private Long id;
	@NotNull(message="用户名不能为空")
	@Size(max=20, message="用户名不能超过20个字符")
	private String username;
	@NotNull(message="密码不能为空")
	private String password;
	
	@NotNull(message="Email不能为空")
	@Pattern(regexp="\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*", message="无效email地址")
	private String email;
	private UserStatus status;
	private Date lastLogin;
	private Date createdDatetime;
	private Date updatedDatetime = new Date();
	private boolean loginFromOauth;
	private OauthSource oauthSource;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	@SuppressWarnings("unused")
	private void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public Date getCreatedDatetime() {
		return createdDatetime;
	}
	public void setCreatedDatetime(Date createdDatetime) {
		this.createdDatetime = createdDatetime;
	}
	public Date getUpdatedDatetime() {
		return updatedDatetime;
	}
	public void setUpdatedDatetime(Date updatedDatetime) {
		this.updatedDatetime = updatedDatetime;
	}
	@Transient
	public void setPlainPassword(String password) {
		this.password = AuthUtil.encodePassword(password);
		
	}
	@Enumerated(EnumType.ORDINAL)
    public UserStatus getStatus() {
        return status;
    }
    public void setStatus(UserStatus status) {
        this.status = status;
    }
    @Transient
    public boolean isLoginFromOauth() {
        return loginFromOauth;
    }
    @Transient
    public void setLoginFromOauth(boolean loginFromOauth) {
        this.loginFromOauth = loginFromOauth;
    }
    @Transient
    public OauthSource getOauthSource() {
        return oauthSource;
    }
    @Transient
    public void setOauthSource(OauthSource oauthSource) {
        this.oauthSource = oauthSource;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "[" + this.id + "]" + this.username + " : " + this.email;
    }
	
}
