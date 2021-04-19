package com.myProject.demo.com.myProject.demo.model;

public class PersonFactory {

    public Person getPerson(String name, int age){
        return new Person(name, age);
    }
}
