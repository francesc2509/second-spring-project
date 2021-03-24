package com.springcourse.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcourse.annotations.model.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		Employee salesManager = context.getBean("salesManager", Employee.class);
		System.out.println(salesManager.getTasks());
		System.out.println(salesManager.getReport());
		
		context.close();
	}

}
