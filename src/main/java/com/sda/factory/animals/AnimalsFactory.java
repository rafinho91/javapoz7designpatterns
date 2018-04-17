package com.sda.factory.animals;

import com.sda.factory.animals.cat.Cat;
import com.sda.factory.animals.cat.CatFactory;
import com.sda.factory.animals.dog.Dog;
import com.sda.factory.animals.dog.DogFactory;

public class AnimalsFactory {
    private DogFactory dogFactory;
    private CatFactory catFactory;

    public AnimalsFactory() {
        this.dogFactory = new DogFactory();
        this.catFactory = new CatFactory();
    }

    public AnimalsFactory(DogFactory dogFactory, CatFactory catFactory) {
        this.dogFactory = dogFactory;
        this.catFactory = catFactory;
    }

    public Dog createDog(String height){
        return dogFactory.create(height);
    }

    public Cat createCat(String status){
        return catFactory.createCat(status);
    }
}
