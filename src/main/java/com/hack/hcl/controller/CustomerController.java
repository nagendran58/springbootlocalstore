package com.hack.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hack.hcl.dao.CustomerDAO;
import com.hack.hcl.model.StoreCustomer;
@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerDAO custDao;
	
	
	
	@PostMapping(path="/addCust", consumes=MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin(maxAge=3800)
	public Integer addStoreList(@RequestBody StoreCustomer cust){
		
		custDao.save(cust);
		return cust.getCustId();
	}
}
