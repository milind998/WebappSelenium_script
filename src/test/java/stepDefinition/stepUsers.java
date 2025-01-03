package stepDefinition;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.Loginpage;
import com.pages.UsersPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class stepUsers {

	public static UsersPage user = new UsersPage(Loginpage.ldriver);
	private String downloadPath =  "C:\\Users\\Noor Mohamed A\\Downloads";
	//   System.getProperty("user.dir") + "\downloads";

	@Given("Navigate to users page")
	public void navigate_to_users_page() {
		user.userModule();
	}

	@When("Enter the invlaid phone number {string}")
	public void enter_the_invlaid_phone_number(String string) {
		user.enterUsernumber(string );
	}
	@When("Click on searchicon")
	public void click_on_searchicon() throws InterruptedException {
		user.clickSearchicon();
		//  user.spinnerwaits();
		Thread.sleep(3000);
	}
	@When("Click on Close button in dialog box")
	public void click_on_close_button_in_dialog_box() {
		//	user.spinnerwaits();
		user.clickClose();

	}

	@When("Enter the invlaid Name {string}")
	public void enter_the_invlaid_name(String string) {
		user.enterUsernumber(string );
	}

	@When("Enter the valid Name\\/phone {string}")
	public void enter_the_valid_name_phone(String string) {
		user.enterUsernumber(string );
	}

	@When("Validate the users")
	public void validate_the_users() {
		//  assertion for name
		WebDriverWait wait = new WebDriverWait(Loginpage.ldriver, 3);
		WebElement userNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[1]")));
		String actualUserName = userNameElement.getText();
		String expectedUserName = "Noor mohamed";

		//  assertion for phone number           
		WebElement userPhoneElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[2]")));
		String actualUserPhone = userPhoneElement.getText();
		String expectedUserPhone = "8248991405";

		//  assertion for mail
		WebElement usermailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[3]")));
		String actualUsermail= usermailElement.getText();
		String expectedUsermail = "noormohamed289055@gmail.com";


		if (actualUserName==expectedUserName) {
			Assert.assertEquals(actualUserName, expectedUserName, "User name does not match!");
		} else if (actualUserPhone ==expectedUserPhone) {
			Assert.assertEquals(actualUserPhone, expectedUserPhone, "User phone number does not match!");
		} else if (actualUsermail==expectedUsermail) {
			Assert.assertEquals(actualUsermail, expectedUsermail, "User mail does not match!");
		} 
	}


	/*users profile */
	@When("Enter the invalid Name {string}")
	public void enter_the_invalid_name_phone(String string) {
		user.enterUsername(string);
	}


	@When("Click on updateuser")
	public void click_on_updateuser() {
		user.clickUpdateprofile();
		user.waittoast();
	}


	@When("Enter the invalid phone {string}")
	public void enter_the_invalid_phone(String string) {
		user.enterUserphone(string);
	}


	@When("Enter the invalid mail {string}")
	public void enter_the_invalid_mail(String string) {
		user.enterUsermail(string);
	}


	@When("Enter the valid name {string}, phone {string},and  email {string}")
	public void enter_the_valid_name_phone_email_and(String name, String phone, String mail) {
		user.enterUsername(name);
		user.enterUserphone(phone);
		user.enterUsermail(mail);

	}

	@When("click on the user status toggle")
	public void click_on_the_user_status_toggle() {
		user.toggleUserstatus();
		//  user.waittoast();
	}

	@When("click on the user influencer toggle")
	public void click_on_the_user_influencer_toggle() {
		user.toggleUserinfluencer();
		//	user.waittoast();
	}
	@When("Click on make influencer button")
	public void click_on_make_influencer_button() throws InterruptedException {
		user.clickUserinfluencer();
		// user.waittoast();
		Thread.sleep(2000);
		user.waittoast();
	}
	@When("Click on download referral code")
	public void click_on_download_referral_code() {

		user.clickdDownloadUserReferalid();

		// validate the file download
		String expectedFileName = "saM_8248991405.png";

		// Create a File object for the downloaded file
		File downloadedFile = new File(downloadPath + "/" + expectedFileName);
		System.out.println("downloadpath"+downloadPath);
		System.out.println("downloadfile name "+downloadedFile.getName());
		// Assert that the file exists
		if (downloadedFile.exists()) {
			System.out.println("Referal code file downloaded successfully.");
		} else {
			throw new AssertionError("File not downloaded.");
		}
	}

	@When("click on b2b toggle button")
	public void click_on_b2b_toggle_button() {
		user.toggleb2buser();
	}
	@When("Enter the bill name")
	public void enter_the_bill_name() {
		user.enterUserbillname("sam");
	}
	@When("Enter the gst number")
	public void enter_the_gst_number() {
		user.enterUsergst("27AAPFU0959F1ZB");
	}
	@When("Click on notification toggle")
	public void click_on_notification_toggle() {
		user.toggleNotifyuser();
	}
	@When("Click on postpaid mail toggle")
	public void click_on_postpaid_mail_toggle() {
		user.togglepostpaidmail();
	}
	@When("Click on update button")
	public void click_on_update_button() {
		user.clickUpdateuser();
	}

	/*Request redeem functionality*/
	//redeem btn
	@When("click on Request to Redeem button")
	public void click_on_request_to_redeem_button() throws InterruptedException {
		user.clickrequestredeem();
		Thread.sleep(2000);
	}


	//bank
	@When("Select the Bank Account number")
	public void select_the_bank_account_number() {
		user.selectBank();
	}

	//ifsc,bank,pan
	@When("Select the ifsc {string}, bank {string}, pan {string},bank {string}, acc {string}, reenteracc {string} and drops {string}")
	public void select_the_ifsc_bank_pan_bank_acc_reenteracc_and_drops(String ifsc, String bank, String pan, String bank2, String acc1, String accc2, String drops) {
		user.selectifsccode(ifsc);
		user.selectBankname(bank);
		user.selectPancard(pan);
		user.selectBankname2(bank2);
		user.selectAccountno1(acc1);
		user.selectAccountno2(accc2);
		user.enterWaterdropnumber(drops);
	}

	//verify
	@When("Click on verify button in request to redeem dialog box")
	public void click_on_verify_button_in_request_to_redeem_dialog_box() throws InterruptedException {
		user.clickVerify();
		Thread.sleep(2000);
	}

	//cancel btn
	@When("Click on cancel button in request to redeem dialog box")
	public void click_on_cancel_button_in_request_to_redeem_dialog_box() {
		user.clickCancelRequest();

	}
	/*check this since error/bug in the feature after clicking cancel btn */
	//request btn
	@When("Click on send request button in request to redeem dialog box")
	public void click_on_send_request_button_in_request_to_redeem_dialog_box() throws InterruptedException {
		user.clickSendRequest();
		// user.waittoast();
		Thread.sleep(3000);

	}
/*********************************** custom address**************************************************/

	/*********************  User Custom amount ************************/

	@When("click on product button")
	public void click_on_product_button() throws InterruptedException {
		Thread.sleep(3000);
		user.clickProduct();
	}

	@When("Click on close button in product dialog box")
	public void click_on_close_button_in_product_dialog_box() {
		user.clickclose( );
	}	
	
	
	@When("Click on add product button")
	public void click_on_add_product_button() {
		
		try {
			user.addProduct();
	    } catch (Exception e) {
	        System.out.println("Failed to click on product button: " + e.getMessage());
	        throw new RuntimeException(e);
	    }
	}
	@When("Select the one time toggle button")
	public void select_the_one_time_toggle_button() {
		user.selectonetime();
	}
	@When("Enter the Values of deposit {string}, mrp {string}, refundtype {string},refundamount {string},and sp {string}")
	public void enter_the_values_of_deposit_mrp_refundtype_refundamount_and_sp(String deposit, String mrp, String reftype, String refamt, String sp) {
		
		user.enterdeposit(deposit);
		user.entermrp(mrp);
		user.selectrefundtype(reftype);
		user.enterRefundAmount(refamt);
		user.enterSellingprice(sp);
	}

	@When("Enter the Values of refill deposit {string}, mrp {string}, refundtype {string},refundamount {string},and sp {string}")
	public void enter_the_values_of_refill_deposit_mrp_refundtype_refundamount_and_sp(String deposit, String mrp, String reftype, String refamt, String sp) {
		user.enterdeposit(deposit);
		user.entermrp(mrp);
		user.selectrefundtype(reftype);
		user.enterRefundAmount(refamt);
		user.enterSellingpricerefill(sp);
	}

	@When("Click on the update button")
	public void click_on_the_update_button() {
		user.clickupdate( );
		user.waittoast();
	}
	/**refill sale radio button*/

	@When("Select the Refill toggle button")
	public void select_the_refill_toggle_button() {
		user.selectrefill();
	}

	/*  Both radio button*/
	
	@When("Select the Both toggle button")
	public void select_the_both_toggle_button() {
		user.selectbothsale();
	}
	@When("Enter the Values of deposit {string}, mrp {string}, refundtype {string},refundamount {string}, sp {string}, R_deposit {string}, R_mrp {string}, R_refundtype {string},R_refundamount {string},and R_sp {string}")
	public void enter_the_values_of_deposit_mrp_refundtype_refundamount_sp_r_deposit_r_mrp_r_refundtype_r_refundamount_and_r_sp(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
		user.enterdeposit(string);
		user.entermrp(string2);
		user.selectrefundtype(string3);
		user.enterRefundAmount(string4);
		user.enterSellingprice(string5);
		user.enterdeposit2(string6);
		user.entermrp2(string7);
		user.selectrefundtype2(string8);
		user.enterRefundAmount2(string9);
		user.enterSellingpricerefill2(string10);
	}

	/***************************Address custom price************************************************/

	@When("Select the Address to set custom price")
	public void select_the_address_to_set_custom_price() {
		user.selectAddress();
	}


	@When("Click on the product details button")
	public void click_on_the_product_details_button() {
		user.clickproductdetails( );
	}
	
		
	
	
	/*************************************Adding waterdrop  ******************************************************/


	@When("Click on the Add Waterdrop button")
	public void click_on_the_add_waterdrop_button() {
		user.clickAddwaterdrop();	

	}



	@When("Click on close button in waterdrop dialog")
	public void click_on_close_button_in_waterdrop_dialog() {
		user.clickwaterdropclose();
	}

	@When("Enter the Waterdrop count")
	public void enter_the_waterdrop_count() {
		user.enterwaterdrop("2");

	}


	@When("Enter the Reason for Adding waterdrop")
	public void enter_the_reason_for_adding_waterdrop() {
		user.enterwaterdropreason();
	}

	@When("Enter the Waterdrop {string}")
	public void enter_the_waterdrop(String string) {
		user.enterwaterdrop(string);
	}


	@When("Click on Add button waterdrop dialog")
	public void click_on_add_button_waterdrop_dialog() {
		user.clickwaterdropadd();
		user.waittoast();
	}


	/********************************* Reduce wallet amount ********************************************************/


	@When("Click on the Reduce wallet amount button")
	public void click_on_the_reduce_wallet_amount_button() {
		user.clickreducewalleticon();
	}

	@When("Enter the Wallet amount")
	public void enter_the_wallet_amount() {
		user.enterwalletamount("1");
	}

	@When("Enter the Reason for reducing  wallet amount")
	public void enter_the_reason_for_reducing_wallet_amount() {
		user.enterwalletreason("Automation script running");
	}

	@When("Enter the wallet {string}, reason {string} and transactionid {string}")
	public void enter_the_wallet_reason_and_transactionid(String amt, String reason, String id) {
		user.enterwalletamount(amt);
		user.enterwalletreason(reason);
		user.entertransactionid(id);
	}

	@When("Click on close button in Reduce wallet amount dialog")
	public void click_on_close_button_in_reduce_wallet_amount_dialog() {
		user.clickclosewallet();
	}


	@When("Click on Add button Reduce wallet amount dialog")
	public void click_on_add_button_reduce_wallet_amount_dialog() {
		user.clickreducewallet();
		user.waittoast();
	}

	/************************** Add Deposit and undeposited stock ******************************************************/

	@Given("Scroll to top of the page")
	public void scroll_to_top_of_the_page() {
		user.scrollpagetop();
	}

//// common for deposit and custom amount and deposit
		@When("Select the product from dropdown")
		public void select_the_product_from_dropdown() {
			user.SelectProd();
		}



	
	@When("Click on the Add deposit button")
	public void click_on_the_add_deposit_button() throws InterruptedException {
		user.clickaddstock();
		Thread.sleep(1000);
	}


	@When("Select the Undeposited radio button")
	public void select_the_undeposited_radio_button() {
		user.clickundeposited();
	}

	@When("Select the Deposited radio button")
	public void select_the_deposited_radio_button() {
		user.clickdeposited();
	}

	@When("Select the Address from dropdown")
	public void select_the_address_from_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		user.selectaddresstodeposit();
	}

	@When("Enter the Quantity {string}")
	public void enter_the_quantity(String string) {
		user.enterquantity(string);
	}


	@When("Enter the Quantity in deposit qty {string}")
	public void enter_the_quantity_in_deposit_qty(String string) {
		user.clickdepositqty(string);
	}

	@When("Click on submit in add deposit dialog box")
	public void click_on_submit_in_add_deposit_dialog_box() throws InterruptedException {
		user.clickdepositsubmit();
		// user.waittoast();
		Thread.sleep(4000);
	}

	/*************************************** Selecting the product and add/refund deposit************************************************************/

	@When("Select the product update stock from dropdown")
	public void select_the_product_update_stock_from_dropdown() {
		user.clickproductdrpdwnstock();
	}

	@When("Click on the refund deposit")
	public void click_on_the_refund_deposit() {
		user.clickrefunddeposit();
	}

	@When("Click on the minimum button")
	public void click_on_the_minimum_button() {
		user.clickrefunddepositmin();
	}
	@When("Click on the maximum button")
	public void click_on_the_maximum_button() {
		//  user.clickrefunddepositmax();

		int availableStock = user.getAvailableStock();
		int defaltValue = user.getdefaultStock();

		// Click the Max button until the defaltValue equals the available stock
		while (defaltValue < availableStock) {
			user.clickrefunddepositmax();  // Assuming 'maxButton' is a WebElement representing the Max button
			defaltValue = user.getdefaultStock();  // Update the current value after each click
		}	    

		try {
			user.clickrefunddepositmax();  
			// Check for error message if available or perform validation here
			WebElement errorMessage = Loginpage.ldriver.findElement(By.className("Toastify__toast-body"));
			if (errorMessage.isDisplayed()) {
				System.out.println("Error displayed as expected if reached more than available stock");
			}
		} catch (Exception e) {
			System.out.println("Expected exception or error not displayed if reached more than available stock.");
		}


		// Now, click the Min button until the current value returns to the default value (1)
		while (defaltValue > 1) {
			user.clickrefunddepositmin(); // Assuming 'minButton' is a WebElement representing the Min button
			defaltValue = user.getdefaultStock();  // Update the current value after each click
		}
	}
	@When("Click on refund button in dialog box")
	public void click_on_refund_button_in_dialog_box() {
		user.clickrefund();

	}






}
