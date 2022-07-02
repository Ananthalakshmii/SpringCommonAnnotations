package com.accolite.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college=context.getBean("college",College.class);//college-method name of the @Bean
		System.out.println("College bean created "+college);
		college.test();
		
	}
}

//WAYS TO CREATE BEANS:
//1.bean.xml defining <bean>
//2. using @component and @componentScan
//3.using @bean
