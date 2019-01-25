package com.ps.repository;

import java.util.ArrayList;
import java.util.List;

import com.ps.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	private String dbUsername;
	
	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	/* (non-Javadoc)
	 * @see com.ps.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		System.out.println("dbUsername: " + dbUsername );
		
		List<Customer> customerList = new ArrayList<Customer>();
		
		Customer cust = new Customer();
		cust.setNameFirst("Todd");
		cust.setNameLast("M");
		
		customerList.add(cust);
		return customerList;
		
	}

}
