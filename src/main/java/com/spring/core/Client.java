package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class Client {
    public static void main(String[] args) {

       /* Vehicle vehicle = new Cycle();

        Traveler traveler = new Traveler(vehicle);
        traveler.startJourney(); */

        // creating spring IOC container
        // Read config class
        // create and manage beans

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //Retrieve beans from IOC container

        Car car = applicationContext.getBean(Car.class);
        car.move();

        Bike bike = applicationContext.getBean(Bike.class);
        bike.move();

        Cycle cycle = applicationContext.getBean(Cycle.class);
        cycle.move();

        Traveler traveler1 = applicationContext.getBean(Traveler.class);
        traveler1.startJourney();

    }
}
