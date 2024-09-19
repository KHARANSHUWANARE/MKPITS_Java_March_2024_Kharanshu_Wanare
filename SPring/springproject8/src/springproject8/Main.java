package springproject8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appconfig.xml");
		
		Student student =(Student) applicationContext.getBean("s");
		
		System.out.println(student);
	}

}