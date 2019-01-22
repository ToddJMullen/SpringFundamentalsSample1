package com.ps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.model.Customer;
import com.ps.repository.CustomerRepository;
//import com.ps.repository.HibernateCustomerRepositoryImpl;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepo;//	 = new HibernateCustomerRepositoryImpl();
	//note that this is still using the hard wired dependency bc this rev was started
	//on the base started sample (rev 1) "spring_sample" & hence the "poor" example code is the start
	//& applicationContext IS NOT wired to use constructor injection or setter injection
	//to provide the CustomerRepository instance that should be used (as in rev 2 "spring_sample_xml").
	//In rev 3, we will use autowiring/annotations to decouple the Repo instance as the preferred method
			
	/* (non-Javadoc)
	 * @see com.ps.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}
	
}
