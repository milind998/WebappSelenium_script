package com.pages;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mongodb.annotations.ThreadSafe;

public class promoCode extends mainsettingsPage {
	public promoCode(WebDriver rdriver) {
		super(rdriver);
	}

	@FindBy(xpath="//*[text()=\"Promo Code\"]")
	@CacheLookup
	WebElement promoCodeTab;
	public void Click_On_promoCodeTab() {
		promoCodeTab.click();
	}

	@FindBy(xpath="//*[text()='Add Promo']")
	@CacheLookup
	WebElement text_Of_promoCodeTab;
	public String Check_Text_Of_PromoCode() {
		return text_Of_promoCodeTab.getText();
	}

	public String check_Promo_Code_Table_Text(int i) {
		WebElement tableText_PromoCode = ldriver.findElement(By.xpath("(//*[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-sizeMedium css-bh1x84'])["+i+"]"));
		return tableText_PromoCode.getText();

	}

	public void checkNextButtonCountAndEnabled() throws InterruptedException {
		WebElement nextButtonLocator = ldriver.findElement(By.xpath("(//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3'])[2]"));
		boolean checkNextButtonCountAndEnabled = nextButtonLocator.isEnabled();
		int clickCount = 0;
		while (checkNextButtonCountAndEnabled) {
			//if (checkNextButtonCountAndEnabled) {
			Thread.sleep(1500);
			nextButtonLocator.click();
			Thread.sleep(2000);
			checkNextButtonCountAndEnabled = nextButtonLocator.isEnabled();
			clickCount++;
		}
		System.out.println(clickCount);
	}


	public String checkLastPageText() {
		WebElement LastPageText= ldriver.findElement(By.xpath("//*[text()='No More Promocodes Left!!!']"));
		return LastPageText.getText();
	}

	public void Click_on_BackButtonOfPage () {
		WebElement Click_ON_BackButton = ldriver.findElement(By.xpath("//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3']"));
		Click_ON_BackButton.click();
	}

	@FindBy(xpath="//*[text()=\"Add Promo\"]")
	@CacheLookup
	WebElement AddPromo_Button;
	public void Click_On_PromoCode_Button() throws InterruptedException {
		Thread.sleep(1000);
		AddPromo_Button.click();

	}

	@FindBy(xpath="//*[text()=\"Create or Add Promo Code Here\"]")
	@CacheLookup
	WebElement Heading_Of_DialogBox;
	public String Check_Heading_Of_DialogBox() {
		return Heading_Of_DialogBox.getText();
	}

