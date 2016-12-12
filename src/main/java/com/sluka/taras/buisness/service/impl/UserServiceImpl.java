package com.sluka.taras.buisness.service.impl;


import com.sluka.taras.buisness.service.UserService;
import com.sluka.taras.common.model.User;
import com.sluka.taras.repositories.RoleRepository;
import com.sluka.taras.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;


    @Override
    public void save(User user) {
        //  user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.getRoles().add(roleRepository.findByName("USER_ROLE"));

        user.getRoles().add(roleRepository.findById(2L));
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUserName(username);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User findById(Long id) {
        if (userRepository.findById(id) != null)
            return userRepository.findById(id);
        return null;


    }

    public final List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean authentice(String username, String password) {
        return Objects.equals(username, password);
    }

}
