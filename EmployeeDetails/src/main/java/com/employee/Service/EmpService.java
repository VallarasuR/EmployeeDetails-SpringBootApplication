package com.employee.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.employee.Bean.Employee;
import com.employee.Dao.EmployeeDao;
import com.employee.Exception.UserNotFoundException;
import com.employee.Repos.EmployeeRepostory;






@Service
public class EmpService 
{

	  private static List<Employee>  emp = new ArrayList<Employee>();
	  private EmployeeRepostory repo ;
	  
	  @Autowired
	  public EmpService(EmployeeRepostory repo) 
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

	
	public List<Employee> toGetAllEmp()
	{
		emp=repo.findAll();
		return  emp;
				
	}
	
	
	public List<Employee> toDelete(int empId)
	{
		repo.deleteById(empId);
		return toGetAllEmp();
	}
	

	public Employee toSave(Integer empId, String empName, Integer  empAge, String empLocation)
	{
		Employee emplo=new Employee(empId,empName, empAge, empLocation);
		Employee emp =  repo.save(emplo);
		return emp;
	}
	
	
	
	public Employee toSearch(int empId)
	{
		Optional<Employee> emplo = repo.findById(empId);
		if(!emplo.isPresent()) 
		{
			throw new UserNotFoundException("EmpId - " + empId + "Not found ");
		}
		return emplo.get();
	}
	
	public int updateProduct(Employee product) {
	    List<Employee> products = repo.findAll();
	    for (Employee prod : products) {
	        if (prod.getEmpId().equals(product.getEmpId())) {
	            repo.save(product);
	            return 200;
	        }
	    }
	    return  404;

	}

	
	
	
	

}
