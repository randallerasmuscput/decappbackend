package com.example.conf.factory;



import com.example.Domain.Demographics;

/**
 * Created by User on 2016/04/24.
 */
public class DemographicsFactory {
    public static Demographics getDemographics(String race, String gender,String age)
    {
        Demographics demogr = new Demographics
                .Builder()
                .race(race)
                .gender(gender)
                .age(age)
                .build();

        return demogr;
    }
}
