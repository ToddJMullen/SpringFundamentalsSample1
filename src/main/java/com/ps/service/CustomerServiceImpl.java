package com.ps.service;

import java.util.List;

import com.ps.model.Customer;
import com.ps.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepo;
	
	public CustomerServiceImpl( CustomerRepository customerRepo ) {
		this.customerRepo = customerRepo;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}

	public void setCustomerRepo(CustomerRepository customerRepo) {
		this.customerRepo = customerRepo;
	}

}
