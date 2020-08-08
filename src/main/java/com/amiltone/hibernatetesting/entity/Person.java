package com.amiltone.hibernatetesting.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "test_user")

public class Person {
    @Id
    @GeneratedValue
    private int Id;
    private String firstname;
    private String name;
}
