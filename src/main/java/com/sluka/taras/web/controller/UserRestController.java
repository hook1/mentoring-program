package com.sluka.taras.web.controller;

import com.sluka.taras.buisness.service.UserService;
import com.sluka.taras.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by taras on 07.12.2016.
 */
@RestController
@RequestMapping("/users/")
public class UserRestController {

    @Autowired
    UserService userService;

    @GetMapping("/users/")
    public List getUsers() {
        System.out.println("=====================================================================================");
        for (User user : userService.findAll()) {
            System.out.println(user.toString());
        }
        System.out.println("=====================================================================================");
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity getUser(@PathVariable("id") Long id) {
        User user = userService.findById(id);
        if (user == null)
            return new ResponseEntity("No User found for ID" + id, HttpStatus.NOT_FOUND);
        return new ResponseEntity(user, HttpStatus.OK);
    }

    @PostMapping(value = "/users")
    public ResponseEntity createUser(@RequestBody User user) {
        userService.save(user);
        return new ResponseEntity(user, HttpStatus.OK);
    }

    @DeleteMapping("/users{id}")
    public ResponseEntity deleteUser(@PathVariable Long id) {
        if (null == userService.findById(id))
            return new ResponseEntity("No User found for Id" + id, HttpStatus.NOT_FOUND);
        return new ResponseEntity(id, HttpStatus.OK);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity updateUser(@PathVariable Long id, @RequestBody User user) {
        user = userService.update(user);
        if (null == user)
            return new ResponseEntity("No User found for Id" + id, HttpStatus.NOT_FOUND);
        return new ResponseEntity(id, HttpStatus.OK);
    }
}
