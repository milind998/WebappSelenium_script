package stepDefination;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;

import com.pages.Home;
import com.pages.mainsettingsPage;
//import com.pages.settingsPage;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepsMainSetting {
	//static int payment_methods;
	mainsettingsPage kk = new mainsettingsPage(Home.ldriver);

	@When("Click on Setting page")
	public void click_on_setting_page() {
		kk.settingLink();
	}

	@Then("Check Page title")
	public void check_page_title() {
		String actResult = kk.settingsText();
		String expResult = "Settings";
		Assert.assertEquals(expResult, actResult);
	}

	@When("Check settings page tab is display")
	public void check_settings_page_tab_is_display() {
		kk.settingTabDisplay().isDisplayed();
	}

	@Then("Check tab text")
	public void check_tab_text() {
		String SettingsTab[] = { "Common", "Delivery Slots", "Block Payment & Booking & Timing", "Sold By", "Referral Settings",
				"convenience Fee setting", "Time settings", "Settlement Settings","PWD convenience Fee","Cancellation fee setting"
		};
		for (int i = 1; i <= 10; i++) {
			String actResult = kk.settingTabButtonText(i).getText();
			System.out.println(actResult);
			String expResult = SettingsTab[i - 1];
			Assert.assertEquals(expResult, actResult);
		}
	}


	//=========================================COMMON SETTINGS========================================================================

	@Given("Click on common Settings tab")
	public void click_on_common_settings_tab() throws InterruptedException {
		kk.commonSettings();
	}

	@Then("Check All tab text")
	public void Check_All_tab_text() {
		String[] commonSettingsTab = { "Maximum discount allowed(In %)","Minimum water wallet amount", "Water wallet recharge alert",
				"Extra charges for single order","OTP Less Delivery Msg", "Extra charges HSN code",
				"Extra charges CGST %", "Extra charges SGST %"
		};
		for (int i = 1; i <= 8; i++) {
			String actResult = kk.commonSettingsTabText(i).getText();
			System.out.println(actResult);
			String expResult = commonSettingsTab[i - 1];
			Assert.assertEquals(actResult, expResult);
		}
	}

	@And("Admin enter required field  {string},{string},{string},{string},{string},{string}, {string}, {string}")
	public void admin_enter_required_field(String MaximumdiscountallowedBox, String Minimumwaterwalletamount, String Waterwalletrechargealert,
			String Extrachargesforsingleorder, String OTPLessDeliveryMsg,
			String ExtrachargesHSNcode, String ExtrachargesCGST, String ExtrachargesSGST) throws InterruptedException {
		Thread.sleep(3000);
		kk.MaximumdiscountallowedTextBox(MaximumdiscountallowedBox);
		kk.MinimumwaterwalletamounttextBox(Minimumwaterwalletamount);
		kk.WaterwalletrechargealerttextBox(Waterwalletrechargealert);
		kk.Extrachargesforsingleordertextbox(Extrachargesforsingleorder);
		//kk.Minimumwaterwalletamounttextbox(Minimumwaterwalletamount);
		kk.OTPLessDeliveryMsgtextbox(OTPLessDeliveryMsg);
		kk.ExtrachargesHSNcodeTextBox(ExtrachargesHSNcode);
		kk.ExtrachargesCGSTtextBox(ExtrachargesCGST);
		kk.ExtrachargesSGSTtextBox(ExtrachargesSGST);

	}

	//	@Given("Admin enter required field  {string},{string},{string},{string},{string},{string},{string},{string}")
	//	public void admin_enter_required_field(String MaximumdiscountallowedBox, String Minimumwaterwalletamount, String Waterwalletrechargealert,
	//			String Extrachargesforsingleorder, String OTPLessDeliveryMsg,
	//			String ExtrachargesHSNcode, String ExtrachargesCGST, String ExtrachargesSGST) {
	//		kk.MaximumdiscountallowedTextBox(MaximumdiscountallowedBox);
	//		kk.MinimumwaterwalletamounttextBox(Minimumwaterwalletamount);
	//		kk.WaterwalletrechargealerttextBox(Waterwalletrechargealert);
	//		kk.Extrachargesforsingleordertextbox(Extrachargesforsingleorder);
	//		//kk.Minimumwaterwalletamounttextbox(Minimumwaterwalletamount);
	//		kk.OTPLessDeliveryMsgtextbox(OTPLessDeliveryMsg);
	//		kk.ExtrachargesHSNcodeTextBox(ExtrachargesHSNcode);
	//		kk.ExtrachargesCGSTtextBox(ExtrachargesCGST);
	//		kk.ExtrachargesSGSTtextBox(ExtrachargesSGST);
	//
	//	}

	@When("Click on update button")
	public void click_on_update_button() throws InterruptedException {
		Thread.sleep(3000);
		kk.clickUpdateButton();
	}

	@Then("check Toast message {string}") // COMMON METHOD FOR VERIFY TOAST MESSAGE
	public void  check_Toast_message(String toast) throws InterruptedException {

		String actResult = kk.toastMessage();
		String expResult = toast;
		Thread.sleep(1000);
		Assert.assertEquals(actResult, expResult);

	}

	@Given("Close Main Settings tab")
	public void close_main_settings_tab() throws InterruptedException {
		// Thread.sleep(1800);
		kk.CloseMainSettingsTab();
	}


	//=======================================DELIVERY SLOTS===================================================


	@Given("Click on Delivery Slots button")
	public void click_on_delivery_slots_button() {
		kk.DeliverySlotsTab();
	}


	@When("Click on Existing Delivery slots button and count slot")
	public void click_on_existing_delivery_slots_button_and_count_slot() throws InterruptedException {
		//kk.GetSlotsTab();
	}



	@When("Click on Add Slots button")
	public void click_on_add_slots_button() throws InterruptedException {
		kk.AddSlotsTab();
		Thread.sleep(2000);
	}

	@When("Add Slots tab text1")
	public void add_slots_tab_text1() {
		String[] AddSlotsTab = {"Delivery Slot Start Time (AM)", "Delivery Slot End Time (PM)" };
		for (int a = 1; a <= 2; a++) {
			String actResult = kk.AddSlotsTabText1(a).getText();
			System.out.println(actResult);
			String expResult = AddSlotsTab[a - 1];
			Assert.assertEquals(actResult, expResult);
		}
	}

	@Then("Add Slots tab text")
	public void add_slots_tab_text() {
		// String[] AddSlotsTab = {"Number of Slots"};
		String actResult = kk.AddSlotsTabText().getText();
		System.out.println(actResult);
		String expResult = "Number of Slots";
		Assert.assertEquals(actResult, expResult);
	}

	@Given("Admin fill data in textboxes {string}, {string}, {string}")
	public void admin_fill_data_in_textboxes(String NumberOfSlots, String DeliverySlotStartTime, String DeliverySlotEndTime) {
		kk.NumberOfSlotsTextBox(NumberOfSlots);
		kk.DeliverySlotStartTimeTextBox(DeliverySlotStartTime);
		kk.DeliverySlotEndTimeTextBox(DeliverySlotEndTime);
	}

	@When("Click on ADD button")
	public void click_on_add_button() {
		kk.AddSlotButton();
	}

	@Given("Admin add slots with fill textboxes {string}, {string}, {string}")
	public void admin_add_slots_with_fill_textboxes(String NumberOfSlots, String DeliverySlotStartTime, String DeliverySlotEndTime) {
		kk.NumberOfSlotsTextBox(NumberOfSlots);
		kk.DeliverySlotStartTimeTextBox(DeliverySlotStartTime);
		kk.DeliverySlotEndTimeTextBox(DeliverySlotEndTime);
		kk.AddSlotButton();
	}

	@When("Click on Get Slots button")
	public void click_on_get_slots_button() {
		kk.GetSlotButton();
		kk.existingDeliverySlotButton();
		kk.selectDeliverySlot();
	}

	@Then("Count Delivery slot")
	public void count_delivery_slot() {
		kk.existingDeliverySlotButton();
	}


	//=======================================BLOCK PAYMENT & BOOKING & TIMIMG===================================


	@Given("Click on Block setting")
	public void click_on_block_setting() throws InterruptedException {
		kk.BlockSettingTab();
	}

	@When("Click on Scanning button")
	public void click_on_scanning_button() {
		kk.ClickOnScanningButton();
	}


	@Then("Check AllB tab Text")
	public void check_allb_tab_text() {
		String SettingsTab[] = { "PRE-PAID", "POSTPAID", "BOTH", "NONE"};
		for (int i = 1; i <= 4; i++) {
			String actResult = kk.BlockScanningTabText(i).getText();
			System.out.println(actResult);
			String expResult = SettingsTab[i - 1];
			Assert.assertEquals(expResult, actResult);
		}
	}

	@Given("select each radio button and Click on ScanningUpdate button")
	public void select_each_radio_button_and_click_on_scanning_update_button() throws InterruptedException {
		Thread.sleep(2000);
		kk.SelectRadioandUpdateButtons();
	}

	@Then("Check Toast Message {string}")
	public void check_toast_message(String string) {

		String actResult = kk.toastMessage();
		String expResult = string;
		Assert.assertEquals(actResult, expResult);
	}


	@Given("Click on Block Payments button")
	public void click_on_block_payments_button() {

		kk.ClickPaymentsButton();

	}

	@When("Click on Payment Methods button")
	public void click_on_payment_methods_button() throws InterruptedException {
		kk.ClickPaymentsMethodsButton();
	}

	@Then("Check Payment Methods text")
	public void check_payment_methods_text() throws InterruptedException {
		String PaymentMethodsTab[] = { "All paysharp payments","Paysharp UPI","Paysharp QR","Virtual Bank","RazorPay","Wallet"};
		for (int i = 1; i <= 6; i++) {
			//Thread.sleep(3000);
			String actResult = kk.BlockPaymentMethodsText(i).getText();
			System.out.println(actResult);
			String expResult = PaymentMethodsTab[i-1];
			Assert.assertEquals(expResult, actResult);
		}

		kk.onePaymentMethod();
	}

	@Given("Select Payment method")
	public void select_payment_method() throws InterruptedException  {
		kk.AllPaymentMethods();
		kk.Select_AllPaymentMethod();
	}

	@When("Enter Blocking reason")
	public void enter_blocking_reason() {
		kk.ReasonTextbox();

	}

	@Then("Click on Block Button")
	public void click_on_block_button() {
		kk.Block();    
	}


	@Given("Click on Remove Button")
	public void click_on_remove_button() throws InterruptedException {
		kk.Remove_BlockedMethod();

	}

	@Then("Check Toast Message after remove {string}")
	public void check_toast_message_after_remove(String string) {
		String actResult = kk.toastMessage();
		String expResult = string;
		Assert.assertEquals(actResult, expResult);
	}
	
	
	@Given("Click  on Booking button")
	public void click_on_booking_button() {
	    kk.BlockBookingButton();
	}

	@When("Click  on Block Booking type")
	public void click_on_block_booking_type() {
	    kk.BlockBookingType();
	}

	@Then("Check Block Booking type text")
	public void check_block_booking_type_text() throws InterruptedException {
		for (int i = 1; i <= 7; i++) {
			//Thread.sleep(1500);
			String actResult = kk.Check_BlockBookingType_Text(i).getText();
			System.out.println(actResult);
	}
	}
	
	@Given("Select Date Range Block Booking type")
	public void select_date_range_block_booking_type() {
	   kk.Select_DateRangeBlockingType();
	}

	@When("Select Date Range")
	public void select_date_range() throws InterruptedException {
		kk.Select_Date();
		kk.Remove_BlockedMethod();
	}
	
	
	
	@Given("Click on Remove Date Range Button")
	public void click_on_remove_date_range_button() throws InterruptedException {
	    kk.RemoveBlock_DataRange();
	}
	
	
	@Given("Select Block Booking Type")
	public void select_block_booking_type() throws InterruptedException {
		kk.BlockBookingType();
	   kk.Select_BlockingBY_BookingType();
	}

	@When("Select Order Type")
	public void select_order_type() throws InterruptedException {
	    kk.Select_Order_TypeButton();
	    kk.Select_Order_Type();
	}
	
	@Given("Click on Pincode tab")
	public void click_on_pincode_tab() throws InterruptedException {
		kk.Select_BlockingBY_BookingType();
		kk.Select_PincodeButton();
		
	}

	@Then("Check Pincode tab Text")
	public void check_pincode_tab_text() {
		for (int i = 4; i <= 4; i++) {
			String actResult = kk.check_TextOfPincodeBlocking(i).getText();
			System.out.println(actResult);
			}
	}
	
	
	@Given("Select State")
	public void select_state() {
		   kk.Click_On_StateButton();
		   kk.Select_State();
	}

	@When("Select district")
	public void select_district() {
		   kk.Click_On_DistrictButton();
		   kk.Select_District();
	}

	@And("Select pincode")
	public void select_pincode() {
		   kk.Click_On_PincodeButton();
		   kk.Select_Pincode();
	}
	
	@Given("Click on Area Combobox")
	public void click_on_area_combobox() throws InterruptedException {
		kk.BlockBookingType();
		kk.Click_On_AreaButton();
		kk.Click_On_AreaCombobox();
		kk.Select_Area();
	}
	
	@Given("Click on District Combobox")
	public void click_on_district_combobox() {
		kk.BlockBookingType();
		kk.Select_DistrictButton_FromComboBox();
	}

	
	@Given("Click on State Combobox")
	public void click_on_state_combobox() {
		kk.BlockBookingType();
		kk.Select_StateButton_FromComboBox();
	}
	
	@Given("Click on Countries Combobox")
	public void click_on_countries_combobox() {
		kk.BlockBookingType();
		kk.Select_CountriesButton_FromComboBox();
	}
	

	@Given("Click on Timing tab")
	public void click_on_timing_tab() throws InterruptedException {
		kk.timingtabbutton();
	}

	@Then("Block Time tab text")
	public void block_time_tab_text() throws InterruptedException {
		String[] BlockTimeSettingTab = { "Start time", "End time" };
		for (int a = 1; a <= 2; a++) {
			String actResult = kk.BlockTimeSettingTabText(a).getText();
			System.out.println(actResult);
			String expResult = BlockTimeSettingTab[a - 1];
			Assert.assertEquals(actResult, expResult);
		}

	}

	@Given("Click on clock textbox and enter time {string}, {string}")
	public void click_on_clock_textbox_and_enter_time(String UstartTime, String UEndTime) throws InterruptedException {
		kk.timingtabbutton();
		kk.UpdateBlockTime(UstartTime, UEndTime);

	}

	@When("Block Time Settings update button")
	public void block_time_settings_update_button() {
		kk.BlockTimeUpdate();
	}

	@Given("Click on Clock and select time")
	public void click_on_clock_and_select_time() throws InterruptedException {
		kk.setTimeOnClock();
	}
	
	@Given("Click on Auto Cancel Button")
	public void click_on_auto_cancel_button() {
	   kk.Select_AutoCancel_tab();
	}
	
	@When("Enter Block reason {string}")
	public void enter_block_reason(String Reason) throws InterruptedException {
		kk.Click_On_ReasonButton();
	    kk.ResontextBox(Reason);
	}
	
	@Then("Click on Block")
	public void click_on_block() {
	   
	}



	//=================================SOLD BY====================================================================

	@Given("Click on Sold by tab")
	public void click_on_sold_by_tab() {
		kk.SoldByTab();
	}

	@Given("Select Distributor")
	public void select_distributor() {
		kk.selectslotofDistributor();
	}


	@When("Click on Update button")
	public void clicks_on_update_button() throws InterruptedException {
		kk.SelectDistributorUpdateButton();
	}


	@Then("check toast messages {string}")
	public void check_toast_messages(String string) {
		String actResult = kk.toastMessage();
		String expResult = "Updates settings successfully!";
		Assert.assertEquals(actResult, expResult);
	}


	@Given("Click on BookWater button")
	public void click_on_book_water_button() throws InterruptedException {
		kk.selectslotofBookwater();
	}

	@Then("Check all tab text")
	public void check_all_tab_text() throws InterruptedException {
		String[] SoldByBookwaterTab = {"Company Name","PAN Number","GST Number", "Address"};
		for (int i = 10; i <= 13; i++) {
			//for (int i = 13; i <= 16; i++) {
			String actResult = kk.SoldByBookWaterText(i).getText();
			System.out.println(actResult);
			String expResult = SoldByBookwaterTab[i - 10];
			//String expResult = SoldByBookwaterTab[i - 13];
			Assert.assertEquals(actResult, expResult);
		}
	}

	@Given("Fill all textboxes {string}, {string}, {string}, {string}")
	public void fill_all_textboxes(String CompanyName, String PanNumber, String GSTNumber, String Address) {
		kk.CompanyNameTextBox(CompanyName);
		kk.PanNumberTextBox(PanNumber);
		kk.GSTNumberTextBox(GSTNumber);
		kk.AddressTextBox(Address);
	}

		@When("Sold by BookWater Update button")
		public void sold_by_book_water_update_button() throws InterruptedException {
		    kk.SoldByBookwaterUpdateButton();
		}

	//	@Then("check toast message {string}")
	//	public void check_toast_messages(String string) {
	//	    
	//	}


	//=================================REFERRAL SETTINGS===============================================================

	@Given("Click on Referral setting button")
	public void click_on_referral_setting_button() {
		kk.ReferralSettingTab();
	}

	@Given("Select Sign UP")
	public void select_sign_up() {
		kk.SignUpTab();
	}

	@When("admin enter data in Sign UP field  {string},{string}")
	public void admin_enter_data_in_sign_up_field(String WaterDropsForReferrerBox, String WaterDropsForReferreeBox) {
		kk.WaterDropsForReferrerTab(WaterDropsForReferrerBox);
		kk.WaterDropsForReferreeTab(WaterDropsForReferreeBox);
	}

	@When("Referral Setting update button")
	public void referral_setting_update_button() {
		kk.U_SignUp();
	}

	@Then("Toast message {string}")
	public void toast_message(String string) {
		String actResult = kk.toastMessage();
		String expResult = string;
		Assert.assertEquals(actResult, expResult);
	}

	@Then("Referral Setting tab text")
	public void referral_setting_tab_text() throws InterruptedException {
		String[] ReferralSettingTab = { "Water drops for referrer", "Water drops for referee" };
		for (int a = 17; a <= 18; a++) {
			String actResult = kk.ReferralSettingTabText(a).getText();
			System.out.println(actResult);
			String expResult = ReferralSettingTab[a - 17];
			Assert.assertEquals(actResult, expResult);
		}
	}
	
