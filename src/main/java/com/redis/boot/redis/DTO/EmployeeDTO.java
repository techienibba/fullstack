package com.redis.boot.redis.DTO;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeDTO implements Serializable {
	
	
	private Long empid;
	
	private String firstname;
	
	private String lastname;
	
	private String emailid;

}
