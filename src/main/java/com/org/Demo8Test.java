package com.org;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Demo8Test {
	@Test
	public void postrequest() {
		
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		RestAssured.basePath="/posts";
		
		HashMap<String,String> map =new HashMap<String,String>();
		map.put("id", "109");
		map.put("title", "Shravs");
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
