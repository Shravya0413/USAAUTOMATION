package com.org;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Demo3Test {
	
	
	@Test
	public void getrequesttyepecode() {
	 RestAssured.baseURI="https://jsonplaceholder.typicode.com";
	 RestAssured.basePath="/posts";
	 given()
	 .when()
	 .get()
	 .then()
	 .statusCode(200)
	 .log().all()
	 .statusLine("HTTP/1.1 200 OK");
		
	}
	

}
