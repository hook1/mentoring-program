package com.sluka.taras.web.controller.logInUP;

import com.sluka.taras.buisness.service.NotificationService;
import com.sluka.taras.buisness.service.UserService;
import com.sluka.taras.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by taras on 09.11.2016.
 */
@Controller
public class RegistrationController {
    @Autowired
    UserService userService;
    @Autowired
    private NotificationService notificationService;


    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String showRegistrationForm(@Valid RegistrationForm registrationForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            notificationService.addErrorMessage(
                    "Моля изчистетет грешките по форматата, щото така, както си тръгнал, няма да те пусна напред!");
            return "users/login";
        }
        User user = new User();
        user.setEmail(registrationForm.getEmail());
        user.setFirstName(registrationForm.getFirstName());
        user.setLastName(registrationForm.getLastName());
        user.setPassword(registrationForm.getPassword());
        /*user.getRoles().add(roleDao.findById(3L));*/
        userService.save(user);
        /*if (!loginService.authentice(registrationForm.getUsername(),
                registrationForm.getPassword())) {
            notificationService.addErrorMessage("Invalid login");
            return "users/login";
        }*/

        // Login successful
        notificationService.addInfoMessage("Влезнахме!");
        return "redirect:/";
    }

}
    /*@RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);


        return "redirect:/welcome";
    }*/


