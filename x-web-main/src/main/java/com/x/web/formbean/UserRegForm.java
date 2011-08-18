/**
 * 
 */
package com.x.web.formbean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author sqlxx
 *
 */
public class UserRegForm {
    @NotNull(message="用户名不能为空")
    @Size(max=20, message="用户名不能超过20个字符")
    private String username;
    @Size(min=1, message="密码不能为空")
    private String password;
    @Size(min=1, message="验证密码不能为空")
    private String verifyPassword;
    
    @NotNull(message="Email不能为空")
    @Pattern(regexp="\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*", message="无效email地址")
    private String email;
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }
    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return this.username + " : " + this.email;
    }
}
