package com.sluka.taras.buisness.service;


import com.sluka.taras.common.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    User findByUsername(String username);

    User findByEmail(String email);

    User findById(Long id);

    List<User> findAll();

    User update(User user);

    boolean authentice(String username, String password);


}
