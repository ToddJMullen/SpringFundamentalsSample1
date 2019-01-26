//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.ps.repository.CustomerRepository;
import com.ps.repository.HibernateCustomerRepositoryImpl;
import com.ps.service.CustomerService;
import com.ps.service.CustomerServiceImpl;

//The AppConfig class is not "a configuration file" just by existing
// we must add @Configuration annotations so that javac knows.

@Configuration// << mark this class as a configuration provider
@ComponentScan({"com.ps"})//Activate scanning to autowire in the com.ps package
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer
					getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

//	@Bean(name = "customerService")
//	public CustomerService getCustomerService() {
//		//we do not need to cache the result, 
//		//Spring automatically provides lazy loaded Singletons via @Bean
////		CustomerServiceImpl service = new CustomerServiceImpl( getCustomerRepository());
//		CustomerServiceImpl service = new CustomerServiceImpl();
//		// not sure why he's using setter instead, will follow suite though
////		service.setCustomerRepository(getCustomerRepository());//replaced with contructor DI
//		return service;
//	}
	
//	@Bean(name = "customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}
	
	
}//AppConfig
