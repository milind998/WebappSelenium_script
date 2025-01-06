package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;

public class InfluencerPage extends Reports{
  
	
	public InfluencerPage(WebDriver rdriver) {
		super(rdriver);
	}

	

	public void influencerlink() {
		
//		  ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Actions
//		  actions = new Actions(ldriver);
//		  WebElement influencerButton = ldriver.findElement(By.xpath("(//*[text()='Settings'])[2]"));
//		  actions.moveToElement(influencerButton).click().build().perform();
		 
		WebElement influencerButton = ldriver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-12zoz4r'])[14]"));
		
		influencerButton.click();
	}
	// wait for 10 seconds
	public void waits() {
//	ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void infuwaits() {
		WebDriverWait wait = new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Toastify__toast-body")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("Toastify__toast-body")));
		//new WebDriverWait(ldriver, 500).until(ExpectedConditions.invisibilityOfElementLocated(By.className("Toastify__toast-body")));
		}
	
	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		//js.executeScript("window.scrollBy(0,3000)");
		js.executeScript("window.scrollBy(0, 1000)");
	}
	public void scrollup() {
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		 js.executeScript("scroll(0, -250);");
	}
	
	// wait till toast msg goesoff
	public  void waittoastMessage() {
		/*WebElement wait = new WebDriverWait(ldriver, 100)
				.until(ExpectedConditions.elementToBeClickable(By.className("Toastify__toast-body")));*/
	
		// WebDriverWait wait = new WebDriverWait(ldriver, 4);
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.className("Toastify__toast-body")));
		// WebElement alertMessage =
		 //wait.until(ExpectedConditions.invisibilityOf(alertMessage));
		//new WebDriverWait(ldriver, 100).until(ExpectedConditions.invisibilityOfElementLocated(By.className("Toastify__toast-body")));
		WebDriverWait wait = new WebDriverWait(ldriver, 4);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void influencertab() {
		/*
		 * ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Actions
		 * actions = new Actions(ldriver);
		 * actions.moveToElement(influencerButton).click().build().perform();
		 */
		WebElement iinfluencertab = ldriver.findElement(By.xpath("//*[contains(text(),'Influencer')]"));
		Actions  actions = new Actions(ldriver);
		actions.moveToElement(iinfluencertab).click().build().perform();
	}
	
	public void scrollToElement(WebElement webElement) throws Exception {
	    ((JavascriptExecutor)ldriver).executeScript("arguments[0].scrollIntoViewIfNeeded()", webElement);
	    Thread.sleep(500);
	}
	
	@FindBy(xpath = "//*[contains(text(),'Influencer')]")
	@CacheLookup
	WebElement influencertab;
	public void clickinfluencertab() {
		
		influencertab.click();
	}
	
	
	@FindBy(xpath = "//*[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb']")
	@CacheLookup
	WebElement influencerdropdown;
	public void clickinfluencerdropdown() {
		// this javascript exe for scroll up
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		 js.executeScript("scroll(0, -250);");
		influencerdropdown.click();
	}
	
	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[1]")
	@CacheLookup
	WebElement influencerrequestdropdown;
	public void clickinfluencerrequestdropdown() {
		
		influencerrequestdropdown.click();
	}
	
	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1hw9j7s']")
	@CacheLookup
	WebElement searchbtn;
	public void clicksearchbtn() {
		
		searchbtn.click();
	}
	
	@FindBy(xpath = "(//*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter MuiTableCell-sizeMedium css-g7f81l'])")
	@CacheLookup
	//WebElement selectreq;
	 List<WebElement> selectreq;
	public void clickrequestlist() {	
	//	selectreq.click();
		
		List<String> options = Arrays.asList("automation influencer", "automation influencer_2", "automation influencer_3");

		for (WebElement item : selectreq) {
		    System.out.println(item.getText());
		    if (options.contains(item.getText())) {
		        item.click();
		        break;
		    }
		}

		 	
	}
	/*Reject button*/
	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-d4eqgw'])")
	@CacheLookup
	WebElement reject;
	public void clickreject() {
				
		reject.click();
	}
	/*Accept button*/
	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s'])")
	@CacheLookup
	WebElement accept;
	public void clickaccept() {
				
		accept.click();
	}
	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3'])[2]")
	@CacheLookup
	WebElement agree;
	public void clickagree() {
				
		agree.click();
	}
	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3'])[1]")
	@CacheLookup
	WebElement disagree;
	public void clickdisagree() {
				
		disagree.click();
	}
	// click validfrom
	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[1]")
	@CacheLookup
	WebElement validfrom;
	public void clickvalidfrom() {
						
		validfrom.click();
	}
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin MuiPickersDay-today css-wed0tz' and @aria-current='date']")
	@CacheLookup
	WebElement selectvalidfromdate;
	public void clickvalidfromdate() {
						
		selectvalidfromdate.click();
	}
	// click validto	
	@FindBy(xpath="(//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]")
	@CacheLookup
	WebElement validto;
	public void clickvalidto() {
						
		validto.click();
	}
	
	@FindBy(xpath="(//*[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-ub1r1'])[2]")
	@CacheLookup
	WebElement selectvalidto;
	public void clickvalidtodate() {
						
		selectvalidto.click();
	}
	// update validto date
	@FindBy(xpath="(//*[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-ub1r1'])[3]")
	@CacheLookup
	WebElement updatevalidto;
	public void updatevalidtodate() {
						
		updatevalidto.click();
	}
	
	@FindBy(xpath="(//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[1]")
	@CacheLookup
	WebElement influencer;
	public void clickinfluencer() {
						
		influencer.click();
	}
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-6fqjp3']")
	@CacheLookup
	WebElement update;
	public void clickupdate() {
						
		update.click();
		
	}
	@FindBy(xpath="//*[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3']")
	@CacheLookup
	WebElement deactivate;
	public void clickdeactivate() {
						
		deactivate.click();
	}
	
	/*this is for influencer disabled*/
	
	@FindBy(xpath="(//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[2]")
	@CacheLookup
	WebElement inflencerdisbled;
	public void clickinflencerdisbled() {
						
		inflencerdisbled.click();
	}
	/*this is for influencer rejected*/
	@FindBy(xpath="(//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[3]")
	@CacheLookup
	WebElement inflencerrejected;
	public void clickinflencerrejected() {
								
		inflencerrejected.click();
	}
	
	/* This is for influencer settlement*/
	
	@FindBy(xpath="//button[@value='InfluncerSettlement']")
	@CacheLookup
	WebElement inflencersettlementtab;
	public void clickinflencersettlementtab() {
								
		inflencersettlementtab.click();
	}
	
	@FindBy(xpath="//*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter MuiTableCell-sizeMedium css-ehfjjw']")
	@CacheLookup
	List<WebElement> inflencersettlmentlist;
	public void clickinflencersettlementlist() {				
		List<String> options = Arrays.asList("automation influencer", "automation influencer_2", "automation influencer_3");

		for (WebElement item : inflencersettlmentlist) {
		    System.out.println(item.getText());
		    if (options.contains(item.getText())) {
		        item.click();
		        break;
		    }
		}
	}
	
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3'])[2]")
	@CacheLookup
	WebElement inflencersettlementaccept;
	public void clickinflencersettlementaccept() {
								
		inflencersettlementaccept.click();
	}

	
	@FindBy(xpath="(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[1]")
	@CacheLookup
	WebElement settlementtdscharge;
	public void entertdscharge() {
		settlementtdscharge.clear();						
		settlementtdscharge.sendKeys("1");
	}
	
	@FindBy(xpath="(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[2]")
	@CacheLookup
	WebElement settlementextracharge;
	public void enterextracharge() {
		settlementextracharge.clear();						
		settlementextracharge.sendKeys("1");
	}
	
	
	@FindBy(xpath="//input[@type='file']")
	@CacheLookup
	WebElement settlementreceipt;
	public void uploadsettlementreceipt() {
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
        js.executeScript("arguments[0].scrollIntoView(true);", settlementreceipt);
		settlementreceipt.sendKeys("C:/Users/Noor Mohamed A/Downloads/ss22.png");
	}
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSuccess MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorSuccess MuiButton-root MuiButton-contained MuiButton-containedSuccess MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorSuccess css-5zrdtn']")
	@CacheLookup
	WebElement settleinfluencer;
	public void clicksettleinfluencer() {
								
		settleinfluencer.click();
	}
	
	
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3'])[1]")
	@CacheLookup
	WebElement inflencersettlmentreject;
	public void clickinflencersettlementreject() {
								
		inflencersettlmentreject.click();
	}
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3'])[3]")
	@CacheLookup
	WebElement inflencersettlmentclose;
	public void clickinflencersettlementclose() {
								
		inflencersettlmentclose.click();
	}
	/* Influencer settlement filter option*/
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorPrimary css-79xub']")
	@CacheLookup
	WebElement inflencersettlmentfilter;
	public void clicksettlementfilter() {
								
		inflencersettlmentfilter.click();
	}
	
	@FindBy(xpath="//input[@value='DESC']")
	@CacheLookup
	WebElement inflencersettlmentfilterdesc;
	public void clicksettlementdesc() {
								
		inflencersettlmentfilterdesc.click();
	}
	
	@FindBy(xpath="//input[@value='1003']")
	@CacheLookup
	WebElement inflencersettlmentrejectfilter;
	public void clicksettlementreject() {
								
		inflencersettlmentrejectfilter.click();
	}
	
	
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3'])[2]")
	@CacheLookup
	WebElement inflencersettlmentfiltersearch;
	public void clicksettlementrejectsearch() {
								
		inflencersettlmentfiltersearch.click();
	}	
	
	/* this is Settlement history*/
	
	@FindBy(xpath = "//input[@value='Settlement History']")
	@CacheLookup
	WebElement settlementhistory;
	public void clicksettlementhistory() {
		
		settlementhistory.click();
		
	}
	
	@FindBy(xpath = "//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']")
	@CacheLookup
	WebElement influencerphone;
	public void enterinfluencerphone(String phone) {
		
		influencerphone.sendKeys(phone);		
		
	}
	
	@FindBy(xpath = "//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']")
	@CacheLookup
	WebElement influencersphone;
    public void clearinfluencerphone() {
    	
    	influencersphone.sendKeys(Keys.CONTROL + "a");
        influencersphone.sendKeys(Keys.DELETE);
	}
	
     public void enterinfluencervalidphone() {
		
		influencerphone.sendKeys("8807720333");
	}
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-1lpukdo']")
	@CacheLookup
	WebElement settlementsearch;
	public void clicksettlementsearch() {
		
		settlementsearch.click();
		
	}
	
	@FindBy(xpath = "(//button [@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s'])[1]")
	@CacheLookup
	 List<WebElement>  downloadreceipt;
	public void clickdownloadreceipt() {
		for (WebElement button : downloadreceipt) {
			button.click();
		}
	}
	
	@FindBy(xpath = "(//button [@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s'])[2]")
	@CacheLookup
	WebElement notifyinfluencer;
	public void clicknotifyinfluencer() {
		
		notifyinfluencer.click();
		
	}
	
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[2]")
	@CacheLookup
	WebElement issuedfrom;
	public void enterissuedfrom() {
		
		issuedfrom.sendKeys("Bookwater");
		
	}
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[3]")
	@CacheLookup
	WebElement paymentmode;
	public void enterpaymentmode() {
		
		paymentmode.sendKeys("cheque");
		
	}
	
	@FindBy(xpath = "(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall  css-fvipm8'])[1]")
	@CacheLookup
	WebElement selectinfluenceraddressdropdown;
	public void clickinfluenceraddressdropdown() {
		
	  selectinfluenceraddressdropdown.click();
		
	}
	
	@FindBy(xpath = "(//*[@aria-selected='true'])[2]")
	@CacheLookup
	WebElement selectinfluenceraddress;
	public void clickinfluenceraddress() {
	
		 selectinfluenceraddress.click();
		
	}
	
	@FindBy(xpath = "(//*[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall  css-fvipm8'])")
	@CacheLookup
	WebElement accountnumberdropdown;
	public void clickaccountnumberdropdown() {
		
		accountnumberdropdown.click();
		
	}
	
	@FindBy(xpath = "(//*[@aria-selected='true'])[2]")
	@CacheLookup
	WebElement selectaccountnumber;
	public void clickselectaccountnumber() {
		
		selectaccountnumber.click();
		
	}
	
	@FindBy(xpath = "//*[@class='MuiInputBase-input MuiInput-input css-mnn31']")
	@CacheLookup
	WebElement clickonnotifydate;
	public void clicknotifydate() {
		
		// clickonnotifydate.getClass()
		   clickonnotifydate.click();
		
	}
	
	/*@FindBy(xpath="//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin MuiPickersDay-today css-wed0tz' and @aria-current='date']")
	@CacheLookup
	WebElement selectvalidfromdate;
	public void clickvalidfromdate() {
						
		selectvalidfromdate.click();
	}*/
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	@CacheLookup
	WebElement clicksubmit;
	public void clicksubmitbutton() {
		
	  clicksubmit.click();
		
	}
	
	
	/* this is for main banners tab*/
	        
	@FindBy(xpath = "//*[contains(text(),'Banners')]")
	@CacheLookup
	WebElement bannertab;
	public void clickbannertab() {
		
		bannertab.click();
	}					
	/*this clicking create banner tab*/
	@FindBy(xpath = "//button[contains(text(),'Banners')][@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary css-1q2h7u5']")
	@CacheLookup
	WebElement addbanner;
	public void clickaddbanner() {
		
		addbanner.click();
	}	
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s']")
	@CacheLookup
	WebElement addbannerbutton;
	public void clickaddbannerbutton() {
		
		addbannerbutton.click();
	}
	
	@FindBy(id = "demo-simple-select")
	//@FindBy(xpath = "(//*[@class='MuiFormLabel-root MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-outlined MuiFormLabel-colorPrimary MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-outlined css-p0rm37'])[1]")
	@CacheLookup
	WebElement bannertypedropdown;
	public void clickbannertypedropdown() {
		
		bannertypedropdown.click();
	}
	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[1]")
	@CacheLookup
	WebElement selectbannertype;
	public void clickselectbannertype() {
		
		selectbannertype.click();
	}
	
	@FindBy(id = "outlined-basic")
	@CacheLookup
	WebElement entermessage;
	public void enterbannermessage() {
		
		entermessage.sendKeys("test");
	}
	
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[2]")
	@CacheLookup
	WebElement enterheader;
	public void enterbannerheader() {
				
		enterheader.sendKeys("test");
	}
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[3]")
	@CacheLookup
	WebElement expiryhours;
	public void enterexpiryhours() {
				
		expiryhours.sendKeys("2");
	}
	
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[4]")
	@CacheLookup
	WebElement displayorder;
	public void enterdisplayorder() {
				
		displayorder.sendKeys("4");
	}
	
	@FindBy(xpath = "(//input[@type='file'])[1]")
	@CacheLookup
	WebElement uploadsmallimage;
	public void uploadsmallimage() {
	
		uploadsmallimage.sendKeys("C:/Users/Noor Mohamed A/Downloads/ss22.png");
		
	}
	
	@FindBy(xpath = "(//input[@type='file'])[2]")
	@CacheLookup
	WebElement uploadmaxscreenimage;
	public void uploadmaximage() {
	
		uploadmaxscreenimage.sendKeys("C:/Users/Noor Mohamed A/Downloads/ss22.png");
		
	}
	
	@FindBy(xpath = "(//*[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb'])[2]")
	@CacheLookup
	WebElement apppagedropdown;
	public void selectapppage() {
			
		apppagedropdown.click();
				
	}
	
	//@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz' and @data-value='1'])")
	@FindBy(xpath = "//*[contains(text(),'HOME')]")
	@CacheLookup
	WebElement apppage;
	public void clickapppage() {
					
		apppage.click();
						
	}
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeSmall MuiButton-outlinedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeSmall MuiButton-outlinedSizeSmall MuiButton-colorPrimary css-k58djc']")
	@CacheLookup
	WebElement createnewbanner;
	public void clickcreatenewbanner() {
					
		createnewbanner.click();
						
	}
	/*Filter option in banner*/
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedSecondary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorSecondary MuiButton-root MuiButton-outlined MuiButton-outlinedSecondary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorSecondary css-11pdzw']")
	@CacheLookup
	WebElement bannerfilter;
	public void clickbannerfilter() {
					
		bannerfilter.click();
						
	}
	@FindBy(xpath = "//*[@value='DESC']")
	@CacheLookup
	WebElement selectdesc;
	public void clickselectdesc() {
					
		selectdesc.click();
						
	}
	@FindBy(xpath = "//*[@value='ASC']")
	@CacheLookup
	WebElement selectasc;
	public void clickselectasc() {
					
		selectasc.click();
						
	}
	@FindBy(xpath = "//*[contains(text(),'Disabled')]")
	@CacheLookup
	WebElement selectdisabled;
	public void clickselectdisabled() {
					
		selectdisabled.click();
						
	}
	@FindBy(xpath = "(//*[@name='radio-buttons-group'])[3]")
	@CacheLookup
	WebElement selectenabled;
	public void clickselectenabled() {
					
		selectenabled.click();
						
	}
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeSmall MuiButton-outlinedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeSmall MuiButton-outlinedSizeSmall MuiButton-colorPrimary css-k58djc']")
	@CacheLookup
	WebElement filter;
	public void clickfilter() {
					
		filter.click();
						
	}
	/* Select Disabled list */
	@FindBy(xpath = "(//*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-sizeMedium css-1r82erg'])[2]")
	@CacheLookup
	WebElement disabledlist;
	public void clickdisabledlist() {
							
		disabledlist.click();
								
	}
	
	@FindBy(xpath = "//*[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3']")
	@CacheLookup
	WebElement toggledisabletoenable;
	public void clicktoggledisabletoenable() {
							
		toggledisabletoenable.click();
							
	}
	
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeSmall MuiButton-outlinedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeSmall MuiButton-outlinedSizeSmall MuiButton-colorPrimary css-k58djc'])[1]")
	@CacheLookup
	WebElement editfilter;
	public void clickeditfilter() {
							
		editfilter.click();
								
	}
	// this for adding banner type
	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected css-1q2h7u5'])[2]")
	@CacheLookup
	WebElement bannertypetab;
	public void clickbannertypetab() {
							
		bannertypetab.click();
								
	}
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s']")
	@CacheLookup
	WebElement addbannertype;
	public void clickaddbannertype() {
							
		addbannertype.click();
								
	}
	
	@FindBy(xpath = "//*[@id='outlined-basic']")
	@CacheLookup
	WebElement bannertypename;
	public void enterbannertype() {
							
		bannertypename.sendKeys("Automation_TestBannertype");
								
	}	
	
	@FindBy(xpath = "//*[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3']")
	@CacheLookup
	WebElement bannertypetoggle;
	public void clickbannertypetoggle() {
							
		bannertypetoggle.click();
								
	}
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeSmall MuiButton-outlinedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeSmall MuiButton-outlinedSizeSmall MuiButton-colorPrimary css-k58djc']")
	@CacheLookup
	WebElement addbannertypename;
	public void clickaddbannertypename() {
							
		addbannertypename.click();
								
	}
	/*Filter option banner type*/
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedSecondary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorSecondary MuiButton-root MuiButton-outlined MuiButton-outlinedSecondary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorSecondary css-11pdzw']")
	@CacheLookup
	WebElement bannertypefilter;
	public void clickbannertypefilter() {
							
		bannertypefilter.click();
								
	}
	
	@FindBy(xpath = "//input[@Value='ASC']")
	@CacheLookup
	WebElement bannertypefilterasc;
	public void clickbannertypefilterasc() {
							
		bannertypefilterasc.click();
								
	}
	@FindBy(xpath = "//input[@Value='DESC']")
	@CacheLookup
	WebElement bannertypefilterdesc;
	public void clickbannertypefilterdesc() {
							
		bannertypefilterdesc.click();
								
	}
	
	@FindBy(xpath = "//input[@Value='true']")
	@CacheLookup
	WebElement bannertypefilterenabled;
	public void clickbannertypefilterenabled() {
							
		bannertypefilterenabled.click();
								
	}
	@FindBy(xpath = "//input[@Value='false']")
	@CacheLookup
	WebElement bannertypefilterdisabled;
	public void clickbannertypefilterdisabled() {
							
		bannertypefilterdisabled.click();
								
	}
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeSmall MuiButton-outlinedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeSmall MuiButton-outlinedSizeSmall MuiButton-colorPrimary css-k58djc']")
	@CacheLookup
	WebElement bannertypefilterbutton;
	public void clickbannertypefilterbutton() {
							
		bannertypefilterbutton.click();
								
	}
	
	@FindBy(xpath = "//*[contains(text(),'Automation_TestBannertype')][@class='MuiTableCell-root MuiTableCell-body MuiTableCell-sizeMedium css-1r82erg']")
	@CacheLookup
	WebElement bannertypeenabledlist;
	public void clickbannertypeenabledlist() {
							
		bannertypeenabledlist.click();
								
	}
	@FindBy(xpath = "//input[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3']")
	@CacheLookup
	WebElement bannertypetodisable;
	public void clickbannertypetodisable() {
							
		bannertypetodisable.click();
								
	}
	@FindBy(xpath = "//*[contains(text(),'Close')]")
	@CacheLookup
	WebElement bannertypeclose;
	public void clickbannertypeclose() {
							
		bannertypeclose.click();
								
	}
	@FindBy(xpath = "//*[contains(text(),'Update')]")
	@CacheLookup
	WebElement bannertypeupdate;
	public void clickbannertypeupdate() {
							
		bannertypeupdate.click();
								
	}
	
	/*Lost can Notification*/
	
	@FindBy(xpath = "//*[contains(text(),'Lost Cans')]")
	@CacheLookup
	WebElement lostcantab;
	public void clicklostcantab() {
							
		lostcantab.click();
								
	}
	
	@FindBy(xpath = "//button[contains(text(),'Filter')]")
	@CacheLookup
	WebElement filterlostcan;
	public void clickfilterlostcan() {
							
		filterlostcan.click();
								
	}
	
	@FindBy(xpath = "//input[@value='DISTRIBUTOR']")
	@CacheLookup
	WebElement distributorradiobtn;
	public void clickdistributorradiobtn() {
							
		distributorradiobtn.click();
								
	}
	
	@FindBy(xpath = "//input[@value='CONSUMER']")
	@CacheLookup
	WebElement consumerradiobtn;
	public void clickconsumerradiobtn() {
							
		consumerradiobtn.click();
								
	}
	@FindBy(xpath = "//input[@value='WFS']")
	@CacheLookup
	WebElement wfsradiobtn;
	public void clickwfsradiobtn() {
							
		wfsradiobtn.click();
								
	}
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s']")
	@CacheLookup
	WebElement applybutton;
	public void clickapplybutton() {
							
		applybutton.click();
								
	}
	
	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium css-zun73v'])[1]")
	@CacheLookup
	WebElement lostcanlist;
	public void clicklostcanlist() {
							
		lostcanlist.click();
								
	}
	
	@FindBy(xpath = "//button[contains(text(),'Notify users')]")
	@CacheLookup
	WebElement notifylostcan;
	public void clicknotifylostcan() {
							
		notifylostcan.click();
								
	}
	
	@FindBy(xpath = "//button[contains(text(),'Disable cans')]")
	@CacheLookup
	WebElement disablelostcan;
	public void clickdisablelostcan() {
							
		disablelostcan.click();
								
	}
	
	
	
	
}
