package stepDefination;

import static org.junit.Assert.assertArrayEquals;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.pages.Home;
import com.pages.settingsPage;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepsSetting {
	settingsPage kk = new settingsPage(Home.ldriver);

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
	public void click_on_common_settings_tab() {
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
	
	@Given("Admin enter required field  {string},{string},{string},{string},{string},{string}, {string}, {string}")
	public void admin_enter_required_field(String MaximumdiscountallowedBox, String Minimumwaterwalletamount, String Waterwalletrechargealert,
			String Extrachargesforsingleorder, String OTPLessDeliveryMsg,
			String ExtrachargesHSNcode, String ExtrachargesCGST, String ExtrachargesSGST) {
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
	public void click_on_update_button() {
		kk.clickUpdateButton();
	}

	@Then("check Toast message {string}") // COMMON METHOD FOR VERIFY TOAST MESSAGE
	public void  check_Toast_message(String string) {

		String actResult = kk.toastMessage();
		String expResult = string;
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

	@When("Click on Add Slots button")
	public void click_on_add_slots_button() {
		kk.AddSlotsTab();
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
	}

	@Then("Count Delivery slot")
	public void count_delivery_slot() {
	    
	}
	
	
	//=======================================BLOCK PAYMENT & BOOKING & TIMIMG===================================

	
	@Given("Click on Block Time setting")
	public void click_on_block_time_setting() throws InterruptedException {
		kk.BlockTimeSettingTab();
		//kk.timingtabbutton();
	}

	@Then("Block Time tab text")
	public void block_time_tab_text() throws InterruptedException {
		String[] BlockTimeSettingTab = { "Start time", "End time" };
		for (int a = 3; a <= 4; a++) {
			String actResult = kk.BlockTimeSettingTabText(a).getText();
			System.out.println(actResult);
			String expResult = BlockTimeSettingTab[a - 3];
			Assert.assertEquals(actResult, expResult);
		}

	}

	@Given("Click on clock textbox and enter time {string}, {string}")
	public void click_on_clock_textbox_and_enter_time(String UstartTime, String UEndTime) throws InterruptedException {
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
	
	@Then("Check successful toast message")
	public void check_successful_toast_message() {
	    String actResult = kk.toastMessage();
	    String expResult = "successfully updated";
	    Assert.assertEquals(actResult, expResult);
	}
	
	
	@Given("Click on BookWater button")
	public void click_on_book_water_button() throws InterruptedException {
		kk.selectslotofBookwater();
	}

	@Then("Check all tab text")
	public void check_all_tab_text() throws InterruptedException {
		String[] SoldByBookwaterTab = {"Company Name","PAN Number","GST Number", "Address"};
	     for (int i = 2; i <= 5; i++) {
		String actResult = kk.SoldByBookWaterText(i).getText();
		System.out.println(actResult);
		String expResult = SoldByBookwaterTab[i - 2];
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

//	@When("Sold by BookWater Update button")
//	public void sold_by_book_water_update_button() {
//	    kk.SoldByBookwaterUpdateButton();
//	}

//	@Then("check toast message {string}")
//	public void check_toast_messages(String string) {
//	    
//	}
	
	
	//=================================REFERRAL SETTINGS===============================================================

	@Given("Click on Referral setting button")
	public void click_on_referral_setting_button() {
		kk.ReferralSettingTab();
	}

	@Then("Referral Setting tab text")
	public void referral_setting_tab_text() throws InterruptedException {
		String[] ReferralSettingTab = { "Referal Water Drop Per Order", "Referral Reward Limit",
				"Rupee Value for Each Water Drop" };
		for (int a = 38; a <= 40; a++) {
			String actResult = kk.ReferralSettingTabText(a).getText();
			System.out.println(actResult);
			String expResult = ReferralSettingTab[a - 38];
			Assert.assertEquals(actResult, expResult);
		}
	}

	@Given("Select Referral type")
	public void select_referral_type() {
		kk.ConsumerReferrer();

	}

	@When("admin enter data in referral setting field  {string},{string},{string}")
	public void admin_enter_data_in_referral_setting_field(String ReferralWaterDropPerOrder, String ReferralRewardLimit,
			String RupeeValueforEachWaterDrop) {
		kk.ReferralWaterDropPerOrderTextBox(ReferralWaterDropPerOrder);
		kk.ReferralRewardLimitTextBox(ReferralRewardLimit);
		kk.RupeeValueforEachWaterDropTextBox(RupeeValueforEachWaterDrop);
	}

	@Given("Select Referree type")
	public void select_referree_type() {
		kk.ConsumerReferree();
	}

	@When("admin enter data in referral setting field  {string}")
	public void admin_enter_data_in_referral_setting_field(String ReferralRewardLimit) {
		kk.referralRewardLimitTextBox(ReferralRewardLimit);
	}

	@And("Referral Settings update button")
	public void referral_settings_update_button() {
		kk.ReferralSettingsUpdate();
	}

	@Then("Toast message {string}")
	public void toast_message(String toast) throws InterruptedException {
		Thread.sleep(500);
		String actResult = kk.toastMessage();
		System.out.println(actResult);
		String expResult = toast;
		Assert.assertEquals(actResult, expResult);

	}

	@Given("Select Influencer type")
	public void select_influencer_type() {
		kk.Influencer();
	}

	@When("admin enter data in Influencer setting field  {string}, {string}")
	public void admin_enter_data_in_influencer_setting_field(String referralWaterDropPerOrder,
			String rupeeValueforEachWaterDrop) {
		kk.referralWaterDropPerOrderTextBox(referralWaterDropPerOrder);
		kk.rupeeValueforEachWaterDropTextBox(rupeeValueforEachWaterDrop);
	}

	@When("Influencer Settings update button")
	public void influencer_settings_update_button() {
		kk.ReferralSettingsUpdate();
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

	
	
	
	
	
	
	//================================================SETTLEMENT SETTINGS====================================================

	
	
	
	
	
	
	//================================================PWD CONVENIENCE FEE===================================================


	@Given("Click on PWD Convenience Fee")
	public void click_on_pwd_convenience_fee() {
		kk.PWDConvenienceFee();

	}

	@Then("Test All Tab Text")
	public void test_all_tab_text() {
		String[] PWDcFeeSettingTab = { "PWD Conv fee CGST (%)", "PWD Conv fee SGST (%)", "PWD Conv fee GST code" };
		for (int a = 13; a <= 15; a++) {
			String actResult = kk.PWDConFeeTabText(a).getText();
			System.out.println(actResult);
			String expResult = PWDcFeeSettingTab[a - 13];
			Assert.assertEquals(actResult, expResult);
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
		for (int a = 29; a <= 30; a++) {
			String actResult = kk.CancellationFeeSettingTabText(a).getText();
			System.out.println(actResult);
			String expResult = CancellationFeeSettingTab[a - 29];
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
	
//	@Given("Click on GST Details")
//	public void click_on_gst_details() {
//		kk.GSTDetailsTab();
//	}
//
//	@Then("Check All Tab Text")
//	public void check_all_tab_text() {
//		String[] GstDetailsTab = { "Extra charges HSN code", "Extra charges CGST %", "Extra charges SGST %",
//				"Water tanker CGST (%)", "Water tanker SGST (%)", "Water tanker GST code", "Sewage Tanker CGST (%)",
//				"Sewage Tanker SGST (%)", "Sewage tanker GST code" };
//		for (int a = 16; a <= 24; a++) {
//			String actResult = kk.PWDConFeeTabText(a).getText();
//			// System.out.println(actResult);
//			String expResult = GstDetailsTab[a - 16];
//			Assert.assertEquals(actResult, expResult);
//		}
//	}
//
//	@Given("admin enter data in required field  {string},{string},{string}")
//	public void admin_enter_data_in_required_field(String ExtraChargesHSNCode, String ExtraChargesCGST,
//			String ExtraChargesSGST) {
//		kk.ExtraChargesHSNCodeTextBox(ExtraChargesHSNCode);
//		kk.ExtraChargesCGSTTextBox(ExtraChargesCGST);
//		kk.ExtraChargesSGSTTextBox(ExtraChargesSGST);
//	}
//
//	@When("GST Details update button")
//	public void gst_details_update_button() {
//		kk.GSTDetailsUpdate();
//	}
//
//	@Given("Click on Gate Way Fee Setting")
//	public void click_on_gate_way_fee_setting() {
//		kk.GateWayFeeSettingTab();
//	}
//
//	@Then("Print All tab text")
//	public void print_all_tab_text1() {
//		String[] GateWayFeeSettingTab = { "Gateway fee", "Gateway fee CGST (%)", "Gateway fee SGST (%)",
//				"Gateway fee GST code" };
//		for (int a = 25; a <= 28; a++) {
//			String actResult = kk.GateWayFeeSettingTabText(a).getText();
//			System.out.println(actResult);
//			String expResult = GateWayFeeSettingTab[a - 25];
//			Assert.assertEquals(actResult, expResult);
//		}
//	}
//
//	@Given("admin enter data in required field  {string},{string},{string},{string}")
//	public void admin_enter_data_in_required_field(String GateWayFee, String GateWayFeeCGST, String GateWayFeeSGST,
//			String GatewayFeeGSTCode) {
//		kk.GateWayFeeTextBox(GateWayFee);
//		kk.GateWayFeeCGSTTextBox(GateWayFeeCGST);
//		kk.GateWayFeeSGSTTextBox(GateWayFeeSGST);
//		kk.GatewayFeeGSTCodeTextBox(GatewayFeeGSTCode);
//	}
//
//	@When("Gate Way Fee Setting update button")
//	public void gate_way_fee_setting_update_button() {
//		kk.GateWayFeeUpdate();
//	}

	

//	@Given("Click on Time setting")
//	public void click_on_time_setting() {
//		kk.TimeSettingTab();
//	}
//
//	@Then("Time tab text")
//	public void time_tab_text() {
//		String[] TimeSettingTab = { "Supplier order acceptance intervel(minutes)", "Consumer notify time",
//				"Consumer disable time", "Distributor notify time", "Distributor disable time", "WFS notify time",
//				"WFS disable time" };
//		for (int a = 31; a <= 37; a++) {
//			String actResult = kk.GateWayFeeSettingTabText(a).getText();
//			System.out.println(actResult);
//			String expResult = TimeSettingTab[a - 31];
//			Assert.assertEquals(actResult, expResult);
//		}
//	}
//
//	@Given("admin enter data in required field  {string},{string},{string},{string},{string},{string},{string}")
//	public void admin_enter_data_in_required_field(String SupplierOrderAcceptanceIntervel, String ConsumerNotifyTime,
//			String ConsumerDisableTime, String DistributorNotifyTime, String DistributorDisableTime,
//			String WFSNotifyTime, String WFSDisableTime) {
//		kk.SupplierOrderAcceptanceIntervelTextBox(SupplierOrderAcceptanceIntervel);
//		kk.ConsumerNotifyTimeTextBox(ConsumerNotifyTime);
//		kk.ConsumerDisableTimeTextBox(ConsumerDisableTime);
//		kk.DistributorNotifyTimeTextBox(DistributorNotifyTime);
//		kk.DistributorDisableTimeTextBox(DistributorDisableTime);
//		kk.WFSNotifyTimeTextBox(WFSNotifyTime);
//		kk.WFSDisableTimeTextBox(WFSDisableTime);
//	}
//
//	@When("Time Settings update button")
//	public void time_settings_update_button() {
//		kk.TimeSettingsUpdate();
//	}

	
//	@Given("Click on Consumer service area rate for all tab")
//	public void click_on_consumer_service_area_rate_for_all_tab() throws InterruptedException {
//		// kk.CloseMainSettingsTab();
//		//Thread.sleep(1800);
//		kk.OpenCommonServiceArea();
//	}
//
//	@Then("Tab text")
//	public void tab_text() throws InterruptedException {
//		//Thread.sleep(1000);
//		String actResult = kk.CheckCommonServiceArea();
//		System.out.println(actResult);
//		String expResult = "Common service area and rate for all";
//		Assert.assertEquals(actResult, expResult);
//	}
//
//	@Given("Enter {string}")
//	public void enter(String pincode) {
//		kk.enterPincodeBox(pincode);
//	}
//
//	@When("Select area {string}")
//	public void select_area(String rate) throws InterruptedException {
//		// kk.ClickOnAreaButton();
//		kk.selectArea(rate);
//	}
//
//	@Then("Check {string},{string}")
//	public void check(String toast, String rate) {
//		int i = parseInt(rate);
//		if (i > 0) {
//			String actResult = kk.toastMessage();
//			System.out.println(actResult);
//			String expResult = toast;
//			Assert.assertEquals(actResult, expResult);
//		} else {
//			String actResult = kk.toastMessage();
//			System.out.println(actResult);
//			String expResult = toast;
//			Assert.assertEquals(actResult, expResult);
//		}
//	}
//
//	private int parseInt(String rate) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	

	

}
