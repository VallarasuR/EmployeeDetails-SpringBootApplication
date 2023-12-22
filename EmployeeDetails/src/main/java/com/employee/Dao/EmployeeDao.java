package com.employee.Dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.employee.Bean.Employee;
import com.employee.Repos.EmployeeRepostory;

public class EmployeeDao 
{
   // private static List<Employee>  emp = new ArrayList<Employee>();
    private EmployeeRepostory repo ;
    
    @Autowired
    public EmployeeDao(EmployeeRepostory repo) 
    {
    	this.repo=repo;
	}
	
	/*static 
	{
		emp.add(new Employee(1,"vallarasu",23,"Neyveli"));
		emp.add(new Employee(2,"vallarasu",23,"Neyveli"));
		emp.add(new Employee(3,"vallarasu",23,"Neyveli"));
		emp.add(new Employee(4,"vallarasu",23,"Neyveli"));
		
	}*/
	
	public List<Employee> getDetails()
	{
		List<Employee>  emp = repo.findAll();
		return emp;
	}
	
	
	public List<Employee> getSave()
	{
		List<Employee>  emp = repo.findAll();
		return emp;
	}
	
	public List<Employee> getUpdate()
	{
		List<Employee>  emp = repo.findAll();
		return emp;
	}

	
	
	
}
