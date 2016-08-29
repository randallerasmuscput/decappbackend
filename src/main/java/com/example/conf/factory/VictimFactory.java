package com.example.conf.factory;


import com.example.Domain.Victim;

/**
 * Created by User on 2016/04/23.
 */
public class VictimFactory {

    public static Victim getVictim (String name, String surname)
    {
        Victim victm = new Victim
                .Builder()
                .name(name)
                .surname(surname)
                .build();

        return victm;
    }
}
