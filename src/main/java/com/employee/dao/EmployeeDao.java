package com.employee.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	
	@Autowired
	EmployeeRepository empRepository;
	
	public String addEmployee1(Employee e)
	{
		empRepository.save(e);
		return "Successfully Saved";
	}
	
	public String addEmployees(List<Employee> e)
	{
		empRepository.saveAll(e);
		return "Saved Successfully";
	}
	
	public List<Employee> getDetails()
	{
		return empRepository.findAll();
	}
	public Employee getDetail(int a)
	{
		return empRepository.findById(a).get();
	}
	
	public String deleteDetails(int b)
	{
		 empRepository.deleteById(b);
		 return "Deleted Successfully";
	}
	public String updateDetail(Employee e)
	{
		empRepository.save(e);
		return "Updated Successfully";
	}
	public List<Employee> getBySal(int sal1,int sal2)
	{
		return empRepository.getBySal(sal1,sal2);
	}
	
	public List<Employee> getById(int id1,int id2)
	{
		return empRepository.getById(id1,id2);
	}
	public String addEmployee(Employee e)
	{
		empRepository.save(e);
		return "Successfully Saved";
	}
	public Employee getByIdDetail( int id)
	{
		return empRepository.findById(id).get();
	}

	
	
	
}
