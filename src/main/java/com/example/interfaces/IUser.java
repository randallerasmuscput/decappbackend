package com.example.interfaces;

/**
 * Created by User on 2016/08/29.
 */
public interface IUser {

    Long id();
    String username();
    String password();
    String passwordConfirmation();
    String authorizationNumber();
}
