package com.xzit.serviceimpl;

import com.xzit.entity.User;
import com.xzit.service.UserService;

public class UserServiceXmlImpl  implements UserService {
    public User loginValidate(String account, String password) {
        return new  User(account,password);
    }
}
