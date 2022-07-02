package com.accolite.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("college")       //@Component -- will have the bean name as college -- class name starting small letter
public class College {
	
	private String collegeName;
	
	@Autowired //doesnt require setter method when annotation used beofre field
	private Principal principal;
	@Autowired
	@Qualifier("scienceTeacher") //qualifier first priortiy
	private Teacher teacher;
	
	@Required
	@Value("${college.name}")
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public College() {
		super();
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public College(Principal principal) { //constructor injection
		this.principal = principal;
	}

	public void test() {
		System.out.println("inside test method in college");
		principal.principalInfo();
		teacher.teach();
		System.out.println("college name is "+collegeName);
	}

}
