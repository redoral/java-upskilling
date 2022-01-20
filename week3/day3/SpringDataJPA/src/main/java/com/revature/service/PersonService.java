package com.revature.service;

import com.revature.entity.Person;
import com.revature.exception.DogNotFoundException;
import com.revature.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    PersonRepository personRepository;

    @Autowired
    public void setPersonRepository(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    // find all
    public List<Person> findAll() {
        return (List<Person>) personRepository.findAll();
    }

    // find one
    public Person find(Integer id) throws DogNotFoundException {
        personRepository.findById(id).orElseThrow(() -> new DogNotFoundException("Person with id: " + id + " cannot be found."));
        return (Person) personRepository.findById(id).get();
    }

    // save a new person
    public Person save(Person person) {
        return personRepository.save(person);
    }

    // delete a person
    public boolean delete(Integer id) throws DogNotFoundException {
        personRepository.findById(id).orElseThrow(() -> new DogNotFoundException("Person with id: " + id + " cannot be found."));
        personRepository.deleteById(id);
        return true;
    }

    // update a person
    public Person update(Integer id, Person person) throws DogNotFoundException {
        personRepository.findById(id).orElseThrow(() -> new DogNotFoundException("Person with id: " + id + " cannot be found."));
        return personRepository.save(person);
    }
}

