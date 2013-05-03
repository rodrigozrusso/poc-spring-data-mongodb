# poc-spring-data-mongodb
=============

## Overview

This is a poc to use spring-data with mongodb.

### MongoDB
#### Install (MAC)
	brew install mongodb

#### Use (MAC)
run command:

	mongod

#### Console
to start the console run command: 

	mongo

### Application
This poc runs with **maven** 
#### Starting server
	mvn clean package jetty:run
	
#### Verify application
	curl 'http://localhost:8080/welcome'

#### List all objects
	curl 'http://localhost:8080/person'

#### Save a person (hardcoded)
	curl -X POST 'http://localhost:8080/person'


### And more?


Follow [@zrusso](http://twitter.com/zrusso) on Twitter for the latest news.
Send your feedback.