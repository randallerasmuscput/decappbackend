package com.example.conf.factory;


import com.example.Domain.User;

/**
 * Created by User on 2016/04/24.
 */
public class UserFactory {
    public static User getUser (String username, String password,String passwordConfirmation ,String authorizationNumber)
    {
        User usr = new User
                .Builder()
                .username(username)
                .password(password)
                .passwordConfirmation(passwordConfirmation)
                .authorizationNumber(authorizationNumber)
                .build();

        return usr;
}}
