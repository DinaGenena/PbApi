package com.education.PbApi.ContactManager;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component  
public class PersonDAL {

 private static ArrayList<Person> contactList = new ArrayList<Person> () ; 
   static {
	   contactList.add(new Person("Person1","1111-1111","2222-2222","3333-3333","null") );
	   contactList.add(new Person("Person2","1111-2222","1111-2222","null","null") );
	   contactList.add(new Person("Person3","2222-3333","3333-3333","null","email@example.com") );
  }

   //return entire contactList
  public ArrayList<Person>listContacts (){ 
	  return contactList  ;
   }  
   
  //add new user to list
  public void addContact (Person person) {
	  contactList.add(person);
  } 
   
  
  //find user by name
  public Person findContact(String name) {
	  Person tmpPerson = null ; 
	  List list = contactList.stream().filter(person -> name.equals(person.getName())).collect(Collectors.toList());
	  if (list.size() != 0 )
		{ tmpPerson = (Person) list.get(0);}
	 return tmpPerson ;
  } 
  
  
  public void deleteContact(String name) {
	  Person tmpPerson = null ; 
	  List list = contactList.stream().filter(person -> name.equals(person.getName())).collect(Collectors.toList());
	  if (list.size() != 0 )
		{ tmpPerson = (Person) list.get(0);
		  contactList.remove(tmpPerson) ;
		}
	  
  } 
  
  
   
  
 }
   
   
   

 