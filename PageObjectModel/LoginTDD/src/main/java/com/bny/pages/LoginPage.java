package com.bny.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bny.base.TestBase;
import com.bny.utils.TestUtilities;

public class LoginPage extends TestBase {
	
	/*
	 * TestUtilities utils = new TestUtilities(); //static Properties prop;
	 * 
	 * //-----/html/body/div[5]/header/div[4]/nav/ul/li[1]/button
	 * 
	 * @FindBy(xpath="/html/body/div[5]/header/div[4]/nav/ul/li[1]/button")
	 * WebElement signInImg;
	 * 
	 * @FindBy(id="join_neu_email_field") WebElement userName;
	 * 
	 * @FindBy(xpath="//input[@id='join_neu_password_field']") WebElement passWord;
	 * 
	 * @FindBy(xpath= "//button[@name='submit_attempt']") WebElement submitBtn;
	 * 
	 * 
	 * public LoginPage() { PageFactory.initElements(driver, this); } public void
	 * clickOnSignInImg() { signInImg.click();
	 * 
	 * } public void enterValidCredentials() {
	 * userName.sendKeys("bhagyalakshmi.bandaruj@gmail.com");
	 * passWord.sendKeys("Lucky@12345$"); } public void clickOnSubmitBtn() {
	 * submitBtn.click();
	 * 
	 * }
	 */
TestUtilities utils = new TestUtilities();
	
	@FindBy(xpath="//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]/button")
	WebElement signinImg;
	
	@FindBy(id="join_neu_email_field")
	WebElement username;
	
	@FindBy(id="join_neu_password_field")
	WebElement password;
	
	@FindBy(name="submit_attempt")
	WebElement submit;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this); 
	}
	
	public void clickOnSignInImg() {
		signinImg.click();
	}
	public void enteredValidCreds() {
		username.sendKeys("bhagyalakshmi.bandaruj@gmail.com");
		password.sendKeys("Lucky@12345$");
	}
	public void clickOnSubmitBtn() {
		submit.click();
	}
}
