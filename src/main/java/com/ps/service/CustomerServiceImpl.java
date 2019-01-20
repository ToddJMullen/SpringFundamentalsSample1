package com.ps.service;

import java.util.List;

import com.ps.model.Customer;
import com.ps.repository.CustomerRepository;
import com.ps.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	
	private CustomerRepository customerRepo = new HibernateCustomerRepositoryImpl();
			
	/* (non-Javadoc)
	 * @see com.ps.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepo.findAll();
	}
			
	
	
}
