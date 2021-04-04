package com.qa.testngBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	public WebDriver driver;
	
	@BeforeMethod
	public void setUP(){
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void googleGmaiTest(){
	WebElement	linkGmail=driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
	linkGmail.click();
	
	Assert.assertEquals(driver.getTitle(), "Gmail - Email from Google", "Gmail Login Page not displayed");
	}
	
	@Test
	public void imagesLinkTest(){
		WebElement	linkImages=driver.findElement(By.xpath("//a[contains(text(),'Images')]"));
		linkImages.click();
		Assert.assertEquals(driver.getTitle(), "Google Images", "Gmail Page not displayed");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
		
	}

}
