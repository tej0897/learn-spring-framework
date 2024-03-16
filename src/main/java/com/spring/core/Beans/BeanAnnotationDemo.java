package com.spring.core.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class Student{

    Address address;

    public Student(Address address){
        this.address = address;
    }

    public void print(){
        System.out.println("Student class called...");
    }
}

class Address{
    public void print(){
        System.out.println("Address class called...");
    }
}

@Configuration
class AppConfig{

    @Bean
    public Address address(){
        return new Address();
    }

    @Bean
    public Student student(){
        return new Student(address());
    }
}

public class BeanAnnotationDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = applicationContext.getBean(Student.class);
        Address address = applicationContext.getBean(Address.class);
        student.print();
        address.print();
    }

}
