package com.example.services.Impl;



import com.example.Domain.Suspect;
import com.example.Domain.Transfer;
import com.example.repositories.SuspectRepository;
import com.example.repositories.TransferRepository;
import com.example.services.ViewPicService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by User on 2016/05/04.
 */
// this service will be used to present to victims of crime on the crime scene
    // a list of possible suspects that are related to the type of crime
public class ViewPicServiceImpl  implements ViewPicService {

        @Autowired
        private SuspectRepository repository;

    public Suspect findById(Long aLong) {return null;}
    public Suspect save(Suspect entity) {return null;}
    public Suspect update(Suspect entity) {return null;}
    public void delete(Suspect entity) {}
    public List<Suspect> findAll() {return null;}
}


