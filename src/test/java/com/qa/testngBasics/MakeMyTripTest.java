package com.qa.testngBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MakeMyTripTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUP(){
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void makeMyTripLoginPageTest(){
		WebElement eleLogin=driver.findElement(By.xpath("//p[contains(text(),'Login or Create Account')]"));
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", eleLogin);
		Assert.assertEquals(driver.getTitle(), "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday",
				"Login Page not displayed");
	}
	
	/*@Test
	public void bookHotel(){
		WebElement eleHotel=driver.findElement(By.xpath("//span[contains(text(),'Hotels')"));
		eleHotel.click();
		Assert.assertEquals(driver.getTitle(), "MakeMyTrip.com: Save upto 60% on Hotel Booking 4,442,00+ Hotels Worldwide", 
				"Hotel Booking Page not displayed");
		
	}
	@Test
	public void bookTrains(){
		WebElement eleTrains=driver.findElement(By.xpath("//span[contains(text(),'Trains')"));
		eleTrains.click();
		Assert.assertEquals(driver.getTitle(), "IRCTC Train Tickets Reservation | Indian Railways Reservation | IRCTC Train Tickets Booking, Trains Enquiry Online : MakeMyTrip", 
				"Trains Booking Page not displayed");
		
	}
	@Test
	public void bookBuses(){
		WebElement eleBuses=driver.findElement(By.xpath("//span[contains(text(),'Buses')"));
		eleBuses.click();
		Assert.assertEquals(driver.getTitle(), "Online Bus Ticket Booking, Book Confirmed Reservation Tickets @ MakeMyTrip", 
				"Booking Page not displayed");
		
	}
	@Test
	public void bookCabs(){
		WebElement eleCabs=driver.findElement(By.xpath("//span[contains(text(),'Cabs')"));
		eleCabs.click();
		Assert.assertEquals(driver.getTitle(), "Online Cab Booking - Book Outstation Cabs at Lowest Fare @ MakeMyTrip", 
				"Cabs Booking Page not displayed");
		
	}*/
	@AfterMethod
	public void tearDown(){
		driver.close();
		
	}

}
