package com.ravi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ravi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Query(value ="select * from emp_tab", nativeQuery = true)
	public List<Employee> getEmp();
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE emp_tab SET emp_dep = 'Student' where emp_id = 107",nativeQuery = true)
	public void update(@Param("emp_dep")String emp_dep);

}
