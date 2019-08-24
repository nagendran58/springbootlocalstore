package com.hack.hcl.dao;

import org.springframework.data.repository.CrudRepository;

import com.hack.hcl.model.StoreCustomer;

public interface CustomerDAO extends CrudRepository<StoreCustomer, Integer>{

}
