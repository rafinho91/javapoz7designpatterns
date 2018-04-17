package com.sda.factory.animals.cat;

public class CatFactory {

    public Cat createCat(String status){
        if ("poor".equals(status)){
            return new PersianCat();
        }else if ("rich".equals(status)){
            return new EuropeanCat();
        }
        return null;
    }
}
