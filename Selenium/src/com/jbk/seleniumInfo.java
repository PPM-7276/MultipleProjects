package com.jbk;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumInfo {

		public static void main(String[] args) throws InterruptedException {
			
			String gender="Male";
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///F:/Offline%20website/Offline%20website/index.html");
			driver.manage().window().maximize();
			
			WebElement uname=driver.findElement(By.id("email"));
			uname.sendKeys("kiran@gmail.com");
			WebElement pass=driver.findElement(By.id("password"));
			pass.sendKeys("123456");
			WebElement loginbtn=driver.findElement(By.tagName("button"));
			loginbtn.click();
			
			driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
			
			driver.findElement(By.id("username")).sendKeys("Paras");
			driver.findElement(By.id("mobile")).sendKeys("*9890904637");
			driver.findElement(By.id("email")).sendKeys("paras@gmail.com");
			driver.findElement(By.id("course")).sendKeys("Selenium");
			
			if(gender.equals("Male"))
			{
			driver.findElement(By.id("Male")).click();
			}
			else
			{
			driver.findElement(By.id("Female")).click();
			}
			
			Thread.sleep(500);
			
			WebElement stateDropDown=driver.findElement(By.tagName("select"));
			
			Select sel=new Select(stateDropDown);
			
			sel.selectByValue("HP");
			
			List<WebElement> states=sel.getOptions();
			
			for(WebElement ele:states)
			{
				System.out.println(ele.getText());
				
				if(ele.getText().equals("Maharashtra"))
				{
					System.out.println("Maharashtra option is available");
				}
				else
				{
				System.out.println("Maharashtra is not available");	
				}
			}
			
			driver.findElement(By.id("password")).sendKeys("147852");
			driver.findElement(By.id("submit")).click();
				
			Alert al=driver.switchTo().alert();
			System.out.println(al.getText());
			al.accept();
			
		}
}
