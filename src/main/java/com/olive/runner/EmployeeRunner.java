package com.olive.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olive.model.Employee;
import com.olive.model.Profile;
import com.olive.repo.EmployeeRepo;
import com.olive.repo.ProfileRepo;

@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	private ProfileRepo prepo;
	@Autowired
	private EmployeeRepo erepo;

	public void run(String... args) throws Exception {
		Profile p1= new Profile(10, 3, 300000.0);
		Profile p2= new Profile(20, 4, 400000.0);
		Profile p3= new Profile(30, 5, 500000.0);
		Profile p4= new Profile(40, 6, 600000.0);
		
		   prepo.save(p1);
		   prepo.save(p2);
		   prepo.save(p3);
		   prepo.save(p4);
		   
		   
		   erepo.save(new Employee(101, "Ravi", "DEV", p1));
		   erepo.save(new Employee(102, "Manoj", "DEV", p2));
		   erepo.save(new Employee(103, "Mahesh", "QA", p4));
		   erepo.save(new Employee(104, "Rohan", "DEV", p3));
   		System.out.println("DONE");
   		Optional<Employee> findById = erepo.findById(101);
   		System.out.println("Data :: " + findById);

	}

}
