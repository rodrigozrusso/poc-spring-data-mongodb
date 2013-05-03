package com.poc.mongodb.repository;

import org.springframework.data.repository.CrudRepository;

import com.poc.mongodb.domain.Person;

public interface PersonRepository extends CrudRepository<Person, String> {

}
