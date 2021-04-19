package com.myProject.demo.service.serviceImpl;

import com.myProject.demo.repository.PersonRepository;
import com.myProject.demo.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

private final PersonRepository personRepository;

public PersonServiceImpl (PersonRepository personRepository){

    this.personRepository = personRepository;
}
    @Override
    public String findPerson() {
        return personRepository.findPerson();
    }
}
