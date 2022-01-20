package com.revature;

import com.revature.entity.Dog;
import com.revature.entity.Person;
import com.revature.service.DogService;
import com.revature.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

// entity relationship app
public class App03 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        PersonService personService = context.getBean(PersonService.class);
        DogService dogService = context.getBean(DogService.class);


        Person red = new Person("Red");
        Person guy = new Person("Guy");
        personService.save(red);
        personService.save(guy);

        dogService.save(new Dog("Pupper", "Corgi", 3, red));
        dogService.save(new Dog("Pooper", "German Shepherd", 3, red));
        dogService.save(new Dog("Doggo", "Golden Retriever", 5, guy));

        List<Dog> ownedByPerson = dogService.findByPerson(red);

        System.out.println("\nDogs owned by " + red.getName() + ":");
        ownedByPerson.stream().forEach(System.out::println);
    }
}
