package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import de.erichseifert.vectorgraphics2d.VectorHints.Value;

public class mainsettingsPage extends Home {
	public mainsettingsPage(WebDriver rdriver) {
		super(rdriver);
		// PageFactory.initElements(rdriver, this);
	}

	WebElement settingButton = ldriver.findElement(By.xpath("(//*[text()='Settings'])[1]"));

	public void settingLink() {
		Actions actions = new Actions(ldriver);
		actions.moveToElement(settingButton).click().build().perform();
		settingButton.click();
	}

	@FindBy(xpath = "(//*[text()='Settings'])[1]")
	@CacheLookup
	WebElement settingsText;

	public String settingsText() {
		String pagename = settingsText.getText();
		return pagename;
	}

	
	//=========================================COMMON SETTINGS========================================================================
	
	
	@FindBy(xpath = "(//*[@class=\"MuiButtonBase-root MuiAccordionSummary-root MuiAccordionSummary-gutters css-1oqimao\"])[1]")
	@CacheLookup
	WebElement commonSettingsButton;

	public void commonSettings() throws InterruptedException {
		Thread.sleep(2000);
		commonSettingsButton.click();
	}

	public WebElement commonSettingsTabText(int i) {
		WebElement commonSettingsTabText = ldriver.findElement(By.xpath(
				"(//*[@class='MuiFormLabel-root MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-shrink MuiInputLabel-sizeMedium MuiInputLabel-outlined MuiFormLabel-colorPrimary MuiFormLabel-filled MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-shrink MuiInputLabel-sizeMedium MuiInputLabel-outlined css-1ald77x'])["
						+ i + "]"));
		return commonSettingsTabText;
	}

	public WebElement settingTabButtonText(int i) {
		WebElement settingTabButtonText = ldriver.findElement(By.xpath(
				"(//*[@class='MuiButtonBase-root MuiAccordionSummary-root MuiAccordionSummary-gutters css-1iji0d4'])["
						+ i + "]"));
		return settingTabButtonText;
	}

	public WebElement settingTabDisplay() {
		WebElement settingTabDisplay = ldriver.findElement(By.xpath(
				"(//*[@class='MuiButtonBase-root MuiAccordionSummary-root MuiAccordionSummary-gutters css-1iji0d4'])[1]"));
		return settingTabDisplay;
	}

	public String toastMessage() {
		String actToast = new WebDriverWait(ldriver,100)
				.until(ExpectedConditions.elementToBeClickable(By.className("Toastify__toast-body"))).getText();
		return actToast;
	}

	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq\"])[1]")
	@CacheLookup
	WebElement Maximumdiscountallowed;

	public void MaximumdiscountallowedTextBox(String MaximumdiscountallowedBox) {
		Maximumdiscountallowed.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Maximumdiscountallowed.sendKeys(MaximumdiscountallowedBox);
	}

	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq\"])[2]")
	@CacheLookup
	WebElement MinimumwaterwalletamountBox;

	public void MinimumwaterwalletamounttextBox(String Minimumwaterwalletamount) {
		MinimumwaterwalletamountBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		MinimumwaterwalletamountBox.sendKeys(Minimumwaterwalletamount);
	}

	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq\"])[3]")
	@CacheLookup
	WebElement WaterwalletrechargealertBox;

	public void WaterwalletrechargealerttextBox(String Waterwalletrechargealert) {
		WaterwalletrechargealertBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		WaterwalletrechargealertBox.sendKeys(Waterwalletrechargealert);
	}

	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq\"])[4]")
	@CacheLookup
	WebElement ExtrachargesforsingleorderBox;

	public void Extrachargesforsingleordertextbox(String Extrachargesforsingleorder) {
		ExtrachargesforsingleorderBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ExtrachargesforsingleorderBox.sendKeys(Extrachargesforsingleorder);
	}

//	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq\"])[5]")
//	@CacheLookup
//	WebElement MinimumwaterwalletamountBox;
//
//	public void Minimumwaterwalletamounttextbox(String Minimumwaterwalletamount) {
//		MinimumwaterwalletamountBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//		MinimumwaterwalletamountBox.sendKeys(Minimumwaterwalletamount);
//	}

	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq\"])[5]")
	@CacheLookup
	WebElement OTPLessDeliveryMsgBox;

	public void OTPLessDeliveryMsgtextbox(String OTPLessDeliveryMsg) {
		OTPLessDeliveryMsgBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		OTPLessDeliveryMsgBox.sendKeys(OTPLessDeliveryMsg);
	}

	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq\"])[6]")
	@CacheLookup
	WebElement ExtrachargesHSNcodeBox;

	public void ExtrachargesHSNcodeTextBox(String ExtrachargesHSNcode) {
		ExtrachargesHSNcodeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ExtrachargesHSNcodeBox.sendKeys(ExtrachargesHSNcode);
	}

	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq\"])[7]")
	@CacheLookup
	WebElement ExtrachargesCGSTBox;

	public void ExtrachargesCGSTtextBox(String ExtrachargesCGST) {
		ExtrachargesCGSTBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ExtrachargesCGSTBox.sendKeys(ExtrachargesCGST);
	}

	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq\"])[8]")
	@CacheLookup
	WebElement ExtrachargesSGSTBox;

	public void ExtrachargesSGSTtextBox(String ExtrachargesSGST) {
		ExtrachargesSGSTBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ExtrachargesSGSTBox.sendKeys(ExtrachargesSGST);
	}

	@FindBy(xpath = "//*[@id='panel1bh-content']//button[@type='button'][normalize-space()='Update']")
	@CacheLookup
	WebElement UpdateButton;

	public void clickUpdateButton() {
		UpdateButton.click();
	}

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiAccordionSummary-root Mui-expanded MuiAccordionSummary-gutters css-1iji0d4']")
	@CacheLookup
	WebElement Closemainsettings;

	public void CloseMainSettingsTab() {
		Closemainsettings.click();
	}


	//=======================================DELIVERY SLOTS===================================================

	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiAccordionSummary-root MuiAccordionSummary-gutters css-1oqimao'])[1]")
	@CacheLookup
	WebElement DeliverySlots;

	public void DeliverySlotsTab() {
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		jse.executeScript("window.scrollBy(0,-250)");
		DeliverySlots.click();
	}
	
//	@FindBy(xpath = "//*[text()='Get Slots']")
//	@CacheLookup
//	WebElement GetSlotsTab;
//	
//	public void GetSlotsTabText() {
//		GetSlotsTab.click();
//	}
	
//	@FindBy(xpath = "(//*[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb'])[1]")
//	@CacheLookup
//	WebElement GetSlots;
//	
//	public void GetSlotsTab() throws InterruptedException {
//		Thread.sleep(500);
//		GetSlots.click();
//		WebElement CountSlots = ldriver.findElement(By.xpath("//*[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']"));
//		 Select s=new Select(CountSlots);
//	       List<WebElement> elementCount = s.getOptions();
//	       Thread.sleep(2000);
//	      int itemSize = elementCount.size();
//	          System.out.println(itemSize);
//	          for(int i = 0; i < itemSize ; i++){
//                  String optionsValue = elementCount.get(i).getText();
//                  System.out.println(optionsValue);
//	}
//	}
	
	

