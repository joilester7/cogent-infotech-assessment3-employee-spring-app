/**
 * 
 */
package com.cogent.employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Joi
 * @date: Feb 9, 2023
 */

@Configuration
public class EmployeeMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeApplication.class);
		Employee e = ctx.getBean("employee", Employee.class);
		
		System.out.println("Employee ID is: " + e.getEmpId());
		System.out.println("Employee name is: " + e.getEmpName());
		System.out.println("Employee salary is: " + e.getEmpSal());
	}
	
}
