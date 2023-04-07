package Tutorial2;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {
public static void main(String[] args) {
	// step 1: Specify the Base URI in Rest Assured.
	RestAssured.baseURI = "http://localhost:3000/";

	// Step 2: get the Request Specification Object to hit different types of HTTP
	// Request.

	RequestSpecification httpRequest = RestAssured.given();

	// step 3: select the HTTP GET Request from the Request Specification object,
	Response resp = httpRequest.get("/employees/1");

	// step 4: capture status code.
	int a = resp.getStatusCode();
	System.out.println(a);
	
	// step 5: capture Status Line
	String b = resp.getStatusLine();
	System.out.println(b);
	
	// step 6: capture Content-Type Headers
	
	String c = resp.getHeader("Content-Type");
	System.out.println(c);


}
}
