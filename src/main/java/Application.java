import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;//<< replaced with AppConfig

import com.ps.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
//		CustomerService service = new CustomerServiceImpl();
		
//		ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// ^^^ used for the autowiring/XML approach
		
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);
		//Change app ctx to use the AppConfig implementation
		
		CustomerService service = appCtx.getBean("customerService", CustomerService.class );
		
		System.out.println( service.findAll().get(0).getNameFirst() );

	}

}
