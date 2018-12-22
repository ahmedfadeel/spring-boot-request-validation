package com.example.demo.controller;

import javax.validation.Valid;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Person;
import com.example.demo.bean.TestBean;
import com.example.demo.exceptions.InvalidRequestException;

@RestController
@Slf4j
public class TestController {

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String test(@Valid @RequestBody Person person, BindingResult bindingResult) {
		if(bindingResult.getErrorCount() > 0 ) {
			throw new InvalidRequestException("Error", bindingResult);	
		}
//		log.debug("test");
		return "test";
	}
	
	@RequestMapping(value = "/test-bean", method = RequestMethod.POST)
	public String test1(@Valid @RequestBody TestBean testBean) {		
		return "test-bean";
	}
	
	
}
