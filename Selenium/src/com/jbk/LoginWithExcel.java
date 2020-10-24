package com.jbk;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class LoginWithExcel {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("TestData.xls");
		
		Workbook wb=Workbook.getWorkbook(fis);
		
		Sheet sh=wb.getSheet("Login");
		for(int i=0;i<sh.getRows();i++) {
		
		Cell cell=sh.getCell(0, i);
		String uname=cell.getContents();
		
		Cell cell1=sh.getCell(1, i);
		String pass=cell1.getContents();
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Offline%20website/Offline%20website/index.html");
		driver.manage().window().maximize();
		
		WebElement uname1=driver.findElement(By.id("email"));
		uname1.sendKeys(uname);
		WebElement pass1=driver.findElement(By.id("password"));
		pass1.sendKeys(pass);
		
		WebElement loginbtn=driver.findElement(By.tagName("button"));
		loginbtn.click();
		}
	}
}
