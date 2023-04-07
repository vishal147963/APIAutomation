package Tutorial5PutRequest;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {
public static void main(String[] args) {
	// Step 1: Specify the Base URI in Rest Assured.
			RestAssured.baseURI = "http://localhost:3000/";

			// Step 2: get RequestSpecification object to hit the different types of HTTP
			// Request

			RequestSpecification httpRequest = RestAssured.given();

			// Step 3: Add Request Content-Type header from RequestSpecification Object

			httpRequest.header("Content-Type", "application/json");

			// step 4: Create updated JSON Body or Data
			JSONObject json = new JSONObject();
			json.put("firstName", "Sanuja");
			json.put("lastName", "Bhosale");
			json.put("address", "Dubai");
			json.put("mobileNo", 890890890);
			
			// Step 5: attach request body as part of HTTP Put request from
			// RequestSpecification Object
			
			httpRequest.body(json.toString());
			
			// step 6: select HTTP Put request from the RequestSpecification Object
			Response resp =httpRequest.put("/employees/2");
			
			// step 7:capture status code
			System.out.println(resp.getStatusCode());
			
			// step 8: capture status line
			System.out.println(resp.getStatusLine());
			
}
}