	public String Check_text_Of_DialogBox(int i) {
		WebElement text_Of_DialogBox = ldriver.findElement(By.xpath("(//*[@for=\"outlined-basic\" and @id=\"outlined-basic-label\"])["+i+"]"));
		return text_Of_DialogBox.getText();
	}


	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq\"])[1]")
	@CacheLookup
	WebElement PromoLabel;

	public void PromoLabelTextBox(String PromoLabelBox) {
		PromoLabel.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		PromoLabel.sendKeys(PromoLabelBox);
	}

	public void Click_PromoCode_TypeComboBox() {
		WebElement PromoCode_TypeButton = ldriver.findElement(By.xpath("(//*[@class=\"MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb\"])[1]"));
		PromoCode_TypeButton.click();
	}


	public void Select_SingleUse_PromoCode_Type() throws InterruptedException {
		try {
		WebElement SingleUse_PromoCode_Type = ldriver.findElement(By.xpath("(//*[text()='Single use promo codes'])[1]"));
		SingleUse_PromoCode_Type.click();
		}
		catch(Exception e) {
			WebElement SingleUse_PromoCode_Type = ldriver.findElement(By.xpath("(//*[text()='Single use promo codes'])[2]"));
			SingleUse_PromoCode_Type.click();
		}
	}


	public void Select_Promo_Offer_TypeComboBox() throws InterruptedException {
		WebElement PromoOffer_Type = ldriver.findElement(By.xpath("(//*[@class=\"MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb\"])[2]"));
		PromoOffer_Type.click();
		
	}

	

	public void Select_CashBackWaterDrop_PromoOffer_Type() {
		try {
		WebElement CashBackWaterDrop_PromoOffer_Type = ldriver.findElement(By.xpath("(//*[text()='cashback water drops'])[1]"));
		CashBackWaterDrop_PromoOffer_Type.click();
		}
		catch(Exception e) {
			WebElement CashBackWaterDrop_PromoOffer_Type = ldriver.findElement(By.xpath("(//*[text()='cashback water drops'])[2]"));
			CashBackWaterDrop_PromoOffer_Type.click();
		}
	}

	public void Select_PercentageDiscount_PromoOffer_Type() {
		WebElement PercentageDiscount_PromoOffer_Type = ldriver.findElement(By.xpath("//*[text()='percentage discount']"));
		PercentageDiscount_PromoOffer_Type.click();
	}

	@FindBy(xpath = "//*[@role='presentation']//div[@role='presentation']//div[3]//div[2]//div[1]//input[1]")
	@CacheLookup
	WebElement Minimum_order_Price;

	public void Minimum_order_PriceTextBox(String Minimum_order_PriceBox) {
		Minimum_order_Price.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Minimum_order_Price.sendKeys(Minimum_order_PriceBox);
	}

	@FindBy(xpath = "//*[@role='presentation']//div[4]//div[1]//div[1]//input[1]")
	@CacheLookup
	WebElement Promo_Offer_Value;

	public void Promo_Offer_ValueTextBox(String Promo_Offer_ValueBox) throws InterruptedException {
		Promo_Offer_Value.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Promo_Offer_Value.sendKeys(Promo_Offer_ValueBox);
		//Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@role='presentation']//div[4]//div[2]//div[1]//input[1]")
	@CacheLookup
	WebElement Max_Usage_Limit;

	public void Max_Usage_LimitTextBox(String Max_Usage_LimitBox) {
		Max_Usage_Limit.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Max_Usage_Limit.sendKeys(Max_Usage_LimitBox);
	}

	@FindBy(xpath = "//body/div[@role='presentation']/div[@role='presentation']/div[@role='dialog']/div[@class='MuiDialogContent-root css-1ty026z']/div[@class='MuiBox-root css-0']/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement Validity_In_Days;

	public void Validity_In_DaysTextBox(String Validity_In_DaysBox) {
		Validity_In_Days.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Validity_In_Days.sendKeys(Validity_In_DaysBox);
	}

	@FindBy(xpath = "//*[@class='MuiBox-root css-0']//div[2]//div[1]//input[1]")
	@CacheLookup
	WebElement Validity_In_Hours;

	public void Validity_In_HoursTextBox(String Validity_In_HoursBox) {
		Validity_In_Hours.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Validity_In_Hours.sendKeys(Validity_In_HoursBox);
	}

	@FindBy(xpath = "//textarea[@id='outlined-basic']")
	@CacheLookup
	WebElement promo_Disclaimer;

	public void promo_DisclaimerTextBox(String promo_DisclaimerBox) {
		promo_Disclaimer.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		promo_Disclaimer.sendKeys(promo_DisclaimerBox);
	}

	@FindBy(xpath="//*[text()=\"Add\"]")
	@CacheLookup
	WebElement Add_Button;

	public void Click_Add_Button() throws InterruptedException {
		Add_Button.click();
		//Thread.sleep(2000);
	}
	

	public void Click_On_CloseButton() throws InterruptedException {
		
		try {
		    WebElement button = ldriver.findElement(By.xpath("//*[text()='close']"));
		            button.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			
		}
		
		//Thread.sleep(2000);
	}
	
	@FindBy(xpath="(//*[@class='MuiTableRow-root css-1gqqc9w'])[1]")
	@CacheLookup
	WebElement PromoCode;
	public void Click_On_PromoCode() {
		PromoCode.click();
	}
	
	@FindBy(xpath="//*[text()='Delete']")
	@CacheLookup
	WebElement DeletePromoCode;
	public void Click_On_DeletePromoCode() throws InterruptedException {
		DeletePromoCode.click();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath="//*[text()='Agree']")
	@CacheLookup
	WebElement Agree_To_DeletePromoCode;
	public void Click_On_Agree_To_DeletePromoCode() {
		Agree_To_DeletePromoCode.click();
	}
	
	
	@FindBy(xpath="//*[text()='price discount']")
	@CacheLookup
	WebElement Price_Discount;
	public void Select_Price_Discount_PromoOffer_Type() throws InterruptedException {
		Thread.sleep(1500);
		Price_Discount.click();
	}
	
	
	@FindBy(xpath="//*[text()='Multi use promo codes']")
	@CacheLookup
	WebElement MultiUse_PromoCodes_Type;
	public void Select_MultiUse_PromoCodes_Type() {
		MultiUse_PromoCodes_Type.click();
	}
	
	
	@FindBy(xpath="//*[text()='Cumulative Coupon']")
	@CacheLookup
	WebElement Cumulative_Coupon;
	public void Select_Cumulative_Coupon() {
		Cumulative_Coupon.click();
	}
	
	@FindBy(xpath="//*[text()='Wallet Recharge Coupon']")
	@CacheLookup
	WebElement Wallet_Recharge_Coupon;
	public void Select_Wallet_Recharge_Coupon() {
		Wallet_Recharge_Coupon.click();
	}
	
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[1]")
	@CacheLookup
	WebElement Promo_Valid_Start_Date;

	public void Promo_Valid_Start_DateTextBox(String Promo_Valid_Start_DateBox) throws InterruptedException {
		Promo_Valid_Start_Date.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Promo_Valid_Start_Date.sendKeys(Promo_Valid_Start_DateBox);
		Thread.sleep(1500);
	}
	
	
	@FindBy(xpath="//*[span[contains(text(),'Validity To Date ')]]//input[@type='radio']")
	@CacheLookup
	WebElement Validity_To_Date;
	
	public void Validity_To_Date_RadioButton() {
		//Validity_To_Date.click();
		Actions action = new Actions(ldriver);
		action.moveToElement(Validity_To_Date).click().perform();
	}
	
	
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[2]")
	@CacheLookup
	WebElement Promo_Valid_End_Date;

	public void Promo_Valid_End_DateTextBox(String Promo_Valid_End_DateBox) {
		Promo_Valid_End_Date.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Promo_Valid_End_Date.sendKeys(Promo_Valid_End_DateBox);
	}
	
	
	public void Select_StartDate() {
        LocalDate systemDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = systemDate.format(formatter);
        System.out.println(formattedDate);

        WebElement datePicker = ldriver.findElement(By.xpath("(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[1]"));
        datePicker.click();
        datePicker.sendKeys(formattedDate);
        datePicker.sendKeys(Keys.RETURN);

	}
	
	public void Select_EndDate() {
		try {
            LocalDate tomorrowDate = LocalDate.now().plusDays(1);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String formattedTomorrowDate = tomorrowDate.format(formatter);
            System.out.println("Calculated tomorrow's date: " + formattedTomorrowDate);
            WebElement datePicker = ldriver.findElement(By.xpath("(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[2]")); // Change this to the actual locator
            Thread.sleep(1000);
            datePicker.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
            datePicker.sendKeys(formattedTomorrowDate);
            datePicker.sendKeys(Keys.RETURN);
            WebElement updatedDatePicker = ldriver.findElement(By.xpath("(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[2]")); // Change this to the actual locator
            String selectedDate = updatedDatePicker.getAttribute("value");
            System.out.println("Selected date from date picker: " + selectedDate);
            if (selectedDate != null && selectedDate.equals(formattedTomorrowDate)) {
                System.out.println("Tomorrow's date has been selected correctly: " + selectedDate);
            } else {
                System.out.println("Failed to select tomorrow's date. Expected: " + formattedTomorrowDate + ", but got: " + (selectedDate != null ? selectedDate : "null"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
	
	}
	@FindBy(xpath="//*[text()='No More Promocodes Left!!!']")
	@CacheLookup
	WebElement No_PromoCodes_Left;
	public boolean verify_Table_Data() {
	    boolean nextPageData = false;
	    
	        List<WebElement> elementsList = ldriver.findElements(By.xpath("(//*[@class=\"MuiTableRow-root css-1gqqc9w\"])"));
	        int sizeOfList = elementsList.size();
	        System.out.println(sizeOfList);
	        if (sizeOfList >= 1) {
	            nextPageData = true;
	        }
	        else  {
	        String noPromoCodePage = No_PromoCodes_Left.getText();
	        System.out.println(noPromoCodePage);
	        nextPageData = noPromoCodePage.trim().equalsIgnoreCase("No More Promocodes Left!!!");
	        System.out.println(nextPageData);
	    }
	    return nextPageData;
	}


public void promoCodePageOnDashBoard() {
	//WebDriverWait wait = new WebDriverWait(ldriver, 10);


	 WebDriverWait wait = new WebDriverWait(ldriver, 10);
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(promoCodeTab));
	((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", element);
}
}









//	public void checkBackButtonCountAndEnabled() throws InterruptedException {
//		WebElement backButtonLocator = ldriver.findElement(By.xpath("//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3']"));
//		boolean checkBackButtonCountAndEnabled = backButtonLocator.isEnabled();
//		int clickCount = 0;
//		while (checkBackButtonCountAndEnabled) {
//			//if (checkNextButtonCountAndEnabled) {
//				Thread.sleep(1500);
//				backButtonLocator.click();
//				System.out.println("print this");
//				Thread.sleep(2000);
//				checkBackButtonCountAndEnabled = backButtonLocator.isEnabled();
//				clickCount++;
//			}
//		System.out.println(clickCount);
//		}
//	
//	
//	@FindBy(xpath="//*[text()='Add Promo']")
//	@CacheLookup
//	WebElement tableText;
//	public String Check_TableText_AfterCameBackFromLastPage() {
//		return tableText.getText();
//		
//	}





