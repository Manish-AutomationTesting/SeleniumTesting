package com.qa.testngBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	
	@BeforeSuite//1
	public void setUp(){
		System.out.println("@BeforeSuite");
	}
	
	@BeforeTest//2
	public void launchTheBrowser(){
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass//3
	public void enterUrl(){
		System.out.println("@BeforeClass");
	}
	@BeforeMethod//4
	public void enterUserName(){
		System.out.println("@BeforeMethod");
	}
	@Test//5
	public void clickonSignInButton(){
		System.out.println("@1");
	}
	@Test//5
	public void clickonSearchButton(){
		System.out.println("@2");
	}
	@Test//5
	public void clickonDealsButton(){
		System.out.println("@3");
	}
	@Test//5
	public void clickonContactDetails(){
		System.out.println("@4");
	}
	@Test//5
	public void getContactDetails(){
		System.out.println("@5");
	}
	
	@AfterMethod//6
	public void logout(){
		System.out.println("@AfterMethod");
	}
	
	@AfterClass//7
	public void close(){
		System.out.println("@AfterClass");
	}
	@AfterTest//8
	public void closeTheBrowser(){
		System.out.println("@AfterTest");
	}
	@AfterSuite//9
	public void complete(){
		System.out.println("@AfterSuite");
	}
	
	

}
