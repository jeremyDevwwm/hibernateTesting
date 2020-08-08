package com.amiltone.hibernatetesting.respository;

import com.amiltone.hibernatetesting.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {


    public Person findByName(String name);
}
