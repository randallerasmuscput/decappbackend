package com.example.services.Impl;



import com.example.Domain.Comment;
import com.example.repositories.CommentRepository;
import com.example.services.UpdateInfoService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * Created by User on 2016/05/04.
 */
// this service will be used to update the information of suspect with relevant information
    // that is verified
    // this is a bound service
public class UpdateServiceImpl implements UpdateInfoService {


        @Autowired
        private CommentRepository repository;

    public Comment findById(Long aLong) {return null;}
    public Comment save(Comment entity) {return null;}
    public Comment update(Comment entity) {return null;}
    public void delete(Comment entity) {}
    public List<Comment> findAll() {return null;}
}


