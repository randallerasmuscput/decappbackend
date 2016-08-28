package com.example.services.Impl;



import com.example.Domain.Transfer;
import com.example.repositories.TransferRepository;
import com.example.services.WantedService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * Created by User on 2016/05/04.
 */
// this service will be used mainly by detectives to alert the uniform branch about a
    // list of Wanteds that are wanted with the type of crime they are wanted for
public class WantedServiceImpl implements WantedService {
    {

        @Autowired
        private TransferRepository repository;

    public Transfer findById(Long aLong) {return null;}
    public Transfer save(Transfer entity) {return null;}
    public Transfer update(Transfer entity) {return null;}
    public Transfer delete(Transfer entity) {return null;}
    public List<Transfer> findAll() {return null;}
}



