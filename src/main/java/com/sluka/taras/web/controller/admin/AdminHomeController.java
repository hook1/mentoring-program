package com.sluka.taras.web.controller.admin;

import com.sluka.taras.buisness.service.UserService;
import com.sluka.taras.common.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by taras on 14.11.2016.
 */
@Controller
@Transactional
public class AdminHomeController {
    private static final Logger logger = LoggerFactory.getLogger(AdminHomeController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/admin/home/getAllUsers", method = RequestMethod.GET)
    public
    @ResponseBody
    List<User> usersList() {
        for (User user : userService.findAll()) {
            user.getRoles().size();
        }
        return userService.findAll();
    }

    @RequestMapping(value = "/admin/home")
    public String admin() {
        return "/role/admin/home";
    }

   /* @RequestMapping(value = "getAllUsers", method = RequestMethod.GET)
    public @ResponseBody String getAllUsers (ModelMap modelMap){
        String jsonData = "[{\"firstname\":\"ajitesh\",\"lastname\":\"kumar\",\"address\":\"211/20-B,mgstreet\",\"city\":\"hyderabad\",\"phone\":\"999-888-6666\"},{\"firstname\":\"nidhi\",\"lastname\":\"rai\",\"address\":\"201,mgstreet\",\"city\":\"hyderabad\",\"phone\":\"999-876-5432\"}]";
        return jsonData;
    }*/


}
