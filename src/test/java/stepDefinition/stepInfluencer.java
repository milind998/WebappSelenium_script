package stepDefinition;

import java.awt.AWTException;

import com.pages.InfluencerPage;
import com.pages.Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class stepInfluencer {
	
	InfluencerPage influ = new InfluencerPage(Loginpage.ldriver);
	
	@Given("Click on the influencer")
	public void click_on_the_influencer() throws InterruptedException {
		Thread.sleep(2000);
		influ.influencerlink();
	}
	@When("Select the Influencer tab")
	public void select_the_influencer_tab() throws InterruptedException {
		influ.clickinfluencertab();
		Thread.sleep(1000);
		
	}
	@When("Select Influencer Request dropdown")
	public void select_influencer_request_dropdown() {
		influ.clickinfluencerdropdown();
	}

	@When("Select the influencer request")
	public void select_the_influencer_request() {
		influ.clickinfluencerrequestdropdown();
	}
	@When("Click on Search button")
	public void click_on_search_button() throws InterruptedException {
		influ.clicksearchbtn();
		Thread.sleep(1000);
		
		
	}
	@When("Click on Requestlist")
	public void click_on_requestlist() throws InterruptedException {
		influ.clickrequestlist();
		Thread.sleep(2000);
		
	}
	@When("Click on Reject")
	public void click_on_reject() throws InterruptedException {
	    influ.clickreject();
	 //c   Thread.sleep(2000);
	    influ.infuwaits();
	  
	}
	@When("Click on Accept")
	public void click_on_accept()  throws InterruptedException {
		
		influ.clickaccept();
		//Thread.sleep(1000);
	}
	@When("Click on Agree")
	public void click_on_agree() throws InterruptedException  {
		influ.clickagree();
     //	Thread.sleep(2000); 
		influ.infuwaits();
       
		
		
	}
	@When("Click on Disagree")
	public void click_on_disagree() throws InterruptedException {
		influ.clickdisagree();
	//	Thread.sleep(2000);
	}
	@When("Enter the valid from date")
	public void enter_the_valid_from_date() throws InterruptedException {
		//influ.waits();
		influ.clickvalidfrom();
		influ.scroll();
		influ.clickvalidfromdate();
		Thread.sleep(2000);
		
	}
	@When("Enter the valid to date")
	public void enter_the_valid_to_date()  throws InterruptedException {
		//influ.waits();
		influ.clickvalidto();
		influ.scroll();
		influ.clickvalidtodate();
		Thread.sleep(2000);
		
	}
	
	@When("Update the valid to date")
	public void update_the_valid_to_date() throws InterruptedException {
    
     	influ.clickvalidto();
     	influ.scroll();
	    influ.updatevalidtodate();
	    Thread.sleep(2000);
	   
		
	}
	
	@When("Select Influencer dropdown")
	  public void select_influencer_dropdown() {
		influ.clickinfluencerdropdown();
	  }
	  @When("Select the influencer")
		public void select_the_influencer() throws InterruptedException {
		  influ.clickinfluencer();
		  Thread.sleep(1000);
		}
	  @When("Click on Influencerlist")
	  public void click_on_influencerlist() throws InterruptedException {
		  influ.clickrequestlist();
		  Thread.sleep(1000);
	  }
	  @When("Click on update")
	  public void click_on_update() throws InterruptedException{
		  influ.clickupdate();
		  Thread.sleep(1000);
		 // influ.infuwaits();
	      
	     
	  }
	  @When("Click on Deactivate")
	  public void click_on_deactivate() throws InterruptedException {
		  influ.clickdeactivate();
		  Thread.sleep(2000);
		 
	  }
	  @When("Select the influencer disabled")
	  public void select_the_influencer_disabled() {
		  influ.clickinflencerdisbled();
		//  influ.waits();
	  }
	  /*this is influencer rejected*/
	  @When("Select the influencer rejected")
	  public void select_the_influencer_rejected() throws InterruptedException {
		  influ.clickinflencerrejected();
		  Thread.sleep(1000);
	  }
	  
	  
	  /*This is for Influencer settlement*/
	  @When("Select the Influencersettlement tab")
	  public void select_the_influencersettlement_tab() throws InterruptedException {
		  influ.clickinflencersettlementtab();
		  Thread.sleep(2000);
		  influ.scroll();
	  }

	  @When("Select the InfluencerSettlement list")
	  public void select_the_influencer_settlement_list() throws InterruptedException {	
		  influ.clickinflencersettlementlist();
		  Thread.sleep(1000);
		 	  
		
	  }
	  
	  @When("Click on Influencer Settlement Accept")
	  public void click_on_influencer_settlement_accept() throws InterruptedException {
	      influ.clickinflencersettlementaccept();
	      Thread.sleep(2000);
	      
	      
	  }
	  
	  @When("Enter the TDS charge percentage")
	  public void enter_the_tds_charge_percentage() throws InterruptedException {
		 // Thread.sleep(2000);
		 
		  influ.scroll();
	      influ.entertdscharge();
	  }

	  @When("Enter the Extra Charge percentage")
	  public void enter_the_extra_charge_percentage() {
	      influ.enterextracharge();
	      
	  }

	  @When("Upload the Payment receipt")
	  public void upload_the_payment_receipt() {
		  
	      influ.uploadsettlementreceipt();
	      influ.infuwaits();
	  }

	  @When("Click on Settle influencer button")
	  public void click_on_settle_influencer_button() {
		  influ.clicksettleinfluencer();
		  influ.infuwaits();
		
	  }
	  
	  @When("Click on Influencer Settlement Reject")
	  public void click_on_influencer_settlement_reject() {
		  influ.clickinflencersettlementreject();
		  influ.infuwaits();
	  }
	  
	  @When("Click on Influencer Settlement Close")
	  public void click_on_influencer_settlement_close() {
		  influ.clickinflencersettlementclose();
	  }
  /*settlement filter */
	  @When("Click on the InfluencerSettlement Filter")
	  public void click_on_the_influencer_settlement_filter() {
	      influ.clicksettlementfilter();
	  }


	  @When("Select Order by Desc")
	  public void select_order_by_desc() {
	     influ.clicksettlementdesc();
	  }
	  @When("Select Request rejected")
	  public void select_request_rejected() {
	      influ.clicksettlementreject();
	  }
	  @When("Click on settlement Filter")
	  public void click_on_settlement_filter() {
	      influ.clicksettlementrejectsearch();
	  }
	  
	  /*This is for settlement history*/
	  @When("Click on the Settlement History")
	  public void click_on_the_settlement_history() {
	     influ.clicksettlementhistory();
	  }

	  @When("Enter invalid influencer {string}")
	  public void enter_invalid_influencer(String string) {
	      influ.enterinfluencerphone(string);
	      
	  }

	  @When("Click on settlement search button")
	  public void click_on_settlement_search_button() throws InterruptedException {
		 influ.clicksettlementsearch();
		 Thread.sleep(2000);	 	 
	  }

	  @When("Enter valid influencer Phone number")
	  public void enter_valid_influencer_phone_number() {
	      influ.enterinfluencervalidphone();
	  }
	  @When("Clear the phone number")
	  public void clear_the_phone_number() {
		  influ.clearinfluencerphone();
	  }
	  
	  @When("Scroll Down to the influencer settlement details")
	  public void scroll_down_to_the_influencer_settlement_details() {
		  influ.scroll();
	  }

	  @When("Download the Payment receipt of settlement")
	  public void download_the_payment_receipt_of_settlement() {
	      influ.clickdownloadreceipt();
	  }

	  @When("Click on influncer notify button")
	  public void click_on_influncer_notify_button() throws InterruptedException {
	      influ.clicknotifyinfluencer();
	     // influ.waits();
	      Thread.sleep(2000);
	  }
	  
	  @When("Enter on Issued from data")
	  public void enter_on_issued_from_data() {
	   influ.enterissuedfrom();
	  }

	  @When("Enter on payment mode")
	  public void enter_on_payment_mode() {
	      influ.enterpaymentmode();
	  }

	  @When("Select the influencer Address")
	  public void select_the_influencer_address() throws InterruptedException {
	      influ.clickinfluenceraddressdropdown();	 
	      influ.clickinfluenceraddress();
	    //  Thread.sleep(2000);
	  }

	  @When("Select the influencer bank Account")
	  public void select_the_influencer_bank_account() {
    	  influ.clickaccountnumberdropdown();
    	 
	    influ.clickselectaccountnumber();
	  }

	  @When("Select the Notify date")
	  public void select_the_notify_date() {
	     influ.clicknotifydate();
	  }

	  @When("Click on Submit notify button")
	  public void click_on_submit_notify_button() {
		  
	    influ.clicksubmitbutton();
	   // influ.waittoastMessage();
	    influ.infuwaits();
	    
	  }
	  
	  /* this is for Banners tab*/
	  @When("Select the Banners tab")
	  public void select_the_banners_tab() {
	      influ.clickbannertab();
	  }
	  @When("Click on Banners")
	  public void click_on_banners() {
	      influ.clickaddbanner();
	  }

	  @When("Click on Addbanners button")
	  public void click_on_addbanners_button() {
	      influ.clickaddbannerbutton();
	  }
	  @When("Select the Banner type")
	  public void select_the_banner_type() {
		  //influ.waits();
	      influ.clickbannertypedropdown();
	      influ.clickselectbannertype();
	  }
	  @When("Enter Banner Message")
	  public void enter_banner_message() {
	      influ.enterbannermessage();
	  }
	  @When("Enter banner Header")
	  public void enter_banner_header() {
	      influ.enterbannerheader();
	  }
	  @When("Enter Expiry hour")
	  public void enter_expiry_hour() {
	      influ.enterexpiryhours();
	  }

	  @When("Enter Display order")
	  public void enter_display_order() {
	     influ.enterdisplayorder();
	  }
	  @When("Upload image for small screensize")
	  public void upload_image_for_small_screensize() {
	      influ.uploadsmallimage();
	      
	  }
	  @When("Upload image for max screensize")
	  public void upload_image_for_max_screensize() {
	      influ.uploadmaximage();
	  }

	  @When("Click on App Page")
	  public void click_on_app_page() {
	     influ.selectapppage();
	     influ.clickapppage();
	  }
	  @When("Click on Add banner")
	  public void click_on_add_banner() throws InterruptedException {
	     influ.clickcreatenewbanner();
	   //  influ.waittoastMessage();
	     Thread.sleep(3000);
	  }
	  // filter option
	  @When("Click on Filter button")
	  public void click_on_filter_button() {
	      influ.clickbannerfilter();
	      influ.waits();
	  }

	  @When("Click on descending")
	  public void click_on_descending() {
	      influ.clickselectdesc();
	      influ.waits();
	  }

	  @When("Click on Disabled")
	  public void click_on_disabled() {
	      influ.clickselectdisabled();
	      influ.waits();
	  }
	  @When("Click on ascending")
	  public void click_on_ascending() {
	      influ.clickselectasc();
	      influ.waits();
	  }

	  @When("Click on Enabled")
	  public void click_on_enabled() {
	      influ.clickselectenabled();
	      influ.waits();
	  }
	  @When("Click on filter")
	  public void click_on_filter() throws InterruptedException {
	     influ.clickfilter();
	     influ.waits();
	    // Thread.sleep(1000);
	  }
	  @When("Click on Disabled list")
	  public void click_on_disabled_list() {
	      influ.clickdisabledlist();
	  }
	  @When("Click Disable to Enable")
	  public void click_disable_to_enable() {
	      influ.clicktoggledisabletoenable();
	      influ.scroll();
	  }
	  
	  @When("Click on EditFilter")
	  public void click_on_edit_filter() {
	     influ.clickeditfilter();
	     influ.scrollup();
	  }
	  // this is for adding banner type 
	  @When("Click on Banner Type")
	  public void click_on_banner_type() {
		  influ.clickbannertypetab();
	  }

	  @When("Click on AddBannertype button")
	  public void click_on_add_bannertype_button() {
		  influ.clickaddbannertype();
	  }

	  @When("Enter Banner Type Name")
	  public void enter_banner_type_name() {
		  influ.enterbannertype();
	  }
	  
	  @When("Click to Enable Bannertype")
	  public void click_to_enable_bannertype() {
		  influ.clickbannertypetoggle();
	  }

	  @When("Click on Add")
	  public void click_on_add() {
		 influ.clickaddbannertypename();
		 influ.infuwaits();
	  }
	  /*banner type filter and Disabling the banner type*/
	  
	  @When("Click on Banner type Filter button")
	  public void click_on_banner_type_filter_button() {
	     influ.clickbannertypefilter();
	  }

	  @When("Click on Asc")
	  public void click_on_asc() {
	     influ.clickbannertypefilterasc();
	  }

	  @When("Click on Filter banner type")
	  public void click_on_filter_banner_type() {
	     influ.clickbannertypefilterbutton();
	     
	  }

	  @When("Click on Desc")
	  public void click_on_desc() {
	    influ.clickbannertypefilterdesc();
	    
	  }
	  
	  @When("Click on Enabled banner type")
	  public void click_on_enabled_banner_type() {
	  influ.clickbannertypefilterenabled();
	 
	  }
	  
	  @When("Click on Disabled banner type")
	  public void click_on_disabled_banner_type() {
	      influ.clickbannertypefilterdisabled();
	  }

	  @When("Click on Banner type List")
	  public void click_on_banner_type_list() {
	     influ.clickbannertypeenabledlist();
	  }

	  @When("Click on Close button")
	  public void click_on_close_button() {
	     influ.clickbannertypeclose();
	  }

	  @When("Click on the Disable toggle button of the Banner type")
	  public void click_on_the_disable_toggle_button_of_the_banner_type() {
         influ.clickbannertypetodisable();
	  }
	  
	  @When("Click on Update Banner type")
	  public void click_on_update_banner_type() {
	    influ.clickbannertypeupdate();
	  }
	  
	  /*Lost cans notify and disable cans*/
	  
	  @When("Select the Lost can tab")
	  public void select_the_lost_can_tab() {
	      influ.clicklostcantab();
	  }

	  @When("Click on Lost can Filter")
	  public void click_on_lost_can_filter() {
	     influ.clickfilterlostcan();
	  }

	  @When("Select the Distributor radio button")
	  public void select_the_distributor_radio_button() {
	     influ.clickdistributorradiobtn();
	  }

	  @When("Click on Apply button")
	  public void click_on_apply_button() {
	     influ.clickapplybutton();
	     
	     
	  }

	  @When("Click on Notify button")
	  public void click_on_notify_button() {
	     influ.clicknotifylostcan();
	     influ.infuwaits();
	   }

	  @When("Click Disable can button")
	  public void click_disable_can_button() {
	     influ.clickdisablelostcan();
	     influ.infuwaits();
	  }

	  @When("Select the user from the list to send notification")
	  public void select_the_user_from_the_list_to_send_notification() {
	     influ.clicklostcanlist();
	  }
	  
	  @When("Select the Consumer radio button")
	  public void select_the_consumer_radio_button() {
	      influ.clickconsumerradiobtn();
	  }
	  @When("Select the WFS radio button")
	  public void select_the_wfs_radio_button() {
	      influ.clickwfsradiobtn();
	  }
	  
}
