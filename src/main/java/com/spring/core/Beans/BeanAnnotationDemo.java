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
        System.out.println("Student class method called...");
        address.print();
    }

    public void init(){
        System.out.println("Initialization method logic...");
    }

    public void destroy(){
        System.out.println("Destruction method logic...");
    }

}

class Address{
    public void print(){
        System.out.println("Address class method called...");
    }
}

@Configuration
class AppConfig{

    @Bean(name = "address")
    public Address address(){
        return new Address();
    }

    @Bean(name = "student" , initMethod = "init", destroyMethod = "destroy")
    public Student student(){
        return new Student(address());
    }
}

public class BeanAnnotationDemo {
    public static void main(String[] args) {

        try(var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class))
        {
            //Student student = applicationContext.getBean(Student.class);
            //setting application context using bean name instead of class
            Student student = (Student) applicationContext.getBean("student");
            student.print();

            // to get bean names:

            String [] beanNames = applicationContext.getBeanDefinitionNames();
            for (String bean : beanNames){
                System.out.println(bean);
            }
        }
    }

}
