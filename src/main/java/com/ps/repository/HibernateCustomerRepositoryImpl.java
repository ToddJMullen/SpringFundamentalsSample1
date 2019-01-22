package com.ps.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ps.model.Customer;

@Repository("customerRepo")//<< stereotype annotation identifies this repo bean
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.ps.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customerList = new ArrayList<Customer>();
		
		Customer cust = new Customer();
		cust.setNameFirst("Todd");
		cust.setNameLast("M");
		
		customerList.add(cust);
		return customerList;
		
	}

}
