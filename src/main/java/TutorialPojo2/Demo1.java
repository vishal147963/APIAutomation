package TutorialPojo2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo1 {
public static void main(String[] args) throws JsonProcessingException {
	Messages message = Messages.builder().success("user Created").build();

	Type type = Type.builder().id(101).name("Amdocs").build();

	Data data = 
			Data.builder()
			.activity_id("101")
			.name("Amdocs Billing System")
			.projectId("amd1001")
			.preset(true)
			.is_deleted(10)
			.type(type)
			.build();

	ProjectActivities project1 = 
			ProjectActivities
			.builder()
			.success(true)
			.message(message)
			.data(data)
			.build();

	
	ObjectMapper mapper =new ObjectMapper();
	String reqbody = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(project1);
	
	System.out.println(reqbody);
	

}
}
