package PostReq;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {
public static void main(String[] args) {
	// Step 1: Specify Base URI in Request Assured
			RestAssured.baseURI = "http://localhost:3000";

			// Step 2: get the RequestSpecification Object to hit the different type of HTTP
			// Request

			RequestSpecification httpRequest = RestAssured.given();

			// step 3: add Request Content-Type header from RequestSpecification Object

			httpRequest.header("Content-Type", "application/json");

			// step 4: Create Request body-- using Google json Simple Dependency

			JSONObject json = new JSONObject();
			json.put("firstName", "Vishal");
			json.put("lastName", "Patole");
			json.put("address", "Pune");
			json.put("mobileNo", 90909090);

			// Step 5: attach the Request Body as part of HTTP POST Request
			httpRequest.body(json.toString());

			// step 6: select the HTTP POST Request from the RequestSpecification Object
			Response resp = httpRequest.post("/employees");

			// step 7: capture status code
			int a = resp.getStatusCode();
			System.out.println(a);//201

			// step 8: capture status Line
			String b = resp.getStatusLine();
			System.out.println(b);//HTTP/1.1 201 Created

}
}
