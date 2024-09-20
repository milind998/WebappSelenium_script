package stepDefination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;

import com.pages.SuperAdmin;
import com.pages.Transactions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class stepsSuperAdmin {
	
	SuperAdmin SupA = new SuperAdmin(Transactions.ldriver);
	
	
	@Given("Click on Super Admin page")
	public void click_on_super_admin_page() throws InterruptedException {
		Thread.sleep(500);
		try {
		SupA.Click_ON_SuperAdminTab();
		}
		catch (Exception e) {
			System.out.println("Already on Super Admin page");
		}
	}

	@Then("Check Heading of Super Admin page")
	public void check_heading_of_super_admin_page() {
	    String actResult = SupA.Check_Heading_SuperAdmin();
	    System.out.println(actResult);
	    String expResult = "Super Admin";
	    Assert.assertEquals(actResult, expResult);
	    
	}
	
	@Then("Check Roll to Add text")
	public void check_roll_to_add_text() {
		String actResult = SupA.Select_Role_To_Add();
		System.out.println(actResult);
		String expResult = "Select role to add";
		Assert.assertEquals(actResult, expResult);
	}

	@Then("Check Full Name text")
	public void check_full_name_text() {
	    String actResult = SupA.Select_Full_Name();
	    System.out.println(actResult);
	    String expResult = "Full Name *";
	    Assert.assertEquals(actResult, expResult);
	}

	@Then("Check Phone text")
	public void check_phone_text() {
	    String actResult = SupA.Select_Phone();
	    System.out.println(actResult);
	    String expResult = "Phone *";
	    Assert.assertEquals(actResult, expResult);
	}

	@Then("Check Email Address text")
	public void check_email_address_text() {
	    String actResult = SupA.Select_Email_Address();
	    System.out.println(actResult);
	    String expResult = "Email Address *";
	    Assert.assertEquals(actResult, expResult);
	}

	@Then("Check Password text")
	public void check_password_text() {
	    String actResult = SupA.Select_Password();
	    System.out.println(actResult);
	    String expResult = "Password *";
	    Assert.assertEquals(actResult, expResult);
	}
	
	
	@Given("Select Role Combobox")
	public void select_role_combobox() throws InterruptedException {
		Thread.sleep(2000);
		SupA.Click_On_AddRoleCombobox();
	}
	
	
	@Given("Select role to Add")
	public void select_role_to_add() throws InterruptedException {
		SupA.Select_SuperAdminButton();
		}

	@When("Fill all Add User textboxes {string}, {string}, {string}, {string}")
	public void fill_all_add_user_textboxes(String FullNameBox, String PhoneBox, String EmailAddressBox, String PasswordBox) {
	   SupA.TextBox_FullName(FullNameBox);
	   SupA.TextBox_Phone(PhoneBox);
	   SupA.TextBox_EmailAddress(EmailAddressBox);
	   SupA.TextBox_Password(PasswordBox);
	}

	
	@When("Click on Add User button")
	public void click_on_add_user_button() {
	   SupA.Click_ON_Add_UserButton();
	
	}
	
	@Then("Verify toast message {string}")
	public void verify_toast_message(String ToastMessage) {
	
		 String actResult = SupA.toastMessage();
		 System.out.println(actResult);
		    String expResult = ToastMessage;
		    Assert.assertEquals(actResult, expResult);
	}
	
	
	
	
	@Given("Select Admin role to Add")
	public void select_admin_role_to_add() {
	    SupA.Select_AdminButton();
	}
	
	
	@Given("Select WFSAdmin role to Add")
	public void select_wfs_admin_role_to_add() {
	    SupA.Select_WFSAdminButton();
	}
	
	@Given("Select Distributor role to Add")
	public void select_distributor_role_to_add() {
		SupA.Select_Distributor();
	}
	
	
	@Given("Select Delivery Agent role to Add")
	public void select_delivery_agent_role_to_add() {
	    SupA.Select_DeliveryAgent();
		
	}

	@When("Fill all Add User textboxes {string}, {string}, {string}, {string}, {string}")
	public void fill_all_add_user_textboxes(String FullNameBox, String SupplierPhoneBox, String PhoneBox, String EmailAddressBox, String PasswordBox) {
		SupA.TextBox_FullName(FullNameBox);
		SupA.TextBox_SupplierPhone(SupplierPhoneBox);
		   SupA.TextBox_Phone(PhoneBox);
		   SupA.TextBox_EmailAddress(EmailAddressBox);
		   SupA.TextBox_Password(PasswordBox);
		
	}
	
	@Given("Select Consumer role to Add")
	public void select_consumer_role_to_add() {
	    SupA.Select_Consumer();
	}
	
	
	
	@When("Fill all textboxes to add Consumer {string}, {string}, {string}, {string}, {string}")
	public void fill_all_textboxes_to_add_consumer(String FullNameBox, String ReferralCodeBox, String PhoneBox, String EmailAddressBox, String PasswordBox) {
		SupA.TextBox_FullName(FullNameBox);
		SupA.TextBox_ReferralCode(ReferralCodeBox);
		   SupA.TextBox_Phone(PhoneBox);
		   SupA.TextBox_EmailAddress(EmailAddressBox);
		   SupA.TextBox_Password(PasswordBox);
		
	}
	
	
	@Given("Select SALESHEAD role to Add")
	public void select_saleshead_role_to_add() throws InterruptedException {
	    SupA.Select_SalesHead();
	}
	
	@Given("Select SALES role to Add")
	public void select_sales_role_to_add() throws InterruptedException {
	   SupA.Select_Sales();
	}
	
	@Given("Select CSHEAD role to Add")
	public void select_cshead_role_to_add() {
	    SupA.Select_CSHEAD();
	}
	
	
	@Given("Select CS role to Add")
	public void select_cs_role_to_add() {
	    SupA.Select_CS();
	}
	
	
	@Given("Select CS Lead role to Add")
	public void select_cs_lead_role_to_add() throws InterruptedException {
	    SupA.Select_CSLead();
	}

	@Given("Select OPS Head role to Add")
	public void select_ops_head_role_to_add() {
	   SupA.Select_OPSHEAD();
	}

	@Given("Select OPS role to Add")
	public void select_ops_role_to_add() {
	   SupA.Select_OPS();
	}

	@Given("Select Inventory ML role to Add")
	public void select_inventory_ml_role_to_add() {
	    SupA.Select_InventoryML();
	}

	@Given("Select Finance Head role to Add")
	public void select_finance_head_role_to_add() {
	   SupA.Select_FINANCEHEAD();
	}

	@Given("Select Finance role to Add")
	public void select_finance_role_to_add() {
	    SupA.Select_FINANCE();
	}

	@Given("Select QAHEAD role to Add")
	public void select_qahead_role_to_add() {
	    SupA.Select_QAHEAD();
	}

	@Given("Select QA role to Add")
	public void select_qa_role_to_add() throws InterruptedException {
	    SupA.Select_QA();
	}

	
	
	@Then("Check Roles_List text")
	public void check_roles_list_text() {
	    String actResult = SupA.Check_Role_List();
	    System.out.println(actResult);
	    String expResult = "ROLES LIST";
	    Assert.assertEquals(actResult, expResult);
	}

	@Then("Check Active_Users text")
	public void check_active_users_text() {
		String actResult = SupA.Check_Active_Users();
		System.out.println(actResult);
		String expResult = "ACTIVE USERS";
		Assert.assertEquals(actResult, expResult);
	}
	
	
	@Given("Click on Active Users button")
	public void click_on_active_users_button() throws InterruptedException {
		Thread.sleep(1000);
		try {
	    SupA.ClickON_Active_Users();
		}
		catch (Exception e) {
			System.out.println("Already on Active Users tab");
		}
	}

	
	
	@Given("Send data in Search Name box")
	public void send_data_in_search_name_box() throws InterruptedException {
	    SupA.CheckSearch_NameText();
	}

	@Given("Select any Role")
	public void select_any_role() {
		SupA.Click_On_Role_Button();
	   SupA.SelectRoleTOAdd();
	}

	@When("Send data in Search Email Box")
	public void send_data_in_search_email_box() throws InterruptedException {
	    SupA.CheckSearch_EmailText();
	}

//	@Then("Verify Active Users text")
//	public void verify_active_users_text() throws InterruptedException {
//		String active_users_text[]= {"Search Name",
//				"Select role to add",
//				"Search Email"};
//	   for(int i=1; i<=3; i++) {
//		   String actResult = SupA.verify_TextBox_Of_ActiveUsers(i);
//		   System.err.println(actResult);
//		   String expResult = active_users_text[i-1];
//		   Assert.assertEquals(actResult, expResult);
//	   }
		
	@Then("Verify Active Users text {string}, {string}, {string}")
	public void verify_active_users_text(String string, String string2, String string3) {
	
		List<String> stringList = new ArrayList<>();
		stringList.add(string);
		stringList.add(string2);
		stringList.add(string3);
		
		List<String> detail = SupA.verify_TextBox_Of_ActiveUsers();
		// Sort both lists
		Collections.sort(stringList);
		Collections.sort(detail);

		//  trns.Close_Product_Info.click();
		boolean actResult=stringList.equals(detail);
		boolean expResult=true;

		Assert.assertEquals(expResult, actResult);

		//SupA.Select_one_PaymentStatus();
	}


	
	
	@Then("Verify Table text of Active users")
	public void verify_table_text_of_active_users() {
		String tableOFActiveUser[]= {"Name",
				"Phone",
				"Email",
				"Role"};
		for(int i=1; i<=4; i++) {
	    String actResult = SupA.Check_TextOfTable_ActiveUsers(i);
	    System.out.println(actResult);
	    String expResult = tableOFActiveUser[i-1];
	    Assert.assertEquals(actResult, expResult);
	    
	}

	}
	
	@Given("Click on Role Button")
	public void click_on_role_button() {
	    SupA.Click_On_Role_Button();
	}

	
	
	@When("Select Role {string}")
	public void select_role(String string) throws InterruptedException {	
	    SupA.Select_Role(string);
	}

	@Then("Count Super Admin Role {string}")
	public void count_super_admin_role(String Role) throws InterruptedException {
		boolean actResult = SupA.RoleOnTable(Role);
	    boolean expResult = true;
	    Assert.assertEquals(actResult, expResult);
	
	}
	

	
	@Given("Click on Search by Name textbox")
	public void click_on_search_by_name_textbox() {
	     SupA.Select_Search_By_Name();
	}

	@When("Enter User Name")
	public void enter_user_name() {
	    SupA.Send_Search_Name();
	}
	
	@When("Click on Search Button")
	public void click_on_search_button() {
	    SupA.Click_Search_Button();
	}

	@Then("Verify User name in table")
	public void verify_user_name_in_table() {
		String actResult = SupA.Verify_SearchedName();
		System.out.println(actResult);
		String expResult = "Milind Automation SA";
		Assert.assertEquals(actResult, expResult);
	}
	
	
	
	@Given("Click on Search by Email textbox")
	public void click_on_search_by_email_textbox() {
	    SupA.Select_Search_By_EmailID();
	}

	@When("Enter Email id")
	public void enter_email_id() {
	   SupA.Send_Search_EmailID();
	}

	@When("Click on Search")
	public void click_on_search() {
	    SupA.Click_Search_ButtonEmail();
	}

	@Then("Verify User Email id in table")
	public void verify_user_email_id_in_table() {
	   String actResult = SupA.Verify_SearchedMailID();
	   System.out.println(actResult);
	   String expResult = "milind031@bookwater.com";
	   Assert.assertEquals(actResult, expResult);
	}



	
	@When("Enter User Name {string}")
	public void enter_user_name(String Name) {
	    SupA.Enter_UserName(Name);
	}

	@When("Click on View Details button")
	public void click_on_view_details_button() {
	    SupA.Click_ON_View_Details();
	}

	@When("Click on Delete Button")
	public void click_on_delete_button() {
	    SupA.Delete_User();
	}
	
	@When("Click Confirm button to Delete")
	public void click_confirm_button_to_delete() {
	    SupA.Confirm_DeleteUser();
	}



}

