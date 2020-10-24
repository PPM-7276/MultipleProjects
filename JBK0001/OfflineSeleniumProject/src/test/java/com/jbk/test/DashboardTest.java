package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.DashboardPage;

public class DashboardTest {

	DashboardPage dp;
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///F:/Offline%20website/pages/examples/dashboard.html");
		driver.manage().window().maximize();
		}
	
	@Test(priority = 1)
	  public void validCourses() {
		  Assert.assertTrue(dp.checkCourses());
	  }
	
	/*
	 * @Test(priority = 2) public void SubCourses() {
	 * Assert.assertTrue(dp.checkSubCourses()); }
	 * 
	 * @Test(priority = 3) public void IsClickable() {
	 * Assert.assertTrue(dp.buttonIsClickable()); }
	 * 
	 * @Test(priority = 4) public void WithWindowsHandles() {
	 * Assert.assertTrue(dp.verifyMoreInfoWithWindowsHandles()); }
	 * 
	 * @Test(priority = 5) public void logoutButton() {
	 * Assert.assertTrue(dp.logoutButtonWorking()); }
	 * 
	 * @Test(priority = 6) public void checkUrl() {
	 * Assert.assertTrue(dp.checkDashboardUrl()); }
	 */

	@AfterMethod
	public void closeBrowser()
	{
		if(null!=driver)
		{
			driver.close();
			driver.quit();
		}
		
	}
}
