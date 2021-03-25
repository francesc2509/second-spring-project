package com.springcourse.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcourse.annotations.model.Employee;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class); 
		
		Employee salesManager = context.getBean("salesManager", Employee.class);
		System.out.println(salesManager.getTasks());
		System.out.println(salesManager.getReport());
		
		System.out.println();
		Employee salesManager2 = context.getBean("salesManager", Employee.class);
		System.out.println(salesManager.getTasks());
		System.out.println(salesManager.getReport());
		
		System.out.println(salesManager + " - " + salesManager2);
		
		context.close();
	}
}
