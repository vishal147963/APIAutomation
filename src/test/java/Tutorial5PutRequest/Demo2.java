package Tutorial5PutRequest;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {
public static void main(String[] args) {
	RestAssured.baseURI = "http://localhost:3000";

	RequestSpecification httpRequest = RestAssured.given();

	// httpRequest.header("Content-Type","application/json");
	httpRequest.contentType(ContentType.JSON);

	JSONObject json =new JSONObject();
	json.put("firstName", "Vinit");
	json.put("lastName", "Patil");
	json.put("address", "Pune");
	json.put("mobileNo", 13555555);
	
	httpRequest.body(json.toString());
	
	Response resp=httpRequest.put("/employees/2");
	
	System.out.println(resp.getStatusCode());
	System.out.println(resp.getStatusLine());
	
	//capture response payload --- First Name
	JsonPath respbody = resp.jsonPath();
	String a = respbody.getString("firstName");
	System.out.println(a);
	long b = respbody.getLong("mobileNo");
	System.out.println(b);
	
	System.out.println("-----------------------");
	
	String d = resp.getHeader("Content-Type");
	System.out.println(d);
	
	String e = resp.header("Content-Type");
	System.out.println(e);
	
	String c = resp.contentType();
	System.out.println(c);
}
}
