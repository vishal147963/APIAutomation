package TutorialPojo1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo1 {
public static void main(String[] args) throws JsonProcessingException {
	Photo abc=  Photo.builder()
			.filename("Docs")
			.filesize(100)
			.filetype("pdf")
			.base64("123")
			.build();
			
			AddEmployee emp= AddEmployee.builder()
			.firstName("Soham")
			.middleName("abc")
			.lastName("Shah")
			.employeeId("1001")
			.locationId("10")
			.joinedDate("2023-03-03")
			.photo(abc)
			.chkLogin(false)
			.build();
			
			ObjectMapper mapper =new ObjectMapper();
			String reqbody =mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
			
			System.out.println(reqbody);
			
}
}
