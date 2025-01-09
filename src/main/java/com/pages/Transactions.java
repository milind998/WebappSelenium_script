package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

import io.cucumber.datatable.DataTable;

public class Transactions extends promoCode{
	public Transactions(WebDriver rdriver) {
		super(rdriver);
		
	}
	
	mainsettingsPage Settings = new mainsettingsPage(ldriver);
	
	
	@FindBy(xpath="(//*[text()='Transactions'])[1]")
	@CacheLookup
	WebElement transaction;
	public void Click_On_Transactions() {
		transaction.click();
	}
	
	@FindBy(xpath="//*[text()=\"Transaction details\"]")
	@CacheLookup
	WebElement Heading_Text;
	public String Check_Heading_Text() {
		return Heading_Text.getText();
		
	}
	
	public void click_OnTransactionTypeCombobox() throws InterruptedException {
		 WebElement TransactionTypecombobox = ldriver.findElement(By.xpath("(//*[@class=\"MuiSelect-select MuiSelect-standard MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall css-qq14pi\"])[1]")); // replace with actual locator
		 TransactionTypecombobox.click();
		 Thread.sleep(1500);
	}

	public List <String> Check_TransactionsTypesText() {
		List <String> TransactionType = new ArrayList<>();
		for(int i=0; i<=3; i++) {
			if(i==0) {
				String First = ldriver.findElement(By.xpath("//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1km1ehz']")).getText();
				TransactionType.add(First);
				System.out.println(First);
			}
			else {
				String Others = ldriver.findElement(By.xpath("(//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])["+i+"]")).getText();
				TransactionType.add(Others);
				System.out.println(Others);
			}
		}
		return TransactionType;
}
	
	public void Select_one_TransactionType() {
		WebElement One_TransactionType = ldriver.findElement(By.xpath("//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1km1ehz']"));
		One_TransactionType.click();
	}
	
	public void Click_On_PaymentMethods_Combobox() throws InterruptedException {
		WebElement PaymentMethods_Combobox = ldriver.findElement(By.xpath("(//*[@class=\"MuiSelect-select MuiSelect-standard MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall css-qq14pi\"])[2]"));
		PaymentMethods_Combobox.click();
		Thread.sleep(2000);
	}
	
