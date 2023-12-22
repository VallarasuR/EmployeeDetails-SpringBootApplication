package com.employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Bean.Employee;
import com.employee.Service.EmpService;







@RestController
@RequestMapping("/uniqsolution")
public class EmpController
{
	
	private EmpService service ;  // Obj service class
	
	@Autowired
	EmpController(EmpService service)  // initalize the EmpService
	{
		this.service=service;
	}
	
	@GetMapping("/employee")
	public List<Employee> toGetAllEmp()
	{
		return service.toGetAllEmp();
	}
	
	@DeleteMapping("/employee/delete/{empId}")
	public List<Employee> toDelete(@PathVariable int empId )
	{
		return service.toDelete(empId);
	}
	
	
	  @GetMapping("/employee/search/{empId}")
	  public Employee toSearch(@PathVariable int empId) 
	  {
		  return service.toSearch(empId);
	  }
	
	
	@PostMapping("/employee/save")
	public Employee toSave(@RequestParam Integer empId, @RequestParam String empName,
			@RequestParam Integer empAge,@RequestParam String empLoc)
	{
		return service.toSave( empId,empName, empAge, empLoc);
	}
	@PutMapping("/employee/update")
	public ResponseEntity<String> updateProduct(@RequestParam Integer empId, @RequestBody Employee emp) {
	    Integer code = service.updateProduct(emp);

	    if (code != null && code == 200) 
	    {
	        return ResponseEntity.ok("Product Updated Successfully!");
	    } 
	    else 
	    {
	        return ResponseEntity.ok("Failed to update product");
	    }
	}

	
}

