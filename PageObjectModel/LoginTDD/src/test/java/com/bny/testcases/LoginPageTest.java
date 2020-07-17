package com.bny.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bny.base.TestBase;
import com.bny.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	/*
	 * LoginPage loginPage;
	 * 
	 * 
	 * public LoginPageTest() { super(); }
	 * 
	 * @BeforeTest public void setUp() {
	 * //System.out.println("Before Initialization ----"); initialization();
	 * //System.out.println("After Initialization ----"); loginPage =new
	 * LoginPage(); }
	 * 
	 * @Test public void clickedOnSignInImage() { loginPage.clickOnSignInImg();
	 * System.out.println("User Clicked on Sign in Image"); }
	 * 
	 * @Test public void enteredValidCredentials() {
	 * loginPage.enterValidCredentials();
	 * System.out.println("User Entered valid crcedentials"); }
	 * 
	 * @Test public void clickedOnSubmitBtn() { loginPage.clickOnSubmitBtn();
	 * System.out.println("User Clicked on submit button"); }
	 * 
	 * @AfterTest public void teardown() { driver.close(); }
	 */
LoginPage loginPage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initialization();
		loginPage =new LoginPage();
	}
	
	@Test(priority=1)
	public void clickedOnSignInImage() {
		loginPage.clickOnSignInImg();
		System.out.println("User clicked on Sign in Image");
		
	}
	@Test(priority=2)
	public void enterValidUsername() {
		loginPage.enteredValidCreds();
		System.out.println("User entered valid credentials");
		Assert.assertFalse(true);
	}
	@Test(priority=3)
	public void clickedOnSubmitBtn() {
		loginPage.clickOnSubmitBtn();
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
		
	
}

