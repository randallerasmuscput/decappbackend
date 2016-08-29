package com.example.services.Impl;




import com.example.Domain.User;
import com.example.repositories.UserRepository;
import com.example.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * Created by User on 2016/05/04.
 */// **********  WHY?*******************
// this service is for the login of only law officials with a authorization number
    // and can only used while on duty due to security constraints
    // this is a started service

public class LoginServiceImpl implements LoginService
{


        @Autowired
        private UserRepository repository;

    public User findById(Long aLong) {return null;}
    public User save(User entity) {return null;}
    public User update(User entity) {return null;}
    public void delete(User entity) {}
    public List<User> findAll() {return null;}
}


