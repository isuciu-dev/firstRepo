package com.myProject.demo.repository;

import com.myProject.demo.model.Person;
import com.myProject.demo.model.PersonFactory;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository {

    public String findPerson(){

        PersonFactory factory = new PersonFactory();
        Person p = factory.getPerson("John", 33);
        return p.getName();
    }
}
