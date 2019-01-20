package com.ps.repository;

import java.util.ArrayList;
import java.util.List;

import com.ps.model.Customer;

public class HibernateCustomerRepositoryImpl {
	
	public List<Customer> findAll(){
		List<Customer> customerList = new ArrayList<Customer>();
		
		Customer cust = new Customer();
		cust.setNameFirst("Todd");
		cust.setNameLast("M");
		
		customerList.add(cust);
		return customerList;
		
	}

}