//	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiToggleButtonGroup-grouped MuiToggleButtonGroup-groupedHorizontal MuiToggleButton-root MuiToggleButton-sizeMedium MuiToggleButton-primary MuiToggleButtonGroup-grouped MuiToggleButtonGroup-groupedHorizontal MuiToggleButtonGroup-lastButton css-1cmnqml']")
//	@CacheLookup
//	WebElement AddSlots;

	public void AddSlotsTab() {
		WebElement element = ldriver.findElement(By.xpath("//*[text()='Add Slots']"));
		JavascriptExecutor executor = (JavascriptExecutor)ldriver;
		executor.executeScript("arguments[0].click();", element);

	}

	public WebElement AddSlotsTabText() {
		WebElement AddSlotsText = ldriver.findElement(By.xpath(
				"(//*[@class='MuiFormLabel-root MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-shrink MuiInputLabel-outlined MuiFormLabel-colorPrimary MuiFormLabel-filled MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-shrink MuiInputLabel-outlined css-u9osun'])[9]"));
		return AddSlotsText;
	}

	public WebElement AddSlotsTabText1(int i) {
		WebElement AddSlotsText1 = ldriver.findElement(By.xpath(
				"(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[" + i + "]"));
		return AddSlotsText1;
	}

	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[9]")
	@CacheLookup
	WebElement NumberOfSlotsBox;

	public void NumberOfSlotsTextBox(String NumberOfSlots) {
		NumberOfSlotsBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		NumberOfSlotsBox.sendKeys(NumberOfSlots);
	}

	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[1]")
	@CacheLookup
	WebElement DeliverySlotStartTimeBox;

	public void DeliverySlotStartTimeTextBox(String DeliverySlotStartTime) {
		DeliverySlotStartTimeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		DeliverySlotStartTimeBox.sendKeys(DeliverySlotStartTime);
	}

	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[2]")
	@CacheLookup
	WebElement DeliverySlotEndTimeBox;

	public void DeliverySlotEndTimeTextBox(String DeliverySlotEndTime) {
		DeliverySlotEndTimeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		DeliverySlotEndTimeBox.sendKeys(DeliverySlotEndTime);
	}

	@FindBy(xpath = "//*[text()='add']")
	@CacheLookup
	WebElement addSlot;

	public void AddSlotButton() {
		addSlot.click();
	}

	@FindBy(xpath = "//*[text()='Get Slots']")
	@CacheLookup
	WebElement getSlot;

	public void GetSlotButton() {
		getSlot.click();
	}

	@FindBy(xpath = "(//*[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb'])[1]")
	@CacheLookup
	WebElement existingDeliverySlot;

	public void existingDeliverySlotButton() {
		existingDeliverySlot.click();
		
	}
	
	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[1]")
	@CacheLookup
	WebElement selectSlot;
	public void selectDeliverySlot() {
		selectSlot.click();
	}

	
	//=======================================BLOCK PAYMENT & BOOKING & TIMIMG===================================
	
	@FindBy(xpath = "//*[text()='Block Settings']")
	@CacheLookup
	WebElement BlockSetting;
	public void BlockSettingTab() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		jse.executeScript("window.scrollBy(0,-250)");
		BlockSetting.click();
		
	}
	
	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected css-1q2h7u5'])[2]")
	@CacheLookup
	WebElement ClickOnScanning;
	public void ClickOnScanningButton() {
		ClickOnScanning.click();
	}
	
	
	public WebElement BlockScanningTabText(int i) {
		WebElement BlockScanningTabText = ldriver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-9l3uo3'])["+i+"]"));
		return BlockScanningTabText;
		
	}
		
	public void SelectRadioandUpdateButtons() throws InterruptedException {
       // List<WebElement> radioButtons = ldriver.findElements(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-9l3uo3'])"));
        for (int m = 1; m <= 4; m++) {
           
            WebElement radioButton = ldriver.findElement(By.xpath("(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])["+m+"]"));
            radioButton.click();
            
            WebElement updateButton = ldriver.findElement(By.xpath("(//*[text()='Update'])[2]"));
            updateButton.click();
            Thread.sleep(3000);
        }
    }
	
	@FindBy (xpath = "//*[text()='Payments']")
	@CacheLookup
	WebElement PaymentsButton;
	
	public void ClickPaymentsButton() {
		PaymentsButton.click();
	}
	
	@FindBy (xpath = "//*[@id='select-payment-methods']")
	@CacheLookup
	WebElement PaymentsMethodsButton;
	public void ClickPaymentsMethodsButton() {
		PaymentsMethodsButton.click();	
	}
	

	public WebElement BlockPaymentMethodsText(int i) {
		WebElement PaymentMethodsText = ldriver.findElement(By.xpath(
				"(//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])["+i+"]"));
		return PaymentMethodsText;
	}
	
	@FindBy (xpath = "//*[text()='All paysharp payments']")
	@CacheLookup
	WebElement SelectOnePaymentMethod;
	public void onePaymentMethod() {
		SelectOnePaymentMethod.click();
	}
	
	
	public void AllPaymentMethods(){
			ldriver.findElement(By.xpath("//*[@id=\"select-payment-methods\"]")).click();
		
	}
	
	public void Select_AllPaymentMethod() throws InterruptedException {
		 List<String> xpaths = new ArrayList<>();
	        xpaths.add("//*[text()='All paysharp payments']");
	        xpaths.add("//*[text()='Paysharp UPI']");
	        xpaths.add("//*[text()='Paysharp QR']");
	        xpaths.add("//*[text()='Paysharp Search UPI']");
	        xpaths.add("//*[text()='Virtual Bank']");
	        xpaths.add("//*[text()='RazorPay']");
	        xpaths.add("(//*[text()='Wallet'])[2]");
	        for (String xpath : xpaths) {
	            try {
	            	//Thread.sleep(1500);
	               WebElement element = ldriver.findElement(By.xpath(xpath));
	                element.click();
	            } 
	            catch (Exception e) {
	            }
	        }
	}
	@FindBy(xpath="(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline css-u36398'])[1]")
	@CacheLookup
	WebElement ReasonBox;
	public  void ReasonTextbox() {
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		jse.executeScript("window.scrollBy(0,-250)");
		ReasonBox.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		ReasonBox.sendKeys("Block By Automation testing");
	}
	
	@FindBy(xpath="//*[text()='Block']")
	@CacheLookup
	WebElement BlockButton;
	public void Block(){
		//BlockButton.click();
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		jse.executeScript("window.scrollBy(0,-250)");
		Actions actions = new Actions(ldriver);
         actions.moveToElement(BlockButton).click().build().perform();
	}
	
