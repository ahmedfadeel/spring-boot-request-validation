package com.example.demo.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.demo.annotations.InRange;

public class Person {
	@NotNull @Size(min = 1, max = 10)
	private String firstname;
	@NotNull @Size(min = 1, max = 10)
	private String lastname;
	@NotNull @InRange(min = 1, max = 10) 
	private int age;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
}
