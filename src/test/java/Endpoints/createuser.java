package Endpoints;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.annotations.Test;


import payloads.pojo;
import scala.Int;

import static io.restassured.RestAssured.*;

public class createuser {
	
	public static Response createus(pojo payloads)
	{
	
		
		
		Response res=given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(payloads).
	//	when().post("https://reqres.in/api/users");
		when().post(Routes.create_ur);
		//then().statusCode(201);
		return res;
	}
	
	
	public static Response geturl1(int id)
	{
		//int id=0;
		Response res=given().//queryParam("id",id)
				when().get(Routes.get_Url);
		return res;
	}

}
