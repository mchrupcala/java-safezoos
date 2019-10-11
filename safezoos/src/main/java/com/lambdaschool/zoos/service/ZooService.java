package com.lambdaschool.zoos.service;

import com.lambdaschool.zoos.model.Zoo;

import java.util.ArrayList;

public interface ZooService
{
    ArrayList<Zoo> findAll();

    Zoo findZooById(long id);

    Zoo findZooByName(String zooname);

    void delete(long id);

    Zoo save(Zoo zoo);

    Zoo update(Zoo zoo, long id);
}
