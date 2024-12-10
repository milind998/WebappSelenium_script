package stepDefination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.pages.SKU;
import com.pages.SuperAdmin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepsSKU {

	SKU sku = new SKU (SuperAdmin.ldriver);



	@Given("Click on SKU page")
	public void click_on_sku_page() {
		sku.SKU_PageButton();
	}

	@Then("check SKU page heading")
	public void check_sku_page_heading() {
		String actResult = sku.CheckSKU_text();
		System.out.println(actResult);
		String expResult = "SKU";
		Assert.assertEquals(actResult, expResult);	  
	}

	@Given("Click on Add Product Button")
	public void click_on_add_product_button() {
		sku.Add_ProductButton();
	}

	@Then("Check Heading text")
	public void check_heading_text() {
		String actResult = sku.CheckAdd_ProductText();
		System.out.println(actResult);
		String expResult = "ADD/UPDATE PRODUCT";
		Assert.assertEquals(actResult, expResult);
	}

	@Then("Verify Add Product textboxes")
	public void verify_add_product_textboxes() throws InterruptedException {
	    List<String> ProductText = new ArrayList<>();
	    //List<String>
	    List<String> ProductTextList = Arrays.asList("Product Name *",
				
				"Capacity *",
				"Material *",
				"Life Span *",
				"SKU Quantity *",
				"HSN Code *",
				"CGST % *",
				"SGST % *",
				"IGST % *",
				"Minimum Book Quantity *",
				"Maximum Book Quantity *",
		"Description *");
		for(int i=1; i<=12; i++) {
			String actResult = sku.Verify_Add_Product_textboxes(i);
			System.out.println(actResult);
			ProductText.add(actResult);
			//Thread.sleep(2800);
		}
		sku.CloseProductButton.click();
		Assert.assertEquals(ProductText, ProductTextList);
	}

	@Given("Send values in textboxes {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void send_values_in_textboxes(String ProductNameBox, String CapacityBox, String MaterialBox, String Life_SpanBox, String SKU_QuantityBox, String HSN_CodeBox, String CGSTBox, String SGSTBox, String IGSTBox, String MinimumBookQuantityBox, String MiximumBookQuantityBox, String DescriptionBox, String MRPBox, String Sale_PriceBox, String DepositBox, String Refund_AmountBox) {
		sku.ProductNameTextBox(ProductNameBox);
		sku.CapacityTextBox(CapacityBox);
		sku.MaterialTextBox(MaterialBox);
		sku.Life_SpanTextBox(Life_SpanBox);
		sku.SKU_QuantityTextBox(SKU_QuantityBox);
		sku.HSN_CodeTextBox(HSN_CodeBox);
		sku.CGSTTextBox(CGSTBox);
		sku.SGSTTextBox(SGSTBox);
		sku.IGSTTextBox(IGSTBox);
		sku.MinimumBookQuantityTextBox(MinimumBookQuantityBox);
		sku.MiximumBookQuantityTextBox(MiximumBookQuantityBox);
		sku.DescriptionTextBox(DescriptionBox);
		sku.MRPTextBox(MRPBox);
		sku.Sale_PriceTextBox(Sale_PriceBox);
		sku.DepositTextBox(DepositBox);
		sku.Refund_AmountTextBox(Refund_AmountBox);
	}

	@When("Select Refill type")
	public void select_refill_type() {
		sku.Refill_RadioButton();
	}

	@When("Select Refund Type")
	public void select_refund_type() throws InterruptedException {
		sku.Select_RefundType();
	}

	@When("Upload Image")
	public void upload_image() {
		sku.Upload_Image();
	}

	@When("Click on Add Products button")
	public void click_on_add_products_button() throws InterruptedException {
		sku.Click_AddProduct_Button();
	}

	
	@Then("Verify toast messages {string}")
	public void verify_toast_messages(String string) throws InterruptedException {
		try {
			String actResult = sku.toastMessage();
			System.out.println(actResult);
			String expResult = string;
			Thread.sleep(2800);
			sku.CloseProductButton.click();
			Assert.assertEquals(actResult, expResult);	

		}
		catch (Exception e) {
			sku.ClickCloseButton.click();
			System.out.println("Product already available!");
		}
		
	}


	@Given("Click on Added Product")
	public void click_on_added_product() {
		sku.Check_ProductName();
	}

	@When("Update any data from textbox  {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void update_any_data_from_textbox(String Life_SpanBox, String SKU_QuantityBox, String HSN_CodeBox, String CGSTBox, String SGSTBox, String IGSTBox, String MinimumBookQuantityBox, String MiximumBookQuantityBox) {
		sku.Life_SpanTextBox(Life_SpanBox);
		sku.SKU_QuantityTextBox(SKU_QuantityBox);
		sku.HSN_CodeTextBox(HSN_CodeBox);
		sku.CGSTTextBox(CGSTBox);
		sku.SGSTTextBox(SGSTBox);
		sku.IGSTTextBox(IGSTBox);
		sku.MinimumBookQuantityTextBox(MinimumBookQuantityBox);
		sku.MiximumBookQuantityTextBox(MiximumBookQuantityBox);
	}

	@When("Click on Update Button")
	public void click_on_update_button() {
		sku.Click_Update_Button();
	}


	@When("Click on radio button of Product without QR\\/Barcode")
	public void click_on_radio_button_of_product_without_qr_barcode() {
		sku.Click_QRBarcodeLess_Radio_Button();
	}


	@When("Click on One time sale product button")
	public void click_on_one_time_sale_product_button() {
		sku.Click_ON_OneTimeSale_Button();
	}


	@When("Fill One time sale textboxes {string}, {string}, {string}")
	public void fill_one_time_sale_textboxes(String MRPBox, String Sale_PriceBox, String Refund_AmountBox_OTS) {
		sku.MRPTextBox(MRPBox);
		sku.Sale_PriceTextBox(Sale_PriceBox);
		sku.Refund_AmountTextBox_OTS(Refund_AmountBox_OTS);
	}


	@When("Click on Both Button")
	public void click_on_both_button() {
		sku.Click_ON_Both_Button();
	}


	@Given("Verify Products table text")
	public void verify_products_table_text()  {
		String Products_table[]= {"S.no",
				"Name",
				"Capacity",
				"Material",
				"Life Span",
				"Order Type",
				"Image",
		"Edit"};
		for(int i=2; i<=9; i++) {
			String actResult = sku.Verify_ProductsTableText(i);
			System.out.println(actResult);
			String expResult = Products_table[i-2];
			Assert.assertEquals(actResult, expResult);
		}
	}


	@Given("Click on Download button")
	public void click_on_download_button() {
		sku.Click_On_Download_DocumentB();
	}


	@Given("Click on Product QRBarcode details tab")
	public void click_on_product_qrbarcode_details_tab() {
		sku.ClickONProduct_QRBarcode_DetailsButton().click();;
	}


	@When("Click on Generate QRBarcode button")
	public void click_on_generate_qrbarcode_button() {
		sku.Click_ON_Generate_QRBarcode();
	}

	@When("Click on Generate QRBarcode combobox")
	public void click_on_generate_qrbarcode_combobox() {
		sku.Click_ON_Generate_QRBarcodeC();
	}

	@Then("Verify combobox text")
	public void verify_combobox_text() {
		String QRBarcode_Combobox []= {"Generate QR code",
				"Generate Bar code",
				"Re-generate QR code",
		"Re-generate Bar code"};
		for(int i=1; i<=4; i++) {
			String actResult = sku.Verify_GenerateQRCodeCombobox_Text(i);
			System.out.println(actResult);
			String expResult = QRBarcode_Combobox [i-1];
			Assert.assertEquals(actResult, expResult);
		}
	}

	//=============================================X0X==================================================================


	@Given("Generate qr barcode option")
	public void generate_qr_barcode_option() {
		sku.generateQRBarcodeForProductTab.isDisplayed();
	}

	@When("Click generate qr barcode tab")
	public void click_generate_qr_barcode_tab() {
		String tabopen=sku.generateQRBarcodeForProductTab.getAttribute("aria-selected");
		if(!tabopen.equalsIgnoreCase("true")) {
			sku.generateQRBarcodeForProductTab.click();
		}
	}



	@When("Select qr for product")
	public void select_qr_for_product() {
		//sku.qrBarcodeDropdownToGenerate.click();
		sku.generateQrOption.click();
	}
	@When("Select twenty liter product")
	public void select_twenty_liter_product() {
		sku.productDropdownToGenerate.click();
		sku.AutomationProduct.click();
	}

	@When("Enter Quantity for generate qr {string}")
	public void enter_quantity_for_generate_qr(String string) {
		WebElement inputField = sku.enterQrQuantityTextBox;

		// Directly overwrite the value without clearing
		inputField.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), string);

		// Optionally move to another element to ensure the value is committed
		sku.enterBatchIdTextBox.click();
	}







	@When("Enter Batch id {string}")
	public void enter_batch_id(String string) throws InterruptedException {
		Thread.sleep(500);  // Add a short delay before moving to the next field
		sku.enterBatchIdTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		sku.enterBatchIdTextBox.sendKeys(string);
	}
	@When("Enter Manufacturer Name {string}")
	public void enter_manufacturer_name(String string) {
		sku.enterManufacturer_NameTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		sku.enterManufacturer_NameTextBox.sendKeys(string);
	}
	@When("Enter Manufacturer address {string}")
	public void enter_manufacturer_address(String string) {
		sku.enterManufacturer_addressTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		sku.enterManufacturer_addressTextBox.sendKeys(string);
	}
	@When("Click on Generate")
	public void click_on_generate() {
		sku.generateButton.click();
	}

	@Then("Verify toast message after generated as {string}")
	public void verify_toast_message_after_generated_as(String string) {
		String actResult=sku.toastMessage().trim();
		System.out.println(actResult);
		String expResult=string;
		Assert.assertEquals(actResult, expResult);
	}

	@Then("Newly generated qr number is display")
	public void newly_generated_qr_number_is_display() {
		boolean actResult=sku.QrBarcodeStartNumber().isDisplayed();
		boolean expResult=true;
		Assert.assertEquals(actResult, expResult);
		String startQRNumber = sku.QrBarcodeStartNumber.getText();
		String[] arrOfStr = startQRNumber.split("(?<=Q)");

		// The number part as a String will preserve leading zeros
		String numberPart = arrOfStr[1];  // "00171"

		// When incrementing, you can use Integer for the logic, but reformat to String with leading zeros
		int numericPart = Integer.parseInt(numberPart);

		for (int i = 0; i < Integer.parseInt(sku.qrQuantity.getText()); i++) {
			String formattedNumber = String.format("%05d", numericPart);  // %05d ensures 5 digits with leading zeros
			String newQrNumber = arrOfStr[0] + formattedNumber;
			SKU.qrList.add(newQrNumber);
			numericPart++;
		}

		System.out.println(SKU.qrList);

	}

	@When("Select generate Barcode for product")
	public void select_generate_barcode_for_product() {
		sku.Click_ON_Generate_QRBarcodeC();
		sku.generateBarcodeOption.click();
	}
	@When("Enter Quantity for generate barcode {string}")
	public void enter_quantity_for_generate_barcode(String string) {
		WebElement inputField = sku.enterQuantityBoxForGenerateBarcode();

		// Directly overwrite the value without clearing
		inputField.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), string);

	}

	@When("Click on filter qr barcode list")
	public void click_on_filter_qr_barcode_list() {
		sku.filterButtonQrList().click();
	}
	@When("Filter qr_Barcode DialogBox Open")
	public void filter_qr_barcode_dialog_box_open() {
		sku.qrFilterDialogBoxText().getText().equalsIgnoreCase("Date");
	}
	@When("Select Barcode radio Button")
	public void select_barcode_radio_button() {
		sku.barcodeDetailsRadioButton.click();
	}
	@When("Select Newly Generated radio Button")
	public void select_newly_generated_radio_button() {
		sku.newlyGeneratedRadioButton.click();
	}
	@When("Click on Submit Button to filter")
	public void click_on_submit_button_to_filter() {
		sku.submitButtonForFilter.click();
	}
	@Then("Newly barcode qr number is display")
	public void newly_barcode_qr_number_is_display() throws InterruptedException {
		Thread.sleep(2800);
		boolean actResult=sku.QrBarcodeStartNumber().isDisplayed();
		boolean expResult=true;
		Assert.assertEquals(actResult, expResult);
		String startQRNumber = sku.QrBarcodeStartNumber.getText();
		String[] arrOfStr = startQRNumber.split("(?<=C)");

		// The number part as a String will preserve leading zeros
		String numberPart = arrOfStr[1];  // "00171"

		// When incrementing, you can use Integer for the logic, but reformat to String with leading zeros
		int numericPart = Integer.parseInt(numberPart);

		for (int i = 0; i < Integer.parseInt(sku.qrQuantity.getText()); i++) {
			String formattedNumber = String.format("%05d", numericPart);  // %05d ensures 5 digits with leading zeros
			String newQrNumber = arrOfStr[0] + formattedNumber;
			SKU.barcodeList.add(newQrNumber);
			numericPart++;
		}
		System.out.println(SKU.qrList);
		System.out.println(SKU.barcodeList);
	}


	@When("Select ReGenerate QR code")
	public void select_re_generate_qr_code() {
		sku.ReGenerateQRcodeButton.click();
	}

	@When("Enter Quantity for Regenerate qr {string}")
	public void enter_quantity_for_regenerate_qr(String string) {
		WebElement inputFields = sku.enterQuantityToRegenrateQRcode();

		// Directly overwrite the value without clearing
		inputFields.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), string);
	}

	@When("Select QRcode radio Button")
	public void select_q_rcode_radio_button() {
		sku.QR_DetailsRadioButton.click();
	}

	@When("Select ReGenerated radio Button")
	public void select_re_generated_radio_button() {
		sku.Regenerated_RadioButton.click();
	}

	@Then("Regenerated qr number is display")
	public void regenerated_qr_number_is_display() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println(sku.QrBarcodeStartNumber().getText());
		boolean actResult=sku.QrBarcodeStartNumber().getText().contains("BWRQ");
		boolean expResult=true;
		Assert.assertEquals(actResult, expResult); 
		System.out.println(actResult);
	}

	@When("Select ReGenerate Bar code")
	public void select_re_generate_bar_code() {
		sku.ReGenerateBarcodeButton.click();
	}


	@When("Select Bar code radio Button")
	public void select_bar_code_radio_button() {
		sku.BarCode_DetailsRadioButton.click();
	}

	@Then("Regenerated Bar number is display")
	public void regenerated_bar_number_is_display() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println(sku.QrBarcodeStartNumber().getText());
		boolean actResult=sku.QrBarcodeStartNumber().getText().contains("EC");
		boolean expResult=true;
		Assert.assertEquals(actResult, expResult); 
		System.out.println(actResult);
	}


	@Given("Click on Link QR Code tab")
	public void click_on_link_qr_code_tabs() {
		sku.Link_QRCodeTab.click();
	}

	@Then("Check Device Text")
	public void check_device_text() {
		String Dtext[]= {"Scanner Device",
		"Camera" };
		for(int i=1; i<=2; i++) {
			String actResult = sku.CheckDeviceText(i);
			System.out.println(actResult);
			String expresult = Dtext[i-1];
			Assert.assertEquals(actResult, expresult);
		}
	}


	@When("Click on link qr code Tab")
	public void click_on_link_qr_code_tab() {
		String qrLinkTabOpen=sku.linkQrCodeTab.getAttribute("aria-selected");
		if(!qrLinkTabOpen.equalsIgnoreCase("true")) {
			sku.linkQrCodeTab.click();
		}
	}
	@When("Click on link qr and barcode button")
	public void click_on_link_qr_and_barcode_button() {
		String qrBarcodeLinkOpen=sku.linkQrAndBarcodeButton.getAttribute("aria-pressed");
		if(!qrBarcodeLinkOpen.equalsIgnoreCase("true")) {
			sku.linkQrAndBarcodeButton.click();
		}
	}

	@When("First qr scan successfully message display")
	public void first_qr_scan_successfully_message_display() {
		sku.oneLinkSuccessText().getText().equalsIgnoreCase("1 of 2 scanned Successfully");
	}
	@When("Click on next button")
	public void click_on_next_button() throws InterruptedException {
		Thread.sleep(1000);
		sku.scanNextButton.click();
	}

	@Then("verify invalid qr and barcode toast messaage as {string}")
	public void verify_invalid_qr_and_barcode_toast_messaage_as(String string) {
		String actResult=sku.toastMessage();
		System.out.println(actResult);
		String expResult=string;
		Assert.assertEquals(actResult, expResult);
	}

	@When("scan first invalid qr {string}")
	public void scan_first_invalid_qr(String qrCode) {
		sku.linkQrBarcodeTextBox.sendKeys(qrCode);
	}
	@When("scan first inavlid barcode {string}")
	public void scan_first_inavlid_barcode(String barCode) throws InterruptedException {
		sku.linkQrBarcodeTextBox.sendKeys(barCode);
	}

	@When("Two of two scanned Successfully message display")
	public void two_of_two_scanned_successfully_message_display() throws InterruptedException {
		Thread.sleep(1000);
		sku.oneLinkSuccessText().getText().equalsIgnoreCase("2 of 2 scanned Successfully");
	}

	@When("Click on Link Button")
	public void click_on_link_button() throws InterruptedException {
		sku.linkButton().click();;
	}

	@When("Link all qr with all barcode")
	public void link_all_qr_with_all_barcode() throws InterruptedException {
		sku.linkQRWithBarcode();
	}


	@Then("Verify successfully link message as {string}")
	public void verify_successfully_link_message_as(String string) throws InterruptedException {
		String actResult=sku.toastMessage();
		System.out.println(actResult);
		String expResult=string;
		Thread.sleep(500);
		Assert.assertEquals(actResult, expResult);
	}


	@Given("Click on Link only QR code tab")
	public void click_on_link_only_qr_code_tab() {
		sku.Click_ON_LinkQRCode.click();
	}

	@Given("Link qr with system")
	public void link_qr_with_system() throws InterruptedException {
		sku.Link_Only_QR();
	}


	@When("Enter invalid QR id {string}")
	public void enter_invalid_qr_id(String Enter_InvalidQRCodeBox) throws InterruptedException {
		sku.Enter_InvalidQRCode(Enter_InvalidQRCodeBox);
		Thread.sleep(1500);
	}


	@Given("Click on Scan QR code tab")
	public void click_on_scan_qr_code_tab() {
		sku.Click_ON_ScanQRCode.click();
	}

	@When("Click on Scanner device radio button")
	public void click_on_scanner_device_radio_button() {
		String scannerDevice=sku.Select_ScannerDevice.getAttribute("aria-hidden");
		if(!scannerDevice.equalsIgnoreCase("true")) {
			sku.Select_ScannerDevice.click();
		}
	}

	@When("Enter QR code id to scan {string}")
	public void enter_qr_code_id_to_scan(String enterQRid) throws InterruptedException {
		Thread.sleep(1500);
		sku.Enter_QRid.sendKeys(enterQRid);
	}


	@When("Enter Valid QR code id to scan {string}")
	public void enter_valid_qr_code_id_to_scan(String ValidenterQRid) throws InterruptedException {
		sku.VEnter_QRid.sendKeys(ValidenterQRid);
		Thread.sleep(2000);

	}


	@Then("Verify container details text")
	public void verify_container_details_text() throws InterruptedException {
		String QRDetailsText[]= {"Capacity",
				"Material",
				"Life Span",
				"Product Linked With Crate",
				"Products Linked Crate Qty",
				"TDS",
				"PH",
				"Mft. date",
				"Exp. date",
				"No.of times can used",
				"Report",
				"Container status",
				"Can Type",
				"Order ID",
				"Filling Station",
				"Status",
				"Owner name",
				"Phone number",
				"Pincode",
				"Owner Type",
				"Name",
				"Email",
				"Phone number",
		"Status"};

		for (int i=1; i<=24; i++) {
			String actResult = sku.Check_ContainerDetails_text(i);
			System.out.println(actResult);
			String expResult = QRDetailsText[i-1];
			Assert.assertEquals(actResult, expResult);
		}

		sku.CloseButton.click();
	}


	@Given("Click on Crate Details Button")
	public void click_on_crate_details_button() throws InterruptedException {	
		sku.Click_ON_CrateDetails_Tab.click();
		Thread.sleep(1000);

	}

	@Then("Check Crate Details of table text")
	public void check_crate_details_of_table_text() {
		String CrateTableText[]= {"S.no",
				"Name",
				"Capacity",
				"Price",
				"Image",
		"Edit"};
		for(int i=11; i<=16; i++) {
			String actResult = sku.Check_CrateDetailsTable_Text(i);
			System.out.println(actResult);
			String expResult = CrateTableText[i-11];
			Assert.assertEquals(actResult, expResult);
		}
	}


	@Given("Click on Add Crate button")
	public void click_on_add_crate_button() {
		sku.AddCrate_Button.click();
	}

	@Then("Check Crate textboxes")
	public void check_crate_textboxes() {
		String AddCrateBoxes[]= { "Crate Name *",
				"Crate Capacity *",
				"Price *",
				"HSN Code *",
				"CGST % *",
				"SGST % *",
				"IGST % *",
		"Description *"};
		for(int i=1; i<=8; i++) {
			String actResult = sku.Check_AddCrateTextboxes(i);
			System.out.println(actResult);
			String expResult = AddCrateBoxes[i-1];
			Assert.assertEquals(actResult, expResult);
		}
	}


	@Given("Enter Data to add crate {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void enter_data_to_add_crate(String CrateNameBox, String CrateCapacityBox, String PriceBox, String HSNCodeBox, String enterCGSTBox, String enterSGSTBox, String enterIGSTBox, String DescriptionsBox) {
		sku.CrateNameTextBox(CrateNameBox);
		sku.CrateCapacityTextBox(CrateCapacityBox);
		sku.PriceTextBox(PriceBox);
		sku.HSNCodeTextBox(HSNCodeBox);
		sku.enterCGSTTextBox(enterCGSTBox);
		sku.enterSGSTTextBox(enterSGSTBox);
		sku.enterIGSTTextBox(enterIGSTBox);
		sku.DescriptionsTextBox(DescriptionsBox);
	}

	@When("Upload Crate Image")
	public void upload_crate_image()  {
		sku.UploadCrate_Image();
	}

	@When("Click on Add Crate Buttons")
	public void click_on_add_crate_buttons() {

		sku.AddCrateButton.click();
	}


	@Then("Verify successfully toast message as {string}")
	public void verify_successfully_toast_message_as(String string) {
		try {
			String actResult = sku.toastMessage();
			System.out.println(actResult);
			String expResult = string;
			Assert.assertEquals(actResult, expResult);	
		}
		catch (Exception e) {
			sku.ClickCloseButton.click();
			System.out.println("Crate already available!");
		}
	}


	@Given("Click on Added Crate")
	public void click_on_added_crate() {
		sku.ClickONEditButton.click();
	}

	@When("Update any data from textbox  {string}, {string}, {string}, {string}, {string},")
	public void update_any_data_from_textbox(String CrateCapacityBox, String PriceBox, String enterCGSTBox, String enterSGSTBox, String enterIGSTBox) {
		sku.CrateCapacityTextBox(CrateCapacityBox);
		sku.PriceTextBox(PriceBox);
		sku.enterCGSTTextBox(enterCGSTBox);
		sku.enterSGSTTextBox(enterSGSTBox);
		sku.enterIGSTTextBox(enterIGSTBox);
		sku.UploadCrate_Image();

	}

	@Given("Click on Download button of Crate")
	public void click_on_download_button_of_crate() {
		sku.Download_Crate_Image.click();
	}

	@Given("Click on Filter Option")
	public void click_on_filter_option() {
		sku.Click_ON_CrateFilter.click();
	}

	@Then("Check Heading Of Filters")
	public void check_heading_of_filters() {
		String ExpectedHeading[]= {"Active",
				"Capacity",
				"Name",
				"Price",
		"Sort by date"};
		for(int i=3; i<=7; i++) {
			String actResult = sku.HeadingOFfilters(i);
			System.out.println(actResult);
			String expResult = ExpectedHeading[i-3];
			Assert.assertEquals(actResult, expResult);
		}

		sku.Click_ON_CancelButton.click();
	}


	@Then("Check Crates Name in ascending form")
	public void check_crates_name_in_ascending_form() {
		boolean actResult = sku.SortingOFCratesName();
		boolean expResult = true;
		Assert.assertEquals(actResult, expResult);
	}


	@Given("Click on QR Barcode details tab")
	public void click_on_qr_barcode_details_tab() {
		sku.Crates_QRBarcodeDetails_Tab.click();
	}

	@Then("Check QR Barcode Details Table column text")
	public void check_qr_barcode_details_table_column_text() {
		String CrateQRBarcodeText[]= {"Start Number",
				"End Number",
				"Quantity",
				"CompanyName",
				"OwnerName",
				"OwnerPhone",
				"GSTNumber",
				"PANNumber",
				"Address",
				"Landmark",
				"Area",
				"State",
				"County",
				"Pincode",
		"CreatedAt"};
		for(int i=10; i<=24; i++) {
			String actResult = sku.Check_CrateQRBarcodeDetails_TableText(i);
			System.out.println(actResult);
			String expResult = CrateQRBarcodeText[i-10];
			Assert.assertEquals(actResult, expResult);

		}
	}

	@Given("Click on Generate Radio Button")
	public void click_on_generate_radio_button() {
		sku.GenerateRadioButton.click();
	}

	@When("Click on Generate QR Barcode button")
	public void click_on_generate_qr_barcode_button() {
		sku.Generate_Qr_BarCode_Crate.click();
	}

	@Then("Check Textboxes text of Generate QR Barcode")
	public void check_textboxes_text_of_generate_qr_barcode() {
		String crateAddTextboxes[] = {"Crate Name*",
				"Quantity*",
				"Company Name*",
				"Owner Name*",
				"Owner Phone*",
				"Line 1*",
				"Line 2*",
				"Landmark*",
				"Area",
				"State",
				"Country*",
				"Pincode*",
				"Gst Number*",
		"PAN Number*" };
		for(int i=3; i<=16; i++) {
			String actResult = sku.Check_CrateTextboxes(i);
			System.out.println(actResult);
			String expResult = crateAddTextboxes[i-3];
			Assert.assertEquals(actResult, expResult);
		}
	}

	@Given("Select Generated Crate")
	public void select_generated_crate() throws InterruptedException {
		sku.SelectCrateFrom_DropDown();
	}

	@When("Send Data to create QR or Barcode in textboxes {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void send_data_to_create_qr_or_barcode_in_textboxes(String QuantityBox, String Company_NameBox, String Owner_NameBox, String Owner_PhoneBox, String Line_1Box, String Line_2Box, String LandmarkBox, String AreaBox, String StateBox, String CountryBox, String PincodeBox, String Gst_NumberBox, String PAN_NumberBox) {
		sku.QuantityTextBox(QuantityBox);
		sku.Company_NameTextBox(Company_NameBox);
		sku.Owner_NameTextBox(Owner_NameBox);
		sku.Owner_PhoneTextBox(Owner_PhoneBox);
		sku.Line_1TextBox(Line_1Box);
		sku.Line_2TextBox(Line_2Box);
		sku.LandmarkTextBox(LandmarkBox);
		sku.AreaTextBox(AreaBox);
		sku.StateTextBox(StateBox);
		sku.CountryTextBox(CountryBox);
		sku.PincodeTextBox(PincodeBox);
		sku.Gst_NumberTextBox(Gst_NumberBox);
		sku.PAN_NumberTextBox(PAN_NumberBox);
	}


	@When("Click on Generate Button")
	public void click_on_generate_button() {
		sku.GenerateCrateQRBarcodeButton.click();
	}

	@Then("Check Successful toast message of Crate {string}")
	public void check_successful_toast_message_of_crate(String string) {
		String actResult = sku.toastMessage();
		System.out.println(actResult);
		String expResult = string;
		Assert.assertEquals(actResult, expResult);
	}


	@Given("Click on filter Of Crate qr barcode list")
	public void click_on_filter_of_crate_qr_barcode_list() {
		sku.CrateQRBarcodeFilter.click();
	}

	@When("Click on Is ReGenerated dropdown")
	public void click_on_is_re_generated_dropdown() {
		sku.ClickONIsReGeneratedDropDown.click();
	}

	@When("Select Newly Generated")
	public void select_newly_generated() {
		sku.SelectNewlyGenerateds();
	}

	@When("click on QR barcode DropDown")
	public void click_on_qr_barcode_drop_down() {
		sku.SelectQRBarcodeDropDown.click();
	}

	@When("Select QR code option")
	public void select_qr_code_option() {
		sku.SelectQRCodeOption();
	}

	@When("Clicks on Filter option")
	public void clicks_on_filter_option() {
		sku.ClickONCrateFilterButton.click();
	}

	@Then("Newly Generated qrcode number is display")
	public void newly_generated_qrcode_number_is_display() throws InterruptedException {
		Thread.sleep(3500);
		boolean actResult=sku.FirstQROfCrate().isDisplayed();
		boolean expResult=true;
		Assert.assertEquals(actResult, expResult);
		String CratestartQRNumber = sku.FirstQROfCrate.getText();
		String[] arrOfStr = CratestartQRNumber.split("(?<=QCR)");

		// The number part as a String will preserve leading zeros
		String numberPart = arrOfStr[1];  // "00171"

		// When incrementing, you can use Integer for the logic, but reformat to String with leading zeros
		int numericPart = Integer.parseInt(numberPart);
		System.out.println(numericPart);
		System.out.println(sku.QRQuantityOFCrate.getText());

		for (int i = 0; i < Integer.parseInt(sku.QRQuantityOFCrate.getText()); i++) {
			String formattedNumber = String.format("%06d", numericPart);  // %05d ensures 5 digits with leading zeros
			String newCrateQrNumber = arrOfStr[0] + formattedNumber;
			SKU.crateQrList.add(newCrateQrNumber);
			numericPart++;
		}

		System.out.println(SKU.crateQrList);
	}



	@When("Select Bar code option")
	public void select_bar_code_option() {
		sku.SelectBarCodeOption();
	}

	@Then("Newly Generated Barcode number is display")
	public void newly_generated_barcode_number_is_display() throws InterruptedException {
		Thread.sleep(3500);
		boolean actResult=sku.FirstBarCodeOfCrate().isDisplayed();
		boolean expResult=true;
		Assert.assertEquals(actResult, expResult);
		String CratestartBarcodeNumber = sku.FirstBarCodeOfCrate.getText();
		String[] arrOfStr = CratestartBarcodeNumber.split("(?<=BCR)");

		// The number part as a String will preserve leading zeros
		String numberPart = arrOfStr[1];  // "00171"

		// When incrementing, you can use Integer for the logic, but reformat to String with leading zeros
		int numericPart = Integer.parseInt(numberPart);
		System.out.println(numericPart);
		System.out.println(sku.BarCodeQuantityOFCrate.getText());

		for (int i = 0; i < Integer.parseInt(sku.BarCodeQuantityOFCrate.getText()); i++) {
			String formattedNumber = String.format("%06d", numericPart);  // %05d ensures 5 digits with leading zeros
			String newCrateBarCodeNumber = arrOfStr[0] + formattedNumber;
			SKU.crateBarcodeList.add(newCrateBarCodeNumber);
			numericPart++;
		}

		System.out.println(SKU.crateBarcodeList);
	
	}
	
	
	@Given("Click on link radio button")
	public void click_on_link_radio_button() {
	   sku.Select_LinkRadioButton.click();
	}
	
	@Given("Link all Crate qr with all barcode")
	public void link_all_crate_qr_with_all_barcode() throws InterruptedException {
	    sku.linkCrateQRWithBarcode();
	}


	@When("Click on Link crateButton")
	public void click_on_link_crate_button() {
	    sku.linkcrateButton.click();
	}

	
	@Given("Click on Scan Crate QR code radio button")
	public void click_on_scan_crate_qr_code_radio_button() {
		sku.ScanCrateQRBarcode.click();
	}

	@When("Click on crate Scanner device radio button")
	public void click_on_crate_scanner_device_radio_button() {
		String scannerDevice=sku.Select_ScannerDevice.getAttribute("aria-hidden");
		if(!scannerDevice.equalsIgnoreCase("true")) {
			sku.Select_crateScannerDevice.click();
		}
	}
	
	@When("Enter crate QR code id to scan {string}")
	public void enter_crate_qr_code_id_to_scan(String string) {
	   sku.EnterCrateQRCOde.sendKeys(string);
	}
	
	
	@Then("Verify crate details text")
	public void verify_crate_details_text() throws InterruptedException {
		String crateDetailsTextBoxes[]= {"Name:",
			"Phone number:",
				"Wfs Name:",
				"Crate Id:",
				"Name:",
				"Phone number:",
				"Price:",
				"Capacity:",
				"Description:",
				"Created At:",
				"Updated At:",
				"Name:",
				"Phone number:"};
	    for(int i=1; i<=13; i++) {
	    	String actResult = sku.CheckTextOF_CrateTextboxes(i);
	    	System.out.println(actResult);
	    	String expResult = crateDetailsTextBoxes[i-1];
	    	Assert.assertEquals(actResult, expResult);
	    	
	    }
	    sku.CrateCloseButton.click();
	}

}







