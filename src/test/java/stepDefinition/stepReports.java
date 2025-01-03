package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pages.InfluencerPage;
import com.pages.Loginpage;
import com.pages.Reports;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class stepReports {

	public static Reports rp = new Reports(Loginpage.ldriver);


	@Given("Click on Reports page")
	public void click_on_reports_page() {
		rp.Reportsmodule();
	}


	@When("Select the Get Orders report from dropdown")
	public void select_the_get_orders_report_from_dropdown() {
		rp.Clickonorderreport();
	}


	@When("Select the Get Can age report from dropdown")
	public void select_the_get_can_age_report_from_dropdown() {
		rp.Clickoncanagereport();
	}


	@When("Select the Get Attendance report from dropdown")
	public void select_the_get_attendance_report_from_dropdown() {
	rp.Clickonattendancereport();
	}


	@When("Select the Get Trip report from dropdown")
	public void select_the_get_trip_report_from_dropdown() {
		rp.Clickontripreport();
	}


	@When("Select the Get Subscription report from dropdown")
	public void select_the_get_subscription_report_from_dropdown() {
	rp.Clickonsubscriptionreport();
	}


	@When("Select the Get Warehouse report from dropdown")
	public void select_the_get_warehouse_report_from_dropdown() {
		rp.Clickonwarehousereport();
	}


	@When("Click on download report")
	public void click_on_download_report() {
		rp.Clickdownload();
	}







	/*******************This page ui is completly changed*************************/

	/*
	@When("Click on the Yesterday transaction tab")
	public void click_on_the_yesterday_transaction_tab() {
	    rp.clickyesterdaytransaction();
	}

	@When("Click on Download yesterday report")
	public void click_on_download_yesterday_report() throws InterruptedException {
	    rp.clickdownloadyesterdaytransaction();
	    Thread.sleep(1000);
	}

    @When("Click on the Current month transaction tab")
    public void click_on_the_current_month_transaction_tab() {
        rp.clickcurrenttransaction();
    }

    @When("Click on Download current report")
    public void click_on_download_current_report() throws InterruptedException {
       rp.clickcurrenttransactiondownload();
       Thread.sleep(1000);
    }

   @When("Click on Current month Filter button")
   public void click_on_current_month_filter_button() {
      rp.clickcurrenttransactionfilter();
   }

   @When("Select descending radio button")
   public void select_descending_radio_button() {
     rp.clickcurrenttransactionfilterdesc();
   }

  @When("Click on Submit")
  public void click_on_submit() {
     rp.clickcurrenttransactionsubmit();
     rp.implicitwaits();
  }

  @When("Select Ascending radio button")
  public void select_ascending_radio_button() {
	  rp.clickcurrenttransactionfilterasc();
  }

  @When("Enter the page number")
  public void enter_the_page_number() {
     rp.entercurrenttransactionpagesize();
  }

  @When("Click on next")
  public void click_on_next() {
     rp.entercurrenttransactionpagenext();
  }
  @When("Click on prev")
  public void click_on_prev() {
	  rp.entercurrenttransactionpageprev();
  }

  @When("Click on Current year Transcation tab")
  public void click_on_current_year_transcation_tab() {
	  rp.clickcurrentyearreport(); 

  }

  @When("Click on search by date or phone button")
  public void click_on_search_by_date_or_phone_button() {
      rp.clicksearchbydate();
  }

  @When("Select the from date")
  public void select_the_from_date() {
	   rp.enterfromdate();

  }  


  @When("Select the search report button")
  public void select_the_search_report_button() throws InterruptedException {
	  rp.clickSearchByDate();
	  Thread.sleep(3000);
	//  rp.waittoastmsg();
	  //rp.implicitwaits();
  }
  @When("Select the to date")
  public void select_the_to_date() throws InterruptedException {
	  // To give invalid to date below method is used twice
	  rp.entertodate();
	  Thread.sleep(1000);
	  rp.entertodate();
  }

  @When("Enter the phone number {string}")
  public void enter_the_phone_number(String string) {
    rp.enterPhonenumbers(string);
  }

  @When("Enter the valid phone number")
  public void enter_the_valid_phone_number() {
      rp.enterValidPhonenumber();
  }

  @When("Click on search phone button")
  public void click_on_search_phone_button() throws InterruptedException {
     rp.clickSearchreportbyphone();
     Thread.sleep(4000);
  }




/*More button*/

	/*
  @When("Click on More button")
  public void click_on_more_button() {
	      rp.clickmorebutton();
  }


  @When("Select from the Reports dropdown")
   public void select_from_the_reports_dropdown() throws InterruptedException {

	    rp.clickFromReportsDropdownList();

  }
	 */



}
