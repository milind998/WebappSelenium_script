package stepDefination;

import static org.junit.Assert.assertNotNull;
//import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.pages.Transactions;
import com.pages.promoCode;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepsTransactions {

	//private static final DataTable DataTable = null;
	Transactions trns = new Transactions (promoCode.ldriver);

	@Given("Click on Transactions page")
	public void click_on_transactions_page() {
		trns.Click_On_Transactions();

	}

	@Then("Check Heading of transaction page")
	public void check_heading_of_transaction_page() {
		String actResult = trns.Check_Heading_Text();
		String expResult = "Transaction details";
		System.out.println(actResult);
		Assert.assertEquals(actResult, expResult);
	}

	@Given("Click on Transaction Type Combobox")
	public void click_on_transaction_type_combobox() throws InterruptedException {
		trns.click_OnTransactionTypeCombobox();
	}



	@Then("Check All Transaction type {string}, {string}, {string}, {string}")
	public void check_all_transaction_type(String string, String string2, String string3, String string4) {
		List<String> stringList = new ArrayList<>();
		stringList.add(string);
		stringList.add(string2);
		stringList.add(string3);
		stringList.add(string4);
		List<String> detail = trns.Check_TransactionsTypesText();
		// Sort both lists
		Collections.sort(stringList);
		Collections.sort(detail);

		//  trns.Close_Product_Info.click();
		boolean actResult=stringList.equals(detail);
		boolean expResult=true;

		Assert.assertEquals(expResult, actResult);

		trns.Select_one_TransactionType();

	}

	@Given("Click on Payment Methods Combobox")
	public void click_on_payment_methods_combobox() {
		trns.Click_On_PaymentMethods_Combobox();
	}

	@Then("Check All Payment Methods {string}, {string}, {string}, {string}")
	public void check_all_payment_methods(String string, String string2, String string3, String string4) {
		List<String> stringList = new ArrayList<>();
		stringList.add(string);
		stringList.add(string2);
		stringList.add(string3);
		stringList.add(string4);
		List<String> detail = trns.Check_PaymentMethodsText();
		// Sort both lists
		Collections.sort(stringList);
		Collections.sort(detail);

		//  trns.Close_Product_Info.click();
		boolean actResult=stringList.equals(detail);
		boolean expResult=true;

		Assert.assertEquals(expResult, actResult);

		trns.Select_one_PaymentMethod();

	}

	@Given("Click on Payment Status Combobox")
	public void click_on_payment_status_combobox() {
		trns.Click_On_PaymentStatus_Combobox();
	}

	@Then("Check All Payment Status {string}, {string}, {string}, {string}")
	public void check_all_payment_status(String string, String string2, String string3, String string4) {
		List<String> stringList = new ArrayList<>();
		stringList.add(string);
		stringList.add(string2);
		stringList.add(string3);
		stringList.add(string4);
		List<String> detail = trns.Check_PaymentStatusText();
		// Sort both lists
		Collections.sort(stringList);
		Collections.sort(detail);

		//  trns.Close_Product_Info.click();
		boolean actResult=stringList.equals(detail);
		boolean expResult=true;

		Assert.assertEquals(expResult, actResult);

		trns.Select_one_PaymentStatus();
	}


	@Given("Click on Search Type Combobox")
	public void click_on_search_type_combobox() {
		trns.Click_On_SearchTypes_Combobox();
	}

	@Then("Check All Search Types {string}, {string}, {string}")
	public void check_all_search_types(String string, String string2, String string3) {
		List<String> stringList = new ArrayList<>();
		stringList.add(string);
		stringList.add(string2);
		stringList.add(string3);

		List<String> detail = trns.Check_SearchTypesText();
		// Sort both lists
		Collections.sort(stringList);
		Collections.sort(detail);

		boolean actResult=stringList.equals(detail);
		boolean expResult=true;

		Assert.assertEquals(expResult, actResult);

		trns.Select_one_SearchTypes();
	}



	@Given("Select Water Drops Transaction type")
	public void select_water_drops_transaction_type() {
		trns.Select_WaterDrops_TransactionType();
	}

	@When("Click on Payment Status box")
	public void click_on_payment_status_box() {
		trns.Select_PaymentStatus_Box();
	}

	@Then("Check All Payment Status {string}, {string}, {string}, {string}, {string}, {string}")
	public void check_all_payment_status(String string, String string2, String string3, String string4, String string5, String string6) {
		List<String> stringList = new ArrayList<>();
		stringList.add(string);
		stringList.add(string2);
		stringList.add(string3);
		stringList.add(string4);
		stringList.add(string5);
		stringList.add(string6);

		List<String> detail = trns.Check_PaymentStatus_Of_WaterDrops();
		// Sort both lists
		Collections.sort(stringList);
		Collections.sort(detail);

		boolean actResult=stringList.equals(detail);
		boolean expResult=true;

		Assert.assertEquals(expResult, actResult);

		trns.selectOnePaymentStatusOF_Waterdrops();
	}




	@When("Select Deposit Transaction Type")
	public void select_deposit_transaction_type() {
		trns.Select_Deposit_TransactionType();
	}

	@When("Click on Deposit payment Status")
	public void click_on_deposit_payment_status() throws InterruptedException {
		trns.Select_Deposit_PaymentStatus();
	}

	@Then("Check All Payment Status {string}, {string}, {string}")
	public void check_all_payment_status(String string, String string2, String string3) throws InterruptedException {
		List<String> stringList = new ArrayList<>();
		stringList.add(string);
		stringList.add(string2);
		stringList.add(string3);

		List<String> detail = trns.Check_PaymentStatus_Of_Deposits();
		// Sort both lists
		Collections.sort(stringList);
		Collections.sort(detail);

		boolean actResult=stringList.equals(detail);
		boolean expResult=true;
		Thread.sleep(1500);
		Assert.assertEquals(expResult, actResult);

		trns.selectOnePaymentStatusOF_Deposits();
	}




	@When("Check Deposits")
	public void check_deposits() throws InterruptedException {
		trns.Select_DepositsCombobox();
		//trns.SelectDeposit();
	}

	@Then("Check Filter with deposited and Un-Deposited {string}, {string}")
	public void check_filter_with_deposited_and_un_deposited(String string, String string2) {
		List<String> stringList = new ArrayList<>();
		stringList.add(string);
		stringList.add(string2);

		List<String> detail = trns.Check_Deposits();
		// Sort both lists
		Collections.sort(stringList);
		Collections.sort(detail);

		boolean actResult=stringList.equals(detail);
		boolean expResult=true;

		Assert.assertEquals(expResult, actResult);

		trns.select_DepositsType();
	}


	@Then("Check table column text")
	public void check_table_column_text() {
		try {
		String TransactionTable[] = {"S.NO",
				"Transaction ID",
				"User name",
				"User phone",
				"Order ID",
				"Amount",
				"Transaction time",
				"Payment status",
				"Payment type",
				"Reason",
		"Updated by"};
		for (int i=1; i<=11; i++) {
			String actResult = trns.Check_TransactionTable_Text(i);
			System.out.println(actResult);
			String expResult = TransactionTable[i-1];
			Assert.assertEquals(actResult, expResult);
		}
		}
		catch (Exception e) {
			System.out.println("============Table is not Available=============");
		}
	}


	@Given("Enter User Number in textbox {string}")
	public void enter_user_number_in_textbox(String number) {
		trns.Click_ON_UserNumber(number);

	}

	@Given("Click on Submit button")
	public void click_on_submit_button() throws InterruptedException {
		trns.Transaction_SubmitButton();
		Thread.sleep(1000);
	}

	@Then("Check Data or Error Message")
	public void check_data_or_error_message() {


		try {
			trns.Check_Data_OR_ErrorMessageAfter_SearchBY_Number();
			Object numberElement = null;
			assertNotNull("Data is available in the table.", numberElement);

		} catch (NoSuchElementException e) {
			System.out.println("Data is not available in the table.");

		}
	}

	@Given("Select Start And End Date")
	public void select_start_and_end_date() throws InterruptedException {
		trns.Select_StartDate_EndDate();
	}

	@Given("Select Orders transaction type")
	public void select_orders_transaction_type() throws InterruptedException {
		trns.click_OnTransactionTypeCombobox();
		trns.Select_OrdersType();
	}

	@When("Select Order ID search type")
	public void select_order_id_search_type() {
		trns.Click_On_SearchTypes_Combobox();
		trns.Select_OrderID_SearchType();
	}

	@When("Enter Order ID")
	public void enter_order_id() throws InterruptedException {
		trns.Enter_OrderID();
	}

	@Then("Verify same order id")
	public void verify_same_order_id() throws InterruptedException {
		Thread.sleep(2000);
		String actResult = trns.Check_Verified_OrderID();
		System.out.println(actResult);
		String expResult = "BTORD-38634";
		Thread.sleep(2000);
		Assert.assertEquals(actResult, expResult);
	}


	
	@Given("Select Water Drop transaction type")
	public void select_water_drop_transaction_type() throws InterruptedException {
		trns.click_OnTransactionTypeCombobox();
	    trns.Waterdrops_transactionType();
	}

	@Then("Check water drops column text")
	public void check_water_drops_column_text() throws InterruptedException {
		String WaterDrop_Table[]= {"S.No",
				"Order ID",
				"User name",
				"User phone",
				"Waterdrops",
				"Transaction time",
				"Reason",
				"Updated by"};
		
		Thread.sleep(3000);
	    for(int i=1; i<=8; i++) {
	    	String actResult = trns.Check_WaterDrops_TransactionTable_Text(i);
	    	System.out.println(actResult);
	    	String expResult = WaterDrop_Table[i-1];
	    	Assert.assertEquals(actResult, expResult);
	    	} 	
	    }
	
	
	@Given("Select Deposit Transaction Type for text")
	public void select_deposit_transaction_type_for_text() throws InterruptedException {
		trns.click_OnTransactionTypeCombobox();
		trns.Select_Deposit_TransactionType();
	}
	
	@Then("Check Deposit transactions column text")
	public void check_deposit_transactions_column_text() throws InterruptedException {
		String Deposit_Table[]= {"S.No",
				"Order ID",
				"User name",
				"User phone",
				"Amount",
				"Transaction time"};
		Thread.sleep(2000);
	    for(int i =1; i<=6; i++) {
	    	String actResult = trns.Check_Deposit_TransactionTable_Text(i);
	    	System.out.println(actResult);
	    	String expResult = Deposit_Table[i-1];
	    	Assert.assertEquals(actResult, expResult);
	    	
	    }
	}
	
	
	@Given("Select Order transaction type")
	public void select_order_transaction_type() throws InterruptedException {
		trns.click_OnTransactionTypeCombobox();
		trns.Select_OrdersType();
	}

	@When("Select Razorpay Payment method")
	public void select_razorpay_payment_method() {
	    trns.Click_On_PaymentMethods_Combobox();
	    trns.Select_RazorpayMethod();
	}

	@When("Select Success payment status")
	public void select_success_payment_status() {
		trns.Click_On_PaymentStatus_Combobox();
		trns.Select_Success_PaymentStatus();
	}

	@Then("Count Success Payment status {string}")
	public void count_success_payment_status(String Status) throws InterruptedException {
		//Thread.sleep(1000);
	    boolean actResult = trns.paymentStatusOnCard(Status);
	    boolean expResult = true;
	    Assert.assertEquals(actResult, expResult);
	}
	
	
	@When("Select Failed payment status")
	public void select_failed_payment_status() {
		trns.Click_On_PaymentStatus_Combobox();
		trns.Select_Failed_PaymentStatus();
	}

	
	@Given("Select Refund payment status")
	public void select_refund_payment_status() {
		trns.Click_On_PaymentStatus_Combobox();
		trns.Select_Refund_PaymentStatus();

	}
	
	@Given("Click on Submit buttons")
	public void click_on_submit_buttons() throws InterruptedException {
	   trns.Transaction_SubmitButtons();
	  // trns.Wait_For_LoadingB();
	}
	
	
	
	@Given("Enter Transaction ID")
	public void enter_transaction_id() {
		trns.Select_Transaction();
		trns.SelectAndSend_TransactionID();
		

	}

	@Then("Check and Verify transaction Id")
	public void check_and_verify_transaction_id() throws InterruptedException {
		Thread.sleep(3000);
	   String actResult = trns.Verify_TransactionID();
	   System.out.println(actResult);
	   String expResult = "pay_OhdMYxRvOIT6NU";
	   Assert.assertEquals(actResult, expResult);
	   
	}

	
	}







