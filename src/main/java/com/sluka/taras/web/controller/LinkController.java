package com.sluka.taras.web.controller;

import com.sluka.taras.web.controller.logInUP.RegistrationForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by taras on 26.11.2016.
 */
@Controller
public class LinkController {

    @RequestMapping(value = "/login")
    public String login() {
        return "/login";
    }

    @RequestMapping(value = {"/", "/index"})
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/registration")
    public String showRegistrationForm(RegistrationForm registrationForm) {
        return "/registration";
    }
}
