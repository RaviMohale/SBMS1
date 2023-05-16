package com.ravi;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.ravi.entity.Employee;
import com.ravi.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
				EmployeeRepository repo = context.getBean(EmployeeRepository.class);
				/*
				 * System.out.println(repo.getClass().getName()); Employee e1 = new
				 * Employee(102, "Abhi", 20000.00, "Male", "Agri"); Employee e2 = new
				 * Employee(103, "Shrushti", 35000.00, "Fe-Male", "Doctor"); Employee e3 = new
				 * Employee(104, "Rajju", 40000.00, "Fe-Male", "Teacher"); Employee e4 = new
				 * Employee(105, "Kishor", 45000.00, "Male", "SAP"); Employee e5 = new
				 * Employee(106, "Sagar", 32000.00, "Male", "Software Devloper"); Employee e6 =
				 * new Employee(107, "Nishu", 50000.00, "Male", "Gamer"); Employee e7 = new
				 * Employee(108, "Vivek", 60000.00, "Male", "Production Dev");
				 * repo.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7));
				 * System.out.println("recorde inserted....");
				 */
				//sorting method of JPA repository
				/*
				 * Sort ascending = Sort.by("empName").ascending(); //by ascending order
				 * List<Employee> findAll = repo.findAll(ascending); findAll.forEach(System.out
				 * :: println);
				 */
				//by descnding order
				/*
				 * Sort descending = Sort.by("empName").descending(); //by descending order
				 * List<Employee> findAll = repo.findAll(descending); findAll.forEach(System.out
				 * :: println);
				 */
				
				//short base on multiple column
				
				/*
				 * Sort sort = Sort.by("empName","empSalary").descending(); List<Employee>
				 * findAll = repo.findAll(sort);
				 * 
				 * findAll.forEach(System.out::println);
				 */
				//we can not sort  and pagable in one both are different method
				/*
				 * int pageNo = 1;// you can change the page no. according you will get the
				 * record PageRequest pageRequest = PageRequest.of(pageNo -1, 3); Page<Employee>
				 * findAll = repo.findAll(pageRequest);
				 * 
				 * findAll.forEach(System.out::println);
				 */
				
				
				//dynamic query by Query-by Example concept
				
				//find Employee on the Gender type
				
				/*
				 * Employee emp = new Employee(); emp.setEmpGender("Male");
				 * emp.setEmpDep("Agri");
				 * 
				 * Example<Employee> of = Example.of(emp); List<Employee> findAll =
				 * repo.findAll(of); findAll.forEach(System.out::println);
				 */
				 
				
				//==================using custom query......========
				/*
				 * List<Employee> emp = repo.getEmp(); emp.forEach(System.out::println);
				 */
				
				//	repo.update("emp_dep");
				Employee emp = new Employee();
				emp.setEmpId(102);
				emp.setEmpName("Rajju");
				emp.setEmpDep("Teacher");
				emp.setEmpGender("Fe-Male");
				emp.setEmpSalary(35000.00);
				repo.save(emp);
				
	}
}
