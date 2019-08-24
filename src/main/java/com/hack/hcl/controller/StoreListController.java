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

import com.hack.hcl.dao.StoreListDao;
import com.hack.hcl.model.StoreList;

@RestController
@RequestMapping("/store")
public class StoreListController {

	@Autowired
	StoreListDao storeDao;
	
	@GetMapping(path="/getPendingStoreList")
	public List<StoreList> getAllStoreList(){
		
		
		return (List<StoreList>) storeDao.findAll();
	}
	
	@PostMapping(path="/addStore", consumes=MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin(maxAge=8000)
	public String addStoreList(@RequestBody StoreList list){
		
		storeDao.save(list);
		return list.getStoreName();
	}
}
