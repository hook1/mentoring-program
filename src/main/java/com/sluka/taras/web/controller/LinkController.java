package com.sluka.taras.web.controller;

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
}
