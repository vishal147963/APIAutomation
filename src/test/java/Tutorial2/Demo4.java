package Tutorial2;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo4 {
public static void main(String[] args) {
	// step 1: Specify the Base URI in Rest Assured.
			RestAssured.baseURI = "http://localhost:3000/";

			// Step 2: get the Request Specification Object to hit different types of HTTP
			// Request.

			RequestSpecification httpRequest = RestAssured.given();

			// step 3: select the HTTP GET Request from the Request Specification object,
			Response resp = httpRequest.get("/employees/1");

			int a = resp.getStatusCode();
			System.out.println(a);

			String b = resp.getStatusLine();
			System.out.println(b);

			String respbody = resp.getBody().asString();

			JsonPath json = new JsonPath(respbody);
			String c = json.getString("fname");
			System.out.println(c);

			int d = json.getInt("id");
			System.out.println(d);
			
			String e = resp.getHeader("Content-Type");
			System.out.println(e);
			
		

}
}
