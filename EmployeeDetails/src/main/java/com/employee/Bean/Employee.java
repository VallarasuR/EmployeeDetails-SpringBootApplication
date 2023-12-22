package com.employee.Bean;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee
{
	@Id
	private Integer empId;
	
	private String empName;
	private Integer empAge;
	private String empLoc;
	
	
	public Integer getEmpId()
	{
		return empId;
	}
	
	public void setEmpId(Integer empId) 
	{
		this.empId = empId;
	}
	
	
	public String getEmpName() 
	{
		return empName;
	}
	
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	
	public Integer getEmpAge() 
	{
		return empAge;
	}
	
	public void setEmpAge(Integer empAge) 
	{
		this.empAge = empAge;
	}
	
	public String getEmpLoc() 
	{
		return empLoc;
	}
	public void setEmpLoc(String empLoc) {
		this.empLoc = empLoc;
	}
	
	
	public Employee(Integer empId, String empName, Integer empAge, String empLoc) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empLoc = empLoc;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() 
	{
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empLoc=" + empLoc + "]";
	}
	
	

}
