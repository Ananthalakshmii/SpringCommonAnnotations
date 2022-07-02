package com.accolite.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.accolite.spring")
@PropertySource("classpath:app.properties")
public class CollegeConfig {

	/*
	@Bean //dependency injection
	public Principal principalCall() {
		return new Principal();
	}
	
	@Bean
	public Teacher mathTeacher() {
		return new MathTeacher();
	}
	
	@Bean(name = {"college", "collegeBean", "colBean"}) //giving alias name to the same bean
	public College college() { //method name will be the id of the bean
		//return new College(principalCall()); //constructor injection
		College college=new College();
		college.setPrincipal(principalCall()); //setter injection
		college.setTeacher(mathTeacher());
		return college;
	}
*/
}
