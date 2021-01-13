package com.example.springsecurityapp.service;

import com.example.springsecurityapp.model.User;

/**
 * Service class for {@link User}.
 *
 * @author s
 * @version 1.0
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
