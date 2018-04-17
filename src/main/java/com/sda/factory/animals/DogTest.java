package com.sda.factory.animals;

import com.sda.factory.animals.dog.Dog;
import com.sda.factory.animals.dog.DogFactory;

public class DogTest {
    public static void main(String[] args) {
        DogFactory dogFactory = new DogFactory();

        Dog small = dogFactory.create("small");
        small.fetch();

        Dog big = dogFactory.create("big");
        big.fetch();
    }
}