//		WebElement TextBlocked = ldriver.findElement(By.xpath("(//*[@class='MuiChip-label MuiChip-labelMedium css-9iedg7'])["+i+"]"));
//		return TextBlocked;
//	}
	
	public void Remove_BlockedMethod() throws InterruptedException {
		 List<WebElement> Cancelled_Icons = ldriver.findElements(By.xpath("(//*[@data-testid='CancelIcon'])"));
	        System.out.println("Total Cancel Icons: " + Cancelled_Icons.size());
	        for (int i = 1; i < Cancelled_Icons.size(); i++) {
	        	System.out.println(i);
	            WebDriverWait wait = new WebDriverWait(ldriver, 10);
	            WebElement Cancelled_Icon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@data-testid='CancelIcon'])[1]")));
	            Cancelled_Icon.click();
	            Thread.sleep(2000);
	}
	}
	
	@FindBy(xpath = "//*[text()='Booking']")
	@CacheLookup
	WebElement BlockBookingTab;
	public void BlockBookingButton () {
		BlockBookingTab.click();
	}
	
	@FindBy(xpath = "//*[@id=\"select-booking-methods\"]")
	@CacheLookup
	WebElement Select_BlockBookingType;
	public void BlockBookingType() {
		// ((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", Select_BlockBookingType);
		Select_BlockBookingType.click();
	}
	
	public WebElement Check_BlockBookingType_Text(int i) {
		WebElement BookingTypeText = ldriver.findElement(By.xpath("(//*[@role=\"option\"])["+i+"]"));
		//BookingTypeText.getText();
		return BookingTypeText;
	}
	
	@FindBy(xpath = "//*[text()='Date Range']")
	@CacheLookup
	WebElement Date_Range;
	public void Select_DateRangeBlockingType() {
		Date_Range.click();
	}
	
	public void Select_Date() throws InterruptedException {
		WebElement Click_On_FromDateRange = ldriver.findElement(By.xpath("(//*[@data-testid=\"CalendarIcon\"])[1]"));
		Click_On_FromDateRange.click();
		Thread.sleep(1000);
		WebElement Select_FromDate = ldriver.findElement(By.xpath("(//*[@class=\"MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-ub1r1\"])[8]"));
		Select_FromDate.click();
		WebElement Click_On_EndDateRange = ldriver.findElement(By.xpath("(//*[@data-testid=\"CalendarIcon\"])[2]"));
		Click_On_EndDateRange.click();
		Thread.sleep(1000);
		WebElement Select_EndDate = ldriver.findElement(By.xpath("(//*[@class=\"MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-ub1r1\"])[9]"));
		Select_EndDate.click();
		
	}
	
	
	@FindBy(xpath="(//*[@data-testid='CancelIcon'])[1]")
	@CacheLookup
	WebElement DataRange_RemoveBlock;
	
	public void RemoveBlock_DataRange() throws InterruptedException {
		
		DataRange_RemoveBlock.click();
		Thread.sleep(1000);
	}
	
	@FindBy(xpath= "//*[text()='Booking Type']")
	@CacheLookup
	WebElement Booking_Type;
	public void Select_BlockingBY_BookingType() throws InterruptedException {
		Booking_Type.click();
		Thread.sleep(1000);
	}
	
	@FindBy(xpath ="//*[@id=\"select-order-type\"]")
	@CacheLookup
	WebElement Order_Type;
	public void Select_Order_TypeButton () {
		WebDriverWait wait = new WebDriverWait(ldriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(Order_Type));
        Order_Type.click();
	}
	
	public void Select_Order_Type() throws InterruptedException {
		 List<String> xpaths = new ArrayList<>();
		 xpaths.add("(//*[text()=\"Insta Order\"])[2]");
	        xpaths.add("(//*[text()=\"Postpaid\"])[3]");
	        xpaths.add("//*[text()=\"Subscription\"]");
	        xpaths.add("//*[text()=\"Regular\"]");
	        for (String orderTypes : xpaths) {
	            try {
	               WebElement element = ldriver.findElement(By.xpath(orderTypes));
	                element.click();
	            } 
	            catch (Exception e) {
	            	
	            }
	        }
	}
	
	public void Select_PincodeButton() {
		WebElement PincodeButton = ldriver.findElement(By.xpath("//*[text()=\"Pincodes\"]"));
		PincodeButton.click();
	}
	
	
	public WebElement check_TextOfPincodeBlocking(int i) {
		WebElement TextOfPincodeBlocking = ldriver.findElement(By.xpath("(//*[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb'])[4]"));
		//TextOfPincodeBlocking.getText();
		//System.out.println(TextOfPincodeBlocking);
		return TextOfPincodeBlocking;
	}
	
	public void Click_On_StateButton() {
		WebElement Select_StateButton= ldriver.findElement(By.xpath("//*[@id=\"Select-State\"]"));
		Select_StateButton.click();
	}
	
	public void Select_State() {
		WebElement Select_state = ldriver.findElement(By.xpath("//*[text()=\"TAMIL NADU\"]"));
		Select_state.click();
	}
	
	public void Click_On_DistrictButton() {
		WebElement Select_DistrictButton = ldriver.findElement(By.xpath("//*[@id=\"Select-District\"]"));
		Select_DistrictButton.click();
	}
	
	public void Select_District() {
		WebElement Select_district = ldriver.findElement(By.xpath("//*[text()=\"CHENNAI\"]"));
		Select_district.click();
	}
	
	public void Click_On_PincodeButton() {
		WebElement Select_PincodeButton = ldriver.findElement(By.xpath("//*[@id=\"Select-pincode\"]"));
		Select_PincodeButton.click();
	}
	
	public void Select_Pincode() {
		WebElement Select_pincode = ldriver.findElement(By.xpath("//*[text()=\"600002\"]"));
		Select_pincode.click();
	}
	
	public void Click_On_AreaButton() {
		WebElement AreaButton = ldriver.findElement(By.xpath("//*[text()='Areas']"));
		AreaButton.click();
	}
	
	public void Click_On_AreaCombobox() {
		WebElement Area_Combobox = ldriver.findElement(By.xpath("//*[@id=\"Select-Area\"]"));
		Area_Combobox.click();
	}
	
	public void Select_Area() {
		WebElement Select_area = ldriver.findElement(By.xpath("//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz']"));
		Select_area.click();
	}
	
	public void Select_DistrictButton_FromComboBox() {
		WebElement Select_DistrictButton = ldriver.findElement(By.xpath("//*[text()='Districts']"));
		Select_DistrictButton.click();
	}
	
	public void Select_StateButton_FromComboBox() {
		WebElement Select_StateButton = ldriver.findElement(By.xpath("//*[text()='States']"));
		Select_StateButton.click();
	}

	public void Select_CountriesButton_FromComboBox() {
		WebElement Select_countryButton = ldriver.findElement(By.xpath("//*[text()='Countries']"));
		Select_countryButton.click();
	}


	
	
	
	@FindBy(xpath = "//*[text()='Timing']")
	@CacheLookup
		WebElement timingTab;
	public void timingtabbutton () throws InterruptedException {
		timingTab.click();
		Thread.sleep(3000);
	}

	public WebElement BlockTimeSettingTabText(int i) throws InterruptedException {
		 Thread.sleep(1500);
		WebElement BlockTimeSettingFirstText = ldriver.findElement(By.xpath(
				"(//*[@class='MuiFormLabel-root MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-shrink MuiInputLabel-sizeMedium MuiInputLabel-outlined MuiFormLabel-colorPrimary Mui-error MuiFormLabel-filled MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-shrink MuiInputLabel-sizeMedium MuiInputLabel-outlined css-1ald77x'])["+i+"]"));
		// .findElement(By.xpath("(//*[@id='outlined-basic-label'])[" + i + "]"));
		return BlockTimeSettingFirstText;
	}

	public void UpdateBlockTime(String UstartTime, String UEndTime) throws InterruptedException {
		WebElement starttime = ldriver.findElement(By.xpath(
				"(//*[@placeholder=\"hh:mm (a|p)m\"])[1]"));
		starttime.click();

		WebElement enterStartTime = ldriver.findElement(By.xpath(
				"(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[3]"));
		enterStartTime.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		enterStartTime.sendKeys(UstartTime);
		// enterStartTime.sendKeys(Keys.CONTROL, "a", Keys.DELETE);

		WebElement endtime = ldriver.findElement(By.xpath(
				"(//*[@placeholder=\"hh:mm (a|p)m\"])[2]"));
		endtime.click();

		WebElement enterEndTime = ldriver.findElement(By.xpath(
				"(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[4]"));
		enterEndTime.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		enterEndTime.sendKeys(UEndTime);
		// enterEndTime.sendKeys(Keys.CONTROL, "a", Keys.DELETE);

	}

	@FindBy(xpath = "(//*[text()='Update'])[2]")
	@CacheLookup
	WebElement BlockTimeUpdateButton;

	public void BlockTimeUpdate() {
		BlockTimeUpdateButton.click();
	}

	public void setTimeOnClock() throws InterruptedException {
		WebElement clickOnSWatch = ldriver.findElement(By.xpath(
				"(//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[3]"));
		clickOnSWatch.click();
		Thread.sleep(1000);

		WebElement selectSTime = ldriver.findElement(By.xpath("(//*[@class='MuiClockNumber-root css-1flhz3h'])[9]"));
		Actions act = new Actions(ldriver);
		act.doubleClick(selectSTime);

		WebElement clickOnEWatch = ldriver.findElement(By.xpath(
				"(//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[4]"));
		clickOnEWatch.click();
		Thread.sleep(1000);

		WebElement selectETime = ldriver.findElement(By.xpath("(//*[@class='MuiClockNumber-root css-1flhz3h'])[11]"));
		Actions act1 = new Actions(ldriver);
		act1.doubleClick(selectETime);
	}
	
	
	public void Select_AutoCancel_tab() {
		WebElement Select_Autocancel = ldriver.findElement(By.xpath("//*[text()='Auto Cancel']"));
		Select_Autocancel.click();
	}
	
	
