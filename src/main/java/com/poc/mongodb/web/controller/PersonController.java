package com.poc.mongodb.web.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poc.mongodb.domain.Person;

@Controller
@RequestMapping("/person")
@Slf4j
public class PersonController {

	@Autowired
	private CrudRepository<Person, String> personRepository;

	@RequestMapping(method = RequestMethod.POST)
	public String save(ModelMap model) {

		Person person = new Person();
		person.setName("Rodrigo");
		person.setAge(28);
		log.info("person={}", person);

		personRepository.save(person);

		model.addAttribute("name", person.getName());
		return "person";

	}

	@RequestMapping(method = RequestMethod.GET)
	public String getAll(ModelMap model) {

		Iterable<Person> people = personRepository.findAll();
		
		log.info("Total numbers of people:{}", personRepository.count());

		model.addAttribute("people", people);
		return "person";

	}
}
