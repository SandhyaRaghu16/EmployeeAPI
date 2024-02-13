 package com.employee.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;
import com.employee.exception.NameNotFound;
import com.employee.exception.SalaryNotFound;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao empDao;
	
	public String addEmployee1(Employee e)
	{
		empDao.addEmployee1(e);
		return "Saved Successfully";
	}
	
	public String addEmployees(List<Employee> e)
	{
		return empDao.addEmployees(e);
	}
	
	public List<Employee> getDetails()
	{
		return empDao.getDetails();
	}
	
	public Employee getDetail(int a)
	{
		return empDao.getDetail(a);
	}
	
	public String deleteDetails(int b)
	{
		return empDao.deleteDetails(b);
	}
	public String updateDetail(Employee e)
	{
		return empDao.updateDetail(e);
	}
	
	public List<Employee> getData(int salary)
	{
		List<Employee>f=this.getDetails();
		return f.stream().filter(x->x.getSalary()>=salary).collect(Collectors.toList());
	}
	
	public List<String> getName(String designation)
	{
		List<Employee>f=this.getDetails();
		return f.stream().filter(x->x.getDesignation().equals(designation)).map(x->x.getName()).collect(Collectors.toList());
	}
	
	public String getMax()
	{
		List<Employee>f=this.getDetails();
		return f.stream().max(Comparator.comparingInt(Employee::getSalary)).get().getName();
	}
	
	public String getMin()
	{
		List<Employee>f=this.getDetails();
		return f.stream().min(Comparator.comparingInt(Employee::getSalary)).get().getDesignation();
	}
	
	public List<Employee> getHike(String designation)
	{
		List<Employee> f=this.getDetails();
		return f.stream().filter(x->x.getDesignation().equals(designation)).peek(x->x.setSalary((x.getSalary()*5/100)+x.getSalary())).toList();
	
	}
	public String gethike(String desg)
	{
		List<Employee> f=this.getDetails();
		f.stream().filter(x->x.getDesignation().equals(desg)).peek(x->x.setSalary((x.getSalary()*5/100)+x.getSalary())).toList();
		return "Hike Updated Successfully";
	}
	public List<Integer> getNames(String letter)
	{
		List<Employee>f=this.getDetails();
		 return f.stream().filter(x->x.getName().contains(letter)).map(x->x.getSalary()).collect(Collectors.toList());
		
	} 
	public List<String> getGender(String gender)
	{
		List<Employee>f=this.getDetails();
		
		return f.stream().filter(x->x.getGender().equalsIgnoreCase(gender)).map(x->x.getName()).collect(Collectors.toList());
	}
	
	public List<Employee> getBySal(int sal1,int sal2)
	{
		return empDao.getBySal(sal1,sal2);
	}
	
	public List<Employee> getById(int id1,int id2)
	{
		return empDao.getById(id1,id2);
	}
	public List<Employee> getByName(String name) throws NameNotFound
	{
		List<Employee>f=empDao.getDetails().stream().filter((x->x.getName().equalsIgnoreCase(name))).collect(Collectors.toList());
				
		if(f.isEmpty())
		{
			throw  new NameNotFound("Name is not present");
			}
		else
		{
			return f;
		}
		
	}
	public String addEmployee(Employee e) throws SalaryNotFound
	{
		try
		{
		
		if(e.getSalary()>1000000)
		{
			throw new SalaryNotFound("Salary not Found");
		}
		else
		{
			return empDao.addEmployee(e);
		}
		}
		catch(Exception ex)
		{
			return "Exception handled";
		}
	}
	public Employee getByIdDetail( int id)
	{
		return empDao.getByIdDetail(id);
	}
	
	
	
}
