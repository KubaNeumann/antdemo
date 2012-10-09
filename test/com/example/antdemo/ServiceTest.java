package com.example.antdemo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.antdemo.domain.Person;
import com.example.antdemo.service.PersonManager;

public class ServiceTest {
	 
	PersonManager pm = new PersonManager();
	
	private final String P1_NAME = "Bolek";
	
	@Test
	public void addingTest(){
		
		Person p = new Person();
		p.setName(P1_NAME);
		p.setYob(1983);
		
		pm.clearUp();
		
		assertEquals(0, pm.getAllPersons().size());
		
		pm.addPerson(p);
		
		assertEquals(1, pm.getAllPersons().size());
		
		Person retrievedPerson = pm.getAllPersons().get(0);
		
		assertEquals(P1_NAME, retrievedPerson.getName());
		
	}

}
