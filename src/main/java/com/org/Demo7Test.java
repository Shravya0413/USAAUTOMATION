package com.org;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;


public class Demo7Test {
	
	
	@Test
	public void postrequest() {
		
		RestAssured.baseURI="https://reqres.in";
		RestAssured.basePath="/api/users";
		
		HashMap<String,String> map =new HashMap<String,String>();
		map.put("name", "Shravya");
		map.put("job", "Engineer");
		given()
		.contentType("application/json")
		.body(map)
		.when()
		.post()

		.then()
		.statusCode(201)
		.statusLine("HTTP/1.1 201 Created")
		.log().all();
		
		
	}

}