//	public void ClickOnReasonTextbox() {
//		WebElement ClickOnReasonButton = ldriver.findElement(By.xpath("(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline css-u36398'])[1]"));
//		ClickOnReasonButton.click();
//	}
	public void Click_On_ReasonButton() {
		WebElement ClickOnReasonButton = ldriver.findElement(By.xpath("(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline css-u36398'])[1]"));
		ClickOnReasonButton.click();
	}

	public void ResontextBox(String Reason) throws InterruptedException {
		Thread.sleep(1500);
        WebElement ReasonTBox = ldriver.findElement(By.xpath("(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline css-u36398'])[1]"));
        ReasonTBox.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        ReasonTBox.sendKeys(Reason);

        WebElement BlockUpdatebutton = ldriver.findElement(By.xpath("(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s\"])[2]"));

        String buttonName = BlockUpdatebutton.getText();
        if ("block".equalsIgnoreCase(buttonName)) {
        	BlockUpdatebutton.click();
            System.out.println("Clicked the 'block' button.");
        } else if ("update".equalsIgnoreCase(buttonName)) {
        	BlockUpdatebutton.click();
            System.out.println("Clicked the 'update' button.");
        } else {
            System.out.println("Button name not recognized: " + buttonName);
        }
    }

		
	


	
	
	//=================================SOLD BY====================================================================
	
	@FindBy(xpath = "//*[text()='Sold By']")
	@CacheLookup
	WebElement SoldByButton;
	
	public void SoldByTab() {
		SoldByButton.click();
	}
	
	public void selectslotofDistributor() {
		WebElement SelectSoldBy = ldriver.findElement(By.xpath("(//*[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb'])"));
		String Act = SelectSoldBy.getText();
		System.out.println(Act);
		
		if (Act.equalsIgnoreCase("BookWater")) {
			SelectSoldBy.click();
			System.out.println("hello");
			WebElement SelectSoldBy2 = ldriver.findElement(By.xpath(
					"//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz']"));
			SelectSoldBy2.click();

		} 
		else {
			// SelectType.click();
		}
	}
	
	@FindBy(xpath = "(//*[text()='Update'])[2]")
	@CacheLookup
	WebElement SelectDistributorUpdate;
	
	public void SelectDistributorUpdateButton() throws InterruptedException {
		SelectDistributorUpdate.click();
		Thread.sleep(500);
	}
	
	
	public void selectslotofBookwater() {
	//WebElement SelectSoldBy = ldriver.findElement(By.xpath("(//*[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb'])"));
	WebElement SelectSoldBy = ldriver.findElement(By.xpath("(//*[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb'])"));
	String Act = SelectSoldBy.getText();
	System.out.println(Act);
	
	if (Act.equalsIgnoreCase("Distributor")) {
		SelectSoldBy.click();
		System.out.println("hello");
		WebElement SelectSoldBy2 = ldriver.findElement(By.xpath(
				"//*[text()='BookWater']"));
		SelectSoldBy2.click();

	} 
	else {
		// SelectType.click();
	}
	}
	
