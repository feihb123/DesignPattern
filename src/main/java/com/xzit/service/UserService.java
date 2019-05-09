package com.xzit.service;

import com.xzit.entity.User;

public interface UserService {
    public User loginValidate(String account, String password);
}
