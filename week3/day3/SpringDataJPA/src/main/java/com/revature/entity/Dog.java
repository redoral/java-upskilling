package com.revature.entity;

import javax.persistence.*;

@Entity
@Table(name="dog")
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    String breed;
    int age;


    // entity relationship
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    // constructors
    public Dog(){ }

    public Dog(int id, String name, String breed, int age) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Dog(int id, String name, String breed, int age, Person person) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.person = person;
    }


    public Dog(String name, String breed, int age, Person person) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.person = person;
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }




    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // methods
    public String checkOnDog(){
        return "What the dog doing?";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