	public List <String> Check_PaymentMethodsText() {
		List <String> PaymentMethods = new ArrayList<>();
		for(int i=0; i<=3; i++) {
			if(i==0) {
				String First = ldriver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1km1ehz\"]")).getText();
				PaymentMethods.add(First);
				System.out.println(First);
			}
			else {
				String Others = ldriver.findElement(By.xpath("(//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz\"])["+i+"]")).getText();
				PaymentMethods.add(Others);
				System.out.println(Others);
			}
		}
		return PaymentMethods;
}
	
	public void Select_one_PaymentMethod() {
		WebElement One_PaymentMethod = ldriver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1km1ehz\"]"));
		One_PaymentMethod.click();
	}
	
	
	public void Click_On_PaymentStatus_Combobox() throws InterruptedException {
		WebElement PaymentStatus_Combobox = ldriver.findElement(By.xpath("(//*[@class=\"MuiSelect-select MuiSelect-standard MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall css-qq14pi\"])[3]"));
		PaymentStatus_Combobox.click();
		Thread.sleep(2000);
	}
	
	public List <String> Check_PaymentStatusText() throws InterruptedException {
		List <String> PaymentStatus = new ArrayList<>();
		for(int i=0; i<=3; i++) {
			if(i==0) {
				String First = ldriver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1km1ehz\"]")).getText();
				PaymentStatus.add(First);
				System.out.println(First);
			}
			else {
				String Others = ldriver.findElement(By.xpath("(//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz\"])["+i+"]")).getText();
				PaymentStatus.add(Others);
				System.out.println(Others);
			}
		}
		Thread.sleep(1000);
		return PaymentStatus;
}
	
	public void Select_one_PaymentStatus() {
		WebElement One_PaymentStatus = ldriver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1km1ehz\"]"));
		One_PaymentStatus.click();
	}
	
	
	public void Click_On_SearchTypes_Combobox() throws InterruptedException {
		WebElement SearchTypes_Combobox = ldriver.findElement(By.xpath("//*[text()='Phone/Email']"));
		SearchTypes_Combobox.click();
		Thread.sleep(2000);
	}
	
	public List <String> Check_SearchTypesText() {
		List <String> SearchTypes = new ArrayList<>();
		for(int i=0; i<=2; i++) {
			if(i==0) {
				String First = ldriver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1km1ehz\"]")).getText();
				SearchTypes.add(First);
				System.out.println(First);
			}
			else {
				String Others = ldriver.findElement(By.xpath("(//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz\"])["+i+"]")).getText();
				SearchTypes.add(Others);
				System.out.println(Others);
			}
		}
		return SearchTypes;
}
	
	public void Select_one_SearchTypes() {
		WebElement One_SearchTypes = ldriver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1km1ehz\"]"));
		One_SearchTypes.click();
	}
	
	
	public void Select_WaterDrops_TransactionType() {
		WebElement WaterDrops_TransactionType = ldriver.findElement(By.xpath("(//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz\"])[1]"));
		WaterDrops_TransactionType.click();
	}
	
	public void Select_PaymentStatus_Box() throws InterruptedException {
		WebElement PaymentStatus_Box = ldriver.findElement(By.xpath("//div[contains(text(),'None')]"));
		PaymentStatus_Box.click();
		Thread.sleep(2000);
		}
	
	
	public List<String> Check_PaymentStatus_Of_WaterDrops() {
		List <String> PaymentStatus_Of_WaterDrops = new ArrayList<>();
		for(int i=0; i<=5; i++) {
			if(i==0) {
				String First = ldriver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1km1ehz\"]")).getText();
				PaymentStatus_Of_WaterDrops.add(First);
				System.out.println(First);
			}
			else {
				String Others = ldriver.findElement(By.xpath("(//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz\"])["+i+"]")).getText();
				PaymentStatus_Of_WaterDrops.add(Others);
				System.out.println(Others);
			}
		}
		return PaymentStatus_Of_WaterDrops;
	}
	
	public void selectOnePaymentStatusOF_Waterdrops() {
		WebElement OnePaymentStatusOF_Waterdrops = ldriver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1km1ehz\"]"));
		OnePaymentStatusOF_Waterdrops.click();
	}
	
	
	public void Select_Deposit_TransactionType() {
		WebElement Deposit_TransactionType = ldriver.findElement(By.xpath("//li[normalize-space()='DEPOSIT']"));
		Deposit_TransactionType.click();
	}
	
	public void Select_Deposit_PaymentStatus() throws InterruptedException {
		WebElement PaymentStatus_Box = ldriver.findElement(By.xpath("//div[contains(text(),'None')]"));
		PaymentStatus_Box.click();
		Thread.sleep(1500);
	}
	
	
	public List<String> Check_PaymentStatus_Of_Deposits() {
		List <String> PaymentStatus_Of_Deposits = new ArrayList<>();
		for(int i=0; i<=2; i++) {
			if(i==0) {
				String First = ldriver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1km1ehz\"]")).getText();
				PaymentStatus_Of_Deposits.add(First);
				System.out.println(First);
			}
			else {
				String Others = ldriver.findElement(By.xpath("(//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz\"])["+i+"]")).getText();
				PaymentStatus_Of_Deposits.add(Others);
				System.out.println(Others);
			}
		}
		return PaymentStatus_Of_Deposits;
	}
	
	
	public void selectOnePaymentStatusOF_Deposits() {
		WebElement OnePaymentStatusOF_Deposits = ldriver.findElement(By.xpath("(//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1km1ehz\"])"));
		OnePaymentStatusOF_Deposits.click();
	}
	
	
	
	public void Select_DepositsCombobox() throws InterruptedException {
		WebElement DepositsCombobox = ldriver.findElement(By.xpath("(//*[@class=\"MuiSelect-select MuiSelect-standard MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall css-qq14pi\"])[3]"));
		DepositsCombobox.click();
		Thread.sleep(2000);
	}
	
	
