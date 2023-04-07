package Tutorial1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo3 {
public static void main(String[] args) {
	RestAssured.baseURI="http://localhost:3000/";
	
	RequestSpecification httpRequest = RestAssured.given();
	
	Response resp =httpRequest.get("/employees/1");
	
	int a = resp.getStatusCode();
	System.out.println(a);
	
	String b = resp.getStatusLine();
	System.out.println(b);
	
	String c= resp.getBody().asString();
	System.out.println(c);
	
	if(c.contains("Patil"))
	{
		System.out.println("Test case is pass");
	}
	else {
		System.out.println("Test Case is fail");
	}

}
}
