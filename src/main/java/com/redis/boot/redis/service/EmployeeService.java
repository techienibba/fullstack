package com.redis.boot.redis.service;

import java.util.List;

import com.redis.boot.redis.DTO.EmployeeDTO;
import com.redis.boot.redis.entity.Employee;

public interface EmployeeService {
	
	EmployeeDTO createemployee(Employee employee);
	
	EmployeeDTO getemployee(Long id);
	
	List<EmployeeDTO> getemployees(Long id);
	
	EmployeeDTO updatemployee(Long id, Employee employee);
	
	void deleteemployee(Long id);
	
	
	

}
