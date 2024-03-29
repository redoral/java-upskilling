package com.revature.repository;

import com.revature.entity.Dog;
import com.revature.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepository extends CrudRepository<Dog, Integer> {
    List<Dog> findByPerson(Person person);
}
