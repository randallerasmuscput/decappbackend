package com.example.conf.factory;



import java.util.Date;

import com.example.Domain.Transfer;

/**
 * Created by User on 2016/04/24.
 */
public class TransferFactory {
    public static Transfer getTransfer (byte [] image, Date date
                                           ) {
        Transfer trnsfer = new Transfer
                .Builder()
                .suspectImage(image)
                .date(date)
                .build();

        return trnsfer;
    }
}
