package Tutorial1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {
	public static void main(String[] args) {
		// Step 1 : Specify the BaseURI in Rest Assured
		RestAssured.baseURI = "http://localhost:3000/";

		// Step 2 : get Request Specification object to hit the different types of HTTP
		// Request
		RequestSpecification httpRequest = RestAssured.given();
		// step 3: select the Get Request from Request Specification interface

		Response response = httpRequest.get("/employees/1");
		// step 4: capture response code

		int a = response.getStatusCode();
		System.out.println(a);
		int c = response.statusCode();
		System.out.println(c);

		System.out.println("------------------");

		// step 5: capture Response Status Line

		String b = response.getStatusLine();
		System.out.println(b);
		String d = response.statusLine();
		System.out.println(d);

	}

}
