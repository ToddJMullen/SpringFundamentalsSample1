import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ps.repository.CustomerRepository;
import com.ps.repository.HibernateCustomerRepositoryImpl;
import com.ps.service.CustomerService;
import com.ps.service.CustomerServiceImpl;

//The AppConfig class is not "a configuration file" just by existing
// we must add @Configuration annotations so that javac knows.

@Configuration// << mark this class as a configuration provider
public class AppConfig {

	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
//		CustomerServiceImpl = new CustomerServiceImpl( getCustomerRepository() );
		// not sure why he's using setter instead, will follow suite though
		CustomerServiceImpl service = new CustomerServiceImpl();
		service.setCustomerRepository(getCustomerRepository());
		return service;
	}
	
	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}
	
	
}//AppConfig
