package com.example.antdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.antdemo.domain.Person;


public class PersonManager {
	
	private List<Person> db = new ArrayList<Person>();
	
    public void addPerson(Person person) {
    	Person p = new Person();
    	p.setName(person.getName());
    	p.setYob(person.getYob());
    	db.add(p);
    }

    public List<Person> getAllPersons(){
    	return db;
    }
    
    public void clearUp(){
    	db.clear();
    }
}