//	@FindBy(xpath = "(//*[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb'])[3]")
//	@CacheLookup
//	WebElement SelectBookwater;
//	
//	public void SelectBookwaterTab() throws InterruptedException {
//		Thread.sleep(3000);
//		SelectBookwater.click();
//		
//		WebElement SelectBookwaterButton = ldriver.findElement(By.xpath("//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz']"));
//		SelectBookwaterButton.click();
//	}
	
	public WebElement SoldByBookWaterText(int i) throws InterruptedException {
		Thread.sleep(1000);
		WebElement SoldByBookWaterTabText = ldriver.findElement(By.xpath("(//*[@class='MuiFormLabel-root MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-shrink MuiInputLabel-sizeMedium MuiInputLabel-outlined MuiFormLabel-colorPrimary MuiFormLabel-filled MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-shrink MuiInputLabel-sizeMedium MuiInputLabel-outlined css-1ald77x'])["+i+"]"));
		return SoldByBookWaterTabText;
	}
	
	//@FindBy(xpath = "(//*[@class='MuiOutlinedInput-notchedOutline css-igs3ac'])[15]")
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[10]")
	@CacheLookup
	WebElement CompanyNameBox;

	public void CompanyNameTextBox(String CompanyName) {
		CompanyNameBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		CompanyNameBox.sendKeys(CompanyName);
	}
	
	//@FindBy(xpath = "(//*[@class='MuiOutlinedInput-notchedOutline css-igs3ac'])[16]")
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[11]")
	@CacheLookup
	WebElement PanNumberBox;

	public void PanNumberTextBox(String PanNumber) {
		PanNumberBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		PanNumberBox.sendKeys(PanNumber);
	}
	
	//@FindBy(xpath = "(//*[@class='MuiOutlinedInput-notchedOutline css-igs3ac'])[17]")
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[12]")
	@CacheLookup
	WebElement GSTNumberBox;

	public void GSTNumberTextBox(String GSTNumber) {
		GSTNumberBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		GSTNumberBox.sendKeys(GSTNumber);
	}

	//@FindBy(xpath = "(//*[@class='MuiOutlinedInput-notchedOutline css-igs3ac'])[18]")
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline css-u36398'])[3]")
	@CacheLookup
	WebElement AddressBox;

	public void AddressTextBox(String Address) {
		AddressBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		AddressBox.sendKeys(Address);
	}
	
	@FindBy(xpath = "(//*[text()=\"Update\"])[2]")
	@CacheLookup
	WebElement SoldByBookwaterUpdate;

	public void SoldByBookwaterUpdateButton() throws InterruptedException {
		SoldByBookwaterUpdate.click();
		Thread.sleep(2000);
	}

	
	
	
	
	//=================================REFERRAL SETTINGS===============================================================
	
	@FindBy(xpath = "//*[text()='Referral Settings']")
	@CacheLookup
	WebElement ReferralSetting;

	public void ReferralSettingTab() {
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		jse.executeScript("window.scrollBy(0,-250)");
		ReferralSetting.click();
	}
	
	@FindBy(xpath = "//*[text()='Signup']")
	@CacheLookup
	WebElement SignUP;
	
	public void SignUpTab() {
		SignUP.click();
	}
	
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiInput-input css-mnn31'])[1]")
	@CacheLookup
	WebElement WaterDropsForReferrer;

	public void WaterDropsForReferrerTab(String WaterDropsForReferrerBox) {
		WaterDropsForReferrer.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		WaterDropsForReferrer.sendKeys(WaterDropsForReferrerBox);
	}
	
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiInput-input css-mnn31'])[2]")
	@CacheLookup
	WebElement WaterDropsForReferree;

	public void WaterDropsForReferreeTab(String WaterDropsForReferreeBox) {
		WaterDropsForReferree.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		WaterDropsForReferree.sendKeys(WaterDropsForReferreeBox);
	}
	
	@FindBy(xpath = "(//*[text()='Update'])[3]")
	@CacheLookup
	WebElement UpdateSignUp;
	
	public void U_SignUp() {
		UpdateSignUp.click();
	}

	public WebElement ReferralSettingTabText(int i) throws InterruptedException {
		Thread.sleep(500);
		WebElement ReferralSettingText = ldriver.findElement(By.xpath("(//*[@data-shrink=\"true\"])["+i+"]"));
		return ReferralSettingText;
	}
//
//	@FindBy(xpath = "//*[@id='mui-p-48531-P-ROS']//button[@type='button'][normalize-space()='Update']")
//	@CacheLookup
//	WebElement ReferralSettingsUpdateButton;
//
//	public void ReferralSettingsUpdate() {
//		ReferralSettingsUpdateButton.click();
//	}

	
	@FindBy(xpath = "//*[text()='Order Completion']")
	@CacheLookup
	WebElement OrderCompletionTab;
	public void Select_OrderCompletionTab() throws InterruptedException {
		OrderCompletionTab.click();
		Thread.sleep(2000);
	}
	
	
	public WebElement Referee_Referrer_and_Influencer_rewards_text(int i) {
		WebElement Check_Referee_Referrer_Influencer_TabText = ldriver.findElement(By.xpath("(//*[@data-shrink=\"true\"])["+i+"]"));
		return Check_Referee_Referrer_Influencer_TabText;
	}
	
	@FindBy(xpath = "(//*[@type=\"number\"])[4]")
	@CacheLookup
	WebElement Referrer_Reward_Limit;
	public void EnterData_Referrer_Reward_Limit(String Referrer_Reward_LimitBox) {
		Referrer_Reward_Limit.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Referrer_Reward_Limit.sendKeys(Referrer_Reward_LimitBox);
	}
	
	@FindBy(xpath = "(//*[@type=\"number\"])[5]")
	@CacheLookup
	WebElement Referree_Reward_Limit;
	public void EnterData_Referree_Reward_Limit(String Referree_Reward_LimitBox) {
		Referree_Reward_Limit.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Referree_Reward_Limit.sendKeys(Referree_Reward_LimitBox);
	}
	
	@FindBy(xpath = "(//*[@type=\"number\"])[6]")
	@CacheLookup
	WebElement Water_Drops_Per_Order;
	public void EnterData_Water_Drops_Per_Order(String Water_Drops_Per_OrderBox) {
		Water_Drops_Per_Order.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Water_Drops_Per_Order.sendKeys(Water_Drops_Per_OrderBox);
	}
	
	@FindBy(xpath = "(//*[@type=\"number\"])[7]")
	@CacheLookup
	WebElement Worth_Of_Each_WaterDrop;
	public void EnterData_Worth_Of_Each_WaterDrop(String Worth_Of_Each_WaterDropBox) {
		Worth_Of_Each_WaterDrop.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Worth_Of_Each_WaterDrop.sendKeys(Worth_Of_Each_WaterDropBox);
	}
	
	@FindBy(xpath = "(//*[@type=\"number\"])[8]")
	@CacheLookup
	WebElement Infulencer_WaterDrop_Per_Order;
	public void EnterData_Infulencer_WaterDrop_Per_Order(String Infulencer_WaterDrop_Per_OrderBox) {
		Infulencer_WaterDrop_Per_Order.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Infulencer_WaterDrop_Per_Order.sendKeys(Infulencer_WaterDrop_Per_OrderBox);
	}
	
	@FindBy(xpath = "(//*[@type=\"number\"])[9]")
	@CacheLookup
	WebElement Infulencer_Worth_Of_Each_WaterDrop;
	public void EnterData_Infulencer_Worth_Of_Each_WaterDrop(String Infulencer_Worth_Of_Each_WaterDropBox) {
		Infulencer_Worth_Of_Each_WaterDrop.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Infulencer_Worth_Of_Each_WaterDrop.sendKeys(Infulencer_Worth_Of_Each_WaterDropBox);
	}
	
	
	public void Order_Completion_UpdateButton() {
		WebElement Order_Completion_Update = ldriver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-6fqjp3']"));
		Order_Completion_Update.click();
	}