//	public void SelectDeposit() {
//		WebElement Select_Deposits = ldriver.findElement(By.xpath("//li[normalize-space()='DEPOSIT']"));
//		Select_Deposits.click();
//	}
	
	public List<String> Check_Deposits() {
		List <String> Deposits = new ArrayList<>();
		for(int i=0; i<=1; i++) {
			if(i==0) {
				String First = ldriver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1km1ehz\"]")).getText();
				Deposits.add(First);
				System.out.println(First);
			}
			else {
				String Others = ldriver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz\"]")).getText();
				Deposits.add(Others);
				System.out.println(Others);
			}
		}
		return Deposits;
	}
	
	
	public void select_DepositsType() {
		WebElement OneDeposits = ldriver.findElement(By.xpath("//li[normalize-space()='UN-DEPOSITED']"));
		OneDeposits.click();
	}
	
	
	public String Check_TransactionTable_Text(int i) {
		WebElement TransactionTable_Text = ldriver.findElement(By.xpath("(//*[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-stickyHeader MuiTableCell-sizeMedium css-18t7jp7'])["+i+"]"));
		return TransactionTable_Text.getText();
	}
	
	
	public void Click_ON_UserNumber(String number) {
		WebElement Click_UserNumber = ldriver.findElement(By.xpath("(//*[@class=\"MuiInputBase-input MuiInput-input css-mnn31\"])[3]"));
		Click_UserNumber.click();
		Click_UserNumber.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Click_UserNumber.sendKeys(number);
		
	}
	
	
	@FindBy(xpath="//*[text()=\"Submit\"]")
	@CacheLookup
	WebElement SubmitButton;
	public void Transaction_SubmitButton() throws InterruptedException {
		SubmitButton.click();
		//Thread.sleep(3000);
	}
	
	
	public String Check_Data_OR_ErrorMessageAfter_SearchBY_Number() {
            WebElement numberElement = ldriver.findElement(By.xpath("(//*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-sizeMedium css-q34dxg'])"));
            return numberElement.getText();
            	
	}
	
	
	public void Wait_For_LoadingB() {
		By elementLocator = By.xpath("//*[@class=\"MuiTypography-root MuiTypography-body1 css-1g45d4y\"]");

        // Initialize WebDriverWait with a timeout (e.g., 10 seconds)
        WebDriverWait wait = new WebDriverWait(ldriver, 10);

        // Wait until the element is no longer visible
        wait.until(ExpectedConditions.invisibilityOfElementLocated(elementLocator));
	}
	
	
	public  void Select_OrdersType() {
		WebElement OrdersType = ldriver.findElement(By.xpath("(//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[1]"));
		OrdersType.click();
	}
	
	
	@FindBy(xpath="(//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[1]")
	@CacheLookup
	WebElement OrderID_SearchType;
	public void Select_OrderID_SearchType() {
		OrderID_SearchType.click();
	}
	
	
	@FindBy(xpath="(//*[@class=\"MuiInputBase-input MuiInput-input css-mnn31\"])[3]")
	@CacheLookup
	WebElement Click_UserNumber;
	public void Enter_OrderID() throws InterruptedException {
		Thread.sleep(1000);
		Click_UserNumber.click();
		Click_UserNumber.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Click_UserNumber.sendKeys("BTORD-38634");
	}
	
	
	
	@FindBy(xpath="//*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-sizeMedium css-1xhpt7o']")
	@CacheLookup
	WebElement Verified_OrderID;
	public String Check_Verified_OrderID () {
		return Verified_OrderID.getText();
	}
	
	
	@FindBy(xpath="(//*[@class=\"MuiInputBase-input MuiInput-input css-mnn31\"])[1]")
	@CacheLookup
	WebElement Select_StartDate;
	public void Select_StartDate_EndDate() throws InterruptedException {
		
		Select_StartDate.sendKeys("06082024");
		Thread.sleep(2000);
		WebElement Select_EndDate = ldriver.findElement(By.xpath("(//*[@class=\"MuiInputBase-input MuiInput-input css-mnn31\"])[2]"));
		Select_EndDate.sendKeys("06082024");
		Thread.sleep(2000);
	}
	
	@FindBy(xpath="//*[text()='WATER-DROPS']")
	@CacheLookup
	WebElement WaterDrops_TransactionType;
	public void Waterdrops_transactionType () {
		WaterDrops_TransactionType.click();
	}
	
	public String Check_WaterDrops_TransactionTable_Text(int i) {
		WebElement WaterDrops_TransactionTable_Text = ldriver.findElement(By.xpath("(//*[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-stickyHeader MuiTableCell-sizeMedium css-18t7jp7'])["+i+"]"));
		return WaterDrops_TransactionTable_Text.getText();
		
	}
	
	
	@FindBy (xpath="//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-6uhzee\"]")
	@CacheLookup
	WebElement Close_Button;
	public void Click_ON_Close_Button() {
		Close_Button.click();
	}
	
	
	public String Check_Deposit_TransactionTable_Text(int i) {
		WebElement Deposit_TransactionTable_Text = ldriver.findElement(By.xpath("(//*[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-stickyHeader MuiTableCell-sizeMedium css-18t7jp7'])["+i+"]"));
		return Deposit_TransactionTable_Text.getText();
	}
	
	
	@FindBy(xpath="(//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz\"])[2]")
	@CacheLookup
	WebElement RazorpayMethod;
	public void Select_RazorpayMethod () {
		RazorpayMethod.click();
	}
	
	
	@FindBy(xpath="//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz\"]")
	@CacheLookup
	WebElement Success_PaymentStatus;
	public void Select_Success_PaymentStatus() {
		Success_PaymentStatus.click();
	}
	
	
	
	public boolean paymentStatusOnCard(String Status) throws InterruptedException {
		boolean paymentStatus=true;
		Thread.sleep(1000);
		List<WebElement> elementsList = ldriver
				.findElements(By.xpath("//*[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-sizeMedium css-q34dxg\"]"));
		int sizeOfList = elementsList.size();
		System.out.println(sizeOfList);
		
		if(sizeOfList>=1) {
		try {
			
 
			// Loop through the elements starting from index 4 and increment by 5
			for (int i = 7; i <= sizeOfList; i+=10) {
				String status = ldriver
						.findElement(By.xpath(
								"(//*[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-sizeMedium css-q34dxg\"])["+i+"]"))
						.getText();
				// Add the payment string to the list
				System.out.println(status);
				if(status.equalsIgnoreCase(Status)) {
					paymentStatus=true;
				}else {
					paymentStatus=false;
					break;
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		else {
			String noOrdersPage = Settings.toastMessage();
			System.out.println("noTransactionPage :-" + noOrdersPage);
			//closeMessageIon.click();
			if(noOrdersPage.equalsIgnoreCase("No Data Found!")) {
				paymentStatus=true;
			}else {
				paymentStatus=false;
			}
		}
 
		return paymentStatus;
	}
	
	@FindBy(xpath="(//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz\"])[3]")
	@CacheLookup
	WebElement Failed_PaymentStatus;
	public void Select_Failed_PaymentStatus() {
		Failed_PaymentStatus.click();
	}
	
	@FindBy(xpath="(//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz\"])[3]")
	@CacheLookup
	WebElement Refund_PaymentStatus;
	public void Select_Refund_PaymentStatus() {
		Refund_PaymentStatus.click();
	}
	
	

	@FindBy(xpath="//*[text()=\"Submit\"]")
	@CacheLookup
	WebElement SubmitButtons;
	public void Transaction_SubmitButtons() throws InterruptedException {
		SubmitButtons.click();
		//Thread.sleep(1000);
	}
	
	
	public void SelectAndSend_TransactionID() {
		WebElement Send_TransactionID = ldriver.findElement(By.xpath("(//*[@class=\"MuiInputBase-input MuiInput-input css-mnn31\"])[3]"));
		Send_TransactionID.sendKeys("pay_OhbqiAFNMCXblW");
		
	}
	
	
	public String Verify_TransactionID() {
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollBy(0,250)", "");
		WebElement TransactionID = ldriver.findElement(By.xpath("(//*[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-sizeMedium css-q34dxg\"])[2]"));
		return TransactionID.getText();
	}
	
	
	@FindBy(xpath="(//*[@class=\"MuiSelect-select MuiSelect-standard MuiInputBase-input MuiInput-input css-1cccqvr\"])[1]")
	@CacheLookup
	WebElement SearchTypeTOSelect_Transaction;
	public void Select_Transaction() {
		SearchTypeTOSelect_Transaction.click();
		WebElement TransactionID = ldriver.findElement(By.xpath("(//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz\"])[2]"));
		TransactionID.click();
		
	}
	
}

	



