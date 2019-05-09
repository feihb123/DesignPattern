package com.xzit.ui;

import com.xzit.entity.User;
import com.xzit.service.UserService;
import com.xzit.serviceimpl.UserServiceXmlImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Login {
    public static void main(String[] args) {
        String userAccount="1314";
        String userPassword="xxx";
        ApplicationContext context=new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
        UserService service =(UserService) context.getBean("s");
        User user=service.loginValidate(userAccount,userPassword);

        System.out.println(user.toString()+"end");
    }
}
