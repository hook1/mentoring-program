package com.sluka.taras.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by taras on 06.11.2016.
 */
@Controller
public class HomeController {

    /*@RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "home";
    }*/


    @RequestMapping(value = {"/", "/home"})
    public String home() {
        return "home";
    }
    /*@RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) throws ParseException {

        model.addAttribute("name", name);
        return "home";
    }*/


}