//===========================================CONVENINIENCE FEE SETTINGS==============================================
	
	@FindBy(xpath = "//*[text()='convenience Fee setting']")
	@CacheLookup
	WebElement conFeeSetting;

	public void convenienceFeeSetting() {
		
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		jse.executeScript("window.scrollBy(0,-250)");
		conFeeSetting.click();
	}

	public WebElement cFeeSettingTabText(int i) {
		WebElement convenienceFeeSettingTabText = ldriver
				.findElement(By.xpath("(//*[@id='outlined-basic-label'])[" + i + "]"));
		return convenienceFeeSettingTabText;
	}

	@FindBy(xpath = "(//*[@id=\"outlined-basic\"])[9]")
	@CacheLookup
	WebElement ConvfeelongtermbookingBox;

	public void ConvfeelongtermbookingTextBox(String ConvFeeLongTermBooking) {
		ConvfeelongtermbookingBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ConvfeelongtermbookingBox.sendKeys(ConvFeeLongTermBooking);
	}

	@FindBy(xpath = "(//*[@id=\"outlined-basic\"])[10]")
	@CacheLookup
	WebElement ConcfeesinglebookingBox;

	public void ConcfeesinglebookingTextBox(String ConcFeeSingleBooking) {
		ConcfeesinglebookingBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ConcfeesinglebookingBox.sendKeys(ConcFeeSingleBooking);

	}

	@FindBy(xpath = "(//*[@id=\"outlined-basic\"])[11]")
	@CacheLookup
	WebElement ConvfeeCGSTBox;

	public void ConvfeeCGSTTextBox(String ConvFeeCGST) {
		ConvfeeCGSTBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ConvfeeCGSTBox.sendKeys(ConvFeeCGST);
	}

	@FindBy(xpath = "(//*[@id=\"outlined-basic\"])[12]")
	@CacheLookup
	WebElement ConvfeeSGSTBox;

	public void ConvfeeSGSTTextBox(String ConvFeeSGST) {
		ConvfeeSGSTBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ConvfeeSGSTBox.sendKeys(ConvFeeSGST);
	}

	@FindBy(xpath = "(//*[@id=\"outlined-basic\"])[13]")
	@CacheLookup
	WebElement ConvfeeGSTcodeBox;

	public void ConvfeeGSTcodeTextBox(String ConvFeeGSTCode) {
		ConvfeeGSTcodeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ConvfeeGSTcodeBox.sendKeys(ConvFeeGSTCode);
	}

	//@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s'])[5]")
	@FindBy(xpath = "(//*[text()='Update'])[4]")
	@CacheLookup
	WebElement conFeeSettingUpdateButton;

	public void conFeeSettingUpdate() {
		conFeeSettingUpdateButton.click();
	}

	//=================================================TIME SETTINGS========================================================
	
	@FindBy(xpath = "//*[text()='Time settings']")
	@CacheLookup
	WebElement TimeSetting;

	public void TimeSettingTab() {
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		jse.executeScript("window.scrollBy(0,-250)");
		TimeSetting.click();
	}

	public WebElement TimeSettingTabText(int i) {
		WebElement TimeSettingText = ldriver.findElement(By.xpath("(//*[@class='MuiFormLabel-root MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-shrink MuiInputLabel-sizeMedium MuiInputLabel-outlined MuiFormLabel-colorPrimary MuiFormLabel-filled MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-shrink MuiInputLabel-sizeMedium MuiInputLabel-outlined css-1ald77x'])["+i+"]"));
		return TimeSettingText;
	}

	@FindBy(xpath = "//*[@class='MuiBox-root css-1lcerjl']//div[1]//div[1]//input[1]")
	@CacheLookup
	WebElement SupplierOrderAcceptanceIntervelBox;

	public void SupplierOrderAcceptanceIntervelTextBox(String SupplierOrderAcceptanceIntervel) {
		SupplierOrderAcceptanceIntervelBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		SupplierOrderAcceptanceIntervelBox.sendKeys(SupplierOrderAcceptanceIntervel);
	}

	@FindBy(xpath = "//*[@class='MuiCollapse-root MuiCollapse-vertical MuiCollapse-entered css-c4sutr']//div[2]//div[1]//input[1]")
	@CacheLookup
	WebElement ConsumerNotifyTimeBox;

	public void ConsumerNotifyTimeTextBox(String ConsumerNotifyTime) {
		ConsumerNotifyTimeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ConsumerNotifyTimeBox.sendKeys(ConsumerNotifyTime);
	}

	@FindBy(xpath = "//*[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-8hgyd']//div[3]//div[1]//input[1]")
	@CacheLookup
	WebElement ConsumerDisableTimeBox;

	public void ConsumerDisableTimeTextBox(String ConsumerDisableTime) {
		ConsumerDisableTimeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ConsumerDisableTimeBox.sendKeys(ConsumerDisableTime);
	}

	@FindBy(xpath = "//*[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-8hgyd']//div[4]//div[1]//input[1]")
	@CacheLookup
	WebElement DistributorNotifyTimeBox;

	public void DistributorNotifyTimeTextBox(String DistributorNotifyTime) {
		DistributorNotifyTimeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		DistributorNotifyTimeBox.sendKeys(DistributorNotifyTime);
	}

	@FindBy(xpath = "//*[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-8hgyd']//div[5]//div[1]//input[1]")
	@CacheLookup
	WebElement DistributorDisableTimeBox;

	public void DistributorDisableTimeTextBox(String DistributorDisableTime) {
		DistributorDisableTimeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		DistributorDisableTimeBox.sendKeys(DistributorDisableTime);
	}

	@FindBy(xpath = "//*[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-8hgyd']//div[6]//div[1]//input[1]")
	@CacheLookup
	WebElement WFSNotifyTimeBox;

	public void WFSNotifyTimeTextBox(String WFSNotifyTime) {
		WFSNotifyTimeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		WFSNotifyTimeBox.sendKeys(WFSNotifyTime);
	}

	@FindBy(xpath = "//*[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-8hgyd']//div[7]//div[1]//input[1]")
	@CacheLookup
	WebElement WFSDisableTimeBox;

	public void WFSDisableTimeTextBox(String WFSDisableTime) {
		WFSDisableTimeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		WFSDisableTimeBox.sendKeys(WFSDisableTime);
	}

	//@FindBy(xpath = "(//*[text()='Update'])[5]")
	@FindBy(xpath = "//*[@id='panel7bh-content']//button[@type='button'][normalize-space()='Update']")
	@CacheLookup
	WebElement TimeSettingsUpdateButton;

	public void TimeSettingsUpdate() {
		TimeSettingsUpdateButton.click();
	}

	
	//================================================SETTLEMENT SETTINGS====================================================
	
	@FindBy(xpath="//*[text()='Settlement Settings']")
	@CacheLookup
	WebElement Settlement_Settings;
	public void Settlement_SettingsButton() {
		Settlement_Settings.click();
	}
	
	public WebElement Settlement_Settings_TabText(int i) {
		WebElement Settlement_Settings_Text = ldriver.findElement(By.xpath("(//*[@for=\"outlined-basic\"])["+i+"]"));
		return Settlement_Settings_Text;
	}
	
	@FindBy(xpath = "//*[@class='MuiBox-root css-ascm0e']//div[1]//div[1]//input[1]")
	@CacheLookup
	WebElement Distributor_Settlement_Price;

	public void Enter_Distributor_Settlement_Price(String Distributor_Settlement_PriceBox) {
		Distributor_Settlement_Price.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Distributor_Settlement_Price.sendKeys(Distributor_Settlement_PriceBox);
	}
	
	
	@FindBy(xpath = "//*[@class='MuiCollapse-root MuiCollapse-vertical MuiCollapse-entered css-c4sutr']//div[2]//div[1]//input[1]")
	@CacheLookup
	WebElement Base_Watercan_Price;

	public void Enter_Base_Watercan_Price(String Base_Watercan_PriceBox) {
		Base_Watercan_Price.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Base_Watercan_Price.sendKeys(Base_Watercan_PriceBox);
	}
	
	@FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-d6jyb7']//div[3]//div[1]//input[1]")
	@CacheLookup
	WebElement Filling_Station_Settlement_Price;

	public void Enter_Filling_Station_Settlement_Price(String Filling_Station_Settlement_PriceBox) {
		Filling_Station_Settlement_Price.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Filling_Station_Settlement_Price.sendKeys(Filling_Station_Settlement_PriceBox);
	}
	
	@FindBy(xpath="//*[@class='MuiCollapse-root MuiCollapse-vertical MuiCollapse-entered css-c4sutr']//button[@type='button'][normalize-space()='Update']")
	@CacheLookup
	WebElement Settlement_Settings_Update;
	public void Settlement_Settings_UpdateButton () {
		Settlement_Settings_Update.click();
	}
	
	
	//================================================PDW CONVENIENCE FEE===================================================
	
	@FindBy(xpath = "//*[text()='PDW convenience Fee']")
	@CacheLookup
	WebElement PDWConFee;

	public void PDWConvenienceFee() {
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		jse.executeScript("window.scrollBy(0,-250)");
		PDWConFee.click();
	}

	public WebElement PWDConFeeTabText(int i) {
		WebElement PWDConvenienceFeeTabText = ldriver
				.findElement(By.xpath("(//*[@id='outlined-basic-label'])[" + i + "]"));
		return PWDConvenienceFeeTabText;
	}

	@FindBy(xpath = "(//*[@id = 'outlined-basic'])[24]")
	//@FindBy(xpath = "(//*[@id = 'outlined-basic'])[23]")
	@CacheLookup
	WebElement PWDConvFeeCGSTBox;

	public void PWDConvFeeCGSTTextBox(String PWDConvFeeCGST) {
		PWDConvFeeCGSTBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		PWDConvFeeCGSTBox.sendKeys(PWDConvFeeCGST);
	}

	@FindBy(xpath = "(//*[@id = 'outlined-basic'])[25]")
	//@FindBy(xpath = "(//*[@id = 'outlined-basic'])[24]")
	@CacheLookup
	WebElement PWDConvFeeSGSTBox;

	public void PWDConvFeeSGSTTextBox(String PWDConvFeeSGST) {
		PWDConvFeeSGSTBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		PWDConvFeeSGSTBox.sendKeys(PWDConvFeeSGST);
	}

	@FindBy(xpath = "(//*[@id = 'outlined-basic'])[26]")
	//@FindBy(xpath = "(//*[@id = 'outlined-basic'])[25]")
	@CacheLookup
	WebElement PWDConvFeeGSTcodeBox;

	public void PWDConvFeeGSTcodeTextBox(String PWDConvFeeGSTcode) {
		PWDConvFeeGSTcodeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		PWDConvFeeGSTcodeBox.sendKeys(PWDConvFeeGSTcode);
	}

	//@FindBy(xpath = "(//*[text()='Update'])[7]")
	@FindBy(xpath = "//*[@id='panel3bh-content']//button[@type='button'][normalize-space()='Update']")
	@CacheLookup
	WebElement PWDConvFeeUpdateButton;

	public void PWDConvFeeUpdate() {
		PWDConvFeeUpdateButton.click();
	}
	
	
	
	
	//====================================CANCELLATION FEE SETTINGS===========================================================
	
	@FindBy(xpath = "(//*[text()='Cancellation fee setting'])")
	@CacheLookup
	WebElement CancellationFeeSetting;

	public void CancellationFeeSettingTab() {
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		jse.executeScript("window.scrollBy(0,-250)");
		CancellationFeeSetting.click();
	}

	public WebElement CancellationFeeSettingTabText(int i) {
		WebElement CancellationFeeSettingText = ldriver
				.findElement(By.xpath("(//*[@id='outlined-basic-label'])[" + i + "]"));
		return CancellationFeeSettingText;
	}

	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[28]")
	//@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[26]")
	@CacheLookup
	WebElement SupplierCancelFeeBox;

	public void SupplierCancelFeeTextBox(String SupplierCancelFee) {
		SupplierCancelFeeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		SupplierCancelFeeBox.sendKeys(SupplierCancelFee);
	}

	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[29]")
	//@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[27]")

	@CacheLookup
	WebElement ConsumerCancelFeeBox;

	public void ConsumerCancelFeeTextBox(String ConsumerCancelFee) {
		ConsumerCancelFeeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ConsumerCancelFeeBox.sendKeys(ConsumerCancelFee);
	}

	//@FindBy(xpath = "(//*[text()='Update'])[8]")
	@FindBy(xpath = "//*[@class='MuiCollapse-root MuiCollapse-vertical MuiCollapse-entered css-c4sutr']//button[@type='button'][normalize-space()='Update']")
	@CacheLookup
	WebElement CancellationFeeUpdateButton;

	public void CancellationFeeUpdate() {
		CancellationFeeUpdateButton.click();
	}

	
	
	//=====================================================Force Consumer App Update Settings============================================
	
	@FindBy(xpath="//*[text()='Force Apps Update']")
	@CacheLookup
	WebElement Force_Consumer_Apps_UpdateButton;
	public void Force_Consumer_Apps_Update_Tab () {
		Force_Consumer_Apps_UpdateButton.click();
	}
	
	
	public WebElement All_Radio_ButtonText(int i) {
		WebElement Radio_ButtonText = ldriver.findElement(By.xpath("(//*[@class='MuiFormLabel-root MuiFormLabel-colorPrimary css-15gujdz'])["+i+"]"));
		Actions act = new Actions(ldriver);
		act.moveToElement(Radio_ButtonText).click().perform();
		return Radio_ButtonText;
		

	}
	
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[1]")
	@CacheLookup
	WebElement Android_CurrentVersion;

	public void Update_Android_CurrentVersion(String Android_CurrentVersionBox) {
		Android_CurrentVersion.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Android_CurrentVersion.sendKeys(Android_CurrentVersionBox);
	}
	
	
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[2]")
	@CacheLookup
	WebElement message;

	public void Update_message(String messageBox) {
		message.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		message.sendKeys(messageBox);
	}
	
	
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[3]")
	@CacheLookup
	WebElement header;

	public void Update_headerBox(String headerBox) {
		header.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		header.sendKeys(headerBox);
	}
	
	public void Select_RadioButton_UpdateISMandatory_Android() {
        WebElement radioButton_Of_UpdateISMandatory1 = ldriver.findElement(By.xpath("(//*[@class='MuiButtonBase-root MuiRadio-root MuiRadio-colorPrimary PrivateSwitchBase-root MuiRadio-root MuiRadio-colorPrimary MuiRadio-root MuiRadio-colorPrimary css-1a5icme'])[3]"));
        WebElement radioButton_Of_UpdateISMandatory2 = ldriver.findElement(By.xpath("(//*[@class='MuiButtonBase-root MuiRadio-root MuiRadio-colorPrimary PrivateSwitchBase-root MuiRadio-root MuiRadio-colorPrimary MuiRadio-root MuiRadio-colorPrimary css-1a5icme'])[3]"));

        if (radioButton_Of_UpdateISMandatory1.isSelected()) {
        	radioButton_Of_UpdateISMandatory2.click();
        } else {
        	radioButton_Of_UpdateISMandatory1.click();
        }
		
	}
	
	public void Update_Buton_ForceConsumerAppsUpdate() {
		WebElement Update_ForceConsumerAppsUpdate = ldriver.findElement(By.xpath("//*[@class='MuiCollapse-root MuiCollapse-vertical MuiCollapse-entered css-c4sutr']//*[@type='button'][normalize-space()='Update']"));
		Update_ForceConsumerAppsUpdate.click();
	}
	
	
	public void Select_RadioButton_ForceAppTour_Android() {
		WebElement radioButton_Of_UpdateForceAppTour1 = ldriver.findElement(By.xpath("(//*[@class='MuiButtonBase-root MuiRadio-root MuiRadio-colorPrimary PrivateSwitchBase-root MuiRadio-root MuiRadio-colorPrimary MuiRadio-root MuiRadio-colorPrimary css-1a5icme'])[4]"));
        WebElement radioButton_Of_UpdateForceAppTour2 = ldriver.findElement(By.xpath("(//*[@class='MuiButtonBase-root MuiRadio-root MuiRadio-colorPrimary PrivateSwitchBase-root MuiRadio-root MuiRadio-colorPrimary MuiRadio-root MuiRadio-colorPrimary css-1a5icme'])[4]"));

        if (radioButton_Of_UpdateForceAppTour1.isSelected()) {
        	radioButton_Of_UpdateForceAppTour2.click();
        } else {
        	radioButton_Of_UpdateForceAppTour1.click();
        }
		
	}
	
	
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[7]")
	@CacheLookup
	WebElement ios_CurrentVersion;

	public void Update_ios_CurrentVersion(String ios_CurrentVersionBox) {
		ios_CurrentVersion.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ios_CurrentVersion.sendKeys(ios_CurrentVersionBox);
	}
	
	
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[8]")
	@CacheLookup
	WebElement ios_message;

	public void Update_ios_message(String ios_messageBox) {
		ios_message.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ios_message.sendKeys(ios_messageBox);
	}
	
	
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[9]")
	@CacheLookup
	WebElement ios_header;

	public void Update_ios_headerBox(String ios_headerBox) {
		ios_header.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ios_header.sendKeys(ios_headerBox);
	}
	
	
	public void Select_RadioButton_UpdateISMandatory_ios() {
        WebElement radioButton_Of_UpdateISMandatory_ios1 = ldriver.findElement(By.xpath("(//*[@class=\"MuiButtonBase-root MuiRadio-root MuiRadio-colorPrimary PrivateSwitchBase-root MuiRadio-root MuiRadio-colorPrimary MuiRadio-root MuiRadio-colorPrimary css-1a5icme\"])[6]"));
        WebElement radioButton_Of_UpdateISMandatory_ios2 = ldriver.findElement(By.xpath("(//*[@class=\"MuiButtonBase-root MuiRadio-root MuiRadio-colorPrimary PrivateSwitchBase-root MuiRadio-root MuiRadio-colorPrimary MuiRadio-root MuiRadio-colorPrimary css-1a5icme\"])[6]"));

        if (radioButton_Of_UpdateISMandatory_ios1.isSelected()) {
        	radioButton_Of_UpdateISMandatory_ios2.click();
        } else {
        	radioButton_Of_UpdateISMandatory_ios1.click();
        }
		
	}
	
	public void Select_RadioButton_ForceAppTour_ios() {
		WebElement radioButton_Of_UpdateForceAppTour_ios1 = ldriver.findElement(By.xpath("(//*[@class='MuiButtonBase-root MuiRadio-root MuiRadio-colorPrimary PrivateSwitchBase-root MuiRadio-root MuiRadio-colorPrimary MuiRadio-root MuiRadio-colorPrimary css-1a5icme'])[7]"));
        WebElement radioButton_Of_UpdateForceAppTour_ios2 = ldriver.findElement(By.xpath("(//*[@class='MuiButtonBase-root MuiRadio-root MuiRadio-colorPrimary PrivateSwitchBase-root MuiRadio-root MuiRadio-colorPrimary MuiRadio-root MuiRadio-colorPrimary css-1a5icme'])[7]"));

        if (radioButton_Of_UpdateForceAppTour_ios1.isSelected()) {
        	radioButton_Of_UpdateForceAppTour_ios2.click();
        } else {
        	radioButton_Of_UpdateForceAppTour_ios1.click();
        }  
        
	}

	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[7]")
	@CacheLookup
	WebElement webapp_CurrentVersion;

	public void Update_webapp_CurrentVersion(String webapp_CurrentVersionBox) {
		webapp_CurrentVersion.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		webapp_CurrentVersion.sendKeys(webapp_CurrentVersionBox);
	}
	
	
	public void Select_RadioButton_ForceAppTour_webapp() {
		WebElement radioButton_Of_UpdateForceAppTour_webapp1 = ldriver.findElement(By.xpath("(//*[@class='MuiButtonBase-root MuiRadio-root MuiRadio-colorPrimary PrivateSwitchBase-root MuiRadio-root MuiRadio-colorPrimary MuiRadio-root MuiRadio-colorPrimary css-1a5icme'])[8]"));
        WebElement radioButton_Of_UpdateForceAppTour_webapp2 = ldriver.findElement(By.xpath("(//*[@class='MuiButtonBase-root MuiRadio-root MuiRadio-colorPrimary PrivateSwitchBase-root MuiRadio-root MuiRadio-colorPrimary MuiRadio-root MuiRadio-colorPrimary css-1a5icme'])[8]"));

        if (radioButton_Of_UpdateForceAppTour_webapp1.isSelected()) {
        	radioButton_Of_UpdateForceAppTour_webapp2.click();
        } else {
        	radioButton_Of_UpdateForceAppTour_webapp1.click();
        }  
        
	}
	
	}




