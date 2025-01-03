package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public static WebDriver ldriver;
	public Loginpage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@id='email']")
	@CacheLookup
	WebElement txtEmail;
	public void setUserName() {
		txtEmail.clear();
		txtEmail.sendKeys("noormohamed.a@bookwater.com");
	}
	
	@FindBy(xpath = "//*[@id='password']")
	@CacheLookup
	WebElement txtPassword;
	public void setPassword() {
		txtPassword.clear();
		txtPassword.sendKeys("#King007");
	}
	
	@FindBy (xpath = "(//*[text()='Login'])[2]")
	@CacheLookup
	WebElement btnLogin; 
	public void clickLogin() {
		btnLogin.click();
	}
	
	@FindBy (xpath = "(//*[text()='Dashboard'])[1]")
	@CacheLookup
	WebElement txtHome;
	public String homePage() {
		String pagename = txtHome.getText();
		return pagename;
	}
}
