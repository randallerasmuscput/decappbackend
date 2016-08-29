package com.example.services.Impl;



import com.example.Domain.Suspect;
import com.example.Domain.Transfer;
import com.example.repositories.SuspectRepository;
import com.example.repositories.TransferRepository;
import com.example.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * Created by User on 2016/05/04.
 */
// this service is used to search a specific suspect to a police precinct
    // this is a bound service
public class SearchServiceImpl implements SearchService {


        @Autowired
        private SuspectRepository repository;

    public Suspect findById(Long aLong) {return null;}
    public Suspect save(Suspect entity) {return null;}
    public Suspect update(Suspect entity) {return null;}
    public void delete(Suspect entity) {}
    public List<Suspect> findAll() {return null;}
}


