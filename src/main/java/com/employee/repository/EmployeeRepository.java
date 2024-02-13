package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	@Query(value="select * from employee_details where salary>=? and salary<=?",nativeQuery=true)
	public List<Employee> getBySal(int sal1,int sal2);
	
	@Query(value="select e from Employee e where e.id>=:id1 and e.id<=:id2")
	public List<Employee> getById(@Param(value = "id1") int id1,@Param(value = "id2") int id2);
	
	
}
