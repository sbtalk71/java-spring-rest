package clients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.spring.HrApp;
import com.demo.spring.config.AppConfig;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		HrApp hrApp=ctx.getBean(HrApp.class);
		
		String resp=hrApp.registerEmployee(100, "A", "Gurgaon",5600);
		System.out.println(resp);

	}

}
