package Tutorial6_Patch;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {
	public static void main(String[] args) {
		RestAssured.baseURI = "http://localhost:3000";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.contentType(ContentType.JSON);
		JSONObject json = new JSONObject();
		json.put("firstName", "Amruta");
		json.put("address", "Delhi");

		httpRequest.body(json.toString());

		Response resp = httpRequest.patch("/employees/3");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		System.out.println(resp.getTime());

		String a = resp.jsonPath().getString("firstName");
		System.out.println(a);

		String b = resp.jsonPath().getString("address");
		System.out.println(b);

	}
}
