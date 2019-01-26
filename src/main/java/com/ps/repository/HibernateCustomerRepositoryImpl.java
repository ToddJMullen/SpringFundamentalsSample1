package com.ps.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.ps.model.Customer;

@Repository("customerRepository")//<< stereotype annotation identifies this repo bean
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${appSecret1}")
	private String dbUsername;
	
	@Value("${appSecret2}")
	private String dbPassword;
	
	
	/* (non-Javadoc)
	 * @see com.ps.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customerList = new ArrayList<Customer>();

		System.out.println("findAll() dbUsername: " + dbUsername );
		System.out.println("findAll() dbPassword: " + dbPassword );
		
		Customer cust = new Customer();
		cust.setNameFirst("Todd");
		cust.setNameLast("M");
		
		customerList.add(cust);
		return customerList;
		
	}

}
