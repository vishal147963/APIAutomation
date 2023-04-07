package Tutorial5PutRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo3 {
public static void main(String[] args) {
	RestAssured.baseURI = "http://localhost:3000";
	RequestSpecification httpRequest = RestAssured.given();
	Response resp = httpRequest.get("/employees/1");

	// Capture response code
	int a1 = resp.getStatusCode();
	System.out.println(a1);
	int a2 = resp.statusCode();
	System.out.println(a2);

	System.out.println("-------------------------------------");
	
	
	// capture response status line
	String b1 = resp.getStatusLine();
	System.out.println(b1);
	String b2 = resp.statusLine();
	System.out.println(b2);

	System.out.println("-------------------------------------");

	// capture Content-Type response header
	String c1 = resp.getHeader("Content-Type");
	System.out.println(c1);
	
	String c2 = resp.header("Content-Type");
	System.out.println(c2);
	
	String c3 = resp.contentType();
	System.out.println(c3);
	
	String c4 = resp.getContentType();
	System.out.println(c4);
	
}
}

