package com.employee.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.Bean.Employee;

public interface EmployeeRepostory  extends JpaRepository<Employee, Integer>
{

}
