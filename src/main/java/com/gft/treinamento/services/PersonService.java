package com.gft.treinamento.services;

import com.gft.treinamento.entities.Person;

public class PersonService {
    public Person createPerson(){
        Person person = new Person();
        person.setName("Aldo");
        person.setAge(18);
        person.setStatus(true);

        return person;

    }

}
