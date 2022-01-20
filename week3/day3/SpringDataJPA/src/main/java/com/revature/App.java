package com.revature;

import com.revature.entity.Dog;
import com.revature.service.DogService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // init context
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // create new dog instance
        Dog dog1 = new Dog("Doggy", "Corgi", 3);
        Dog dog2 = new Dog("Poggy", "Golden Retriever", 5);
        Dog dog3 = new Dog("Woggy", "German Shepherd", 7);


        // call save dog method from service
        DogService dogService = context.getBean(DogService.class);
        Dog savedDog1 = dogService.save(dog3);
        System.out.println(savedDog1.getName() + " has been saved!");
    }
}
