package Testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Endpoints.createuser;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponseOptions;
import payloads.pojo;

public class Testcases {
	
	  pojo p;
//public	Logger logger;
	  
	@BeforeClass
	public  void befor()
	{
		
		p=new pojo();
	p.setId(1);
	p.setUsername("tetst");
	//logger=LogManager.getLogger(this.getClass());
	
	}
	
	@Test
	public void  create()
	{  //logger.info("****crester****");
		Response rs=(Response) createuser.createus(p);
				rs.then().statusCode(201);//.log().all();
				 //logger.info("****crester****");
	}
	
	@Test
	public void getwala()
	{
		// logger.info("****crester****");
		Response rs1=createuser.geturl1(this.p.getId());
		rs1.then().statusCode(200).log().all();
		// logger.info("****crester****");
	}
	
	
	
}
