package com.codeclan.EmployeeTracker;

import com.codeclan.EmployeeTracker.models.Employee;
import com.codeclan.EmployeeTracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee employee1 = new Employee("Alex", 25, 345, "alex@gmail.com");
		Employee employee2 = new Employee("Ahmed", 30, 350, "ahmed@gmail.com");

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);

	}

}
