package com.revature;

import com.revature.entity.Dog;
import com.revature.exception.DogNotFoundException;
import com.revature.service.DogService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App02 {

    public static void main(String[] args) {
        // context and service init
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        DogService dogService = context.getBean(DogService.class);

        // find all dogs and print out each one
        List<Dog> dogs = dogService.findAll();
        dogs.stream().forEach(System.out::println);

        // find one dog if exists and print, throws custom exception if not
        try {
            Dog dog = dogService.find(1);
            System.out.println("\n" + dog);
            System.out.println(dog.checkOnDog());
        } catch (DogNotFoundException e){
            System.out.println("\n Error: " + e.getMessage());
        }
    }
}
