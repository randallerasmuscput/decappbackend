package com.example.conf.factory;


import com.example.Domain.Contact;

/**
 * Created by User on 2016/04/24.
 */
public class ContactFactory {
    public static Contact getContact(String cellphone, String phoneNumber)
    {
        Contact contct = new Contact
                .Builder()
                .cellphone(cellphone)
                .phoneNumber(phoneNumber)
                .build();

        return contct;
    }
}
