package com.sluka.taras.web.controller;

import com.sluka.taras.buisness.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by taras on 03.12.2016.
 */
@Controller
public class UserProfile {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/editUser", method = RequestMethod.GET)
    public String editUser() {
        return "/editUser";
    }

    @RequestMapping(value = "/userProfile", method = RequestMethod.GET)
    public String userProfile() {
        return "/userProfile";
    }
}
