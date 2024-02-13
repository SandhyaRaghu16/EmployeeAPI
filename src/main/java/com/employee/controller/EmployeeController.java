package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.exception.NameNotFound;
import com.employee.exception.SalaryNotFound;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@PostMapping(value="/insertDetail")
	public String addEmployee1(@RequestBody Employee e)
	{
		return empService.addEmployee1(e);
	}
	
	@PostMapping(value="/insertingAll")
	public String addEmployees(@RequestBody List<Employee> e)
	{
		return empService.addEmployees(e);
	}
	
	@GetMapping(value="/getdetails")
	public List<Employee> getDetails()
	{
		return empService.getDetails();
	}
	
	@GetMapping(value="/getdetail/{a}")
	public Employee getDetail(@PathVariable int a)
	{
		return empService.getDetail(a);
	}
	
	@DeleteMapping(value="/deleteid/{b}")
	public String deleteDetails(@PathVariable int b)
	{
		return empService.deleteDetails(b);
	}
	
	@PutMapping(value="/updatedetails")
	public String updateDetail(@RequestBody Employee e)
	{
		return empService.updateDetail(e);
	}

	@GetMapping(value="/getDetails/{salary}")
	public List<Employee> getData(@PathVariable int salary)
	{
		return empService.getData(salary);
	}
	
	@GetMapping(value="/getname/{designation}")
	public List<String> getName(@PathVariable String designation)
	{
		return empService.getName(designation);
	}
	
	@GetMapping(value="/maxsalary")
	public String getMax()
	{
		return empService.getMax();
	}
	
	@GetMapping(value="/minsalary")
	public String getMin()
	{
		return empService.getMin();
	}
	
	@GetMapping(value="/hike/{designation}")
	public List<Employee> getHike(@PathVariable String designation)
	{
		return empService.getHike(designation);
	}
	
	@GetMapping(value="/hikeSalary/{desg}")
	public String gethike(@PathVariable String desg)
	{
		return empService.gethike(desg);
	}
	
	@GetMapping(value="/getName/{letter}")
	public List<Integer> getNames(@PathVariable String letter)
	{
		return empService.getNames(letter);
	}
	
	@GetMapping(value="/getGender/{gender}")
	public List<String> getGender(@PathVariable String gender)
	{
		return empService.getGender(gender);
	}
	
	@GetMapping(value="/getBySal/{sal1}/{sal2}")
	public List<Employee> getBySal(@PathVariable int sal1,@PathVariable int sal2)
	{
		return empService.getBySal(sal1,sal2);
	}
	@GetMapping(value="/getById/{id1}/{id2}")
	public List<Employee> getById(@PathVariable int id1,@PathVariable int id2)
	{
		return empService.getById(id1,id2);
	}
	
	@GetMapping(value="/getByName/{name}")
	public List<Employee> getByName(@PathVariable String name) throws NameNotFound
	{
		return empService.getByName(name);
	}
	
	@PostMapping(value="/insertDetails")
	public String addEmployee(@RequestBody Employee e)throws SalaryNotFound
	{
		return empService.addEmployee(e);
	}
	
	@GetMapping(value="/getById/{id}")
	public Employee getByIdDetail(@PathVariable int id)
	{
		return empService.getByIdDetail(id);
	}
	
	
}