//		@And("Referral Settings update button")
//		public void referral_settings_update_button() {
//			kk.ReferralSettingsUpdate();
//		}
		
		
		@Given("Select Order Completion tab button")
		public void select_order_completion_tab_button() throws InterruptedException {
		    kk.Select_OrderCompletionTab();
		}
		
		@Then("Check Referee & Referrer and Influencer rewards text")
		public void check_referee_referrer_and_influencer_rewards_text() {
		    String [] OrderCompletionTabText = { "Referrer reward limit","Referee reward limit","Water drops per order","Worth of each waterdrop","Water drops per order","Worth of each waterdrop"};
			for (int i=17; i<=22; i++) {
				String actResult = kk.Referee_Referrer_and_Influencer_rewards_text(i).getText();
				System.out.println(actResult);
				String expResult = OrderCompletionTabText[i-17];
				Assert.assertEquals(actResult, expResult);
			}
		}
		

		@Given("Enter data {string}, {string}, {string}, {string}, {string},{string}")
		public void enter_data(String Referrer_Reward_LimitBox, String Referree_Reward_LimitBox, String Water_Drops_Per_OrderBox, String Worth_Of_Each_WaterDropBox, String Infulencer_WaterDrop_Per_OrderBox, String Infulencer_Worth_Of_Each_WaterDropBox) {
		    kk.EnterData_Referrer_Reward_Limit(Referrer_Reward_LimitBox);
		    kk.EnterData_Referree_Reward_Limit(Referree_Reward_LimitBox);
		    kk.EnterData_Water_Drops_Per_Order(Water_Drops_Per_OrderBox);
		    kk.EnterData_Worth_Of_Each_WaterDrop(Worth_Of_Each_WaterDropBox);
		    kk.EnterData_Infulencer_WaterDrop_Per_Order(Infulencer_WaterDrop_Per_OrderBox);
		    kk.EnterData_Infulencer_Worth_Of_Each_WaterDrop(Infulencer_Worth_Of_Each_WaterDropBox);
		}


		@When("Order Completion Update Button")
		public void order_completion_update_button() {
		    kk.Order_Completion_UpdateButton();
		}

		
		
	
	//===========================================CONVENINIENCE FEE SETTINGS==============================================

	@Given("Click on Convenience Fee Setting")
	public void click_on_convenience_fee_setting() {
		kk.convenienceFeeSetting();
	}

	@Then("Print All Tab Text")
	public void print_all_tab_text() {
		String[] cFeeSettingTab = { "Conv fee long term booking", "Conc fee single booking", "Conv fee CGST (%)",
				"Conv fee SGST (%)", "Conv fee GST code" };
		for (int a = 8; a <= 12; a++) {
			String actResult = kk.cFeeSettingTabText(a).getText();
			System.out.println(actResult);
			String expResult = cFeeSettingTab[a - 8];
			Assert.assertEquals(actResult, expResult);
		}
	}

	@Given("Admin enter required field  {string}, {string}, {string}, {string},{string}")
	public void admin_enter_required_field(String ConvFeeLongTermBooking, String ConcFeeSingleBooking,
			String ConvFeeCGST, String ConvFeeSGST, String ConvFeeGSTCode) {
		kk.ConvfeelongtermbookingTextBox(ConvFeeLongTermBooking);
		kk.ConcfeesinglebookingTextBox(ConcFeeSingleBooking);
		kk.ConvfeeCGSTTextBox(ConvFeeCGST);
		kk.ConvfeeSGSTTextBox(ConvFeeSGST);
		kk.ConvfeeGSTcodeTextBox(ConvFeeGSTCode);

	}

	@When("conFeeSetting update button")
	public void con_fee_setting_update_button() {
		kk.conFeeSettingUpdate();
	}


	//=================================================TIME SETTINGS========================================================

	@Given("Click on Time setting")
	public void click_on_time_setting() {
		kk.TimeSettingTab();
	}

	@Then("Time tab text")
	public void time_tab_text() {
		String[] TimeSettingTab = { "Supplier order acceptance intervel(minutes)", "Consumer notify time",
				"Consumer disable time", "Distributor notify time", "Distributor disable time", "WFS notify time",
		"WFS disable time" };
		for (int a = 19; a <= 25; a++) {
			String actResult = kk.TimeSettingTabText(a).getText();
			System.out.println(actResult);
			String expResult = TimeSettingTab[a - 19];
			Assert.assertEquals(actResult, expResult);
		}
	}

	@Given("admin enter data in required field  {string},{string},{string},{string},{string},{string},{string}")
	public void admin_enter_data_in_required_field(String SupplierOrderAcceptanceIntervel, String ConsumerNotifyTime,
			String ConsumerDisableTime, String DistributorNotifyTime, String DistributorDisableTime,
			String WFSNotifyTime, String WFSDisableTime) {
		kk.SupplierOrderAcceptanceIntervelTextBox(SupplierOrderAcceptanceIntervel);
		kk.ConsumerNotifyTimeTextBox(ConsumerNotifyTime);
		kk.ConsumerDisableTimeTextBox(ConsumerDisableTime);
		kk.DistributorNotifyTimeTextBox(DistributorNotifyTime);
		kk.DistributorDisableTimeTextBox(DistributorDisableTime);
		kk.WFSNotifyTimeTextBox(WFSNotifyTime);
		kk.WFSDisableTimeTextBox(WFSDisableTime);
	}

	@When("Time Settings update button")
	public void time_settings_update_button() {
		kk.TimeSettingsUpdate();
	}





	//================================================SETTLEMENT SETTINGS====================================================


	@Given("Click on Settlement Settings button")
	public void click_on_settlement_settings_button() {
	    kk.Settlement_SettingsButton();
	}

	@Then("Check Settlement Settings text")
	public void check_settlement_settings_text() {
	    String [] settlement_settings = { "Distributor Settlement Price", "Base Watercan Price", "Filling Station Settlement Price"};
		for(int i = 20; i<=22; i++) {
			String actResult = kk.Settlement_Settings_TabText(i).getText();
			System.out.println(actResult);
			String expResult = settlement_settings[i-20];
			Assert.assertEquals(actResult, expResult);
		}
	}


	@Given("Enter Data in Settlemetn Settings {string}, {string}, {string}")
	public void enter_data_in_settlemetn_settings(String Distributor_Settlement_PriceBox, String Base_Watercan_PriceBox, String Filling_Station_Settlement_PriceBox) {
	    kk.Enter_Distributor_Settlement_Price(Distributor_Settlement_PriceBox);
	    kk.Enter_Base_Watercan_Price(Base_Watercan_PriceBox);
	    kk.Enter_Filling_Station_Settlement_Price(Filling_Station_Settlement_PriceBox);
	}

	@When("Click on Settlement Settings Update Button")
	public void click_on_settlement_settings_update_button() {
	    kk.Settlement_Settings_UpdateButton();
	}



	//================================================PWD CONVENIENCE FEE===================================================


	@Given("Click on PWD Convenience Fee")
	public void click_on_pwd_convenience_fee() {
		kk.PDWConvenienceFee();

	}

	@Then("Test All Tab Text")
	public void test_all_tab_text() {
		//String[] PWDcFeeSettingTab = { "PWD Conv fee CGST (%)", "PWD Conv fee SGST (%)", "PWD Conv fee GST code" };
		for (int a = 23; a <= 26; a++) {
			String actResult = kk.PWDConFeeTabText(a).getText();
			System.out.println(actResult);
		//	String expResult = PWDcFeeSettingTab[a - 23];
		//	Assert.assertEquals(actResult, expResult);
		}
	}

	@Given("Admin enter required field  {string}, {string}, {string}")
	public void admin_enter_required_field(String PWDConvFeeCGST, String PWDConvFeeSGST, String PWDConvFeeGSTcode) {
		kk.PWDConvFeeCGSTTextBox(PWDConvFeeCGST);
		kk.PWDConvFeeSGSTTextBox(PWDConvFeeSGST);
		kk.PWDConvFeeGSTcodeTextBox(PWDConvFeeGSTcode);
	}

	@When("PWDconFee update button")
	public void pw_dcon_fee_update_button() {
		kk.PWDConvFeeUpdate();
	}



	//====================================CANCELLATION FEE SETTINGS===========================================================

	@Given("Click on Cancellation fee setting")
	public void click_on_cancellation_fee_setting() {
		kk.CancellationFeeSettingTab();
	}

	@Then("Cancellation Fee Setting tab text")
	public void cancellation_fee_setting_tab_text() {
		String[] CancellationFeeSettingTab = { "Supplier cancel fee %", "Consumer cancel fee %" };
		for (int a = 28; a <= 29; a++) {
			String actResult = kk.CancellationFeeSettingTabText(a).getText();
			System.out.println(actResult);
			String expResult = CancellationFeeSettingTab[a - 28];
			Assert.assertEquals(actResult, expResult);
		}
	}

	@Given("admin enter data in required field  {string}, {string}")
	public void admin_enter_data_in_required_field(String SupplierCancelFee, String ConsumerCancelFee) {
		kk.SupplierCancelFeeTextBox(SupplierCancelFee);
		kk.ConsumerCancelFeeTextBox(ConsumerCancelFee);
	}

	@When("Cancellation fee setting update button")
	public void cancellation_fee_setting_update_button() {
		kk.CancellationFeeUpdate();
	}

	
      //==========================================Force Consumer App Update============================================


	
	@Given("Click on Force Consumer App Update")
	public void click_on_force_consumer_app_update() {
	   kk.Force_Consumer_Apps_Update_Tab();
	}

	@Then("Check All Radio button text")
	public void check_all_radio_button_text() {
		String [] Radio_Buttons = { "Update Is mandatory","Force App Tour","Update Is mandatory","Force App Tour"};
	    for (int i=1; i<=5; i++) {
		String actResult = kk.All_Radio_ButtonText(i).getText();
		System.out.println(actResult);
		String expResult = Radio_Buttons[i-1];
		Assert.assertEquals(actResult, expResult);
		
	}
	}
	
	@Given("Fill Textboxes to make Update mandatory for android {string}, {string}, {string}")
	public void fill_textboxes_to_make_update_mandatory_for_android(String Android_CurrentVersionBox, String messageBox, String headerBox) {
	    kk.Update_Android_CurrentVersion(Android_CurrentVersionBox);
	    kk.Update_message(messageBox);
	    kk.Update_headerBox(headerBox);
	}


	@When("Click on Radio Button of Update is mandatory in android")
	public void click_on_radio_button_of_update_is_mandatory_in_android() {
	    kk.Select_RadioButton_UpdateISMandatory_Android();
	}
	
	
	@When("Update Button of Force Consumer App")
	public void update_button_of_force_consumer_app() {
	    kk.Update_Buton_ForceConsumerAppsUpdate();
	}



	@Given("Click on Radio Button of Update Force App tour setting in Android")
	public void click_on_radio_button_of_update_force_app_tour_setting_in_android() {
	    kk.Select_RadioButton_ForceAppTour_Android();
	}


	@Given("Fill Textboxes to make Update mandatory for IOS {string}, {string}, {string}")
	public void fill_textboxes_to_make_update_mandatory_for_ios(String ios_CurrentVersionBox, String ios_messageBox, String ios_headerBox) {
	    kk.Update_ios_CurrentVersion(ios_CurrentVersionBox);
	    kk.Update_ios_message(ios_messageBox);
	    kk.Update_ios_headerBox(ios_headerBox);
	}

	@When("Click on Radio Button of Update is mandatory in IOS")
	public void click_on_radio_button_of_update_is_mandatory_in_ios() {
	    kk.Select_RadioButton_UpdateISMandatory_ios();
	}


	@Given("Click on Radio Button of Update Force App tour setting in IOS")
	public void click_on_radio_button_of_update_force_app_tour_setting_in_ios() {
	    kk.Select_RadioButton_ForceAppTour_ios();
	}

	
	@Given("Fill Textboxes to make Update mandatory for WEBAPP {string}")
	public void fill_textboxes_to_make_update_mandatory_for_webapp(String webapp_CurrentVersionBox) {
	    kk.Update_webapp_CurrentVersion(webapp_CurrentVersionBox);
	}

	@When("Click on Radio Button of Update is mandatory in WEBAPP")
	public void click_on_radio_button_of_update_is_mandatory_in_webapp() {
	    kk.Select_RadioButton_ForceAppTour_webapp();
	}
}
