package com.pages;

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
import org.openqa.selenium.support.ui.WebDriverWait;

import de.erichseifert.vectorgraphics2d.VectorHints.Value;

public class settingsPage extends Home {
	public settingsPage(WebDriver rdriver) {
		super(rdriver);
		// PageFactory.initElements(rdriver, this);
	}

	WebElement settingButton = ldriver.findElement(By.xpath("(//*[text()='Settings'])[1]"));

	public void settingLink() {
		Actions actions = new Actions(ldriver);
		actions.moveToElement(settingButton).click().build().perform();
		// settingButton.click();
	}

	@FindBy(xpath = "(//*[text()='Settings'])[1]")
	@CacheLookup
	WebElement settingsText;

	public String settingsText() {
		String pagename = settingsText.getText();
		return pagename;
	}

	
	//=========================================COMMON SETTINGS========================================================================
	
	
	@FindBy(xpath = "(//*[@class=\"MuiButtonBase-root MuiAccordionSummary-root MuiAccordionSummary-gutters css-1iji0d4\"])[1]")
	@CacheLookup
	WebElement commonSettingsButton;

	public void commonSettings() {
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

	@FindBy(xpath = "(//*[text()='Update'])[1]")
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

	@FindBy(xpath = "//*[text()='Delivery Slots']")
	@CacheLookup
	WebElement DeliverySlots;

	public void DeliverySlotsTab() {
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		jse.executeScript("window.scrollBy(0,-250)");
		DeliverySlots.click();
	}

	@FindBy(xpath = "//*[text()='Add Slots']")
	@CacheLookup
	WebElement AddSlots;

	public void AddSlotsTab() {
		AddSlots.click();
//		//boolean act1 = false;
//		String typevalue = AddSlots.getAttribute("aria-pressed");
//		System.out.println(typevalue);
//		if (Boolean.valueOf(typevalue)) {
//			
//		}
//		else {
//			JavascriptExecutor jse = (JavascriptExecutor) ldriver;
//			jse.executeScript("window.scrollBy(0,-250)");
//			AddSlots.click();
//		}
	}

	public WebElement AddSlotsTabText() {
		WebElement AddSlotsText = ldriver.findElement(By.xpath(
				"(//*[@class='MuiFormLabel-root MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-shrink MuiInputLabel-outlined MuiFormLabel-colorPrimary MuiFormLabel-filled MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-shrink MuiInputLabel-outlined css-u9osun'])[9]"));
		return AddSlotsText;
	}

	public WebElement AddSlotsTabText1(int i) {
		WebElement AddSlotsText1 = ldriver.findElement(By.xpath(
				"(//*[@class='MuiFormLabel-root MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-outlined MuiFormLabel-colorPrimary MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-outlined css-p0rm37'])["
						+ i + "]"));
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

	@FindBy(xpath = "(//*[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb'])[2]")
	@CacheLookup
	WebElement existingDeliverySlot;

	public void existingDeliverySlotButton() {
		existingDeliverySlot.click();
	}

	
	//=======================================BLOCK PAYMENT & BOOKING & TIMIMG===================================
	
	@FindBy(xpath = "//*[text()='Block Payment & Booking & Timing']")
	@CacheLookup
	WebElement BlockTimeSetting;

	public void BlockTimeSettingTab() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		jse.executeScript("window.scrollBy(0,-250)");
		BlockTimeSetting.click();
		Thread.sleep(1000);
		WebElement timingTab = ldriver.findElement(By.xpath("//*[text()='Timing']"));
		Actions action=new Actions(ldriver); 
		action.moveToElement(timingTab).click().build().perform();
	}

//	@FindBy(xpath = "//*[text()='Timing']")
//	@CacheLookup
//		WebElement timingTab;
//	public void timingtabbutton () {
//		Actions action=new Actions(ldriver); 
//		action.moveToElement(timingTab).click().build().perform();
//	}

	public WebElement BlockTimeSettingTabText(int i) throws InterruptedException {
		// Thread.sleep(3000);
		WebElement BlockTimeSettingFirstText = ldriver.findElement(By.xpath(
				"(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])"
						+ i + "]"));
		// .findElement(By.xpath("(//*[@id='outlined-basic-label'])[" + i + "]"));
		return BlockTimeSettingFirstText;
	}

	public void UpdateBlockTime(String UstartTime, String UEndTime) throws InterruptedException {
		WebElement starttime = ldriver.findElement(By.xpath(
				"(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[3]"));
		starttime.click();

		WebElement enterStartTime = ldriver.findElement(By.xpath(
				"(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[3]"));
		enterStartTime.sendKeys(UstartTime);
		// enterStartTime.sendKeys(Keys.CONTROL, "a", Keys.DELETE);

		WebElement endtime = ldriver.findElement(By.xpath(
				"(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[4]"));
		endtime.click();

		WebElement enterEndTime = ldriver.findElement(By.xpath(
				"(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[4]"));
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
	
	//=================================SOLD BY====================================================================
	
	@FindBy(xpath = "//*[text()='Sold By']")
	@CacheLookup
	WebElement SoldByButton;
	
	public void SoldByTab() {
		SoldByButton.click();
	}
	
//	@FindBy(xpath = "(//*[text()='Distributor'])[1]")
//	@CacheLookup
//	WebElement SelectDistributor;
	
//	public void SelectDistributorTab() throws InterruptedException {
//		SelectDistributor.click();
//		Thread.sleep(1000);
//		Actions b= new Actions(ldriver);
//		WebElement SelectDist = ldriver.findElement(By.xpath("(//*[text()='Distributor'])[2]"));
//		b.moveToElement(SelectDist).click().build().perform();
//		//SelectDist.click();
//	}
	
	public void selectslotofDistributor() {
		WebElement SelectSoldBy = ldriver.findElement(By.xpath("(//*[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb'])[3]"));
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
	
	@FindBy(xpath = "(//*[text()='Update'])[3]")
	@CacheLookup
	WebElement SelectDistributorUpdate;
	
	public void SelectDistributorUpdateButton() throws InterruptedException {
		SelectDistributorUpdate.click();
		Thread.sleep(500);
	}
	
	
	public void selectslotofBookwater() {
	WebElement SelectSoldBy = ldriver.findElement(By.xpath("(//*[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb'])[3]"));
	String Act = SelectSoldBy.getText();
	System.out.println(Act);
	
	if (Act.equalsIgnoreCase("Distributor")) {
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
		//Thread.sleep(1000);
		WebElement SoldByBookWaterTabText = ldriver.findElement(By.xpath("(//*[@class='MuiFormLabel-root MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-outlined MuiFormLabel-colorPrimary MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-outlined css-p0rm37'])["+i+"]"));
		return SoldByBookWaterTabText;
	}
	
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[9]")
	@CacheLookup
	WebElement CompanyNameBox;

	public void CompanyNameTextBox(String CompanyName) {
		CompanyNameBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		CompanyNameBox.sendKeys(CompanyName);
	}
	
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[10]")
	@CacheLookup
	WebElement PanNumberBox;

	public void PanNumberTextBox(String PanNumber) {
		PanNumberBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		PanNumberBox.sendKeys(PanNumber);
	}
	
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[11]")
	@CacheLookup
	WebElement GSTNumberBox;

	public void GSTNumberTextBox(String GSTNumber) {
		GSTNumberBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		GSTNumberBox.sendKeys(GSTNumber);
	}

	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline css-u36398'])[3]")
	@CacheLookup
	WebElement AddressBox;

	public void AddressTextBox(String Address) {
		AddressBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		AddressBox.sendKeys(Address);
	}
	
//	@FindBy(xpath = "(//*[text()=\"Update\"])[2]")
//	@CacheLookup
//	WebElement SoldByBookwaterUpdate;
//
//	public void SoldByBookwaterUpdateButton() {
//		SoldByBookwaterUpdate.click();
//	}

	
	
	
	
	//=================================REFERRAL SETTINGS===============================================================
	
	@FindBy(xpath = "//*[text()='Referral Settings']")
	@CacheLookup
	WebElement ReferralSetting;

	public void ReferralSettingTab() {
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		jse.executeScript("window.scrollBy(0,-250)");
		ReferralSetting.click();
	}

	public WebElement ReferralSettingTabText(int i) throws InterruptedException {
		Thread.sleep(500);
		WebElement ReferralSettingText = ldriver.findElement(By.xpath("(//*[@id='outlined-basic-label'])[" + i + "]"));
		return ReferralSettingText;
	}

	public void ConsumerReferrer() {
		WebElement selectType = ldriver.findElement(By.xpath("(//*[text()='CONSUMER REFERRER'])[1]"));
		selectType.click();
		WebElement SelectType1 = ldriver.findElement(By.xpath("(//*[text()='CONSUMER REFERRER'])[2]"));
		SelectType1.click();

	}

	public void ConsumerReferree() {
		WebElement SelectType = ldriver.findElement(By.xpath("(//*[@id='demo-simple-select'])[2]"));
		String Act = SelectType.getText();
		System.out.println(Act);

		if (Act.equalsIgnoreCase("CONSUMER REFERRER")) {
			SelectType.click();
			System.out.println("hello");
			WebElement SelectType2 = ldriver.findElement(By.xpath(
					"(//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[1]"));
			SelectType2.click();

		} else {
			// SelectType.click();
		}
		// WebElement SelectType =
		// ldriver.findElement(By.xpath("(//*[@id='demo-simple-select'])[1]"));
		// SelectType.click();
//		WebElement SelectType2= ldriver.findElement(By.xpath("(//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[1]"));
//		SelectType2.click();

	}
//	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input Mui-disabled css-1x5jdmq'])[3]")
//	@CacheLookup
//	WebElement disabledReferralWaterDropPerOrder;
//	
//	public boolean disabledReferralWaterDropPerOrderBox() {
//		boolean dis = disabledReferralWaterDropPerOrder.isEnabled();
//		return dis;
//		
//	}

	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[10]")
	@CacheLookup
	WebElement ReferralWaterDropPerOrderBox;

	public void ReferralWaterDropPerOrderTextBox(String ReferralWaterDropPerOrder) {
		ReferralWaterDropPerOrderBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ReferralWaterDropPerOrderBox.sendKeys(ReferralWaterDropPerOrder);
	}

	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[11]")
	@CacheLookup
	WebElement ReferralRewardLimitBox;

	public void ReferralRewardLimitTextBox(String ReferralRewardLimit) {
		ReferralRewardLimitBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ReferralRewardLimitBox.sendKeys(ReferralRewardLimit);
	}

	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[10]")
	@CacheLookup
	WebElement referralRewardLimitBox;

	public void referralRewardLimitTextBox(String ReferralRewardLimit) {
		referralRewardLimitBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		referralRewardLimitBox.sendKeys(ReferralRewardLimit);
	}

	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[12]")
	@CacheLookup
	WebElement RupeeValueforEachWaterDropBox;

	public void RupeeValueforEachWaterDropTextBox(String RupeeValueforEachWaterDrop) {
		RupeeValueforEachWaterDropBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		RupeeValueforEachWaterDropBox.sendKeys(RupeeValueforEachWaterDrop);
	}

	@FindBy(xpath = "(//*[text()='Update'])[4]")
	@CacheLookup
	WebElement ReferralSettingsUpdateButton;

	public void ReferralSettingsUpdate() {
		ReferralSettingsUpdateButton.click();
	}

	public void Influencer() {
		WebElement SelectType = ldriver.findElement(By.xpath("(//*[@id='demo-simple-select'])[2]"));
		String Act = SelectType.getText();
		System.out.println(Act);

		if (Act.equalsIgnoreCase("CONSUMER REFERREE")) {
			SelectType.click();
			System.out.println("hello");
			WebElement SelectType2 = ldriver.findElement(By.xpath(
					"(//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[2]"));
			SelectType2.click();

		} else {
			// SelectType.click();
		}
	}

	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[10]")
	@CacheLookup
	WebElement referralWaterDropPerOrderBox;

	public void referralWaterDropPerOrderTextBox(String referralWaterDropPerOrder) {
		referralWaterDropPerOrderBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		referralWaterDropPerOrderBox.sendKeys(referralWaterDropPerOrder);
	}

	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[11]")
	@CacheLookup
	WebElement rupeeValueforEachWaterDropBox;

	public void rupeeValueforEachWaterDropTextBox(String rupeeValueforEachWaterDrop) {
		rupeeValueforEachWaterDropBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		rupeeValueforEachWaterDropBox.sendKeys(rupeeValueforEachWaterDrop);
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

	@FindBy(xpath = "(//*[@id='outlined-basic'])[8]")
	@CacheLookup
	WebElement ConvfeelongtermbookingBox;

	public void ConvfeelongtermbookingTextBox(String ConvFeeLongTermBooking) {
		ConvfeelongtermbookingBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ConvfeelongtermbookingBox.sendKeys(ConvFeeLongTermBooking);
	}

	@FindBy(xpath = "(//*[@id='outlined-basic'])[9]")
	@CacheLookup
	WebElement ConcfeesinglebookingBox;

	public void ConcfeesinglebookingTextBox(String ConcFeeSingleBooking) {
		ConcfeesinglebookingBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ConcfeesinglebookingBox.sendKeys(ConcFeeSingleBooking);

	}

	@FindBy(xpath = "(//*[@id='outlined-basic'])[10]")
	@CacheLookup
	WebElement ConvfeeCGSTBox;

	public void ConvfeeCGSTTextBox(String ConvFeeCGST) {
		ConvfeeCGSTBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ConvfeeCGSTBox.sendKeys(ConvFeeCGST);
	}

	@FindBy(xpath = "(//*[@id='outlined-basic'])[11]")
	@CacheLookup
	WebElement ConvfeeSGSTBox;

	public void ConvfeeSGSTTextBox(String ConvFeeSGST) {
		ConvfeeSGSTBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ConvfeeSGSTBox.sendKeys(ConvFeeSGST);
	}

	@FindBy(xpath = "(//*[@id='outlined-basic'])[12]")
	@CacheLookup
	WebElement ConvfeeGSTcodeBox;

	public void ConvfeeGSTcodeTextBox(String ConvFeeGSTCode) {
		ConvfeeGSTcodeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ConvfeeGSTcodeBox.sendKeys(ConvFeeGSTCode);
	}

	@FindBy(xpath = "(//*[text()='Update'])[3]")
	@CacheLookup
	WebElement conFeeSettingUpdateButton;

	public void conFeeSettingUpdate() {
		conFeeSettingUpdateButton.click();
	}

	//=================================================TIME SETTINGS========================================================
	
	
	
	//================================================SETTLEMENT SETTINGS====================================================
	
	
	
	
	//================================================PWD CONVENIENCE FEE===================================================
	
	@FindBy(xpath = "//*[text()='PWD convenience Fee']")
	@CacheLookup
	WebElement PWDConFee;

	public void PWDConvenienceFee() {
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		jse.executeScript("window.scrollBy(0,-250)");
		PWDConFee.click();
	}

	public WebElement PWDConFeeTabText(int i) {
		WebElement PWDConvenienceFeeTabText = ldriver
				.findElement(By.xpath("(//*[@id='outlined-basic-label'])[" + i + "]"));
		return PWDConvenienceFeeTabText;
	}

	@FindBy(xpath = "(//*[@id = 'outlined-basic'])[13]")
	@CacheLookup
	WebElement PWDConvFeeCGSTBox;

	public void PWDConvFeeCGSTTextBox(String PWDConvFeeCGST) {
		PWDConvFeeCGSTBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		PWDConvFeeCGSTBox.sendKeys(PWDConvFeeCGST);
	}

	@FindBy(xpath = "(//*[@id = 'outlined-basic'])[14]")
	@CacheLookup
	WebElement PWDConvFeeSGSTBox;

	public void PWDConvFeeSGSTTextBox(String PWDConvFeeSGST) {
		PWDConvFeeSGSTBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		PWDConvFeeSGSTBox.sendKeys(PWDConvFeeSGST);
	}

	@FindBy(xpath = "(//*[@id = 'outlined-basic'])[15]")
	@CacheLookup
	WebElement PWDConvFeeGSTcodeBox;

	public void PWDConvFeeGSTcodeTextBox(String PWDConvFeeGSTcode) {
		PWDConvFeeGSTcodeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		PWDConvFeeGSTcodeBox.sendKeys(PWDConvFeeGSTcode);
	}

	@FindBy(xpath = "(//*[text()='Update'])[4]")
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

	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[15]")
	@CacheLookup
	WebElement SupplierCancelFeeBox;

	public void SupplierCancelFeeTextBox(String SupplierCancelFee) {
		SupplierCancelFeeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		SupplierCancelFeeBox.sendKeys(SupplierCancelFee);
	}

	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[16]")
	@CacheLookup
	WebElement ConsumerCancelFeeBox;

	public void ConsumerCancelFeeTextBox(String ConsumerCancelFee) {
		ConsumerCancelFeeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ConsumerCancelFeeBox.sendKeys(ConsumerCancelFee);
	}

	@FindBy(xpath = "(//*[text()='Update'])[7]")
	@CacheLookup
	WebElement CancellationFeeUpdateButton;

	public void CancellationFeeUpdate() {
		CancellationFeeUpdateButton.click();
	}
	

//	@FindBy(xpath = "//*[text()='GST Details']")
//	@CacheLookup
//	WebElement GSTDetails;
//
//	public void GSTDetailsTab() {
//		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
//		jse.executeScript("window.scrollBy(0,-250)");
//		GSTDetails.click();
//	}
//
//	public WebElement GSTDetailsTabText(int i) {
//		WebElement GSTDetailsSettingTabText = ldriver
//				.findElement(By.xpath("(//*[@id='outlined-basic-label'])[" + i + "]"));
//		return GSTDetailsSettingTabText;
//	}
//
//	@FindBy(xpath = "(//*[@id = 'outlined-basic'])[16]")
//	@CacheLookup
//	WebElement ExtraChargesHSNCodeBox;
//
//	public void ExtraChargesHSNCodeTextBox(String ExtraChargesHSNCode) {
//		ExtraChargesHSNCodeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//		ExtraChargesHSNCodeBox.sendKeys(ExtraChargesHSNCode);
//	}
//
//	@FindBy(xpath = "(//*[@id = 'outlined-basic'])[17]")
//	@CacheLookup
//	WebElement ExtraChargesCGSTBox;
//
//	public void ExtraChargesCGSTTextBox(String ExtraChargesCGST) {
//		ExtraChargesCGSTBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//		ExtraChargesCGSTBox.sendKeys(ExtraChargesCGST);
//	}
//
//	@FindBy(xpath = "(//*[@id = 'outlined-basic'])[18]")
//	@CacheLookup
//	WebElement ExtraChargesSGSTBox;
//
//	public void ExtraChargesSGSTTextBox(String ExtraChargesSGST) {
//		ExtraChargesSGSTBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//		ExtraChargesSGSTBox.sendKeys(ExtraChargesSGST);
//	}
//
//	@FindBy(xpath = "(//*[text()='Update'])[5]")
//	@CacheLookup
//	WebElement GSTDetailsUpdateButton;
//
//	public void GSTDetailsUpdate() {
//		GSTDetailsUpdateButton.click();
//	}

//	@FindBy(xpath = "(//*[text()='Gate way fee setting'])")
//	@CacheLookup
//	WebElement GateWayFeeSetting;
//
//	public void GateWayFeeSettingTab() {
//		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
//		jse.executeScript("window.scrollBy(0,-250)");
//		GateWayFeeSetting.click();
//	}
//
//	public WebElement GateWayFeeSettingTabText(int i) {
//		WebElement GateWayFeeSettingText = ldriver
//				.findElement(By.xpath("(//*[@id='outlined-basic-label'])[" + i + "]"));
//		return GateWayFeeSettingText;
//	}
//
//	@FindBy(xpath = "(//*[@id = 'outlined-basic'])[25]")
//	@CacheLookup
//	WebElement GateWayFeeBox;
//
//	public void GateWayFeeTextBox(String GateWayFee) {
//		GateWayFeeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//		GateWayFeeBox.sendKeys(GateWayFee);
//	}
//
//	@FindBy(xpath = "(//*[@id = 'outlined-basic'])[26]")
//	@CacheLookup
//	WebElement GateWayFeeCGSTBox;
//
//	public void GateWayFeeCGSTTextBox(String GateWayFeeCGST) {
//		GateWayFeeCGSTBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//		GateWayFeeCGSTBox.sendKeys(GateWayFeeCGST);
//	}
//
//	@FindBy(xpath = "(//*[@id = 'outlined-basic'])[27]")
//	@CacheLookup
//	WebElement GateWayFeeSGSTBox;
//
//	public void GateWayFeeSGSTTextBox(String GateWayFeeSGST) {
//		GateWayFeeSGSTBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//		GateWayFeeSGSTBox.sendKeys(GateWayFeeSGST);
//	}
//
//	@FindBy(xpath = "(//*[@id = 'outlined-basic'])[28]")
//	@CacheLookup
//	WebElement GatewayFeeGSTCodeBox;
//
//	public void GatewayFeeGSTCodeTextBox(String GatewayFeeGSTCode) {
//		GatewayFeeGSTCodeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//		GatewayFeeGSTCodeBox.sendKeys(GatewayFeeGSTCode);
//	}
//
//	@FindBy(xpath = "(//*[text()='Update'])[6]")
//	@CacheLookup
//	WebElement GateWayFeeUpdateButton;
//
//	public void GateWayFeeUpdate() {
//		GateWayFeeUpdateButton.click();
//	}

	

//	@FindBy(xpath = "//*[text()='Time settings']")
//	@CacheLookup
//	WebElement TimeSetting;
//
//	public void TimeSettingTab() {
//		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
//		jse.executeScript("window.scrollBy(0,-250)");
//		TimeSetting.click();
//	}
//
//	public WebElement TimeSettingTabText(int i) {
//		WebElement TimeSettingText = ldriver.findElement(By.xpath("(//*[@id='outlined-basic-label'])[" + i + "]"));
//		return TimeSettingText;
//	}
//
//	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[17]")
//	@CacheLookup
//	WebElement SupplierOrderAcceptanceIntervelBox;
//
//	public void SupplierOrderAcceptanceIntervelTextBox(String SupplierOrderAcceptanceIntervel) {
//		SupplierOrderAcceptanceIntervelBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//		SupplierOrderAcceptanceIntervelBox.sendKeys(SupplierOrderAcceptanceIntervel);
//	}
//
//	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[18]")
//	@CacheLookup
//	WebElement ConsumerNotifyTimeBox;
//
//	public void ConsumerNotifyTimeTextBox(String ConsumerNotifyTime) {
//		ConsumerNotifyTimeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//		ConsumerNotifyTimeBox.sendKeys(ConsumerNotifyTime);
//	}
//
//	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[19]")
//	@CacheLookup
//	WebElement ConsumerDisableTimeBox;
//
//	public void ConsumerDisableTimeTextBox(String ConsumerDisableTime) {
//		ConsumerDisableTimeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//		ConsumerDisableTimeBox.sendKeys(ConsumerDisableTime);
//	}
//
//	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[20]")
//	@CacheLookup
//	WebElement DistributorNotifyTimeBox;
//
//	public void DistributorNotifyTimeTextBox(String DistributorNotifyTime) {
//		DistributorNotifyTimeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//		DistributorNotifyTimeBox.sendKeys(DistributorNotifyTime);
//	}
//
//	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[21]")
//	@CacheLookup
//	WebElement DistributorDisableTimeBox;
//
//	public void DistributorDisableTimeTextBox(String DistributorDisableTime) {
//		DistributorDisableTimeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//		DistributorDisableTimeBox.sendKeys(DistributorDisableTime);
//	}
//
//	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[22]")
//	@CacheLookup
//	WebElement WFSNotifyTimeBox;
//
//	public void WFSNotifyTimeTextBox(String WFSNotifyTime) {
//		WFSNotifyTimeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//		WFSNotifyTimeBox.sendKeys(WFSNotifyTime);
//	}
//
//	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[23]")
//	@CacheLookup
//	WebElement WFSDisableTimeBox;
//
//	public void WFSDisableTimeTextBox(String WFSDisableTime) {
//		WFSDisableTimeBox.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//		WFSDisableTimeBox.sendKeys(WFSDisableTime);
//	}
//
//	@FindBy(xpath = "(//*[text()='Update'])[8]")
//	@CacheLookup
//	WebElement TimeSettingsUpdateButton;
//
//	public void TimeSettingsUpdate() {
//		TimeSettingsUpdateButton.click();
//	}


//=====================================================COMMON SERVICE AREA=========================================
	
//	public void OpenCommonServiceArea() {
//	WebElement CommonServiceArea = ldriver.findElement(By.xpath(
//			"(//*[@class='MuiButtonBase-root MuiAccordionSummary-root MuiAccordionSummary-gutters css-1iji0d4'])[2]"));
//	CommonServiceArea.click();
//}
//
//@FindBy(xpath = "//*[text()='Common service area and rate for all']")
//@CacheLookup
//WebElement CommonServiceareatext;
//
//public String CheckCommonServiceArea() {
//	return CommonServiceareatext.getText();
//}
//
//@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[1]")
//@CacheLookup
//WebElement enterPincode;
//
//public void enterPincodeBox(String Pincode) {
//	enterPincode.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//	enterPincode.sendKeys(Pincode);
//}
//
//public void selectArea(String Rate) throws InterruptedException {
//	WebElement areaButton = ldriver.findElement(By.xpath(
//			"//*[@class=\"MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf\"]"));
//	areaButton.click();
//	// Thread.sleep(1000);
//	List<WebElement> allOptions = ldriver.findElements(By.xpath(
//			"//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz']"));
//	for (int i = 0; i < allOptions.size() - 1;) {
//		allOptions.get(i).click();
//		System.out.println(allOptions.size());
//		WebElement viewButton = ldriver.findElement(By.xpath("//*[text()=\"View\"]"));
//		viewButton.click();
//		// Thread.sleep(3000);
//		WebElement rateButton = ldriver.findElement(By.xpath(
//				"(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[2]"));
//		int length = rateButton.getAttribute("value").length();
//		for (int a = 0; a < length; a++) {
//			rateButton.sendKeys(Keys.BACK_SPACE);
//		}
//		// Thread.sleep(1000);
//		rateButton.sendKeys(Rate);
//		WebElement updateButton = ldriver.findElement(By.xpath("(//*[text()='Update'])[2]"));
//		updateButton.click();
//		Thread.sleep(1800);
//		break;
//	}
//}
	
}