package com.revature.service;

import com.revature.entity.Person;
import com.revature.exception.DogNotFoundException;
import com.revature.entity.Dog;
import com.revature.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {

    DogRepository dogRepository;

    @Autowired
    public void setDogRepository(DogRepository dogRepository){
        this.dogRepository = dogRepository;
    }

    // find all
    public List<Dog> findAll() {
        return (List<Dog>) dogRepository.findAll();
    }

    // find one
    public Dog find(Integer id) throws DogNotFoundException {
        dogRepository.findById(id).orElseThrow(() -> new DogNotFoundException("Dog with id: " + id + " cannot be found."));
        return dogRepository.findById(id).get();
    }

    // find by person
    public List<Dog> findByPerson(Person person){
        return dogRepository.findByPerson(person);
    }

    // save a new dog
    public Dog save(Dog dog) {
        return dogRepository.save(dog);
    }

    // delete a dog
    public boolean delete(Integer id) throws DogNotFoundException {
        dogRepository.findById(id).orElseThrow(() -> new DogNotFoundException("Dog with id: " + id + " cannot be found."));
        dogRepository.deleteById(id);
        return true;
    }

    // update a dog
    public Dog update(Integer id, Dog dog) throws DogNotFoundException {
        dogRepository.findById(id).orElseThrow(() -> new DogNotFoundException("Dog with id: " + id + " cannot be found."));
        return dogRepository.save(dog);
    }
}
