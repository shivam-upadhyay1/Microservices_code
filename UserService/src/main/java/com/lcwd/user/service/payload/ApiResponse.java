package com.lcwd.user.service.payload;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;






//that we can follow builder pattern to build the object of this class
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ApiResponse {
	
	private String message;
	
	private boolean success;
	
	private HttpStatus status;


	
	
	

}
