package com.employeeapi.testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.employeeapi.base.TestBase;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC001_Get_All_Employees extends TestBase {
	
	@BeforeClass
	void getAllEmployees() throws InterruptedException
	{
		//logger.info("*****Started TC001_Get_All_Employees******");
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		httprequest = RestAssured.given();
		response = httprequest.request(Method.GET,"/employees");
		
		Thread.sleep(3000);
	}
	
	@Test
	void checkResponseBody()
	{
		//logger.info("****Checking ResponseBody****");
		
		String responsebody = response.getBody().asString();
		logger.info("Response Body ==>"+ responsebody);
		Assert.assertTrue(responsebody!=null);
	}
	@Test
	void getStatusCode()
	{
		//logger.info("****Checking StatusCode****");
		int statuscode = response.getStatusCode();
		//logger.info("Status code==> " + statuscode);
		Assert.assertEquals(statuscode, 200);
	}
	@Test
	void checkResponseTime()
	{
		long responseTime = response.getTime();
		if (responseTime>6000)
			//logger.warning("Response Time is greater than 4000");
		Assert.assertTrue(responseTime<3000);
	}
	@Test
	void checkStatusLine()
	{
		//logger.info("****Checking status line****");
		String statusLine = response.getStatusLine();
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	}

}
