package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	public static WebDriver ldriver;
	public Home(WebDriver rdriver) {
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
	
	@FindBy (xpath = "//*[@class=\"MuiTypography-root MuiTypography-h6 MuiTypography-noWrap css-1d0b3o0\"]")
	public WebElement txtHome;
	
	public String homePage () {
		String pagename = txtHome.getText();
		System.out.println(pagename);
		return pagename;
	}
	
	@FindBy (xpath = "//*[@class='MuiTypography-root MuiTypography-h6 MuiTypography-noWrap css-1d0b3o0']")
	@CacheLookup
	WebElement title;
	public void homePageTitle() {
		 title.getText();
	}
	
	@FindBy (xpath = "(//*[text()='Super Admin'])[1]")
	WebElement credentialTitle;
	public void credentialTitleText() {
		credentialTitle.getText();
	}
	
	//@FindBy (xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-12zoz4r']")
	//@CacheLookup
	public WebElement dashbuttons (int i) {
		WebElement dashbuttonText = ldriver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-12zoz4r'])["+i+"]"));
		return dashbuttonText;
	}
	public WebElement logoutButtonFunctionality() {
		 WebElement logoutbutton = ldriver.findElement(By.xpath("//*[text()='Logout']"));
		 return logoutbutton;
	}
	@FindBy(xpath = "//*[text()='Logout']")
	@CacheLookup
	WebElement logout;
	public void logoutlink() {
		logout.click();
	}
	@FindBy(xpath = "(//*[text()='Login'])[1]")
	@CacheLookup
	WebElement afterLogout;
		public String afterLogoutLogin() {
			String loginPageName = afterLogout.getText();
			return loginPageName;
		}

	}
	
	

