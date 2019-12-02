package com.education.PbApi.ContactManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;



@RestController 
public class Controller {
 
	@Autowired   //to link to component
	private PersonDAL personDAL ;
	
}
