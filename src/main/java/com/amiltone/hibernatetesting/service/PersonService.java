package com.amiltone.hibernatetesting.service;

import com.amiltone.hibernatetesting.entity.Person;
import com.amiltone.hibernatetesting.respository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public Person savePerson(Person person){
       return repository.save(person);
    }
    public List<Person> savePersons(List<Person> persons){
        return repository.saveAll(persons);
    }

    public List<Person> getPersons(){
        return repository.findAll();
    }
    public Person getPersonById(int id){
        return repository.findById(id).orElse(null);
    }
    public Person getPersonByName(String name){
        return repository.findByName(name);
    }

    public String deletePerson(int id){
        repository.deleteById(id);
        return "User " + id + " Deleted";
    }

    public Person updatePerson(Person person){
        Person existingPerson = repository.findById(person.getId()).orElse(null);
        existingPerson.setName(person.getName());
        existingPerson.setFirstname(person.getFirstname());
        return repository.save(existingPerson);
    }
}
