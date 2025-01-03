package com.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Reports extends InfluencerPage {

   
	public Reports(WebDriver ldriver) {
		super(ldriver);
	}
	
	WebDriverWait wait = new WebDriverWait(ldriver, 10);
	
	public void waittoastmsg() {
		WebDriverWait wait = new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Toastify__toast-body")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("Toastify__toast-body")));
		}
	
	public void implicitwaits() {
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   }

	public void Reportsmodule() {

		WebElement Reports = ldriver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-12zoz4r'])[11]"));
		
          Reports.click();
	}
	
	//select[option[text()='Get can age details']]
	
	
	
	
	@FindBy(xpath="//select[contains(@class,'MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiInput-input css-1gtikml')]//option[2]")
	@CacheLookup
	WebElement selectcanage;
	public void Clickoncanagereport() {
		try {
			selectcanage.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			WebElement selectcanage = ldriver.findElement(By.xpath("//select[contains(@class,'MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiInput-input css-1gtikml')]//option[2]"));
			selectcanage.click();
		}
	}
	@FindBy(xpath="//select[contains(@class,'MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiInput-input css-1gtikml')]//option[1]")
	@CacheLookup
	WebElement selectorderreport;
	public void Clickonorderreport() {
		try {
			selectorderreport.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			WebElement selectorderreport = ldriver.findElement(By.xpath("//select[contains(@class,'MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiInput-input css-1gtikml')]//option[1]"));
			selectorderreport.click();
		}
	}
	
	
	@FindBy(xpath="//select[contains(@class,'MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiInput-input css-1gtikml')]//option[3]")
	@CacheLookup
	WebElement selectattendancereport;
	public void Clickonattendancereport() {
		try {
			selectattendancereport.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			WebElement selectattendancereport = ldriver.findElement(By.xpath("//select[contains(@class,'MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiInput-input css-1gtikml')]//option[3]"));
			selectattendancereport.click();
		}
	}
	@FindBy(xpath="//select[contains(@class,'MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiInput-input css-1gtikml')]//option[4]")
	@CacheLookup
	WebElement selecttripreport;
	public void Clickontripreport() {
		try {
			selecttripreport.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			WebElement selecttripreport = ldriver.findElement(By.xpath("//select[contains(@class,'MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiInput-input css-1gtikml')]//option[4]"));
			selecttripreport.click();
		}
	}
	@FindBy(xpath="//select[contains(@class,'MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiInput-input css-1gtikml')]//option[5]")
	@CacheLookup
	WebElement selectsubscriptionreport;
	public void Clickonsubscriptionreport() {
		try {
			selectsubscriptionreport.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			WebElement selectsubscriptionreport = ldriver.findElement(By.xpath("//select[contains(@class,'MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiInput-input css-1gtikml')]//option[5]"));
			selectsubscriptionreport.click();
		}
	}
	
	@FindBy(xpath="//select[contains(@class,'MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiInput-input css-1gtikml')]//option[6]")
	@CacheLookup
	WebElement selectwarehousereport;
	public void Clickonwarehousereport() {
		try {
			selectwarehousereport.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			WebElement selectwarehousereport = ldriver.findElement(By.xpath("//select[contains(@class,'MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiInput-input css-1gtikml')]//option[6]"));
			selectwarehousereport.click();
		}
	}
		
	
	@FindBy(xpath = "//*[@data-testid ='DownloadIcon']")
	@CacheLookup
	WebElement download;
	public void Clickdownload() {
		
		download.click();
	}
	
	
	
	/*********************************This page ui is chaged completly***********************/
	
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3'])[1]")
	@CacheLookup
	WebElement yesterdaytransaction;
	public void clickyesterdaytransaction() {
		
		yesterdaytransaction.click();
	}
	
	@FindBy(xpath = "//*[contains(text(),'Download')]")
	@CacheLookup
	WebElement downloadyesterdaytransaction;
	public void clickdownloadyesterdaytransaction() {
		
		downloadyesterdaytransaction.click();
	}
	
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3'])[2]")
	@CacheLookup
	WebElement currenttransaction;
	public void clickcurrenttransaction() {
		
		currenttransaction.click();
	}
	/*current transaction*/
	
	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-1v9nh78' and @data-testid='DownloadIcon']")
	@CacheLookup
	WebElement currenttransactiondownload;
	public void clickcurrenttransactiondownload() {
		try {
			currenttransactiondownload.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement currenttransactiondownload = ldriver.findElement(By.xpath("//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-1v9nh78' and @data-testid='DownloadIcon']"));
			currenttransactiondownload.click();
		}
		
	}
	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedSecondary MuiButton-sizeSmall MuiButton-outlinedSizeSmall MuiButton-colorSecondary MuiButton-root MuiButton-outlined MuiButton-outlinedSecondary MuiButton-sizeSmall MuiButton-outlinedSizeSmall MuiButton-colorSecondary css-1myn3iq']")
	@CacheLookup
	WebElement currenttransactionfilter;
	public void clickcurrenttransactionfilter() {
		try {
			currenttransactionfilter.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement currenttransactionfilter = ldriver.findElement(By.xpath("//*[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedSecondary MuiButton-sizeSmall MuiButton-outlinedSizeSmall MuiButton-colorSecondary MuiButton-root MuiButton-outlined MuiButton-outlinedSecondary MuiButton-sizeSmall MuiButton-outlinedSizeSmall MuiButton-colorSecondary css-1myn3iq']"));
			currenttransactionfilter.click();
		}
		
	}
	
	@FindBy(xpath = "//input[@value='DESC']")
	@CacheLookup
	WebElement currenttransactionfilterdesc;
	public void clickcurrenttransactionfilterdesc() {
		try {
			currenttransactionfilterdesc.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement currenttransactionfilterdesc = ldriver.findElement(By.xpath("//input[@value='DESC']"));
			currenttransactionfilterdesc.click();
		}
		
	}
	@FindBy(xpath = "//input[@value='ASC']")
	@CacheLookup
	WebElement currenttransactionfilterasc;
	public void clickcurrenttransactionfilterasc() {
		try {
			currenttransactionfilterasc.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement currenttransactionfilterasc = ldriver.findElement(By.xpath("//input[@value='ASC']"));
			currenttransactionfilterasc.click();
		}
		
	}
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s']")
	@CacheLookup
	WebElement currenttransactionsubmit;
	public void clickcurrenttransactionsubmit() {
		try {
			currenttransactionsubmit.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement currenttransactionsubmit = ldriver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s']"));
			currenttransactionsubmit.click();	
		}
		
	}
	
	
	@FindBy(xpath = "//*[@class='MuiInputAdornment-root MuiInputAdornment-positionEnd MuiInputAdornment-outlined MuiInputAdornment-sizeSmall css-1nvf7g0']")
	@CacheLookup
	WebElement currenttransactionpagesizesearch;
	@FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd css-b52kj1']")
	@CacheLookup
	WebElement currenttransactionpagesize;
	public void entercurrenttransactionpagesize() {
		try {
			
			currenttransactionpagesize.sendKeys(Keys.CONTROL + "a");
			currenttransactionpagesize.sendKeys(Keys.DELETE);
			currenttransactionpagesize.sendKeys("50");
			currenttransactionpagesizesearch.click();
		}catch(StaleElementReferenceException e) {
			WebElement currenttransactionpagesize = ldriver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd css-b52kj1']"));
			WebElement currenttransactionpagesizesearch = ldriver.findElement(By.xpath("//*[@class='MuiInputAdornment-root MuiInputAdornment-positionEnd MuiInputAdornment-outlined MuiInputAdornment-sizeSmall css-1nvf7g0']"));
			currenttransactionpagesize.sendKeys(Keys.CONTROL + "a");
			currenttransactionpagesize.sendKeys(Keys.DELETE);
			currenttransactionpagesize.sendKeys("50");
			currenttransactionpagesizesearch.click();
		}
		
	}
	
	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1nj6kml'])[2]")
	@CacheLookup
	WebElement currenttransactionpagenext;
	public void entercurrenttransactionpagenext() {
		
		try {
			currenttransactionpagenext.click();
		}catch(StaleElementReferenceException e) {
			WebElement currenttransactionpagenext = ldriver.findElement(By.xpath("(//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1nj6kml'])[2]"));
			currenttransactionpagenext.click();
			
		}
		
	}
	
	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1nj6kml'])[1]")
	@CacheLookup
	WebElement currenttransactionpageprev;
	public void entercurrenttransactionpageprev() {
		
		try {
			currenttransactionpageprev.click();
		}
		catch(StaleElementReferenceException e){
			WebElement currenttransactionpageprev = ldriver.findElement(By.xpath("(//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1nj6kml'])[1]"));
			currenttransactionpageprev.click();
		}
		
	}
	
	/*current year report*/
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3'])[3]")
	@CacheLookup
	WebElement currentyearreport;
	public void clickcurrentyearreport() {
		
		currentyearreport.click();
	}
	
	
    @FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-134k4ey'])[1]")
	@CacheLookup
	WebElement searchbydate;
	public void clicksearchbydate() {
				
		searchbydate.click();
	}
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeSmall MuiPickersArrowSwitcher-button css-h1vjls']")
	WebElement prevmonth;
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-ub1r1'])[10]")
	WebElement fromdate;
	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[1]")
	@CacheLookup
	WebElement enterfromdate;
	
	public void enterfromdate() {
		
		  
		enterfromdate.click();
		prevmonth.click();
		fromdate.click();
		
	}
	
	@FindBy(xpath="(//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]")
	@CacheLookup
	WebElement entertodate;
	public void entertodate() {
		
		  
		entertodate.click();
		prevmonth.click();
		fromdate.click();
		
	}
	
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-1b373sw'])[1]")
	@CacheLookup
	WebElement searchByDate;
	
	public void clickSearchByDate() {
		
		  
	searchByDate.click();
		
	}
	
	@FindBy(xpath="//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	@CacheLookup
	WebElement enterphonenumber;
	
	public void enterPhonenumbers(String string) {
		
		enterphonenumber.sendKeys(Keys.CONTROL + "a");
		enterphonenumber.sendKeys(Keys.DELETE);
		enterphonenumber.sendKeys(string);
		
	}
	
	@FindBy(xpath="//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	@CacheLookup
	WebElement entervalidphonenumber;
	
	public void enterValidPhonenumber() {
		
		entervalidphonenumber.sendKeys(Keys.CONTROL + "a");
		entervalidphonenumber.sendKeys(Keys.DELETE);
		entervalidphonenumber.sendKeys("8248991404");
		
	}
	
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-1b373sw'])[2]")
	@CacheLookup
	WebElement searchreportbyphone;
	
	public void clickSearchreportbyphone() {
		
		  
		searchreportbyphone.click();
		
	}
	
	/*more button*/
	
	
	
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-134k4ey'])[2]")
	@CacheLookup
	WebElement morebutton;
	public void clickmorebutton() {
				
		morebutton.click();
	}
	
	/*@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s']")
	@CacheLookup
	WebElement searchbutton;
	public void clicksearchbutton() {
				
		searchbutton.click();
	}
	
	@FindBy(xpath = "//*[@id='demo-simple-select-autowidth']")
	@CacheLookup
	WebElement datavalue1;
	public void clickfromreportsdropdown() {
		
		datavalue1.click();
		
		
	}

	@FindBy(xpath = "//ul[contains(@class,'MuiList-root MuiList-padding MuiMenu-list css-r8u8y9')]//li")
	@CacheLookup
	List<WebElement> datavalues;
	public void clickfromreportsdropdownlist() {
		
		System.out.println(datavalues.size());
		for (WebElement option : datavalues) {
			System.out.println("1"+option.getText());
			option.click();
			System.out.println("2"+option.getText());
			searchbutton.click();
			System.out.println("3"+option.getText());
			datavalue1.click();
			System.out.println("4"+option.getText());
		}
		
		 
		
	}*/
	
	@FindBy(xpath = "//ul[contains(@class,'MuiList-root MuiList-padding MuiMenu-list css-r8u8y9')]//li")
	@CacheLookup
	List<WebElement> reportdatavalues;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s']")  
	WebElement searchbutton;

	@FindBy(xpath = "//*[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb']")  
	WebElement reportdropdown;

	//WebDriverWait wait = new WebDriverWait(ldriver, 10);

	public void clickFromReportsDropdownList() throws InterruptedException {
		System.out.println("1");
		reportdropdown.click();
		for (int i = 0; i < reportdatavalues.size(); i++) {
			System.out.println("size"+reportdatavalues.size());
			System.out.println("count"+i);
			if (i==12) {
				//div[contains(text(),'Financial year paid but cancelled Table')][@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb']
				 WebElement element = ldriver.findElement(By.xpath("//ul[contains(@class,'MuiList-root MuiList-padding MuiMenu-list css-r8u8y9')]//li"));
				    ((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", element);
				    
			}
			//System.out.println(ldriver.findElements(By.xpath("//ul[contains(@class,'MuiList-root MuiList-padding MuiMenu-list css-r8u8y9')]//li")).get(i));
		    WebElement values = ldriver.findElements(By.xpath("//ul[contains(@class,'MuiList-root MuiList-padding MuiMenu-list css-r8u8y9')]//li")).get(i);
		  
		    values.click();
		    searchbutton.click();
		    Thread.sleep(2000);
		    if(i<=14){
		    	reportdropdown.click();
		    }
		    
		}
	}
	
	
}
