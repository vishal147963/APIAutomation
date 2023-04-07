package POJO;

public class AddEmployee {
	private String firstName;

	private String middleName;

	private String lastName;

	private String employeeId;

	private String locationId;

	private String joinedDate;
	
	
	

	@Override
	public String toString() {
		return "AddEmployee [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", employeeId=" + employeeId + ", locationId=" + locationId + ", joinedDate=" + joinedDate + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(String joinedDate) {
		this.joinedDate = joinedDate;
	}
	
	
	
	
	
	
}
