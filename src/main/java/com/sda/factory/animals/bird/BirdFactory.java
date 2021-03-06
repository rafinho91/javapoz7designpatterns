package com.sda.factory.animals.bird;

public class BirdFactory {
    public Bird createBird(BirdType type) {
        switch (type) {
            case DUCK:
                return new Duck();
            case EAGLE:
                return new Eagle();
            default:
                return null;
        }
    }
}
