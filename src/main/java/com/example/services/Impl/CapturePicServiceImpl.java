package com.example.services.Impl;


import com.example.Domain.Suspect;
import com.example.Domain.Transfer;
import com.example.repositories.SuspectRepository;
import com.example.repositories.TransferRepository;
import com.example.services.CapturePicService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by User on 2016/05/04.
 */
// this service will be used mainly by detectives and the Crime intelligence branche to to alert the uniform branch about a
    // list of suspects that are wanted with the type of crime they are wanted for
public class CapturePicServiceImpl implements CapturePicService
{

   @Autowired
    private SuspectRepository repository;

    public Suspect findById(Long aLong) {return null;}
    public Suspect save(Suspect entity) {return null;}
    public Suspect update(Suspect entity) {return null;}
    public void delete(Suspect entity) {}
    public List<Suspect>findAll() {return null;}
}



