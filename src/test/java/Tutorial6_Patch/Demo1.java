package Tutorial6_Patch;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {
public static void main(String[] args) {
	// Step 1: Specify Base URI In Rest Assured
			RestAssured.baseURI = "http://localhost:3000";

			// Step 2: get the RequestSpecification object to hit different types of HTTP
			// Request
			RequestSpecification httpRequest = RestAssured.given();

			// Step 3: Add Request Content-Type Header from RequestSpecification object

			httpRequest.contentType(ContentType.JSON);

			// Step 4: create updated JSON data or Body
			JSONObject json = new JSONObject();
			json.put("firstName", "Sagar");

			// Step 5: attach body to the HTTP PATCH Request from RequestSpecification
			// object
			httpRequest.body(json.toString());

			// Step 6: select HTTP PATCH Request from RequestSpecification object
			Response resp = httpRequest.patch("/employees/3");

			// Step 7: Capture status code
			int a = resp.getStatusCode();
			System.out.println(a);

			// Step 8 : capture Status Line
			String b = resp.getStatusLine();
			System.out.println(b);

			// step 9: capture updated name from Response Payload
			JsonPath js = resp.jsonPath();
			String p = js.getString("firstName");
			System.out.println(p);

			// Step 10: capture response time

			long c1 = resp.getTime();
			System.out.println(c1);

			long c2 = resp.time();
			System.out.println(c2);

			long c3 = resp.getTimeIn(TimeUnit.SECONDS);
			System.out.println(c3);

			long c4 = resp.timeIn(TimeUnit.SECONDS);
			System.out.println(c4);

}
}
