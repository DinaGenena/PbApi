package com.education.PbApi.ContactManager.DatabaseManagement;



import java.util.ArrayList;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.education.PbApi.ContactManager.Person;
import com.education.PbApi.ContactManager.PersonDAL;

@RestController 
public class DatabaseEndpoint {
	  
	private PersonDAL personDAL = new PersonDAL () ; 
	
	// load old phone db (XML format)
	  @PostMapping("/loadOldDB")
	   public void addContact(@RequestBody ArrayList<Person> oldList) {  //read person fields from http request body    
			
		 oldList.forEach(person -> personDAL.addContact(person));
		
	   }
	

	}
	
	
	

