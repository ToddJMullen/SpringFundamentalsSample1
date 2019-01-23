import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ps.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
//		CustomerService service = new CustomerServiceImpl();
		
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService service = appCtx.getBean("customerService", CustomerService.class);

		System.out.println( service.findAll().get(0).getNameFirst() );

	}

}
