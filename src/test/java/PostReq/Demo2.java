package PostReq;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {
	public static void main(String[] args) {
		
	
	RestAssured.baseURI = "http://localhost:3000";

	RequestSpecification httpRequest = RestAssured.given();

	httpRequest.header("Content-Type", "application/json");

	JSONObject json = new JSONObject();
	json.put("firstName", "Soham");
	json.put("lastName", "biradar");
	json.put("address", "pune");
	json.put("mobileNo", 909000);

	httpRequest.body(json.toString());

	Response resp = httpRequest.post("/employees");
	
	
	
	System.out.println(resp.getStatusCode());
	System.out.println(resp.getStatusLine());

	JsonPath js = resp.getBody().jsonPath();
	String a = js.getString("firstName");
	System.out.println(a);

	System.out.println(resp.getStatusCode());
	System.out.println(resp.getStatusLine());

//	JsonPath js = resp.getBody().jsonPath();
//	String a = js.getString("firstName");
//	System.out.println(a);
}
}