package com.jbk;

public class XpathEx {

}

//Absolute path-/ i.e. single slash
//Relative path-// i.e. double slash

// standard syntax :-//tagname[@attr.Name='attr.value']
					//input	  [@id      =      'email']

//1. //b[text()='Java By Kiran']
//2. //h4[text()='JAVA | SELENIUM | PYTHON']
//3. //a[text()='Register a new membership']	
//4. //button[text()='Sign In']
//5.//div[text()='Please enter email.']
//6.//div[text()='Please enter password.']
//7.//span[text()='Dashboard']
//8.//span[text()='Users']
//9.//span[text()='Operators']
//10.//span[text()='     Useful Links']

//1.//label[contains(text(),'Username')]
//2.//label[contains(text(),'Mobile')]
//3.//label[contains(text(),'Email')]
//4.//label[contains(text(),'Courses')]
//5.//label[contains(text(),'Password')]
//6.//label[contains(text(),'Gender')]
//7.//label[contains(text(),'State')]
//8.//li[contains(text(),'NAVIGATION')]
//9.//button[contains(text(),'Submit')]
//10.//span[contains(text(),'Logout')]

//1.//p[text()='Sign in to start your session']//following::h4
//2.//p[text()='Logout successfully']//following::p
//3.//a[text()='Register a new membership']//following::button
//4.//span[text()='Users']//following::a
//5.//small[text()='Courses Offered']//following::h1
//6.//div[text()='Please enter email.']//following::p
//7.//div[text()='Please enter password.']//following::p
//8.//a[text()='Register a new membership']//following::button
//9.//h4[text()='JAVA | SELENIUM | PYTHON']//following::b
//10.//button[text()='Sign In']//following::div
