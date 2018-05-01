package com.example.demo.bean;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class TestBean {

	@NotNull
	@Valid
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "TestBean [person=" + person + "]";
	}
	
}
