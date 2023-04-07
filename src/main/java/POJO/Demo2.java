package POJO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo2 {
public static void main(String[] args) throws JsonProcessingException {

	EmployeePojo emp1 = new EmployeePojo(100, "Ajit", "abc", "Patil", 98988880, "Mumbai");

	ObjectMapper mapper = new ObjectMapper();
	String b = mapper.writeValueAsString(emp1);

	System.out.println(b);
}
}
