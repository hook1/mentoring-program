package com.sluka.taras.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by taras on 06.11.2016.
 */
@Controller
@RequestMapping("/connction")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody String connection() {
        return "OK";
    }

}