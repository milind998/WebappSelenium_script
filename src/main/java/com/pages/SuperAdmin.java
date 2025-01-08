package com.pages;

import java.time.Duration;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SuperAdmin extends Transactions{
	public SuperAdmin(WebDriver rdriver) {
		super(rdriver);

}

	
	@FindBy(xpath="//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//p[@class='MuiTypography-root MuiTypography-body1 css-12zoz4r'][normalize-space()='Super Admin']")
	@CacheLookup
	WebElement SuperAdminTab;
	public void Click_ON_SuperAdminTab() {
		SuperAdminTab.click();
	}
	
	@FindBy(xpath="(//*[text()=\"Super Admin\"])[1]")
	@CacheLookup
	WebElement Heading_SuperAdmin;
	public String Check_Heading_SuperAdmin() {
		return Heading_SuperAdmin.getText();
	}
	
	@FindBy(xpath="(//*[text()='Select role to add'])[1]")
	@CacheLookup
	WebElement Role_To_Add;
	public String Select_Role_To_Add() {
		return Role_To_Add.getText();
	}
	
	@FindBy(xpath="(//*[text()='Full Name'])[1]")
	@CacheLookup
	WebElement Full_Name;
	public String Select_Full_Name() {
		return Full_Name.getText();
	}
	
	@FindBy(xpath="(//*[text()='Phone'])[1]")
	@CacheLookup
	WebElement Phone;
	public String Select_Phone() {
		return Phone.getText();
	}
	
	@FindBy(xpath="(//*[text()='Email Address'])[1]")
	@CacheLookup
	WebElement Email_Address;
	public String Select_Email_Address() {
		return Email_Address.getText();
	}
	
	@FindBy(xpath="(//*[text()='Password'])[1]")
	@CacheLookup
	WebElement Password;
	public String Select_Password() {
		return Password.getText();
	}
	
	
	@FindBy(xpath="//*[@class=\"MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf\"]")
	@CacheLookup
	WebElement AddRoleCombobox;
	public void Click_On_AddRoleCombobox() {
		 AddRoleCombobox.click();
	}
	
	
//	public void Select_AllRole_ToAdd() throws InterruptedException {
//		 List<String> xpaths = new ArrayList<>();
//		 AddRoleCombobox.click();
//		 
//	        xpaths.add("(//*[text()='BW-SUPERADMIN'])[2]");
//	        xpaths.add("(//*[text()='BW-ADMIN'])[2]");
//	        xpaths.add("(//*[text()='BW-WFSADMIN'])[2]");
//	        xpaths.add("(//*[text()='BW-TEST'])[2]");
//	        xpaths.add("(//*[text()='BW-ASADMIN'])[2]");
//	        xpaths.add("(//*[text()='BW-DISTRIBUTOR'])[2]");
//	        xpaths.add("(//*[text()='BW-SALESHEAD'])[2]");
//	        xpaths.add("(//*[text()='BW-SALES'])[2]");
//	        xpaths.add("(//*[text()='BW-CSHEAD'])[2]");
//	        xpaths.add("(//*[text()='BW-CS'])[2]");
//	        xpaths.add("(//*[text()='BW-CUSTOMEREXE'])[2]");
//	        xpaths.add("(//*[text()='BW-CUSTOMEREXECUTIVE'])[2]");
//	        xpaths.add("(//*[text()='BW-CSLEAD'])[2]");
//	        xpaths.add("(//*[text()='BW-OPSHEAD'])[2]");
//	        xpaths.add("(//*[text()='BW-OPS'])[2]");
//	        xpaths.add("(//*[text()='BW-INVENTORY ML'])[2]");
//	        xpaths.add("(//*[text()='BW-FINANCEHEAD'])[2]");
//	        xpaths.add("(//*[text()='BW-FINANCE'])[2]");
//	        xpaths.add("(//*[text()='BW-QAHEAD'])[2]");
//	        xpaths.add("(//*[text()='BW-QA'])[2]");
//	        for (String xpath : xpaths) {
//	            try {
//	            	//Thread.sleep(1500);
//	               WebElement element = ldriver.findElement(By.xpath(xpath));
//	                element.click();
//	            } 
//	            catch (Exception e) {
//	            }
//	        }
//	}

	
	@FindBy(xpath="//li[normalize-space()='BW-SUPERADMIN']")
	@CacheLookup
	WebElement SuperAdmin;
	public void Select_SuperAdminButton() {
		SuperAdmin.click();
	}
	
	
	@FindBy(xpath = "//*[@id=\"fullname\"]")
	@CacheLookup
	WebElement Enter_FullName;

	public void TextBox_FullName(String FullNameBox) {
		Enter_FullName.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Enter_FullName.sendKeys(FullNameBox);
	}
	
	@FindBy(xpath = "//*[@id=\"phone\"]")
	@CacheLookup
	WebElement Enter_Phone;

	public void TextBox_Phone(String PhoneBox) {
		Enter_Phone.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Enter_Phone.sendKeys(PhoneBox);
	}
	
	
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	@CacheLookup
	WebElement Enter_EmailAddress;

	public void TextBox_EmailAddress(String EmailAddressBox) {
		Enter_EmailAddress.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Enter_EmailAddress.sendKeys(EmailAddressBox);
	}
	
	
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	@CacheLookup
	WebElement Enter_Password;

	public void TextBox_Password(String PasswordBox) {
		Enter_Password.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Enter_Password.sendKeys(PasswordBox);
	}
	
	
	@FindBy(xpath = "//*[text()='Add user']")
	@CacheLookup
	WebElement Add_UserButton;
	public void Click_ON_Add_UserButton() {
		Add_UserButton.click();
		
	}
	
	
	@FindBy(xpath="//li[normalize-space()='BW-ADMIN']")
	@CacheLookup
	WebElement Admin;
	public void Select_AdminButton() {
		//Admin.click();
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", Admin);

	}
	
	
	@FindBy(xpath="//li[normalize-space()='BW-WFSADMIN']")
	@CacheLookup
	WebElement WFSAdmin;
	public void Select_WFSAdminButton() {
		//WFSAdmin.click();
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", WFSAdmin);

	}
	
	@FindBy(xpath="//li[normalize-space()='BW-DISTRIBUTOR']")
	@CacheLookup
	WebElement Distributor;
	public void Select_Distributor() {
		//Distributor.click();
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", Distributor);

	}
	
	
	@FindBy(xpath="//li[normalize-space()='BW-DELIVERYAGENT']")
	@CacheLookup
	WebElement DeliveryAgent;
	public void Select_DeliveryAgent() {
		//DeliveryAgent.click();
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", DeliveryAgent);

	}
	

	@FindBy(xpath = "//*[@id=\"supplierphone\"]")
	@CacheLookup
	WebElement Enter_SupplierPhone;

	public void TextBox_SupplierPhone(String SupplierPhoneBox) {
		Enter_SupplierPhone.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Enter_SupplierPhone.sendKeys(SupplierPhoneBox);
	}
	
	
	@FindBy(xpath="//li[normalize-space()='BW-CONSUMER']")
	@CacheLookup
	WebElement Consumer;
	public void Select_Consumer() {
		//Consumer.click();
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", Consumer);

	}
	
	
	@FindBy(xpath = "//*[@autocomplete=\"Referral Code\"]")
	@CacheLookup
	WebElement Enter_ReferralCode;

	public void TextBox_ReferralCode(String ReferralCodeBox) {
		Enter_ReferralCode.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Enter_ReferralCode.sendKeys(ReferralCodeBox);
	}
	
	
	@FindBy(xpath="//li[normalize-space()='BW-SALESHEAD']")
	@CacheLookup
	WebElement SalesHead;
	public void Select_SalesHead() throws InterruptedException {
//		Thread.sleep(500);
//		SalesHead.click();
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", SalesHead);

	}
	
	
	@FindBy(xpath="//li[normalize-space()='BW-SALES']")
	@CacheLookup
	WebElement Sales;
	public void Select_Sales() throws InterruptedException {
//		Thread.sleep(500);
//		Sales.click();
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", Sales);

	}
	
	@FindBy(xpath="//li[normalize-space()='BW-CSHEAD']")
	@CacheLookup
	WebElement CSHEAD;
	public void Select_CSHEAD() {
		//Thread.sleep(500);
		//CSHEAD.click();
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", CSHEAD);

	}
	
	
	@FindBy(xpath="//li[normalize-space()='BW-CS']")
	@CacheLookup
	WebElement CS;
	public void Select_CS(){
		//CS.click();
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", CS);

	}
	
	
	public void Select_CSLead() throws InterruptedException {
		WebElement CSLead = ldriver.findElement(By.xpath("//li[normalize-space()='BW-CSLEAD']"));
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", CSLead);
	}

	

	public void Select_OPSHEAD() {
		WebElement OPSHEAD = ldriver.findElement(By.xpath("//li[normalize-space()='BW-OPSHEAD']"));
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", OPSHEAD);
	}
	
	
	
	public void Select_OPS() {
		WebElement OPS = ldriver.findElement(By.xpath("//li[normalize-space()='BW-OPS']"));
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", OPS);
	}
	
	
	public void Select_InventoryML() {
		WebElement InventoryML = ldriver.findElement(By.xpath("//li[normalize-space()='BW-INVENTORY ML']"));
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", InventoryML);
	}
	
	
	public void Select_FINANCEHEAD() {
		WebElement FINANCEHEAD = ldriver.findElement(By.xpath("//li[normalize-space()='BW-FINANCEHEAD']"));
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", FINANCEHEAD);
	}
	
	
	public void Select_FINANCE() {
		WebElement FINANCE = ldriver.findElement(By.xpath("//li[normalize-space()='BW-FINANCE']"));
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", FINANCE);
	}
	
	
	public void Select_QAHEAD() {
		WebElement QAHEAD = ldriver.findElement(By.xpath("//li[normalize-space()='BW-QAHEAD']"));
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", QAHEAD);
	}
	
	
	@FindBy(xpath="//li[normalize-space()='BW-QA']")
	@CacheLookup
	WebElement QA;
	public void Select_QA() throws InterruptedException {
		Thread.sleep(500);
		//WebElement QA = ldriver.findElement(By.xpath("//li[normalize-space()='BW-QA']"));
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", QA);
	}
	
	
	
	@FindBy(xpath="//*[text()='Roles List']")
	@CacheLookup
	WebElement Role_List;
	public String Check_Role_List() {
		return Role_List.getText();
	}
	

	@FindBy(xpath="//*[text()='Active Users']")
	@CacheLookup
	WebElement Active_Users;
	public String Check_Active_Users() {
		return Active_Users.getText();
	}
	
	
	@FindBy(xpath="//*[text()='Active Users']")
	@CacheLookup
	WebElement ClickActive_Users;
	public void ClickON_Active_Users() {
		 ClickActive_Users.click();
	}
	
	
	@FindBy(xpath="(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2\"])[1]")
	@CacheLookup
	WebElement Search_NameText;
	public void CheckSearch_NameText() throws InterruptedException {
		Search_NameText.click();
		//Thread.sleep(2000);
		Search_NameText.sendKeys("Milind");
		
	}
	
	
//	@FindBy(xpath="//*[@class=\"MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb\"]")
//	@CacheLookup
//	WebElement ClickON_RoleButton;
	public void SelectRoleTOAdd() {
		//ClickON_RoleButton.click();
		WebElement Select_Role = ldriver.findElement(By.xpath("//*[text()='BW-ADMIN']"));
		Select_Role.click();
	}
	
	
	
	@FindBy(xpath="(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2\"])[2]")
	@CacheLookup
	WebElement Search_EmailText;
	public void CheckSearch_EmailText() throws InterruptedException {
		Search_EmailText.click();
		Search_EmailText.sendKeys("1234");
		//Thread.sleep(5000);
	}
	
	public List <String> verify_TextBox_Of_ActiveUsers() {
//		JavascriptExecutor js = (JavascriptExecutor) ldriver;
//		js.executeScript("window.scrollBy(0,250)", "");
//		WebElement TextBoxes_Of_ActiveUsers = ldriver.findElement(By.xpath("(//*[@class=\"MuiFormLabel-root MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-shrink MuiInputLabel-sizeMedium MuiInputLabel-outlined MuiFormLabel-colorPrimary MuiFormLabel-filled MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-shrink MuiInputLabel-sizeMedium MuiInputLabel-outlined css-1ald77x\"])["+i+"]"));
//		return TextBoxes_Of_ActiveUsers.getText();
		
		List <String> ActiveUsersText = new ArrayList<>();
		for(int i=1; i<=3; i++) {
			String First = ldriver.findElement(By.xpath("(//*[@class=\"MuiFormLabel-root MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-shrink MuiInputLabel-sizeMedium MuiInputLabel-outlined MuiFormLabel-colorPrimary MuiFormLabel-filled MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-shrink MuiInputLabel-sizeMedium MuiInputLabel-outlined css-1ald77x\"])["+i+"]")).getText();
			ActiveUsersText.add(First);
		}
		return ActiveUsersText;
	}
	
	
	public String Check_TextOfTable_ActiveUsers(int i) {
		WebElement TextOfTable_ActiveUsers = ldriver.findElement(By.xpath("(//*[@class=\"MuiTableCell-root MuiTableCell-head MuiTableCell-alignCenter MuiTableCell-sizeSmall css-c1c1ku\"])["+i+"]"));
		return TextOfTable_ActiveUsers.getText();
	}
	
	@FindBy(xpath="//*[@class=\"MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb\"]")
	@CacheLookup
	WebElement ClickON_RoleButton;
	public void Click_On_Role_Button() {
		ClickON_RoleButton.click();
	}
	
	
	public void Select_Role(String string) throws InterruptedException {
		String exactXPath = "(//*[text()='" + string + "'])[1]";
		System.out.println(exactXPath);	    
	    WebElement roleElement = ldriver.findElement(By.xpath(exactXPath));	    
	    WebDriverWait wait = new WebDriverWait(ldriver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(roleElement)); 
	    ((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", roleElement);
	}	
	
	public boolean RoleOnTable(String Status) throws InterruptedException {
		boolean userRole=true;
		Thread.sleep(1000);
		List<WebElement> elementsList = ldriver
				.findElements(By.xpath("//*[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter MuiTableCell-sizeSmall css-1r7v2u3\"]"));
		int sizeOfList = elementsList.size();
		System.out.println(sizeOfList);
		
		if(sizeOfList>=1) {
		try {
			for (int i = 4; i <= sizeOfList; i+=5) {
				String status = ldriver
						.findElement(By.xpath(
								"(//*[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter MuiTableCell-sizeSmall css-1r7v2u3\"])["+i+"]"))
						.getText();
				// Add the payment string to the list
				System.out.println(status);
				if(status.equalsIgnoreCase(Status)) {
					userRole=true;
				}else {
					userRole=false;
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
			if(noOrdersPage.equalsIgnoreCase("No More Role Found!")) {
				userRole=true;
			}else {
				userRole=false;
			}
		}
 
		return userRole;
	}
	
	@FindBy(xpath="(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2\"])[1]")
	@CacheLookup
	WebElement Search_By_Name;
	public void Select_Search_By_Name() {
		Search_By_Name.click();
	}
	
	
	@FindBy(xpath="(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2\"])[1]")
	@CacheLookup
	WebElement Search_Name;
	public void Send_Search_Name() {
		Search_Name.sendKeys("Milind Automation SA");
	}
	
	@FindBy(xpath="(//*[@fill=\"currentColor\"])[5]")
	@CacheLookup
	WebElement Search_Button;
	public void Click_Search_Button() {
		Search_Button.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollBy(0,250)", "");
	}
	
	public String Verify_SearchedName() {
		String expectedText = "Milind Automation SA";
        WebElement element = ldriver.findElement(By.xpath("(//*[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter MuiTableCell-sizeSmall css-1r7v2u3\"])[1]"));
        String actualText = element.getText();
        if (expectedText.equals(actualText)) {
            System.out.println("The text matches!");
        } else {
            System.out.println("The text does not match.");
            System.out.println("Expected: " + expectedText);
            System.out.println("Actual: " + actualText);
        }
		return actualText;
	}
	
	
	
	@FindBy(xpath="(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2\"])[2]")
	@CacheLookup
	WebElement Search_By_EmailID;
	public void Select_Search_By_EmailID() {
		Search_By_EmailID.click();
	}
	
	
	@FindBy(xpath="(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2\"])[2]")
	@CacheLookup
	WebElement Search_EmailID;
	public void Send_Search_EmailID() {
		Search_EmailID.sendKeys("milind8390099135@bookwater.com");
	}
	
	@FindBy(xpath="(//*[@fill=\"currentColor\"])[6]")
	@CacheLookup
	WebElement Search_ButtonEmail;
	public void Click_Search_ButtonEmail() {
		Search_ButtonEmail.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollBy(0,250)", "");
	}
	
	public String Verify_SearchedMailID() {
		String expectedText = "milind031@bookwater.com";
        WebElement element = ldriver.findElement(By.xpath("(//*[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter MuiTableCell-sizeSmall css-1r7v2u3\"])[3]"));
        String actualText = element.getText();
        if (expectedText.equals(actualText)) {
            System.out.println("The text matches!");
        } else {
            System.out.println("The text does not match.");
            System.out.println("Expected: " + expectedText);
            System.out.println("Actual: " + actualText);
        }
		return actualText;
	}
	
	
//	@FindBy(xpath="(//*[@class=\\\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2\\\"])[1]")
//	@CacheLookup
//	WebElement UserName;
//	public void Enter_UserName(String Name) {
//		UserName.click();
//		UserName.sendKeys(Name);
//	}
	
	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2\"])[1]")
	@CacheLookup
	WebElement UserName;

	public void Enter_UserName(String Name) {
		//UserName.click();
		UserName.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		UserName.sendKeys(Name);
	}
	
	
	@FindBy(xpath="(//*[text()='view Details'])[1]")
	@CacheLookup
	WebElement View_Details;
	public void Click_ON_View_Details() throws InterruptedException {
		View_Details.click();
		Thread.sleep(1000);
	}
	
	
	public void Delete_User() throws InterruptedException {
		WebElement Delete_Button = ldriver.findElement(By.xpath("//*[text()='Delete User']"));
		Delete_Button.click();
		Thread.sleep(2000);

	}
	
	public void Confirm_DeleteUser() {
		WebElement Confirm_DeleteUserButton = ldriver.findElement(By.xpath("//*[text()='Delete']"));
		Confirm_DeleteUserButton.click();
	}
	
	}
	
