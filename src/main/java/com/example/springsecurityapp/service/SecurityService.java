package com.example.springsecurityapp.service;

/**
 * Service for security.
 *
 * @author s
 * @version 1.0
 */

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
