package TutorialPojo1;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)


public class AddEmployee {
	
	private String firstName;

	private String middleName;

	private String lastName;

	private String employeeId;

	private String locationId;

	private String joinedDate;

	private Photo photo;

	private boolean chkLogin;







}
