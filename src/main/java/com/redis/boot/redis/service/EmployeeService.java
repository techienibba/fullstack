package com.redis.boot.redis.service;

import java.beans.JavaBean;
import java.util.List;

import org.springframework.stereotype.Service;

import com.redis.boot.redis.DTO.EmployeeDTO;
import com.redis.boot.redis.entity.Employee;


public interface EmployeeService {
	
	EmployeeDTO createemployee(EmployeeDTO employee);
	
	EmployeeDTO getemployee(Long id);
	
	List<EmployeeDTO> getemployees();
	
	EmployeeDTO updatemployee(Long id, EmployeeDTO employee);
	
	void deleteemployee(Long id);
	
	
	

}
