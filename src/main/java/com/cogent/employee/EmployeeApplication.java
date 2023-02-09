/**
 * 
 */
package com.cogent.employee;

import org.springframework.context.annotation.Bean;

/**
 * @author: Joi
 * @date: Feb 9, 2023
 */
public class EmployeeApplication {
	@Bean(name="employee")
	public Employee getEmployee() {
		Employee e1 = new Employee();
		e1.setEmpId(1001);
		e1.setEmpName("Joi");
		e1.setEmpSal(5000);
		return e1;
	}
}
