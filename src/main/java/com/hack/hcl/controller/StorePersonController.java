package com.hack.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hack.hcl.dao.StorePersonDAO;
import com.hack.hcl.model.StorePerson;

@RestController
@RequestMapping("/storePersonLogin")
public class StorePersonController {
	@Autowired
	StorePersonDAO dao;
	
	
	
	@PostMapping(path="/login")
	@CrossOrigin(maxAge=80000)
	public String validateUserCredential(@RequestBody StorePerson cust){
		
		List<StorePerson> stores = (List<StorePerson>) dao.findAll();
		boolean check = false;
		for (StorePerson storePerson : stores) {
			if(storePerson.getPersonUserName().equals(cust.getPersonUserName())
					&& storePerson.getPersonPassword().equals(cust.getPersonPassword())){
				check = true;
			}
		}
		if(check){
			return "true";
		}
		return "false";
	}
}
