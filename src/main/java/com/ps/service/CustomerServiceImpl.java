package com.ps.service;

import java.util.List;

import com.ps.model.Customer;
import com.ps.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepo;
	
	public CustomerServiceImpl() {
		
	}
	
	public CustomerServiceImpl( CustomerRepository customerRepository ) {
		this.customerRepo = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}

	public void setCustomerRepo(CustomerRepository customerRepo) {
		System.out.println("setCustomerRepo() Setting customer repo: " + customerRepo );
		this.customerRepo = customerRepo;
	}

}
