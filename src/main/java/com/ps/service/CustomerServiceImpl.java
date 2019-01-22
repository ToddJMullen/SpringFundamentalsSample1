package com.ps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.model.Customer;
import com.ps.repository.CustomerRepository;
//import com.ps.repository.HibernateCustomerRepositoryImpl;

@Service("customerService")// << stereotype annotation
public class CustomerServiceImpl implements CustomerService {

//	@Autowired //<< member injectino 
	private CustomerRepository customerRepo;//	 = new HibernateCustomerRepositoryImpl();
	//note that this is still using the hard wired dependency bc this rev was started
	//on the base started sample (rev 1) "spring_sample" & hence the "poor" example code is the start
	//& applicationContext IS NOT wired to use constructor injection or setter injection
	//to provide the CustomerRepository instance that should be used (as in rev 2 "spring_sample_xml").
	//In rev 3, we will use autowiring/annotations to decouple the Repo instance as the preferred method
	
	@Autowired//Mark constructor for DI
	public CustomerServiceImpl( CustomerRepository customerRepo ) {
		System.out.println("CustomerServiceImpl() injected with repo instance of:\n " + customerRepo.getClass() );
		this.customerRepo = customerRepo;
	}
	//All the @Autowired annotations here are enabled via
	// <context:annotation-config /> & <context:component-scan /> in applicationContext.xml
	// those are enable/added in applicationContext.xml by adding the Spring Context namespace(s)
	
	
//	@Autowired // << setter injection
	public void setCustomerRepo(CustomerRepository customerRepo) {
		System.out.println("setCutomerRepo() called for setter injection with:\n " + customerRepo.getClass() );
		this.customerRepo = customerRepo;
	}
	//this ^^^ member injection method of configuring autowiring is basically the same as would be done w/o Spring
	//both methods can be used & may be considered a matter of preference
	//by providing this explicit setter with the @Autowired, Spring knows that DI is being requested by type here

	/* (non-Javadoc)
	 * @see com.ps.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}
	
}
