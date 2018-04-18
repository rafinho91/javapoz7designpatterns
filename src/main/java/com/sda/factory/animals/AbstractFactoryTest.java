package com.sda.factory.animals;

import com.sda.factory.animals.bird.Bird;
import com.sda.factory.animals.bird.BirdType;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AnimalsFactory animalsFactory = new AnimalsFactory();
        Bird bird = animalsFactory.createBird(BirdType.EAGLE);
        bird.fly();
    }
}
