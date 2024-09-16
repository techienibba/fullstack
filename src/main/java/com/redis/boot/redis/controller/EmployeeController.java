package com.redis.boot.redis.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.redis.boot.redis.DTO.EmployeeDTO;
import com.redis.boot.redis.DTO.EmployeeMapper;
import com.redis.boot.redis.entity.Employee;
import com.redis.boot.redis.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	
	

	private EmployeeService empservice;
	
	public EmployeeController(EmployeeService emp2)
	{
		
		this.empservice=emp2;
	}
	
	
	@PostMapping("/create")
	public ResponseEntity<EmployeeDTO> createemployee(@RequestBody EmployeeDTO empdto )
	{
		
		
		        EmployeeDTO empdtonow= empservice.createemployee(empdto);
		        return new ResponseEntity<>(empdtonow,HttpStatus.CREATED);
		
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<EmployeeDTO> updemployee(@PathVariable("id") Long empid,@RequestBody EmployeeDTO empdto )
	{
		
		
		        EmployeeDTO empdtonow= empservice.updatemployee(empid, empdto);
		        return ResponseEntity.ok(empdtonow);
		
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EmployeeDTO> getemployee(@PathVariable("id") Long empid )
	{
		
		EmployeeDTO empdtonow= empservice.getemployee(empid);
		        return ResponseEntity.ok(empdtonow);
		
		
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<EmployeeDTO>> getallemployee()
	{
		
		List<EmployeeDTO> empdtonow= empservice.getemployees();
		        return ResponseEntity.ok(empdtonow);
		
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteemployee(@PathVariable("id") long empid)
	{
		
		empservice.deleteemployee(empid);
		        return ResponseEntity.ok("Employee deleted with id"+""+empid);
		
		
	}
	

}
