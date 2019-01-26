package com.ps.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.ps.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUsername}")
	private String dbUsername;
	
	//Commented out when switched to annotation config import
//	public void setDbUsername(String dbUsername) {
//		this.dbUsername = dbUsername;
//	}

	/* (non-Javadoc)
	 * @see com.ps.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		System.out.println("HibernateCustomerRepositoryImpl().findAll()\ndbUsername: " + dbUsername );
		
		List<Customer> customerList = new ArrayList<Customer>();
		
		Customer cust = new Customer();
		cust.setNameFirst("Todd");
		cust.setNameLast("M");
		
		customerList.add(cust);
		return customerList;
		
	}

}
