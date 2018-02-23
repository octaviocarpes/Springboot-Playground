package com.securelogin.poc.SpringbootSecureLoginPOC.service;

import com.securelogin.poc.SpringbootSecureLoginPOC.model.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}
