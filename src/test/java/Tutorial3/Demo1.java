package Tutorial3;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {
public static void main(String[] args) {
	//Step 1: Specify the BaseURI in rest Assured
	
			RestAssured.baseURI="http://localhost:3000/";
			
			//step 2: get the RequstSpecification object to hit the different HTTP Request
			RequestSpecification httpRequest = RestAssured.given();
			
			//step 3: select the HTTP DELETE Request from RequestSpecification Object
			Response resp = httpRequest.delete("/employees/5");
			
			//step 4: capture the status code
			int a = resp.getStatusCode();
			System.out.println(a);
			
			//step 5: capture the status Line
			String  b = resp.getStatusLine();
			System.out.println(b);
			
}
}
