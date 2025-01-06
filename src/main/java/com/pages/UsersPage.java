package com.pages;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UsersPage extends SKU {

	public UsersPage(WebDriver ldriver) {
		super(ldriver);

	}

	public void userModule() {

		WebElement users = ldriver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-12zoz4r'])[4]"));

		users.click();
		ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	public void spinnerwaits() {
		WebDriverWait wait = new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-uhb5lp']")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-uhb5lp']")));
	}

	public void waittoast() {
		WebDriverWait wait = new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Toastify__toast-body")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("Toastify__toast-body")));
		//new WebDriverWait(ldriver, 500).until(ExpectedConditions.invisibilityOfElementLocated(By.className("Toastify__toast-body")));
	}
	public void scrollpagetop () {
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollTo(0, 0);");
	}


	@FindBy(xpath="//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd css-b52kj1']")
	@CacheLookup
	WebElement enterusersnumber;
	public void enterUsernumber(String number) {
		enterusersnumber.sendKeys(Keys.CONTROL + "a");
		enterusersnumber.sendKeys(Keys.DELETE);
		enterusersnumber.sendKeys(number);
	}


	@FindBy(xpath="//*[@class='MuiInputAdornment-root MuiInputAdornment-positionEnd MuiInputAdornment-outlined MuiInputAdornment-sizeSmall css-1nvf7g0']")
	@CacheLookup
	WebElement clicksearchicon;
	public void clickSearchicon() {

		clicksearchicon.click();

	} 


	@FindBy(xpath="(//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3'])[2]")
	@CacheLookup
	WebElement clickclose;
	public void clickClose() {
		clickclose.click();
		//		WebDriverWait wait = new WebDriverWait(ldriver, 10);
		//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3'])[2]")));
		//		element.click();
		//		WebElement button = ldriver.findElement(By.xpath("(//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3'])[2]"));
		//		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", button);


	}

	// Users profile locators

	@FindBy(xpath="(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[1]")
	@CacheLookup
	WebElement username;
	public void enterUsername(String name) {
		username.sendKeys(Keys.CONTROL + "a");
		username.sendKeys(Keys.DELETE);
		username.sendKeys(name);

	} 

	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSuccess MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorSuccess MuiButton-root MuiButton-contained MuiButton-containedSuccess MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorSuccess css-f5ro1b']")
	@CacheLookup
	WebElement updateprofile;
	public void clickUpdateprofile() {

		updateprofile.click();
	} 

	@FindBy(xpath="(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[2]")
	@CacheLookup
	WebElement userphone;
	public void enterUserphone(String phone) {
		userphone.sendKeys(Keys.CONTROL + "a");
		userphone.sendKeys(Keys.DELETE);
		userphone.sendKeys(phone);

	} 

	@FindBy(xpath="(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[3]")
	@CacheLookup
	WebElement usermail;
	public void enterUsermail(String mail) {
		usermail.sendKeys(Keys.CONTROL + "a");
		usermail.sendKeys(Keys.DELETE);
		usermail.sendKeys(mail);

	} 

	@FindBy(xpath="(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[4]")
	@CacheLookup
	WebElement userreferalid;
	public void enterUserreferalid(String gst) {
		userreferalid.sendKeys(Keys.CONTROL + "a");
		userreferalid.sendKeys(Keys.DELETE);
		userreferalid.sendKeys(gst);

	} 

	@FindBy(xpath="(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[5]")
	@CacheLookup
	WebElement userbillname;
	public void enterUserbillname(String bname) {
		userbillname.sendKeys(Keys.CONTROL + "a");
		userbillname.sendKeys(Keys.DELETE);
		userbillname.sendKeys(bname);

	} 

	@FindBy(xpath="(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[6]")
	@CacheLookup
	WebElement usergst;
	public void enterUsergst(String gst) {
		usergst.sendKeys(Keys.CONTROL + "a");
		usergst.sendKeys(Keys.DELETE);
		usergst.sendKeys(gst);

	} 

	/*user active/inactive status toggle*/
	@FindBy(xpath="(//input[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3'])[1]")
	@CacheLookup
	WebElement useractive;
	public void toggleUserstatus() {
		//useractive.click();
		//  System.out.println(useractive.isEnabled());
		if (useractive.isEnabled()) {
			System.out.println("User is active");
		}else {
			throw new AssertionError("User is inactive");
		}
	} 

	/*user influencer toggle*/
	@FindBy(xpath="(//input[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3'])[2]")
	@CacheLookup
	WebElement userinfluencertoogle;
	public void toggleUserinfluencer() {
		//userinfluencertoogle.click();
		//	 System.out.println("userinfluencertoggle"+userinfluencertoogle.isEnabled());
		if (userinfluencertoogle.isEnabled()) {
			System.out.println("Influencer status is active");
		}else {
			throw new AssertionError("Influencer status is inactive");
		}

	} 

	/*user influencer button*/
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-170xg3y'])")
	@CacheLookup
	WebElement userinfluencerbutton;
	public void clickUserinfluencer() {
		userinfluencerbutton.click();

	} 

	/*user referral id download */
	@FindBy(xpath="//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'][@data-testid='DownloadIcon']")
	@CacheLookup
	WebElement downloaduserreferalid;
	public void clickdDownloadUserReferalid() {
		downloaduserreferalid.click();
		ChromeOptions options = new ChromeOptions();
		String downloadFilepath = "C:\\Users\\Noor Mohamed A\\Downloads";
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_directory", downloadFilepath);
		options.setExperimentalOption("prefs", prefs);

	} 

	/*user b2b toggle*/
	@FindBy(xpath="(//input[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3'])[3]")
	@CacheLookup
	WebElement userb2btoogle;
	public void toggleb2buser() {
		//userb2btoogle.click();
		//	 System.out.println(userb2btoogle.isEnabled());
		if (userb2btoogle.isEnabled()) {
			System.out.println("User is B2B user");
		}else {
			throw new AssertionError("User is Not B2B user");
		}
	} 

	/*user notify toggle*/
	@FindBy(xpath="(//input[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3'])[4]")
	@CacheLookup
	WebElement usernotification;
	public void toggleNotifyuser() {
		//usernotification.click();
		//	 System.out.println(usernotification.isEnabled());
		if (usernotification.isEnabled()) {
			System.out.println("Usernotification is active");
		}else {
			throw new AssertionError("Usernotification is inactive");
		}

	} 
	/*user postpaid email toggle*/
	@FindBy(xpath="(//input[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3'])[5]")
	@CacheLookup
	WebElement userpostpaidmail;
	public void togglepostpaidmail() {
		//usernotification.click();
		//	 System.out.println(userpostpaidmail.isEnabled());
		if (userpostpaidmail.isEnabled()) {
			System.out.println("Postpaid mail is enabled");
		}else {
			throw new AssertionError("Postpaid mail is disabled");
		}
	}
	/*user update button2*/
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-16nj6z3']")
	@CacheLookup
	WebElement userupdate;
	public void clickUpdateuser() {
		userupdate.click();


	}
	/*Redeem request dialog box*/
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-5u5rh5'])")
	@CacheLookup
	WebElement requestredeem;
	public void clickrequestredeem() {
		
		try {
			requestredeem.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement requestredeem = ldriver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-5u5rh5'])"));
			requestredeem.click();
		}
	}

	@FindBy(xpath="//ul[contains(@class,'MuiList-root MuiList-padding MuiMenu-list css-r8u8y9')]//li[1]")
	@CacheLookup
	WebElement Selectaccount;
	public void selectBank() {

		try {
			Selectaccount.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement Selectaccount = ldriver.findElement(By.xpath("//ul[contains(@class,'MuiList-root MuiList-padding MuiMenu-list css-r8u8y9')]//li[1]"));
			Selectaccount.click();
		}

	}

	@FindBy(xpath="(//input[@id='name'])[1]")
	@CacheLookup
	WebElement Selectifsc;
	public void selectifsccode(String ifsc) {

		try {
			Selectifsc.sendKeys(Keys.CONTROL + "a");
			Selectifsc.sendKeys(Keys.DELETE);
			Selectifsc.sendKeys(ifsc);
		}
		catch(StaleElementReferenceException e) {
			WebElement Selectifsc = ldriver.findElement(By.xpath("(//input[@id='name'])[1]"));
			Selectifsc.sendKeys(Keys.CONTROL + "a");
			Selectifsc.sendKeys(Keys.DELETE);
			Selectifsc.sendKeys(ifsc);
		}

	}
	@FindBy(xpath="(//input[@id='name'])[2]")
	@CacheLookup
	WebElement Selectbankname;
	public void selectBankname(String bank) {

		try {
			Selectbankname.sendKeys(Keys.CONTROL + "a");
			Selectbankname.sendKeys(Keys.DELETE);
			Selectbankname.sendKeys(bank);
		}
		catch(StaleElementReferenceException e) {
			WebElement Selectbankname = ldriver.findElement(By.xpath("(//input[@id='name'])[2]"));
			Selectbankname.sendKeys(Keys.CONTROL + "a");
			Selectbankname.sendKeys(Keys.DELETE);
			Selectbankname.sendKeys(bank);
		}

	}

	@FindBy(xpath="(//input[@id='name'])[3]")
	@CacheLookup
	WebElement Selectpancard;
	public void selectPancard(String pan) {

		try {
			Selectpancard.sendKeys(Keys.CONTROL + "a");
			Selectpancard.sendKeys(Keys.DELETE);
			Selectpancard.sendKeys(pan);
		}
		catch(StaleElementReferenceException e) {
			WebElement Selectpancard = ldriver.findElement(By.xpath("(//input[@id='name'])[3]"));
			Selectpancard.sendKeys(Keys.CONTROL + "a");
			Selectpancard.sendKeys(Keys.DELETE);
			Selectpancard.sendKeys(pan);
		}
	}

	@FindBy(xpath="(//input[@id='name'])[4]")
	@CacheLookup
	WebElement Selectbank;
	public void selectBankname2(String bank) {

		try {
			Selectbank.sendKeys(Keys.CONTROL + "a");
			Selectbank.sendKeys(Keys.DELETE);
			Selectbank.sendKeys(bank);
		}
		catch(StaleElementReferenceException e) {
			WebElement Selectbank = ldriver.findElement(By.xpath("(//input[@id='name'])[4]"));
			Selectbank.sendKeys(Keys.CONTROL + "a");
			Selectbank.sendKeys(Keys.DELETE);
			Selectbank.sendKeys(bank);
		}
	}

	@FindBy(xpath="(//input[@id='name'])[5]")
	@CacheLookup
	WebElement accountno1;
	public void selectAccountno1(String acc) {

		try {
			accountno1.sendKeys(Keys.CONTROL + "a");
			accountno1.sendKeys(Keys.DELETE);
			accountno1.sendKeys(acc);
		}
		catch(StaleElementReferenceException e) {
			WebElement accountno1 = ldriver.findElement(By.xpath("(//input[@id='name'])[5]"));
			accountno1.sendKeys(Keys.CONTROL + "a");
			accountno1.sendKeys(Keys.DELETE);
			accountno1.sendKeys(acc);
		}

	}
	@FindBy(xpath="(//input[@id='name'])[6]")
	@CacheLookup
	WebElement accountno2;
	public void selectAccountno2(String acc) {

		try {
			accountno2.sendKeys(Keys.CONTROL + "a");
			accountno2.sendKeys(Keys.DELETE);
			accountno2.sendKeys(acc);
		}
		catch(StaleElementReferenceException e) {
			WebElement accountno2 = ldriver.findElement(By.xpath("(//input[@id='name'])[6]"));
			accountno2.sendKeys(Keys.CONTROL + "a");
			accountno2.sendKeys(Keys.DELETE);
			accountno2.sendKeys(acc);
		}
	}

	@FindBy(xpath="(//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[7]")
	@CacheLookup
	WebElement waterdropnumber;
	public void enterWaterdropnumber(String drops) {

		try {
			waterdropnumber.sendKeys(Keys.CONTROL + "a");
			waterdropnumber.sendKeys(Keys.DELETE);
			waterdropnumber.sendKeys(drops);
		}
		catch(StaleElementReferenceException e) {
			WebElement waterdropnumber = ldriver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[7]"));
			waterdropnumber.sendKeys(Keys.CONTROL + "a");
			waterdropnumber.sendKeys(Keys.DELETE);
			waterdropnumber.sendKeys(drops);
		}
	}

	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s'])[1]")
	@CacheLookup
	WebElement verifyifsc;
	public void clickVerify() {

		try {
			verifyifsc.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement verifyifsc = ldriver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s'])[1]"));
			verifyifsc.click();
		}
	}

	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s'])[2]")
	@CacheLookup
	WebElement sendrequest;
	public void clickSendRequest() {

		try {
			sendrequest.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement sendrequest = ldriver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s'])[2]"));
			sendrequest.click();
		}
	}

	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3'])[4]")
	@CacheLookup
	WebElement cancelrequest;
	public void clickCancelRequest() {

		try {
			cancelrequest.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement cancelrequest = ldriver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3'])[4]"));
			cancelrequest.click();
		}
	}

	
	/*************************** User Custom  Amount ****************************8*/
	

		@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-2v66nz']")
		@CacheLookup
		WebElement productbtn;
		public void clickProduct() {

			try {
				productbtn.click();
						System.out.println("prod");
			}
			catch(StaleElementReferenceException e) {
				System.out.println("prodcatch");
				WebElement productbtn = ldriver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-2v66nz']"));
				productbtn.click();
				System.out.println("prodcatch2");

			}

		}
		/*** for Selecting 20 litre product from dropdown for custom price on user level and address level and ****/
		@FindBy(xpath="(//*[@class='MuiFormLabel-root MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-sizeSmall MuiInputLabel-outlined MuiFormLabel-colorPrimary MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-sizeSmall MuiInputLabel-outlined css-cktaik'])[2]")
		@CacheLookup
		WebElement productDropdown;

		@FindBy(xpath="//li[@data-value='20_Liters-PET']")
		@CacheLookup
		WebElement selectProduct;

		public void selectProduct() {
			  try {
			        WebDriverWait wait = new WebDriverWait(ldriver, 15);

			        // Wait until the dropdown is clickable and click using JavaScript Executor
			        wait.until(ExpectedConditions.elementToBeClickable(productDropdown));
			        ((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", productDropdown);

			        // Wait until the product option is visible and clickable
			        wait.until(ExpectedConditions.visibilityOf(selectProduct));
			        wait.until(ExpectedConditions.elementToBeClickable(selectProduct));
			        ((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", selectProduct);

			    } catch (Exception ex) {
			        System.out.println("Exception occurred while selecting the product: " + ex.getMessage());
			        ex.printStackTrace();
			        throw new RuntimeException("Failed to select product from dropdown.", ex);
			    }
		}
	
		@FindBy(xpath="//button[contains(text(),'Add')][@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-1lpukdo']")
		@CacheLookup
		WebElement addproduct;
		public void addProduct() {

			try {
				addproduct.click();
			}
			catch(StaleElementReferenceException e) {
				WebElement addproduct = ldriver.findElement(By.xpath("//button[contains(text(),'Add')][@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-1lpukdo']"));
				addproduct.click();

			}
		}

		@FindBy(xpath="(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")
		@CacheLookup
		WebElement onetime;
		public void selectonetime() {

			try {
				onetime.click();
			}
			catch(StaleElementReferenceException e) {
				WebElement onetime = ldriver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]"));
				onetime.click();
			}
		}

		@FindBy(xpath="(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")
		@CacheLookup
		WebElement refill;
		public void selectrefill() {

			try {
				refill.click();
			}
			catch(StaleElementReferenceException e) {
				WebElement refill = ldriver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]"));
				refill.click();
			}

		}

		@FindBy(xpath="(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[3]")
		@CacheLookup
		WebElement bothsale;
		public void selectbothsale() {

			try {
				bothsale.click();
			}
			catch(StaleElementReferenceException e) {
				WebElement bothsale = ldriver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[3]"));
				bothsale.click();
			}
		}

		@FindBy(xpath="(//input[@name='deposit'])[1]")
		@CacheLookup
		WebElement deposit;
		public void enterdeposit(String s) {

			try {
				deposit.sendKeys(Keys.CONTROL + "a");
				deposit.sendKeys(Keys.DELETE);
				deposit.sendKeys(s);
			}
			catch(StaleElementReferenceException e) {
				WebElement deposit = ldriver.findElement(By.xpath("(//input[@name='deposit'])[1]"));
				deposit.sendKeys(Keys.CONTROL + "a");
				deposit.sendKeys(Keys.DELETE);
				deposit.sendKeys(s);
			}
		}

		@FindBy(xpath="(//input[@name='mrp'])[1]")
		@CacheLookup
		WebElement mrp;
		public void entermrp(String s) {

			try {
				mrp.sendKeys(Keys.CONTROL + "a");
				mrp.sendKeys(Keys.DELETE);
				mrp.sendKeys(s);
			}
			catch(StaleElementReferenceException e) {
				WebElement mrp = ldriver.findElement(By.xpath("(//input[@name='mrp'])[1]"));
				mrp.sendKeys(Keys.CONTROL + "a");
				mrp.sendKeys(Keys.DELETE);
				mrp.sendKeys(s);
			}
		}
		@FindBy(xpath="(//select[@class='MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-ciw10u'])[1]")
		@CacheLookup
		WebElement refundtype;
		public void selectrefundtype(String wallet) {

			try {
				Select dropdown = new Select(refundtype);  
				dropdown.selectByVisibleText(wallet); 
			}
			catch(StaleElementReferenceException e) {
				WebElement refundtype = ldriver.findElement(By.xpath("(//select[@class='MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-ciw10u'])[1]"));
				Select dropdown = new Select(refundtype);  
				dropdown.selectByVisibleText(wallet); 
			}

		}


		@FindBy(xpath="(//input[@name='refund_amount'])[1]")
		@CacheLookup
		WebElement refundamount;
		public void enterRefundAmount(String s) {

			try {
				refundamount.sendKeys(Keys.CONTROL + "a");
				refundamount.sendKeys(Keys.DELETE);
				refundamount.sendKeys(s);
			}
			catch(StaleElementReferenceException e) {
				WebElement refundamount = ldriver.findElement(By.xpath("(//input[@name='refund_amount'])[1]"));
				refundamount.sendKeys(Keys.CONTROL + "a");
				refundamount.sendKeys(Keys.DELETE);
				refundamount.sendKeys(s);
			}
		}

		@FindBy(xpath="//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-1v4ccyo']//input[@name='sp']")
		@CacheLookup
		WebElement sellingprice;
		public void enterSellingprice(String s) {

			try {
				sellingprice.sendKeys(Keys.CONTROL + "a");
				sellingprice.sendKeys(Keys.DELETE);
				sellingprice.sendKeys(s);
			}
			catch(StaleElementReferenceException e) {
				//	System.out.println("sp");
				WebElement sellingprice = ldriver.findElement(By.xpath("(//input[@name='sp'])[1]"));
				sellingprice.sendKeys(Keys.CONTROL + "a");
				sellingprice.sendKeys(Keys.DELETE);
				sellingprice.sendKeys(s);


			}
		}

		@FindBy(xpath="//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-1v4ccyo']//input[@name='country']")
		@CacheLookup
		WebElement sellingpricerefill;
		public void enterSellingpricerefill(String s) {

			try {
				sellingpricerefill.sendKeys(Keys.CONTROL + "a");
				sellingpricerefill.sendKeys(Keys.DELETE);
				sellingpricerefill.sendKeys(s);
			}
			catch(StaleElementReferenceException e) {
				WebElement sellingpricerefill = ldriver.findElement(By.xpath("(//input[@name='country'])[1]"));		
				sellingpricerefill.sendKeys(Keys.CONTROL + "a");
				sellingpricerefill.sendKeys(Keys.DELETE);
				sellingpricerefill.sendKeys(s);


			}
		}

		@FindBy(xpath="(//input[@name='deposit'])[2]")
		@CacheLookup
		WebElement deposit1;
		public void enterdeposit2(String s) {

			try {
				//   	System.out.println("1d");
				deposit1.sendKeys(Keys.CONTROL + "a");
				deposit1.sendKeys(Keys.DELETE);
				deposit1.sendKeys(s);
				//		System.out.println("2d");
			}
			catch(StaleElementReferenceException e) {
				//		System.out.println("1cd");
				WebElement deposit1 = ldriver.findElement(By.xpath("(//input[@name='deposit'])[2]"));
				deposit1.sendKeys(Keys.CONTROL + "a");
				deposit1.sendKeys(Keys.DELETE);
				deposit1.sendKeys(s);
				//		System.out.println("2cd");
			}
		}

		@FindBy(xpath="(//input[@name='mrp'])[2]")
		@CacheLookup
		WebElement mrp1;
		public void entermrp2(String s) {

			try {
				//   	System.out.println("1m");
				mrp1.sendKeys(Keys.CONTROL + "a");
				mrp1.sendKeys(Keys.DELETE);
				mrp1.sendKeys(s);
				//		System.out.println("2m");
			}
			catch(StaleElementReferenceException e) {
				//		System.out.println("1cm");
				WebElement mrp1 = ldriver.findElement(By.xpath("(//input[@name='mrp'])[2]"));
				mrp1.sendKeys(Keys.CONTROL + "a");
				mrp1.sendKeys(Keys.DELETE);
				mrp1.sendKeys(s);
				//		System.out.println("2cm");
			}
		}
		@FindBy(xpath="(//select[@class='MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-ciw10u'])[2]")
		@CacheLookup
		WebElement refundtype1;
		public void selectrefundtype2(String wallet) {

			try {
				//    	System.out.println("1r");
				Select dropdown = new Select(refundtype1);  
				dropdown.selectByVisibleText(wallet); 
				//		System.out.println("2r");
			}
			catch(StaleElementReferenceException e) {
				//		System.out.println("1cr");
				WebElement refundtype1 = ldriver.findElement(By.xpath("(//select[@class='MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-ciw10u'])[2]"));
				Select dropdown = new Select(refundtype1);  
				dropdown.selectByVisibleText(wallet); 
				//		System.out.println("2cr");
			}

		}


		@FindBy(xpath="(//input[@name='refund_amount'])[2]")
		@CacheLookup
		WebElement refundamount1;
		public void enterRefundAmount2(String s) {

			try {
				refundamount1.sendKeys(Keys.CONTROL + "a");
				refundamount1.sendKeys(Keys.DELETE);
				refundamount1.sendKeys(s);
			}
			catch(StaleElementReferenceException e) {
				WebElement refundamount1 = ldriver.findElement(By.xpath("(//input[@name='refund_amount'])[2]"));
				refundamount1.sendKeys(Keys.CONTROL + "a");
				refundamount1.sendKeys(Keys.DELETE);
				refundamount1.sendKeys(s);
			}
		}


		@FindBy(xpath="//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-1v4ccyo']//input[@name='country']")
		@CacheLookup
		WebElement sellingpricerefill1;
		public void enterSellingpricerefill2(String s) {

			try {
				sellingpricerefill1.sendKeys(Keys.CONTROL + "a");
				sellingpricerefill1.sendKeys(Keys.DELETE);
				sellingpricerefill1.sendKeys(s);
			}
			catch(StaleElementReferenceException e) {
				WebElement sellingpricerefill1 = ldriver.findElement(By.xpath("(//input[@name='country'])[1]"));		
				sellingpricerefill1.sendKeys(Keys.CONTROL + "a");
				sellingpricerefill1.sendKeys(Keys.DELETE);
				sellingpricerefill1.sendKeys(s);


			}
		}
		@FindBy(xpath="(//button[contains(text(),'Close')])[3]")
		@CacheLookup
		WebElement close;
		public void clickclose( ) {

			try {
				close.click();
			}
			catch(StaleElementReferenceException e) {
				WebElement close = ldriver.findElement(By.xpath("(//button[contains(text(),'Close')])[3]"));
				close.click();
			}
		}

		@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-1lpukdo'])[4]")
		@CacheLookup
		WebElement update;
		public void clickupdate( ) {


			try {
				update.click();
			}
			catch(StaleElementReferenceException e){
				WebElement update = ldriver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-1lpukdo'])[4]"));
				update.click();
			}

		}
	
		@FindBy(xpath="(//*[@data-testid='DeleteIcon'])")
		@CacheLookup
		WebElement delete;
		public void clickdelete( ) {

			try {
				delete.click();
			}
			catch(StaleElementReferenceException e) {
				WebElement delete = ldriver.findElement(By.xpath("(//*[@data-testid='DeleteIcon'])"));
				delete.click();
			}

		}


		/*************************** Address custom price ***********************************/
		// click address from dropdown
		// this will create custom price for address that contains "Noor Mohamed" name
		@FindBy(xpath="(//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf'])[2]")
		@CacheLookup
		WebElement addressdropdown;
		@FindBy(xpath="//ul[contains(@class, 'MuiList-root MuiList-padding MuiMenu-list css-r8u8y9') ]//li[contains(text(), 'Noor Mohamed')]")
		@CacheLookup
		WebElement Selectaddress;
		public void selectAddress() {

			try {
				((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView({block: 'center'});", addressdropdown);
				addressdropdown.click();
				Selectaddress.click();

			}
			catch(StaleElementReferenceException e) {

				WebElement addressdropdown = ldriver.findElement(By.xpath("(//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf'])[2]"));

				WebElement Selectaddress = ldriver.findElement(By.xpath("//ul[contains(@class, 'MuiList-root MuiList-padding MuiMenu-list css-r8u8y9') ]//li[contains(text(), 'Noor Mohamed')]"));				

				addressdropdown.click();	

				Selectaddress.click();


			}
		}

		// click product details button

		@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-1lpukdo'])[1]")
		@CacheLookup
		WebElement productdetails;
		public void clickproductdetails( ) {

			try {
				productdetails.click();
			}
			catch(StaleElementReferenceException e) {
				WebElement productdetails = ldriver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-1lpukdo'])[1]"));
				productdetails.click();
			}

		}
	
	
	
	
	
	
	
	
	
	
	/*************************Adding Waterdrops ******************************************************/


	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSuccess MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorSuccess MuiButton-root MuiButton-contained MuiButton-containedSuccess MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorSuccess css-2qvpm']")
	@CacheLookup
	WebElement clickaddwaterdrop;
	public void clickAddwaterdrop() {


		try {

			clickaddwaterdrop.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement clickaddwaterdrop = ldriver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSuccess MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorSuccess MuiButton-root MuiButton-contained MuiButton-containedSuccess MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorSuccess css-2qvpm']"));

			clickaddwaterdrop.click();
		}
	} 

	@FindBy(xpath="(//input[@id='outlined-basic'])[1]")
	@CacheLookup
	WebElement enterwaterdrop;
	public void enterwaterdrop(String s) {


		try {
			enterwaterdrop.sendKeys(Keys.CONTROL + "a");
			enterwaterdrop.sendKeys(Keys.DELETE);
			enterwaterdrop.sendKeys(s);

		}
		catch(StaleElementReferenceException e) {

			WebElement enterwaterdrop = ldriver.findElement(By.xpath("(//input[@id='outlined-basic'])[1]"));
			enterwaterdrop.sendKeys(Keys.CONTROL + "a");
			enterwaterdrop.sendKeys(Keys.DELETE);
			enterwaterdrop.sendKeys(s);

		}
	} 

	@FindBy(xpath="(//input[@id='outlined-basic'])[2]")
	@CacheLookup
	WebElement enterwaterdropreason;
	public void enterwaterdropreason() {


		try {
			enterwaterdropreason.sendKeys(Keys.CONTROL + "a");
			enterwaterdropreason.sendKeys(Keys.DELETE);
			enterwaterdropreason.sendKeys("Automation testing");
		}
		catch(StaleElementReferenceException e) {
			WebElement enterwaterdropreason = ldriver.findElement(By.xpath("(//input[@id='outlined-basic'])[2]"));
			enterwaterdropreason.sendKeys(Keys.CONTROL + "a");
			enterwaterdropreason.sendKeys(Keys.DELETE);
			enterwaterdropreason.sendKeys("Automation testing");
		}
	} 

	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorError MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorError css-wf29e5'])[3]")
	@CacheLookup
	WebElement clickwaterdropclose;
	public void clickwaterdropclose() {


		try {
			clickwaterdropclose.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement clickwaterdropclose = ldriver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorError MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorError css-wf29e5'])[3]"));
			clickwaterdropclose.click();
		}
	} 

	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-1lpukdo'])[3]")
	@CacheLookup
	WebElement clickwaterdropadd;
	public void clickwaterdropadd() {


		try {
			clickwaterdropadd.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement clickwaterdropadd = ldriver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-1lpukdo'])[3]"));
			clickwaterdropadd.click();
		}
	} 

	/********************************Reduce wallet amount ******************************************************/


	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorError MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorError css-w6e2q4']")
	@CacheLookup
	WebElement clickreducewalleticon;
	public void clickreducewalleticon() {


		try {
			clickreducewalleticon.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement clickreducewalleticon = ldriver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorError MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorError css-w6e2q4']"));
			clickreducewalleticon.click();
		}
	} 

	@FindBy(xpath="(//input[@id='amount'])")
	@CacheLookup
	WebElement enterwalletamount;
	public void enterwalletamount(String amt) {


		try {			
			enterwalletamount.sendKeys(Keys.CONTROL + "a");
			enterwalletamount.sendKeys(Keys.DELETE);
			enterwalletamount.sendKeys(amt);
		}
		catch(StaleElementReferenceException e) {
			WebElement enterwalletamount = ldriver.findElement(By.xpath("(//input[@id='amount'])"));
			enterwalletamount.sendKeys(Keys.CONTROL + "a");
			enterwalletamount.sendKeys(Keys.DELETE);
			enterwalletamount.sendKeys(amt);
		}
	} 

	@FindBy(xpath="(//input[@id='reason'])")
	@CacheLookup
	WebElement enterwalletreason;
	public void enterwalletreason(String reason) {


		try {
			enterwalletreason.sendKeys(Keys.CONTROL + "a");
			enterwalletreason.sendKeys(Keys.DELETE);
			enterwalletreason.sendKeys(reason);
		}
		catch(StaleElementReferenceException e) {
			WebElement enterwalletreason = ldriver.findElement(By.xpath("(//input[@id='reason'])"));
			enterwalletreason.sendKeys(Keys.CONTROL + "a");
			enterwalletreason.sendKeys(Keys.DELETE);
			enterwalletreason.sendKeys(reason);
		}
	} 

	@FindBy(xpath="//input[@id ='transaction-id']")
	@CacheLookup
	WebElement entertransactionid;
	public void entertransactionid(String id) {


		try {
			entertransactionid.sendKeys(Keys.CONTROL + "a");
			entertransactionid.sendKeys(Keys.DELETE);
			entertransactionid.sendKeys(id);
		}
		catch(StaleElementReferenceException e) {
			WebElement entertransactionid = ldriver.findElement(By.xpath("//input[@id ='transaction-id']"));
			entertransactionid.sendKeys(Keys.CONTROL + "a");
			entertransactionid.sendKeys(Keys.DELETE);
			entertransactionid.sendKeys(id);
		}
	} 

	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorError MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorError css-fsuf0'])")
	@CacheLookup
	WebElement clickclosewallet;
	public void clickclosewallet() {


		try {
			clickclosewallet.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement clickclosewallet = ldriver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorError MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorError css-fsuf0'])"));
			clickclosewallet.click();
		}
	} 

	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-1edmhxi'])")
	@CacheLookup
	WebElement clickreducewallet;
	public void clickreducewallet() {


		try {
			clickreducewallet.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement clickreducewallet = ldriver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-1edmhxi'])"));
			clickreducewallet.click();
		}
	} 


	/*********************************** Add Deposit  ***********************************************/

	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-142ondo']")
	@CacheLookup
	WebElement clickaddstock;
	public void clickaddstock() {


		try {
			clickaddstock.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement clickaddstock = ldriver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-142ondo']"));
			clickaddstock.click();
		}
	} 

	@FindBy(xpath="(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")
	@CacheLookup
	WebElement clickdeposited;
	public void clickdeposited() {


		try {
			//		System.out.println("1t");
			WebDriverWait wait = new WebDriverWait(ldriver, 10);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")));
			((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", clickdeposited);
			clickdeposited.click();
			//		System.out.println("2t");
		}
		catch(StaleElementReferenceException e) {
			//		System.out.println("ct");
			WebElement clickdeposited = ldriver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]"));
			//		System.out.println("3ct");
			clickdeposited.click();
			//		System.out.println("4ct");
		}
	} 

	@FindBy(xpath="(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")
	@CacheLookup
	WebElement clickundeposited;
	public void clickundeposited() {


		try {
			//		System.out.println("1td");
			clickundeposited.click();
			//		System.out.println("2td");
		}
		catch(StaleElementReferenceException e) {
			//		System.out.println("3dc");
			WebElement clickundeposited = ldriver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]"));
			clickundeposited.click();
			//		System.out.println("4dc");
		}
	} 
	
	
	@FindBy(xpath="(//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf'])[6]")
	@CacheLookup
	WebElement productdropdown;
	
	@FindBy(xpath="//li[@data-value='20_Liters-PET']")
	@CacheLookup
	WebElement product;
	
	public void SelectProd() {
		try {
			productdropdown.click();
			product.click();
			
		} catch (StaleElementReferenceException e) {
			WebElement productdropdown = ldriver.findElement(By.xpath("(//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf'])[6]"));
			productdropdown.click();
			WebElement product = ldriver.findElement(By.xpath("//li[@data-value='20_Liters-PET']"));
			product.click();
		}
	}
	

	@FindBy(xpath="//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb']")
	@CacheLookup
	WebElement addressdrpdwn;
	@FindBy(xpath="(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-gcjf89'])[1]")
	@CacheLookup
	WebElement address;
	public void selectaddresstodeposit() {


		try {
			System.out.println("try1");
			addressdrpdwn.click();
			System.out.println("try2");
			address.click();
			System.out.println("try3");
		}
		catch(StaleElementReferenceException e) {
			System.out.println("catch");
			WebElement addressdrpdwn = ldriver.findElement(By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb']"));
			addressdrpdwn.click();
			System.out.println("catching");
			WebElement address = ldriver.findElement(By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-gcjf89'])[1]"));
			System.out.println("catch1");


			address.click();
			System.out.println("catcg2");
		}
	} 

	@FindBy(xpath="//input[@class='MuiInputBase-input MuiInput-input css-mnn31']")
	@CacheLookup
	WebElement enterquantity;
	public void enterquantity(String s) {


		try {
			enterquantity.sendKeys(Keys.CONTROL + "a");
			enterquantity.sendKeys(Keys.DELETE);
			enterquantity.sendKeys(s);
		}
		catch(StaleElementReferenceException e) {
			WebElement enterquantity = ldriver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input css-mnn31']"));
			enterquantity.sendKeys(Keys.CONTROL + "a");
			enterquantity.sendKeys(Keys.DELETE);
			enterquantity.sendKeys(s);
		}
	} 

	@FindBy(xpath="(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[9]")
	@CacheLookup
	WebElement clickdepositqty;
	public void clickdepositqty(String s) {


		try {
			clickdepositqty.sendKeys(Keys.CONTROL + "a");
			clickdepositqty.sendKeys(Keys.DELETE);
			clickdepositqty.sendKeys(s);
		}
		catch(StaleElementReferenceException e) {
			WebElement clickdepositqty = ldriver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[9]"));
			clickdepositqty.sendKeys(Keys.CONTROL + "a");
			clickdepositqty.sendKeys(Keys.DELETE);
			clickdepositqty.sendKeys(s);
		}
	} 

	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-134k4ey'] ")
	@CacheLookup
	WebElement clickdepositsubmit;
	public void clickdepositsubmit() {


		try {
			clickdepositsubmit.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement clickdepositsubmit = ldriver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-134k4ey'] "));
			clickdepositsubmit.click();
		}
	} 

	/*************************************** Selecting the product and add/refund deposit************************************************************/

	// selecting the 20 liter pet for add/reduce stock

	@FindBy(xpath="(//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf'])[1]")
	@CacheLookup
	WebElement clickproductdrpdwnstock;
	@FindBy(xpath="//li[@data-value='20_Liters-PET']")
	@CacheLookup
	WebElement selectproductstock;
	public void clickproductdrpdwnstock() {


		try {
			clickproductdrpdwnstock.click();
			selectproductstock.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement clickproductdrpdwnstock = ldriver.findElement(By.xpath("(//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf'])[1]"));
			clickproductdrpdwnstock.click();
			WebElement selectproductstock = ldriver.findElement(By.xpath("//li[@data-value='20_Liters-PET']"));
			selectproductstock.click();
		}
	} 

	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-1boenqq']")
	@CacheLookup
	WebElement clickrefunddeposit;
	public void clickrefunddeposit() {


		try {
			clickrefunddeposit.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement clickrefunddeposit = ldriver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-1boenqq']"));
			clickrefunddeposit.click();
		}
	} 

	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-18764nz'])[1]")
	@CacheLookup
	WebElement clickrefunddepositmin;
	public void clickrefunddepositmin() {


		try {
			clickrefunddepositmin.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement clickrefunddepositmin = ldriver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-18764nz'])[1]"));
			clickrefunddepositmin.click();
		}
	} 

	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-18764nz'])[2]")
	@CacheLookup
	WebElement clickrefunddepositmax;
	public void clickrefunddepositmax() {


		try {
			clickrefunddepositmax.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement clickrefunddepositmax = ldriver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-18764nz'])[2]"));
			clickrefunddepositmax.click();
		}
	} 

	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s']")
	@CacheLookup
	WebElement clickrefund;
	public void clickrefund() {


		try {
			clickrefund.click();
		}
		catch(StaleElementReferenceException e) {
			WebElement clickrefund = ldriver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s']"));
			clickrefund.click();
		}
	} 

	// get available stock
	@FindBy(xpath="(//p[@class='MuiTypography-root MuiTypography-body1 css-15vuy4d'])[11]")
	@CacheLookup
	WebElement availablestock;
	public int getAvailableStock() {
		int availableStockValue = 0;

		try {

			String text = availablestock.getText(); 
			availableStockValue = Integer.parseInt(text.replaceAll("[^\\d]", ""));
		} catch (StaleElementReferenceException e) {
			WebElement availablestockElement = ldriver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 css-15vuy4d'])[11]"));
			String text = availablestockElement.getText();
			availableStockValue = Integer.parseInt(text.replaceAll("[^\\d]", ""));
		}

		return availableStockValue;
	}

	// get default/min stock

	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3'])[4]")
	@CacheLookup
	WebElement defaultstock;
	public int getdefaultStock() {
		int defaultStockValue = 0;

		try {
			String text = defaultstock.getText(); 
			defaultStockValue = Integer.parseInt(text);
		} catch (StaleElementReferenceException e) {
			WebElement defaultstock = ldriver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3'])[4]"));
			String text = defaultstock.getText(); 
			defaultStockValue = Integer.parseInt(text);
		}

		return defaultStockValue;
	}








}	 






