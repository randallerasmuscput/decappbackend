package com.example.conf.factory;

import com.example.Domain.Case;

/**
 * Created by User on 2016/04/24.
 */
public class CaseFactory {
    public static Case getCase(Long id,String offense, String offenseLocation) {
        Case cas = new Case.Builder()
                .id(id)
                .offense(offense)
                .offenseLocation(offenseLocation)
                .build();

        return cas;
    }
}
