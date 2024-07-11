package com.min.edu.anno06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Anno06_Main {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("com/min/edu/anno06/Anno06.xml");
//		IUserService service01 =
//		context.getBean("userServiceImpl", UserServiceImpl.class);
//		service01.addUser();
		
//		IUserService service02 =
//				context.getBean("userServiceImpl", UserServiceImpl.class);
//		service02.addUser();
		
//		UserService service = context.getBean(UserService.class);
//		service.printUser01();
//		service.printUser02();
		
//		ApplicationContext configurationBeanMethod = 
//				new AnnotationConfigApplicationContext("UserService.class");
//		configurationBeanMethod.getBean("printUser01");
		
		UserServiceImpl2 impl2 =
		context.getBean("userServiceImpl2",UserServiceImpl2.class);
		System.out.println(impl2);
		
	}

}
