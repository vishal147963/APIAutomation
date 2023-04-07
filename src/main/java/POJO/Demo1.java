package POJO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo1 {
public static void main(String[] args) throws JsonProcessingException {

	
	EmployeePojo emp1 =new EmployeePojo();
emp1.setId(1);

emp1.setFname("Ashish");
emp1.setMname("abc");
emp1.setLname("Patil");
emp1.setMobileNumber(909090900l);
emp1.setAddress("Pune");

ObjectMapper mapper =new ObjectMapper();

String a =mapper.writeValueAsString(emp1);

System.out.println(a);




}
	
}
