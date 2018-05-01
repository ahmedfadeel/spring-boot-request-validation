package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Person;

@RestController
public class PersonController {

	@RequestMapping(value = "/person", method = RequestMethod.POST)
	public String person(@Valid @RequestBody Person person) {
		return "person";
	}
	
	@RequestMapping(value = "/person", method = RequestMethod.GET)
	public String person(@RequestParam(value = "name", required = true) String name ) {
		return "name value = " + name;
	}
	
	@RequestMapping(value = "/api/{path}", method = RequestMethod.GET)
	public String path(@PathVariable(value = "path", required = true) String path ) {
		return "path value = " + path;
	}
}
