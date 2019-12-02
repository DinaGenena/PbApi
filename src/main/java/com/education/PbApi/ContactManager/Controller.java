package com.education.PbApi.ContactManager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController 
public class Controller {
 
	@Autowired   //to link to component
	private PersonDAL personDAL ;

		@GetMapping("/contactList")
	public ArrayList<Person> getContacts(){
		 return personDAL.listContacts();
	}
		
		
		@GetMapping("/contactList/{name}")	
   public Person findContact(@PathVariable String name) {  //setting the parameter to be read from the URL/path 	
		return personDAL.findContact(name) ;
   }	
		
		@PostMapping("/contactList")
   public void addContact(@RequestBody Person person) {  //read person fields from http request body
	 personDAL.addContact(person);   
   }
		
      @DeleteMapping("/contactList/{name}")
  public void deleteContact(@PathVariable String name) {
	  personDAL.deleteContact(name);
  }
   
      
    
    
	
	
}
