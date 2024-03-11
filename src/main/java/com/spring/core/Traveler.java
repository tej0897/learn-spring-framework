package com.spring.core;

public class Traveller {
    Car car = null;

    public Traveller(){
        this.car = new Car();
    }

    public void startJourney(){
        this.car.move();
    }
}
