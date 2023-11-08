package com.org;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class demo1Test {
	
@Test
	public void shravs() {	
		RestAssured.baseURI="https://reqres.in";
		RestAssured.basePath="/api/users?page=2";
	given()	
	
	.when()
	.get()
	.then()
	.statusCode(200)
	.statusLine("HTTP/1.1 200 OK")
	.log().all();
	
		
		
	}
	
	
}
