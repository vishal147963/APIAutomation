package Tutorial3;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2_Dummy_Server
{
public static void main(String[] args) {
	
	//https://reqres.in/api/users/2
	
	RestAssured.baseURI="https://reqres.in";
	
	RequestSpecification httpRequest = RestAssured.given();
	
	Response resp = httpRequest.delete("/api/users/2");
	
	int a =resp.getStatusCode();
	System.out.println(a);//204
	
	String b = resp.getStatusLine();
	System.out.println(b); //HTTP/1.1 204 No Content
	
	String c = resp.getHeader("Server");
	System.out.println(c);//cloudflare
	
	Headers headers = resp.getHeaders();
System.out.println(headers);
	
	
	
}
}
