package stepDefination;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pages.mainsettingsPage;
import com.pages.promoCode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepsPromoCode {
	
	promoCode mm = new promoCode (mainsettingsPage.ldriver);

	@When("Click on Promo Code Tab")
	public void click_on_promo_code_tab() {
		mm.promoCodePageOnDashBoard();
	}

	@Then("Check Promo Code tab text")
	public void check_promo_code_tab_text() {
	    String actResult = mm.Check_Text_Of_PromoCode();
	    System.out.println(actResult);
	    String expResult = "ADD PROMO";
	    Assert.assertEquals(actResult, expResult);
	}
	
	@Given("check promo code table text")
	public void check_promo_code_table_text() {
		String PromoCode_TableText[] = {"S.no","Promo Label","Promo Disclaimer","Offer Type","IsExpired","Action"};
		for (int i=1; i<=6; i++) {
	    String actResult = mm.check_Promo_Code_Table_Text(i);
	    System.out.println(actResult);
	    String expResult = PromoCode_TableText[i-1];
	    Assert.assertEquals(actResult, expResult);
	    
	}
	}

	@Given("Click on Next Page button")
	public void click_on_next_page_button() throws InterruptedException {
	    mm.checkNextButtonCountAndEnabled();
	}

	@Then("Verify last Page text")
	public void verify_last_page_text() {
	   String actResult = mm.checkLastPageText();
	   System.out.println(actResult);
	   String expResult = "No More Promocodes Left!!!";
	   Assert.assertEquals(actResult, expResult);
	   mm.Click_on_BackButtonOfPage();
	}
	
	@Given("Click on Add Promo Code button")
	public void click_on_add_promo_code_button() throws InterruptedException {
	    mm.Click_On_PromoCode_Button();
	}

	@Then("Check Heading of dialog box")
	public void check_heading_of_dialog_box() {
	    String actResult = mm.Check_Heading_Of_DialogBox();
	    System.out.println(actResult);
	    String expResult = "Create or Add Promo Code Here";
	    Assert.assertEquals(actResult, expResult);
	}

	@Then("verify text of textboxes")
	public void verify_text_of_textboxes() {
		String text_OF_PromoCOde[] = {"Promo Label","Minimum order Price","Promo Offer Value","Max Usage Limit","Validity In Days","Validity In Hours","Promo Disclaimer"};
	    for (int i=1; i<=7; i++) {
	    	String actResult = mm.Check_text_Of_DialogBox(i);
	    	System.out.println(actResult);
	    	String expResult = text_OF_PromoCOde[i-1];
	    	Assert.assertEquals(actResult, expResult);
	    }
	}
	
	

	@Given("Enter Values in textbox {string},{string}, {string}, {string},{string},{string}")
	public void enter_values_in_textbox(String PromoLabelBox, String Minimum_order_PriceBox, String Promo_Offer_ValueBox, String Validity_In_DaysBox, String Validity_In_HoursTextBox, String promo_DisclaimerBox) throws InterruptedException {
	    
		mm.PromoLabelTextBox(PromoLabelBox);
	    mm.Click_PromoCode_TypeComboBox();
	    mm.Select_SingleUse_PromoCode_Type();
	    mm.Select_Promo_Offer_TypeComboBox();
	    mm.Select_CashBackWaterDrop_PromoOffer_Type();
	    mm.Minimum_order_PriceTextBox(Minimum_order_PriceBox);
	    mm.Promo_Offer_ValueTextBox(Promo_Offer_ValueBox);
	   // mm.Max_Usage_LimitTextBox(Max_Usage_LimitBox);
	    mm.Validity_In_DaysTextBox(Validity_In_DaysBox);
	    mm.Validity_In_HoursTextBox(Validity_In_HoursTextBox);
	    mm.promo_DisclaimerTextBox(promo_DisclaimerBox);
	}
	
	@When("Click on ADD promo button")
	public void click_on_add_promo_button() throws InterruptedException {
	   mm.Click_Add_Button();
	}

	
	@Given("Click on Add Promo Code")
	public void click_on_add_promo_code() throws InterruptedException {
	   mm.Click_On_PromoCode_Button();
	}


	@Given("Enter Values in textboxes {string}, {string}, {string}, {string},{string},{string}")
	public void enter_values_in_textboxes(String PromoLabelBox, String Minimum_order_PriceBox, String Promo_Offer_ValueBox, String Validity_In_DaysBox, String Validity_In_HoursTextBox, String promo_DisclaimerBox) throws InterruptedException {
		//mm.Click_On_PromoCode_Button();
		mm.PromoLabelTextBox(PromoLabelBox);
	    mm.Click_PromoCode_TypeComboBox();
	    mm.Select_SingleUse_PromoCode_Type();
	    mm.Select_Promo_Offer_TypeComboBox();
	    mm.Select_PercentageDiscount_PromoOffer_Type();
	    mm.Minimum_order_PriceTextBox(Minimum_order_PriceBox);
	    mm.Promo_Offer_ValueTextBox(Promo_Offer_ValueBox);
	   // mm.Max_Usage_LimitTextBox(Max_Usage_LimitBox);
	    mm.Validity_In_DaysTextBox(Validity_In_DaysBox);
	    mm.Validity_In_HoursTextBox(Validity_In_HoursTextBox);
	    mm.promo_DisclaimerTextBox(promo_DisclaimerBox);
	}

	@When("Click on ADD")
	public void click_on_add() throws InterruptedException {
		 mm.Click_Add_Button();
		// mm.Click_On_CloseButton();
	}
	
	@When("Click on Close")
	public void click_on_close() throws InterruptedException {
		mm.Click_On_CloseButton();
	}
	
	@When("Click on Close button")
	public void click_on_close_button() throws InterruptedException {
		mm.Click_On_CloseButton();
	}


	@Given("Click on Promo Code")
	public void click_on_promo_code() {
	   mm.Click_On_PromoCode();
	}

	@When("Click On Delete Button")
	public void click_on_delete_button() throws InterruptedException {
	   mm.Click_On_DeletePromoCode();
	   
	}
	
	@When("Click on Agree button")
	public void click_on_agree_button() {
		mm.Click_On_Agree_To_DeletePromoCode();
	}
	
	
	@Given("Enter Values in promocode textboxes {string}, {string}, {string}, {string},{string},{string}")
	public void enter_values_in_promocode_textboxes(String PromoLabelBox, String Minimum_order_PriceBox, String Promo_Offer_ValueBox, String Validity_In_DaysBox, String Validity_In_HoursTextBox, String promo_DisclaimerBox) throws InterruptedException {
		mm.PromoLabelTextBox(PromoLabelBox);
	    mm.Click_PromoCode_TypeComboBox();
	    mm.Select_SingleUse_PromoCode_Type();
	    mm.Select_Promo_Offer_TypeComboBox();
	    mm.Select_Price_Discount_PromoOffer_Type();
	    mm.Minimum_order_PriceTextBox(Minimum_order_PriceBox);
	    mm.Promo_Offer_ValueTextBox(Promo_Offer_ValueBox);
	   // mm.Max_Usage_LimitTextBox(Max_Usage_LimitBox);
	    mm.Validity_In_DaysTextBox(Validity_In_DaysBox);
	    mm.Validity_In_HoursTextBox(Validity_In_HoursTextBox);
	    mm.promo_DisclaimerTextBox(promo_DisclaimerBox);
	}
	
	
	@Given("Enter Values in promocode textboxes {string}, {string}, {string}, {string}, {string},{string},{string}")
	public void enter_values_in_promocode_textboxes(String PromoLabelBox, String Minimum_order_PriceBox, String Promo_Offer_ValueBox, String Max_Usage_LimitBox, String Validity_In_DaysBox, String Validity_In_HoursTextBox, String promo_DisclaimerBox) throws InterruptedException {
		mm.PromoLabelTextBox(PromoLabelBox);
	    mm.Click_PromoCode_TypeComboBox();
	    mm.Select_MultiUse_PromoCodes_Type();
	    mm.Select_Promo_Offer_TypeComboBox();
	    mm.Select_CashBackWaterDrop_PromoOffer_Type();
	    mm.Minimum_order_PriceTextBox(Minimum_order_PriceBox);
	    mm.Promo_Offer_ValueTextBox(Promo_Offer_ValueBox);
	    mm.Max_Usage_LimitTextBox(Max_Usage_LimitBox);
	    mm.Validity_In_DaysTextBox(Validity_In_DaysBox);
	    mm.Validity_In_HoursTextBox(Validity_In_HoursTextBox);
	    mm.promo_DisclaimerTextBox(promo_DisclaimerBox);
	}
	
	
	@Given("Click on multi use Cashback Water Drop Promo Code")
	public void click_on_multi_use_cashback_water_drop_promo_code() {
	    mm.Click_On_PromoCode();
	    
	}

	

	
	@Given("Enter Values in promocode textboxes Percentage Discount {string}, {string}, {string}, {string}, {string},{string},{string}")
	public void enter_values_in_promocode_textboxes_percentage_discount(String PromoLabelBox, String Minimum_order_PriceBox, String Promo_Offer_ValueBox, String Max_Usage_LimitBox, String Validity_In_DaysBox, String Validity_In_HoursTextBox, String promo_DisclaimerBox) throws InterruptedException {  
		mm.PromoLabelTextBox(PromoLabelBox);
	    mm.Click_PromoCode_TypeComboBox();
	    mm.Select_MultiUse_PromoCodes_Type();
	    mm.Select_Promo_Offer_TypeComboBox();
	    mm.Select_PercentageDiscount_PromoOffer_Type();
	    mm.Minimum_order_PriceTextBox(Minimum_order_PriceBox);
	    mm.Promo_Offer_ValueTextBox(Promo_Offer_ValueBox);
	    mm.Max_Usage_LimitTextBox(Max_Usage_LimitBox);
	    mm.Validity_In_DaysTextBox(Validity_In_DaysBox);
	    mm.Validity_In_HoursTextBox(Validity_In_HoursTextBox);
	    mm.promo_DisclaimerTextBox(promo_DisclaimerBox);
	}
	
	@Given("Click on multi use percentage discount Promo Code")
	public void click_on_multi_use_percentage_discount_promo_code() {
	    mm.Click_On_PromoCode();

	}
	
	@Given("Enter Values in promocode textboxes Price Discount {string}, {string}, {string}, {string}, {string},{string},{string}")
	public void enter_values_in_promocode_textboxes_price_discount(String PromoLabelBox, String Minimum_order_PriceBox, String Promo_Offer_ValueBox, String Max_Usage_LimitBox, String Validity_In_DaysBox, String Validity_In_HoursTextBox, String promo_DisclaimerBox) throws InterruptedException {
		mm.PromoLabelTextBox(PromoLabelBox);
	    mm.Click_PromoCode_TypeComboBox();
	    mm.Select_MultiUse_PromoCodes_Type();
	    mm.Select_Promo_Offer_TypeComboBox();
	    mm.Select_Price_Discount_PromoOffer_Type();
	    mm.Minimum_order_PriceTextBox(Minimum_order_PriceBox);
	    mm.Promo_Offer_ValueTextBox(Promo_Offer_ValueBox);
	    mm.Max_Usage_LimitTextBox(Max_Usage_LimitBox);
	    mm.Validity_In_DaysTextBox(Validity_In_DaysBox);
	    mm.Validity_In_HoursTextBox(Validity_In_HoursTextBox);
	    mm.promo_DisclaimerTextBox(promo_DisclaimerBox);
	}
	
	
	@Given("Click on multi use price discount Promo Code")
	public void click_on_multi_use_price_discount_promo_code() {
		 mm.Click_On_PromoCode();
		
	    	}

	
	@Given("Enter Values in Cumulative Coupon Cashback Water Drop Promo Code {string}, {string}, {string}, {string}, {string},{string},{string}")
	public void enter_values_in_cumulative_coupon_cashback_water_drop_promo_code(String PromoLabelBox, String Minimum_order_PriceBox, String Promo_Offer_ValueBox, String Max_Usage_LimitBox, String Validity_In_DaysBox, String Validity_In_HoursTextBox, String promo_DisclaimerBox) throws InterruptedException {
		mm.PromoLabelTextBox(PromoLabelBox);
	    mm.Click_PromoCode_TypeComboBox();
	    mm.Select_Cumulative_Coupon();
	    mm.Select_Promo_Offer_TypeComboBox();
	    mm.Select_CashBackWaterDrop_PromoOffer_Type();
	    mm.Minimum_order_PriceTextBox(Minimum_order_PriceBox);
	    mm.Promo_Offer_ValueTextBox(Promo_Offer_ValueBox);
	    mm.Max_Usage_LimitTextBox(Max_Usage_LimitBox);
	    mm.Validity_In_DaysTextBox(Validity_In_DaysBox);
	    mm.Validity_In_HoursTextBox(Validity_In_HoursTextBox);
	    mm.promo_DisclaimerTextBox(promo_DisclaimerBox);
	}

	@Given("Click on Cumulative Coupon Cashback Water Drop Promo Code")
	public void click_on_cumulative_coupon_cashback_water_drop_promo_code() {
		 mm.Click_On_PromoCode();
	}


	@Given("Enter Values in Cumulative Coupon promocode textboxes Percentage Discount {string}, {string}, {string}, {string}, {string},{string},{string}")
	public void enter_values_in_cumulative_coupon_promocode_textboxes_percentage_discount(String PromoLabelBox, String Minimum_order_PriceBox, String Promo_Offer_ValueBox, String Max_Usage_LimitBox, String Validity_In_DaysBox, String Validity_In_HoursTextBox, String promo_DisclaimerBox) throws InterruptedException {
		mm.PromoLabelTextBox(PromoLabelBox);
	    mm.Click_PromoCode_TypeComboBox();
	    mm.Select_Cumulative_Coupon();
	    mm.Select_Promo_Offer_TypeComboBox();
	    mm.Select_PercentageDiscount_PromoOffer_Type();
	    mm.Minimum_order_PriceTextBox(Minimum_order_PriceBox);
	    mm.Promo_Offer_ValueTextBox(Promo_Offer_ValueBox);
	    mm.Max_Usage_LimitTextBox(Max_Usage_LimitBox);
	    mm.Validity_In_DaysTextBox(Validity_In_DaysBox);
	    mm.Validity_In_HoursTextBox(Validity_In_HoursTextBox);
	    mm.promo_DisclaimerTextBox(promo_DisclaimerBox);
	}
	
	@Given("Click on Cumulative Coupon percentage discount Promo Code")
	public void click_on_cumulative_coupon_percentage_discount_promo_code() {
		 mm.Click_On_PromoCode();
	}
	
	@Given("Enter Values in Cumulative Coupon promocode textboxes Price Discount {string}, {string}, {string}, {string}, {string},{string},{string}")
	public void enter_values_in_cumulative_coupon_promocode_textboxes_price_discount(String PromoLabelBox, String Minimum_order_PriceBox, String Promo_Offer_ValueBox, String Max_Usage_LimitBox, String Validity_In_DaysBox, String Validity_In_HoursTextBox, String promo_DisclaimerBox) throws InterruptedException {
		mm.PromoLabelTextBox(PromoLabelBox);
	    mm.Click_PromoCode_TypeComboBox();
	    mm.Select_Cumulative_Coupon();
	    mm.Select_Promo_Offer_TypeComboBox();
	    mm.Select_Price_Discount_PromoOffer_Type();
	    mm.Minimum_order_PriceTextBox(Minimum_order_PriceBox);
	    mm.Promo_Offer_ValueTextBox(Promo_Offer_ValueBox);
	    mm.Max_Usage_LimitTextBox(Max_Usage_LimitBox);
	    mm.Validity_In_DaysTextBox(Validity_In_DaysBox);
	    mm.Validity_In_HoursTextBox(Validity_In_HoursTextBox);
	    mm.promo_DisclaimerTextBox(promo_DisclaimerBox);
	}

	@Given("Click on Cumulative Coupon price discount Promo Code")
	public void click_on_cumulative_coupon_price_discount_promo_code() {
		 mm.Click_On_PromoCode();
	}
	
	
	@Given("Enter Values in Wallet Recharge Coupon Cashback Water Drop Promo Code {string}, {string}, {string}, {string}, {string},{string},{string}")
	public void enter_values_in_wallet_recharge_coupon_cashback_water_drop_promo_code(String PromoLabelBox, String Minimum_order_PriceBox, String Promo_Offer_ValueBox, String Max_Usage_LimitBox, String Validity_In_DaysBox, String Validity_In_HoursTextBox, String promo_DisclaimerBox) throws InterruptedException {
		mm.PromoLabelTextBox(PromoLabelBox);
	    mm.Click_PromoCode_TypeComboBox();
	    mm.Select_Wallet_Recharge_Coupon();
	    mm.Select_Promo_Offer_TypeComboBox();
	    mm.Select_CashBackWaterDrop_PromoOffer_Type();
	    mm.Minimum_order_PriceTextBox(Minimum_order_PriceBox);
	    mm.Promo_Offer_ValueTextBox(Promo_Offer_ValueBox);
	    mm.Max_Usage_LimitTextBox(Max_Usage_LimitBox);
	    mm.Validity_In_DaysTextBox(Validity_In_DaysBox);
	    mm.Validity_In_HoursTextBox(Validity_In_HoursTextBox);
	    mm.promo_DisclaimerTextBox(promo_DisclaimerBox);
	    	}

	@Given("Click on Wallet Recharge Coupon Cashback Water Drop Promo Code")
	public void click_on_wallet_recharge_coupon_cashback_water_drop_promo_code() {
		 mm.Click_On_PromoCode();
	}

	@Given("Enter Values in Wallet Recharge Coupon promocode textboxes Percentage Discount {string}, {string}, {string}, {string}, {string},{string},{string}")
	public void enter_values_in_wallet_recharge_coupon_promocode_textboxes_percentage_discount(String PromoLabelBox, String Minimum_order_PriceBox, String Promo_Offer_ValueBox, String Max_Usage_LimitBox, String Validity_In_DaysBox, String Validity_In_HoursTextBox, String promo_DisclaimerBox) throws InterruptedException {
		mm.PromoLabelTextBox(PromoLabelBox);
	    mm.Click_PromoCode_TypeComboBox();
	    mm.Select_Wallet_Recharge_Coupon();
	    mm.Select_Promo_Offer_TypeComboBox();
	    mm.Select_PercentageDiscount_PromoOffer_Type();
	    mm.Minimum_order_PriceTextBox(Minimum_order_PriceBox);
	    mm.Promo_Offer_ValueTextBox(Promo_Offer_ValueBox);
	    mm.Max_Usage_LimitTextBox(Max_Usage_LimitBox);
	    mm.Validity_In_DaysTextBox(Validity_In_DaysBox);
	    mm.Validity_In_HoursTextBox(Validity_In_HoursTextBox);
	    mm.promo_DisclaimerTextBox(promo_DisclaimerBox);
	}

	@Given("Click on Wallet Recharge Coupon percentage discount Promo Code")
	public void click_on_wallet_recharge_coupon_percentage_discount_promo_code() {
		 mm.Click_On_PromoCode();

	}

	@Given("Enter Values in Wallet Recharge Coupon promocode textboxes Price Discount {string}, {string}, {string}, {string}, {string},{string},{string}")
	public void enter_values_in_wallet_recharge_coupon_promocode_textboxes_price_discount(String PromoLabelBox, String Minimum_order_PriceBox, String Promo_Offer_ValueBox, String Max_Usage_LimitBox, String Validity_In_DaysBox, String Validity_In_HoursTextBox, String promo_DisclaimerBox) throws InterruptedException {
		mm.PromoLabelTextBox(PromoLabelBox);
	    mm.Click_PromoCode_TypeComboBox();
	    mm.Select_Wallet_Recharge_Coupon();
	    mm.Select_Promo_Offer_TypeComboBox();
	    mm.Select_Price_Discount_PromoOffer_Type();
	    mm.Minimum_order_PriceTextBox(Minimum_order_PriceBox);
	    mm.Promo_Offer_ValueTextBox(Promo_Offer_ValueBox);
	    mm.Max_Usage_LimitTextBox(Max_Usage_LimitBox);
	    mm.Validity_In_DaysTextBox(Validity_In_DaysBox);
	    mm.Validity_In_HoursTextBox(Validity_In_HoursTextBox);
	    mm.promo_DisclaimerTextBox(promo_DisclaimerBox);
	}

	@Given("Click on Wallet Recharge Coupon price discount Promo Code")
	public void click_on_wallet_recharge_coupon_price_discount_promo_code() {
		 mm.Click_On_PromoCode();
	}
	
	
	@Given("Enter Values in textbox Start Date and End Date {string},{string}, {string},{string},{string}, {string},{string}")
	public void enter_values_in_textbox_start_date_and_end_date(String PromoLabelBox, String Minimum_order_PriceBox, String Promo_Offer_ValueBox, String Max_Usage_LimitBox, String Promo_Valid_Start_DateBox, String Promo_Valid_End_DateBox, String promo_DisclaimerBox) throws InterruptedException {
	  
		mm.PromoLabelTextBox(PromoLabelBox);
	    mm.Click_PromoCode_TypeComboBox();
	    mm.Select_Wallet_Recharge_Coupon();
	    mm.Select_Promo_Offer_TypeComboBox();
	    mm.Select_Price_Discount_PromoOffer_Type();
	    mm.Minimum_order_PriceTextBox(Minimum_order_PriceBox);
	    mm.Promo_Offer_ValueTextBox(Promo_Offer_ValueBox);
	    mm.Max_Usage_LimitTextBox(Max_Usage_LimitBox);
	    mm.Promo_Valid_Start_DateTextBox(Promo_Valid_Start_DateBox);
	    mm.Validity_To_Date_RadioButton();
	    mm.Promo_Valid_End_DateTextBox(Promo_Valid_End_DateBox);
	    //mm.Validity_In_DaysTextBox(Validity_In_DaysBox);
	   // mm.Validity_In_HoursTextBox(Validity_In_HoursTextBox);
	    mm.promo_DisclaimerTextBox(promo_DisclaimerBox);
	}
	
	
	@Given("Select Start Date")
	public void select_start_date() {
	    mm.Select_StartDate();
	}

	@Given("Select End Date")
	public void select_end_date() {
	    mm.Select_EndDate();
	}

	@Given("Enter Values in textbox Start Date and End Date {string},{string}, {string},{string},{string}")
	public void enter_values_in_textbox_start_date_and_end_date(String PromoLabelBox, String Minimum_order_PriceBox, String Promo_Offer_ValueBox, String Max_Usage_LimitBox, String promo_DisclaimerBox) throws InterruptedException {
		mm.PromoLabelTextBox(PromoLabelBox);
	    mm.Click_PromoCode_TypeComboBox();
	    mm.Select_Wallet_Recharge_Coupon();
	    mm.Select_Promo_Offer_TypeComboBox();
	    mm.Select_Price_Discount_PromoOffer_Type();
	    mm.Minimum_order_PriceTextBox(Minimum_order_PriceBox);
	    mm.Promo_Offer_ValueTextBox(Promo_Offer_ValueBox);
	    mm.Max_Usage_LimitTextBox(Max_Usage_LimitBox);
	   // mm.Promo_Valid_Start_DateTextBox(Promo_Valid_Start_DateBox);
	    mm.Validity_To_Date_RadioButton();
	   // mm.Promo_Valid_End_DateTextBox(Promo_Valid_End_DateBox);
	    //mm.Validity_In_DaysTextBox(Validity_In_DaysBox);
	   // mm.Validity_In_HoursTextBox(Validity_In_HoursTextBox);
	    mm.promo_DisclaimerTextBox(promo_DisclaimerBox);
	}
	
	
	@Given("Click on Promo Code With Calender")
	public void click_on_promo_code_with_calender() {
		mm.Click_On_PromoCode();
	}
	
	
//	@Given("Verify Table")
//	public void verify_table() {
//	    mm.verify_Table_Data();
//	}

	@Then("Check Data is available on page")
	public void check_data_is_available_on_page() {
		boolean actResult = mm.verify_Table_Data();
		boolean expResult = true;
		Assert.assertEquals(actResult, expResult);
	
	}


	
//	@Given("Click on Back button")
//	public void click_on_back_button() throws InterruptedException {
//	    mm.checkBackButtonCountAndEnabled();
//	}
//
//	@Then("Check main page text")
//	public void check_main_page_text() {
//	    String actResult = mm.Check_TableText_AfterCameBackFromLastPage();
//	    System.out.println(actResult);
//	    String expResult = "Add Promo";
//		Assert.assertEquals(actResult, expResult);
//	}
}
