package com.amiltone.hibernatetesting.controller;


import com.amiltone.hibernatetesting.entity.Person;
import com.amiltone.hibernatetesting.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping("/addPerson")
    public Person addPerson(@RequestBody Person person){
        return service.savePerson(person);
    }

    @PostMapping("/addPersons")
    public List<Person> addPersons(@RequestBody List<Person> persons){
        return service.savePersons(persons);
    }

    @GetMapping("/Persons")
    public List<Person> findAllPersons(){
        return service.getPersons();
    }

    @GetMapping("/PersonById/{id}")
    public Person findPersonById(@PathVariable int id){
        return service.getPersonById(id);
    }

    @GetMapping("/PersonByName/{name}")
    public Person findPersonByName(@PathVariable String name){
        return service.getPersonByName(name);
    }

    @GetMapping("/PersonByFirstName/{firstname}")
    public Person findPersonByFirstName(@PathVariable String firstname){
        return service.getPersonByFirstame(firstname);
    }

    @PutMapping("/update")
    public Person updatePerson(@RequestBody Person person){
        return service.updatePerson(person);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePerson(@PathVariable int id){
        service.deletePerson(id);
        return "Person deleted !";

    }
}
