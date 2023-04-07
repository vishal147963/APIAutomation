package com.Orangehrm.Pojo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo1 {

	public static void main(String[] args) throws JsonProcessingException {
		GoogleAccount obj1 = new GoogleAccount();

		obj1.setFirstName("Ashish");
		obj1.setLastName("Sathe");
		obj1.setUsername("Ashish@gmail.com");
		obj1.setPasswd("Ashish@123");
		obj1.setConfirmPasswd("Ashish@123");

		ObjectMapper mapper = new ObjectMapper();
		String a =mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj1);
		System.out.println(a);
		
	}
	
}
