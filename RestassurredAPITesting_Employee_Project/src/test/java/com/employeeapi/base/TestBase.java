package com.employeeapi.base;
import java.util.logging.Logger;
import java.util.logging.*;
import java.util.logging.Level;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestBase {
	
	public static RequestSpecification httprequest;
	public static Response response;
	
	public Logger logger;
	
	/*@BeforeClass
	public void setup()
	{
		logger = Logger.getLogger("EmployeesRestAPI");
		PropertyConfigurator.configure("log4j.properties");
		logger.setLevel(Level.INFO);
	}*/
	
}
