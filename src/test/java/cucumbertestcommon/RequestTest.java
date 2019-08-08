package cucumbertestcommon;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import commonUtils.AppLogger;

public class RequestTest extends AppLogger {

	public static void setup(String URL,String BasePath) {

		RestAssured.baseURI = URL;
//		RestAssured.port=8080;
		RestAssured.basePath = BasePath;
		logger.info("Endpoint has been initialized");
		System.out.println("Default URI is :" +RestAssured.baseURI+RestAssured.basePath);
		
	}

	public void GetRequest() {

		Response response = given().contentType(ContentType.JSON).headers("user", "pass").get("/list");
		logger.info("JSON response has been captured");
		response.prettyPrint();
	}
	
	public void GetRequestWithParam(String pathparam) {

		Response response = given().contentType(ContentType.JSON).headers("user", "pass").get(pathparam);
		logger.info("JSON response has been captured");
		response.prettyPrint();
	}
	
	public void statusValidate(int statusCode) {
		logger.info("Status Code in response: " + statusCode);
		if(statusCode==200) {
			System.out.println("Status code 200 -- PASS");
		}
		else if(statusCode==400) {
			System.out.println("Status code 400 -- FAIL");
		}
		
	}
	
}
