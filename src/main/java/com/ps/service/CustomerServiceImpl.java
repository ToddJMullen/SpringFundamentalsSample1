package com.ps.service;

import java.util.List;

import com.ps.model.Customer;
import com.ps.repository.CustomerRepository;
import com.ps.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl {

	
	private CustomerRepository customerRepo = new HibernateCustomerRepositoryImpl();
			
	public List<Customer> findAll(){
		return customerRepo.findAll();
	}
			
	
	
}
