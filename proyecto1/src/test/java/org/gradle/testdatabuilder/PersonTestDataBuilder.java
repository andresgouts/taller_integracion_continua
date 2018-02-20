package org.gradle.testdatabuilder;

import org.gradle.domain.Person;

public class PersonTestDataBuilder {
	
	private String name;
	private String lastName;
	
	public PersonTestDataBuilder() {
		this.name = "andres";
		this.lastName = "Gomez";
	}
	
	public PersonTestDataBuilder whitName(String name) {
		this.name = name;
		return this;
	}
	
	public PersonTestDataBuilder whitLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public Person build(){
		return new Person(this.name, this.lastName);
	}
}
