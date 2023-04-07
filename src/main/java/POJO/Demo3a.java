package POJO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo3a {
public static void main(String[] args) throws JsonProcessingException {
	

	AddEmployee addemp1 =new AddEmployee();
	addemp1.setFirstName("Rohit");
	addemp1.setMiddleName("xyz");
	addemp1.setLastName("Sathe");
	addemp1.setEmployeeId("100");
	addemp1.setLocationId("7");
	addemp1.setJoinedDate("2023-04-04");
	
	ObjectMapper mapper =new ObjectMapper();
	//String a =mapper.writeValueAsString(addemp1);
	
	String b = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(addemp1);
	
	System.out.println(b);
	
	
}
	
	
}
