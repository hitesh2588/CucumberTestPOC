Feature: Sample feature test

This is a sample feature file

Scenario: Sample scenario to test cucumber feature
		Given The user access the endpoint URL "http://localhost:9090" and basepath "/student"
		When The user makes a request
		Then then the status code is 200
		
Scenario: Sample scenario to test retrieval of student info
		Given The user access the endpoint URL "http://localhost:9090" and basepath "/student"
		When the user makes a request for student id "10"
		Then The status code is 200
		