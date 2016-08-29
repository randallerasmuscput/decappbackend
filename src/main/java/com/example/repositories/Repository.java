package com.example.repositories;

import java.util.Set;

/**
 * Created by User on 2016/05/08.
 */
public interface Repository<E, ID> {

    E findById(ID id);

    E save(E entity);

    E update(E entity);

    E delete(E entity);

    Set<E> findAll();

    int deleteAll();

   String getUserEntry(String username);
}

