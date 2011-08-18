package com.x.web.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.x.web.domain.User;
import com.x.web.exception.AuthException;
import com.x.web.formbean.UserRegForm;
import com.x.web.service.UserManagementService;
import com.x.web.util.FlashMap;
import com.x.web.util.Message;

/**
 * 
 * @author sqlxx
 *
 */
@Controller
@RequestMapping("/user/*")
public class UserController extends BaseController{
    @Autowired
    private UserManagementService ums;
    
    @RequestMapping(value="login", method=RequestMethod.POST)
    public @ResponseBody String login(@RequestParam("username") String userName, @RequestParam String password ) {
        try {
        User user = ums.authenticate(userName, password);
            if (user != null) {
                return "welcome " + userName + "with password " +  password;
            } else {
                return "登录失败";
            }
        } catch (AuthException ex) {
            return ex.getMessage();
        }
    }
    
    @RequestMapping(value="login", method=RequestMethod.GET)
    public String login() {
        return "xweb.login";
    }
    
    @RequestMapping(value="register", method=RequestMethod.POST)
    public String register(@Valid UserRegForm userRegForm, BindingResult result, HttpSession session, WebRequest request) {
        
        if (result.hasErrors()) {
            
            request.setAttribute("message", new Message(Message.MessageType.error, "用户注册失败"), WebRequest.SCOPE_REQUEST);
            return "xweb.register";
        } else if (userRegForm.getPassword() != null && !userRegForm.getPassword().equals(userRegForm.getVerifyPassword())) {
            request.setAttribute("message", new Message(Message.MessageType.error, "两次密码输入不同"), WebRequest.SCOPE_REQUEST);
            return "xweb.register";
        }
        
        User user = ums.registerUser(userRegForm.getUsername(), userRegForm.getEmail(), userRegForm.getPassword());
        if (user != null) {
            FlashMap.setSuccessMessage("注册成功" + user.getUsername() + "请登录");
            return "redirect:login";
        } else {
            FlashMap.setErrorMessage("注册失败");
        }
        return "redirect:register";
    }
    
    @RequestMapping(value="register", method=RequestMethod.GET)
    public String register(HttpSession session, Model model) {
        UserRegForm userForm = (UserRegForm) session.getAttribute("userRegForm");
        model.addAttribute(userForm != null ? userForm : new UserRegForm());
        return "xweb.register";
    }
}
