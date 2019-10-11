package com.lambdaschool.zoos.view;

public interface AnimalCount {
    String getAnimalType();
    int getAnimalCount();
    //My interface has to pull in  a getter method for EVERY ONE of my SQL select fields.
}
