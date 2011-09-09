/**
 * 
 */
package com.x.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author sqlxx
 *
 */
@Controller
public class MainController extends BaseController {
    
    @RequestMapping(value="/main", method=RequestMethod.GET)
    public String main(HttpSession session) {
        return "xweb.main";
    }
}
