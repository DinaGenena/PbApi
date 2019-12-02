package com.education.PbApi.ContactManager;

import javax.persistence.Entity;

@Entity   //for JPA to map to db table with the same name  
public class Person {


	private String name ; 
	private String homeNumber ; 
	private String cellNumber ; 
	private String workNumber ; 
	private String email ;
	
	public Person(String name, String homeNumber, String cellNumber, String workNumber, String email) {
		this.name = name;
		this.homeNumber = homeNumber;
		this.cellNumber = cellNumber;
		this.workNumber = workNumber;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHomeNumber() {
		return homeNumber;
	}
	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}
	public String getCellNumber() {
		return cellNumber;
	}
	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}
	public String getWorkNumber() {
		return workNumber;
	}
	public void setWorkNumber(String workNumber) {
		this.workNumber = workNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 
	
	
	
}
