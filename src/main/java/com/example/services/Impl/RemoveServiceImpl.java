package com.example.services.Impl;



import com.example.Domain.Suspect;
import com.example.Domain.Transfer;
import com.example.repositories.SuspectRepository;
import com.example.repositories.TransferRepository;
import com.example.services.RemoveInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by User on 2016/05/04.
 */
// this services is used to remove unverified information of alleged suspects
    // this is a bound service
public class RemoveServiceImpl implements RemoveInfoService {



        @Autowired
        private SuspectRepository repository;

    public Suspect findById(Long aLong) {return null;}
    public Suspect save(Suspect entity) {return null;}
    public Suspect update(Suspect entity) {return null;}
    public void delete(Suspect entity) {}
    public List<Suspect> findAll() {return null;}
}


