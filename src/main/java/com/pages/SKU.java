package com.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;

public class SKU extends SuperAdmin{

	public SKU(WebDriver rdriver) {
		super(rdriver);
		
	}
	
	public static ArrayList<String> qrList = new ArrayList<String>();
	public static ArrayList<String> barcodeList = new ArrayList<String>();
	
	public static ArrayList<String> crateQrList = new ArrayList<String>();
	public static ArrayList<String> crateBarcodeList = new ArrayList<String>();
	
	
	
	@FindBy(xpath="(//*[text()='SKU'])[1]")
	@CacheLookup
	WebElement SKU_Page;
	public void SKU_PageButton() {
		SKU_Page.click();
	}
	
	
	@FindBy(xpath="(//*[text()='SKU'])[1]")
	@CacheLookup
	WebElement SKU_text;
	public String CheckSKU_text() {
		return SKU_text.getText();
	}
	
	@FindBy(xpath = "//*[text()='add product']")
	@CacheLookup
	WebElement Add_Product;
	public void Add_ProductButton() {
		Add_Product.click();
	}
	
	@FindBy(xpath="//*[text()='ADD/UPDATE PRODUCT']")
	@CacheLookup
	WebElement Add_ProductText;
	public String CheckAdd_ProductText() {
		return Add_ProductText.getText();
	}
	
	public String Verify_Add_Product_textboxes(int i) {
		WebElement Add_Product_textboxes = ldriver.findElement(By.xpath("(//*[@class=\"MuiFormLabel-root MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-shrink MuiInputLabel-sizeSmall MuiInputLabel-outlined MuiFormLabel-colorSuccess Mui-error Mui-focused Mui-required MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-shrink MuiInputLabel-sizeSmall MuiInputLabel-outlined css-142zykt\"])["+i+"]"));
		return Add_Product_textboxes.getText();
	}
	
	
	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[1]")
	@CacheLookup
	WebElement ProductName;

	public void ProductNameTextBox(String ProductNameBox) {
		ProductName.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		ProductName.sendKeys(ProductNameBox);
	}
	
	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[2]")
	@CacheLookup
	WebElement Capacity;

	public void CapacityTextBox(String CapacityBox) {
		Capacity.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Capacity.sendKeys(CapacityBox);
	}

	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[3]")
	@CacheLookup
	WebElement Material;

	public void MaterialTextBox(String MaterialBox) {
		Material.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Material.sendKeys(MaterialBox);
	}
	

	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[4]")
	@CacheLookup
	WebElement Life_Span;

	public void Life_SpanTextBox(String Life_SpanBox) {
		Life_Span.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Life_Span.sendKeys(Life_SpanBox);
	}
	
	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[5]")
	@CacheLookup
	WebElement SKU_Quantity;

	public void SKU_QuantityTextBox(String SKU_QuantityBox) {
		SKU_Quantity.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		SKU_Quantity.sendKeys(SKU_QuantityBox);
	}
	
	
	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[6]")
	@CacheLookup
	WebElement HSN_Code;

	public void HSN_CodeTextBox(String HSN_CodeBox) {
		HSN_Code.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		HSN_Code.sendKeys(HSN_CodeBox);
	}
	
	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[7]")
	@CacheLookup
	WebElement CGST;

	public void CGSTTextBox(String CGSTBox) {
		CGST.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		CGST.sendKeys(CGSTBox);
	}
	
	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[8]")
	@CacheLookup
	WebElement SGST;

	public void SGSTTextBox(String SGSTBox) {
		SGST.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		SGST.sendKeys(SGSTBox);
	}
	
	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[9]")
	@CacheLookup
	WebElement IGST;

	public void IGSTTextBox(String IGSTBox) {
		IGST.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		IGST.sendKeys(IGSTBox);
	}
	
	
	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[10]")
	@CacheLookup
	WebElement MinimumBookQuantity;

	public void MinimumBookQuantityTextBox(String MinimumBookQuantityBox) {
		MinimumBookQuantity.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		MinimumBookQuantity.sendKeys(MinimumBookQuantityBox);
	}
	
	
	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[11]")
	@CacheLookup
	WebElement MiximumBookQuantity;

	public void MiximumBookQuantityTextBox(String MiximumBookQuantityBox) {
		MiximumBookQuantity.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		MiximumBookQuantity.sendKeys(MiximumBookQuantityBox);
	}
	
	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[12]")
	@CacheLookup
	WebElement Description;

	public void DescriptionTextBox(String DescriptionBox) {
		Description.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Description.sendKeys(DescriptionBox);
	}
	
	
	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[13]")
	@CacheLookup
	WebElement MRP;

	public void MRPTextBox(String MRPBox) {
		MRP.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		MRP.sendKeys(MRPBox);
	}
	
	
	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[14]")
	@CacheLookup
	WebElement Sale_Price;

	public void Sale_PriceTextBox(String Sale_PriceBox) {
		Sale_Price.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Sale_Price.sendKeys(Sale_PriceBox);
	}
	
	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[15]")
	@CacheLookup
	WebElement Deposit;

	public void DepositTextBox(String DepositBox) {
		Deposit.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Deposit.sendKeys(DepositBox);
	}
	
	
	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[16]")
	@CacheLookup
	WebElement Refund_Amount;

	public void Refund_AmountTextBox(String Refund_AmountBox) {
		Refund_Amount.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Refund_Amount.sendKeys(Refund_AmountBox);
	}
	
	
	@FindBy(xpath="(//*[@class=\"PrivateSwitchBase-input css-1m9pwf3\"])[2]")
	@CacheLookup
	WebElement Refill;
	public void Refill_RadioButton() {
		Refill.click();
	}
	
	
	public void Select_RefundType() throws InterruptedException {
		 WebElement SelectWallet = ldriver.findElement(By.xpath("(//*[@class='MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-ciw10u'])[2]"));

         // Perform an action with the element, e.g., click it
		 SelectWallet.click();
		//WebElement Wallet_RefundType = ldriver.findElement(By.xpath("(//*[@class=\"MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-ciw10u\"])[2]"));
		Select objSelect =new Select(ldriver.findElement(By.xpath("(//*[@class=\"MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-ciw10u\"])[2]")));
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objSelect.selectByVisibleText("WATER DROPS");
	}
	
	public void Upload_Image() {
	         
	         WebElement button = ldriver.findElement(By.xpath("(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-1lpukdo\"])[1]")); 
		        String buttonText = button.getText().trim();
		        System.out.println(buttonText);
	        if (buttonText.equals("UPLOAD IMAGE")) {
	            WebElement fileInput = ldriver.findElement(By.xpath("//*[@type=\"file\"]"));
		         fileInput.sendKeys("C:\\Users\\Milind Manoharrao\\OneDrive - Bookwater Tech Private Limited\\Pictures\\0rders production crash 1.png");
		         WebElement Close_ToastMessage = ldriver.findElement(By.xpath("//*[@class=\"Toastify__close-button Toastify__close-button--dark\"]"));
		         Close_ToastMessage.click();
	            System.out.println("Button clicked: Upload Image");
	        } else if (buttonText.equals("UPLOADED SUCCESSFULLY")) {
	            System.out.println("Button not clicked: Uploaded Successfully");
	        } else {
	            System.out.println("Button text does not match expected values.");
	        }	         
	}
	
	@FindBy(xpath="//*[normalize-space()='Add Product']")
	@CacheLookup
	WebElement Add_ProductB;
	public void Click_AddProduct_Button() throws InterruptedException {
		Thread.sleep(2500);
		Add_ProductB.click();
	}
	
	@FindBy(xpath="//*[text()='Close']")
	@CacheLookup
	public WebElement CloseProductButton;
	
	
	public void Check_ProductName() {
		try {
            WebElement editButton = ldriver.findElement(By.xpath("//tr[td[contains(text(), 'Automation 10ML')]]//button[contains(text(), 'Edit')]"));
            editButton.click();

        } 
		catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	@FindBy(xpath="//*[text()='Update']")
	@CacheLookup
	WebElement Update_Button;
		public void Click_Update_Button() {
			Update_Button.click();

		}
		
		@FindBy(xpath="//*[@type='checkbox']")
		@CacheLookup
		WebElement QRBarcodeLess_Radio_Button;
		public void Click_QRBarcodeLess_Radio_Button() {
			if (!QRBarcodeLess_Radio_Button.isSelected()) {   
	        }
			else {
				QRBarcodeLess_Radio_Button.click();

			}	
		}
		
		@FindBy(xpath="//input[@type='radio' and @value='2']")
		@CacheLookup
		WebElement OneTimeSale_Button;
		public void Click_ON_OneTimeSale_Button() {
			OneTimeSale_Button.click();
		}
		
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[15]")
		@CacheLookup
		WebElement Refund_Amount_OTS;

		public void Refund_AmountTextBox_OTS(String Refund_AmountBox_OTS) {
			Refund_Amount_OTS.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			Refund_Amount_OTS.sendKeys(Refund_AmountBox_OTS);
		}
		
		@FindBy(xpath="(//*[@class=\"MuiButtonBase-root MuiRadio-root MuiRadio-colorPrimary PrivateSwitchBase-root MuiRadio-root MuiRadio-colorPrimary MuiRadio-root MuiRadio-colorPrimary css-1a5icme\"])[2]")
		@CacheLookup
		WebElement Both_Button;
		public void Click_ON_Both_Button() {
			Both_Button.click();
		}
		
		public String Verify_ProductsTableText(int i) {
			WebElement ProductsTableText = ldriver.findElement(By.xpath("((//*[@class=\"MuiTable-root MuiTable-stickyHeader css-lkld8c\"])[1]//th)["+i+"]"));
			return ProductsTableText.getText();
		}
		
		
		@FindBy(xpath="//*[td[contains(text(),'Automation 10ML')]]//*[@data-testid='DownloadIcon']")
		@CacheLookup
		WebElement Download_DocumentB;
		public void Click_On_Download_DocumentB() {
			Download_DocumentB.click();
		}
		
		@FindBy(xpath="//*[text()='Products Qr/BarCode Details']")
		@CacheLookup
		WebElement Product_QRBarcode_DetailsButton;
		public WebElement ClickONProduct_QRBarcode_DetailsButton() {
			WebDriverWait wait = new WebDriverWait(ldriver, 90);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Product_QRBarcode_DetailsButton));
			return element;
			
		}
		
		@FindBy(xpath="//*[text()='Generate Qr/Barcode']")
		@CacheLookup
		WebElement Generate_QRBarcode;
		public void Click_ON_Generate_QRBarcode() {
			Generate_QRBarcode.click();
		}
		
		@FindBy(xpath="//*[@class=\"MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf\"]")
		@CacheLookup
		WebElement Generate_QRBarcodeC;
		public void Click_ON_Generate_QRBarcodeC() {
			Generate_QRBarcodeC.click();
		}
		
		public String Verify_GenerateQRCodeCombobox_Text(int i) {
			WebElement  GenerateQRCodeCombobox = ldriver.findElement(By.xpath("(//*[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz\"])["+i+"]"));
			return GenerateQRCodeCombobox.getText();		
		}
		
		
		
//		@FindBy(xpath="(//*[@aria-labelledby=\"demo-select-small demo-select-small\"])[1]")
//		@CacheLookup
//		public WebElement qrBarcodeDropdownToGenerate;
		
		@FindBy(xpath="//*[text()=\"Generate Qr/Barcode\"]")
		@CacheLookup
		public WebElement generateQRBarcodeForProductTab;
		
		@FindBy(xpath="(//*[text()=\"Generate QR code\" and @role=\"option\"])")
		@CacheLookup
		public WebElement generateQrOption;
		
		@FindBy(xpath="(//*[text()=\"Generate Bar code\" and @role=\"option\"])")
		@CacheLookup
		public WebElement generateBarcodeOption;
		
		@FindBy(xpath="(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq\"])")
		@CacheLookup
		public WebElement enterQuantityBoxForGenerateBarcode;
		
		@FindBy(xpath="(//button[contains(text(), 'Filter')])[1]")
		@CacheLookup
		public WebElement filterButtonQrList;
		
		@FindBy(xpath="(//*[@id=\"demo-radio-buttons-group-label\"])[1]")
		@CacheLookup
		public WebElement qrFilterDialogBoxText;
		
		@FindBy(xpath="//label[span[text()='Barcode details']]//input[@type='radio']")
		@CacheLookup
		public WebElement barcodeDetailsRadioButton;
		
		@FindBy(xpath="//label[span[text()='Newly generated']]//input[@type='radio']")
		@CacheLookup
		public WebElement newlyGeneratedRadioButton;
		
		@FindBy(xpath="//*[text()='Submit']")
		@CacheLookup
		public WebElement submitButtonForFilter;
		
		@FindBy(xpath="(//*[@aria-labelledby=\"demo-select-small demo-select-small\"])[2]")
		@CacheLookup
		public WebElement productDropdownToGenerate;
		
		@FindBy(xpath="//*[@data-value=\"100 ML-GOLD\"]")
		@CacheLookup
		public WebElement AutomationProduct;
		
		@FindBy(xpath="(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[1]")
		@CacheLookup
		public WebElement enterQrQuantityTextBox;
		
		@FindBy(xpath="(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[2]")
		@CacheLookup
		public WebElement enterBatchIdTextBox;
		
		@FindBy(xpath="(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[3]")
		@CacheLookup
		public WebElement enterManufacturer_NameTextBox;
		
		@FindBy(xpath="(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[4]")
		@CacheLookup
		public WebElement enterManufacturer_addressTextBox;
		
		@FindBy(xpath="//*[text()=\"Generate\"]")
		@CacheLookup
		public WebElement generateButton;
		
		@FindBy(xpath="(//*[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-sizeSmall css-1o6fzn1\"])[1]")
		@CacheLookup
		public WebElement QrBarcodeStartNumber;
		
		@FindBy(xpath="//*[text()=\"Link Qr Code\" and @role=\"tab\"]")
		@CacheLookup
		public WebElement linkQrTab;
		
		@FindBy(xpath="//*[text()=\"Link Qr Code\" and @value=\"linkQr\"]")
		@CacheLookup
		public WebElement linkOnlyQRButton;
		
		@FindBy(xpath="//*[text()=\"Link Qr & Barcode\" and @value=\"linkQrBarcode\"]")
		@CacheLookup
		public WebElement linkQrAndBarcodeButtons;
		
		@FindBy(xpath="(//*[ @name=\"radio-buttons-group\" and @value=\"scanner\"])[1]")
		@CacheLookup
		public WebElement scannerRadioButtonForProduct;
		
		@FindBy(xpath="(//*[ @class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[1]")
		@CacheLookup
		public WebElement productQRBarcodeTextbox;
		
		@FindBy(xpath="(//*[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-sizeSmall css-1o6fzn1\"])[3]")
		@CacheLookup
		public WebElement qrQuantity;
		
		public WebElement QrBarcodeStartNumber() {
			Actions action=new Actions(ldriver);
			action.moveToElement(QrBarcodeStartNumber);
			return QrBarcodeStartNumber;
		}
		
		public WebElement filterButtonQrList() {
			Actions action=new Actions(ldriver);
			action.moveToElement(filterButtonQrList);
			return filterButtonQrList;
		}
		
		public WebElement qrFilterDialogBoxText() {
			WebDriverWait wait = new WebDriverWait(ldriver, 90);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(qrFilterDialogBoxText));
			return element;
		}
		
		public WebElement enterQuantityBoxForGenerateBarcode() {
			WebDriverWait wait = new WebDriverWait(ldriver, 90);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(enterQuantityBoxForGenerateBarcode));
			return element;
		}
		
		@FindBy(xpath="(//*[text()=\"Re-generate QR code\" and @role=\"option\"])")
		@CacheLookup
		public WebElement ReGenerateQRcodeButton;
		
		
		@FindBy(xpath="//*[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq\"]")
		@CacheLookup
		public WebElement enterQuantityToRegenrateQRcode;
		
		
		public WebElement enterQuantityToRegenrateQRcode() {
			WebDriverWait wait = new WebDriverWait(ldriver, 90);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(enterQuantityToRegenrateQRcode));
			return element;
		}
		
		@FindBy(xpath="//label[span[text()='QR details']]//input[@type='radio']")
		@CacheLookup
		public WebElement QR_DetailsRadioButton;
		
		
		@FindBy(xpath="//label[span[text()='Regenerated']]//input[@type='radio']")
		@CacheLookup
		public WebElement Regenerated_RadioButton;
		
		
		@FindBy(xpath="(//*[text()=\"Re-generate Bar code\" and @role=\"option\"])")
		@CacheLookup
		public WebElement ReGenerateBarcodeButton;
		
		
		@FindBy(xpath="//label[span[text()='Barcode details']]//input[@type='radio']")
		@CacheLookup
		public WebElement BarCode_DetailsRadioButton;
		
		
		@FindBy(xpath = "(//*[text()='Link Qr Code'])[1]")
		@CacheLookup
		public WebElement Link_QRCodeTab;
		
		
		public String CheckDeviceText(int i) {
			WebElement DeviceText = ldriver.findElement(By.xpath("(//*[@class=\"MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-9l3uo3\"])["+i+"]"));
			return DeviceText.getText();
		}
		
		
		@FindBy(xpath="(//*[text()=\"QR/Barcode Details\"])[1]")
		@CacheLookup
		public WebElement qrBarcodeDetailsPage;
		
		@FindBy(xpath="(//*[text()=\"Scan Qr Code\"])[1]")
		@CacheLookup
		public WebElement scanQRCodeTab;
		
		@FindBy(xpath="(//*[text()=\"Link Qr Code\"])[1]")
		@CacheLookup
		public WebElement linkQrCodeTab;
		
		@FindBy(xpath="(//*[text()=\"Link Qr & Barcode\"])[1]")
		@CacheLookup
		public WebElement linkQrAndBarcodeButton;
		
		@FindBy(xpath="(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])")
		@CacheLookup
		public WebElement linkQrBarcodeTextBox;
		
		@FindBy(xpath="(//*[@class=\"MuiTypography-root MuiTypography-h6 MuiDialogTitle-root css-ohyacs\"])")
		public WebElement oneLinkSuccessText;
		
		@FindBy(xpath="//*[text()=\"Link\"]")
		public WebElement linkButton;
		
		@FindBy(xpath="(//*[text()=\"Scan next\"])")
		public WebElement scanNextButton;
		
		public WebElement oneLinkSuccessText() {
			WebDriverWait wait = new WebDriverWait(ldriver, 90);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(oneLinkSuccessText));
			return element;
		}
		
		public WebElement linkButton() {
			WebDriverWait wait = new WebDriverWait(ldriver, 90);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(linkButton));
			return element;
		}
		
	 
		
		 public void linkQRWithBarcode() throws InterruptedException {
		        // Check if lists are of the same size
		        if (qrList.size() != barcodeList.size()) {
		            System.out.println("Error: QR list and Barcode list are not of the same size.");
		            return;
		        }
		
	
		 
		  // Iterate over the lists and link each QR with its corresponding barcode
	        for (int i = 0; i < qrList.size()-1; i++) {
	            String qrCode = qrList.get(i);
	            String barcode = barcodeList.get(i);

	            // Perform actions with QR code
	            //scanQRCode(qrCode);
	            Thread.sleep(1000);
	            scanQRCode(qrCode);
		        System.out.println("Scanning QR code: " + qrCode);
		        
		        oneLinkSuccessText();
		        Thread.sleep(2000);
	            scanNextButton.click();

	            // Perform action with barcode
	            //scanBarcode(barcode);
	            scanBarcode(barcode);
		        System.out.println("Scanning barcode: " + barcode);
		        Thread.sleep(1000);
		        oneLinkSuccessText();
		        linkButton.click();

	        }
	    }

	    // Placeholder method to scan the QR code
	    private void scanQRCode(String qrCode) {
	    	linkQrBarcodeTextBox.sendKeys(qrCode);
	        System.out.println("Scanning QR code: " + qrCode);
	    }

	    // Placeholder method to scan the barcode
	    private  void scanBarcode(String barcode) {
	    	linkQrBarcodeTextBox.sendKeys(barcode);
	        System.out.println("Scanning barcode: " + barcode);
	    }
	    
	    
	    @FindBy(xpath="(//*[text()='Link Qr Code'])[2]")
	    @CacheLookup
	    public WebElement Click_ON_LinkQRCode;
	    
	    
	    
	    
	    
	    public void Link_Only_QR() throws InterruptedException {
	            String qrCode = qrList.get(1);
	            // Perform actions with QR code
	            Thread.sleep(1000);
	            scanQRCode(qrCode);
		        System.out.println("Scanning QR code: " + qrCode);
		        
	    }
	    
	    @FindBy(xpath="//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"]")
	    @CacheLookup
	    WebElement InvalidQRCode;
	    
	    public void Enter_InvalidQRCode(String Enter_InvalidQRCodeBox) {
	    	InvalidQRCode.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			InvalidQRCode.sendKeys(Enter_InvalidQRCodeBox);

	    }
	    
	    @FindBy(xpath="//*[text()='Scan Qr Code']")
	    @CacheLookup
	    public WebElement Click_ON_ScanQRCode;
	    
	    
	    @FindBy(xpath="(//*[@class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-q8lw68\"])[1]")
	    @CacheLookup
	    public WebElement Select_ScannerDevice;
	    
	    @FindBy(xpath="//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"]")
	    @CacheLookup
	    public WebElement Enter_QRid;
	    
	    
	    @FindBy(xpath="//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"]")
	    @CacheLookup
	    public WebElement VEnter_QRid;
	    
	    public String Check_ContainerDetails_text(int i) {
	    	WebElement ContainerDetails_text = ldriver.findElement(By.xpath("(//*[@class=\"MuiTypography-root MuiTypography-body1 css-q0ewr5\"])["+i+"]"));
	    	//String text = ContainerDetails_text.getText();
			return ContainerDetails_text.getText().replace(":", "");
	    	}
	    
	    
	    @FindBy(xpath="//*[text()='Close']")
	    @CacheLookup
	    public WebElement CloseButton;
	    
	    
	    
	    @FindBy(xpath="//*[text()='Crate Details']")
	    @CacheLookup
	    public WebElement Click_ON_CrateDetails_Tab;
	    
	    public WebElement Click_ON_CrateDetails_Tab() {
			WebDriverWait wait = new WebDriverWait(ldriver, 90);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Click_ON_CrateDetails_Tab));
			return element;
		}


	    
	    public String Check_CrateDetailsTable_Text(int i)  {
	    	WebElement CrateDetailsTable_Text = ldriver.findElement(By.xpath("(//*[@scope=\"col\"])["+i+"]"));
	    	return CrateDetailsTable_Text.getText();
	  
	    }
	    
	    @FindBy(xpath="//*[text()='add crate']")
	    @CacheLookup
	    public WebElement AddCrate_Button;
	    
	    
	    public String Check_AddCrateTextboxes(int i) {
	    	WebElement AddCrateTextboxes = ldriver.findElement(By.xpath("(//label[span[@class='MuiFormLabel-asterisk MuiInputLabel-asterisk Mui-error css-sp68t1']])["+i+"]"));
	    	return AddCrateTextboxes.getText();
	    }
	    
	    
	    @FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[1]")
		@CacheLookup
		WebElement CrateName;
		public void CrateNameTextBox(String CrateNameBox) {
			CrateName.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			CrateName.sendKeys(CrateNameBox);
		}
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[2]")
		@CacheLookup
		WebElement CrateCapacity;
		public void CrateCapacityTextBox(String CrateCapacityBox) {
			CrateCapacity.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			CrateCapacity.sendKeys(CrateCapacityBox);
		}
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[3]")
		@CacheLookup
		WebElement Price;
		public void PriceTextBox(String PriceBox) {
			Price.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			Price.sendKeys(PriceBox);
		}
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[4]")
		@CacheLookup
		WebElement HSNCode;
		public void HSNCodeTextBox(String HSNCodeBox) {
			HSNCode.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			HSNCode.sendKeys(HSNCodeBox);
	    }
		
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[5]")
		@CacheLookup
		WebElement enterCGST;
		public void enterCGSTTextBox(String enterCGSTBox) {
			enterCGST.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			enterCGST.sendKeys(enterCGSTBox);
	    }
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[6]")
		@CacheLookup
		WebElement enterSGST;
		public void enterSGSTTextBox(String enterSGSTBox) {
			enterSGST.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			enterSGST.sendKeys(enterSGSTBox);
	    }
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[7]")
		@CacheLookup
		WebElement enterIGST;
		public void enterIGSTTextBox(String enterIGSTBox) {
			enterIGST.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			enterIGST.sendKeys(enterIGSTBox);
	    }
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[8]")
		@CacheLookup
		WebElement Descriptions;
		public void DescriptionsTextBox(String DescriptionsBox) {
			Descriptions.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			Descriptions.sendKeys(DescriptionsBox);
	    }
		
		
		public void UploadCrate_Image() {
			 WebElement button = ldriver.findElement(By.xpath("(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary css-1lpukdo\"])[1]")); 
		        String buttonText = button.getText().trim();
		        System.out.println(buttonText);
	        if (buttonText.equals("UPLOAD CRATE")) {
	            WebElement fileInput = ldriver.findElement(By.xpath("//*[@type=\"file\"]"));
		         fileInput.sendKeys("C:\\Users\\Milind Manoharrao\\Downloads\\Bottle crate.png");	        
		         WebElement Close_ToastMessage = ldriver.findElement(By.xpath("//*[@class=\"Toastify__close-button Toastify__close-button--dark\"]"));
		         Close_ToastMessage.click();
		         WebElement Close_SecondToastMessage = ldriver.findElement(By.xpath("//*[@class=\"Toastify__close-button Toastify__close-button--colored\"]"));
		         Close_SecondToastMessage.click();
	            System.out.println("Button clicked: Upload Image");
	        } else if (buttonText.equals("UPLOADED SUCCESSFULLY")) {
	            System.out.println("Button not clicked: Uploaded Successfully");
	        } else {
	            System.out.println("Button text does not match expected values.");
	        }	         
		}
		
		
		@FindBy(xpath="//*[text()='Add Crate']")
		@CacheLookup
		public WebElement AddCrateButton;
		 
		@FindBy(xpath="//*[text()='Close']")
		@CacheLookup
		public WebElement ClickCloseButton;
		
		
		@FindBy(xpath="//tr[td[text()='Crate    Automation']]//button[contains(text(),'Edit')]")
		@CacheLookup
		public WebElement ClickONEditButton;
		
		@FindBy(xpath="//tr[td[contains(text(), 'Crate    Automation')]]//*[@data-testid='DownloadIcon']")
		@CacheLookup
		public WebElement Download_Crate_Image;
		
		@FindBy(xpath="(//*[text()='Filter'])[1]")
		@CacheLookup
		public WebElement Click_ON_CrateFilter;
		
		
		public String HeadingOFfilters(int i) {
			WebElement FilterOptions = ldriver.findElement(By.xpath("(//*[@class=\"MuiTypography-root MuiTypography-body1 css-9l3uo3\"])["+i+"]"));
			return FilterOptions.getText();
		}
		
		@FindBy(xpath="(//*[text()='Cancel'])[2]")
		@CacheLookup
		public WebElement Click_ON_CancelButton;
		
		
		public boolean SortingOFCratesName() {
		    boolean CratesName = true;
		    List<String> CrateN = new ArrayList<>();
		    List<WebElement> elementsList = ldriver
		            .findElements(By.xpath("//*[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-sizeSmall css-1o6fzn1\"]"));
		    int sizeOfList = elementsList.size();
		    System.out.println(sizeOfList);

		    if (sizeOfList >= 1) {
		        // Loop through the elements starting from index 11 to 21
		        for (int i = 11; i <= 21; i++) {
		            String status = ldriver
		                    .findElement(By.xpath("(//table//tr/td[3])[" + i + "]"))
		                    .getText();
		            CrateN.add(status);
		            System.out.println(status);
		        }
		    }

		    // Sort the list in case-insensitive order
		    List<String> sortedList = new ArrayList<>(CrateN);
		    Collections.sort(sortedList, String.CASE_INSENSITIVE_ORDER);

		    // Check if the original list is equal to the sorted list in a case-insensitive manner
		    if (!areListsEqualIgnoreCase(CrateN, sortedList)) {
		        CratesName = false;
		    }

		    System.out.println(CratesName);
		    return CratesName;
		}

		// Method to compare two lists for case-insensitive equality
		private boolean areListsEqualIgnoreCase(List<String> list1, List<String> list2) {
		    if (list1.size() != list2.size()) {
		        return false;
		    }
		    for (int i = 0; i < list1.size(); i++) {
		        if (!list1.get(i).equalsIgnoreCase(list2.get(i))) {
		            return false;
		        }
		    }
		    return true;
		}
		
		@FindBy(xpath="//*[text()='Crates Qr/BarCode Details']")
		@CacheLookup
		public WebElement Crates_QRBarcodeDetails_Tab;
		
		
		public String Check_CrateQRBarcodeDetails_TableText(int i) {
			WebElement CrateQRBarcodeDetails_TableText = ldriver.findElement(By.xpath("(//tr[contains(@class, 'MuiTableRow-head')]//th)["+i+"]"));
		    return CrateQRBarcodeDetails_TableText.getText().trim();
		}
		
		@FindBy(xpath="(//*[@class=\"PrivateSwitchBase-input css-1m9pwf3\"])[2]")
		@CacheLookup
		public WebElement GenerateRadioButton;
		
		@FindBy(xpath="//*[text()='Generate Qr/BarCode Crate']")
		@CacheLookup
		public WebElement Generate_Qr_BarCode_Crate;
		
		
		public String Check_CrateTextboxes(int i) {
			WebElement CrateTextboxe = ldriver.findElement(By.xpath("(//label[contains(@class, 'MuiFormLabel-root')])["+i+"]"));
			return CrateTextboxe.getText();
		}
		
		@FindBy(xpath="//*[@class=\"MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-ciw10u\"]")
		@CacheLookup
		public WebElement ClickON_SelectCrate;
		
		public void SelectCrateFrom_DropDown() {
			//WebElement ClickON_SelectCrate = ldriver.findElement(By.xpath("//*[@class=\\\"MuiNativeSelect-select MuiNativeSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-ciw10u\\\"]"));
			ClickON_SelectCrate.click();
			Select SelectCrate =new Select(ClickON_SelectCrate);
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			SelectCrate.selectByValue("Crate    Automation");
		}
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[1]")
		@CacheLookup
		WebElement Quantity;
		public void QuantityTextBox(String QuantityBox) {
			Quantity.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			Quantity.sendKeys(QuantityBox);
	    }
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[2]")
		@CacheLookup
		WebElement Company_Name;
		public void Company_NameTextBox(String Company_NameBox) {
			Company_Name.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			Company_Name.sendKeys(Company_NameBox);
	    }
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[3]")
		@CacheLookup
		WebElement Owner_Name;
		public void Owner_NameTextBox(String Owner_NameBox) {
			Owner_Name.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			Owner_Name.sendKeys(Owner_NameBox);
	    }
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[4]")
		@CacheLookup
		WebElement Owner_Phone;
		public void Owner_PhoneTextBox(String Owner_PhoneBox) {
			Owner_Phone.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			Owner_Phone.sendKeys(Owner_PhoneBox);
	    }
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[5]")
		@CacheLookup
		WebElement Line_1;
		public void Line_1TextBox(String Line_1Box) {
			Line_1.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			Line_1.sendKeys(Line_1Box);
	    }
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[6]")
		@CacheLookup
		WebElement Line_2;
		public void Line_2TextBox(String Line_2Box) {
			Line_2.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			Line_2.sendKeys(Line_2Box);
	    }
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[7]")
		@CacheLookup
		WebElement Landmark;
		public void LandmarkTextBox(String LandmarkBox) {
			Landmark.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			Landmark.sendKeys(LandmarkBox);
	    }
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[8]")
		@CacheLookup
		WebElement Area;
		public void AreaTextBox(String AreaBox) {
			Area.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			Area.sendKeys(AreaBox);
	    }
		
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[9]")
		@CacheLookup
		WebElement State;
		public void StateTextBox(String StateBox) {
			State.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			State.sendKeys(StateBox);
	    }
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[10]")
		@CacheLookup
		WebElement Country;
		public void CountryTextBox(String CountryBox) {
			Country.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			Country.sendKeys(CountryBox);
	    }
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[11]")
		@CacheLookup
		WebElement Pincode;
		public void PincodeTextBox(String PincodeBox) {
			Pincode.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			Pincode.sendKeys(PincodeBox);
	    }
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[12]")
		@CacheLookup
		WebElement Gst_Number;
		public void Gst_NumberTextBox(String Gst_NumberBox) {
			Gst_Number.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			Gst_Number.sendKeys(Gst_NumberBox);
	    }
		
		@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])[13]")
		@CacheLookup
		WebElement PAN_Number;
		public void PAN_NumberTextBox(String PAN_NumberBox) {
			PAN_Number.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			PAN_Number.sendKeys(PAN_NumberBox);
	    }
		
		@FindBy(xpath="//*[text()='Genrate']")
		@CacheLookup
		public WebElement GenerateCrateQRBarcodeButton;
		
		@FindBy(xpath="(//*[text()='Filter'])[1]")
		@CacheLookup
		public WebElement CrateQRBarcodeFilter;
		
		 public WebElement CrateQRBarcodeFilter() {
				WebDriverWait wait = new WebDriverWait(ldriver, 90);
				WebElement element = wait.until(ExpectedConditions.elementToBeClickable(CrateQRBarcodeFilter));
				return element;
			}
		
		@FindBy(xpath="(//*[@class=\"MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf\"])[2]")
		@CacheLookup
		public WebElement ClickONIsReGeneratedDropDown;
		
//		@FindBy(xpath="(//*[text()='Newly Generated'])")
//		@CacheLookup
//		WebElement SelectNewlyGenerated;
		
		public void SelectNewlyGenerateds() {
		 try {
             WebElement element = ldriver.findElement(By.xpath("(//*[text()='Newly Generated' and @role=\"option\"])"));
              element.click();
          } 
          catch (Exception e) {
          	System.out.println("Already Newly Selected");
          }
		//return AddCrateButton;
		}
		
		@FindBy(xpath="(//*[@class=\"MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf\"])[3]")
		@CacheLookup
		public WebElement SelectQRBarcodeDropDown;
		
//		@FindBy(xpath="(//*[text()='Qr Code'])[2]")
//		@CacheLookup
		public void SelectQRCodeOption() {
			try {
	             WebElement element = ldriver.findElement(By.xpath("(//*[text()='Qr Code' and @role=\"option\"])"));
	              element.click();
	          } 
	          catch (Exception e) {
	          	System.out.println("Already QRCode Selected");
	          }
		}
		
		@FindBy(xpath="//button[@type='button' and contains(@class, 'MuiButton-containedPrimary') and text()='filter']")
		@CacheLookup
		public WebElement ClickONCrateFilterButton;
		
		@FindBy(xpath="(//*[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight MuiTableCell-sizeSmall css-1thfh4x\"])[1]")
		@CacheLookup
		public WebElement FirstQROfCrate;
		
		public WebElement FirstQROfCrate() {
			Actions action=new Actions(ldriver);
			action.moveToElement(FirstQROfCrate);
			return FirstQROfCrate;
		}
		
		@FindBy(xpath="(//tr[@class='MuiTableRow-root css-16nxph9']/th[3])[1]")
		@CacheLookup
		public WebElement QRQuantityOFCrate;
		
		
		public void SelectBarCodeOption() {
			try {
	             WebElement element = ldriver.findElement(By.xpath("(//*[text()='Bar Code' and @role=\"option\"])"));
	              element.click();
	          } 
	          catch (Exception e) {
	          	System.out.println("Already BarCode Selected");
	          }
		}
		
		
		@FindBy(xpath="(//*[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight MuiTableCell-sizeSmall css-1thfh4x\"])[1]")
		@CacheLookup
		public WebElement FirstBarCodeOfCrate;
		
		public WebElement FirstBarCodeOfCrate() {
			Actions action=new Actions(ldriver);
			action.moveToElement(FirstBarCodeOfCrate);
			return FirstBarCodeOfCrate;
		}
		
		@FindBy(xpath="(//tr[@class='MuiTableRow-root css-16nxph9']/th[3])[1]")
		@CacheLookup
		public WebElement BarCodeQuantityOFCrate;
		
		
		
		@FindBy(xpath="//*[@class='MuiButtonBase-root MuiRadio-root MuiRadio-colorPrimary PrivateSwitchBase-root MuiRadio-root MuiRadio-colorPrimary MuiRadio-root MuiRadio-colorPrimary css-1a5icme']//*[@value='2']")
		@CacheLookup
		public WebElement Select_LinkRadioButton;
		
		
		@FindBy(xpath="(//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"])")
		@CacheLookup
		public WebElement linkcrateQrBarcodeTextBox;
		
		
		private void scancrateQRCode(String qrCode) {
			linkcrateQrBarcodeTextBox.sendKeys(qrCode);
	        System.out.println("Scanning QR code: " + qrCode);
	    }

	    // Placeholder method to scan the barcode
	    private  void scancrateBarcode(String barcode) {
	    	linkcrateQrBarcodeTextBox.sendKeys(barcode);
	        System.out.println("Scanning barcode: " + barcode);
	    }
	    
	    
	    
	    @FindBy(xpath="(//*[text()=\"Link\"])[2]")
		public WebElement linkcrateButton;
		
		public void linkCrateQRWithBarcode() throws InterruptedException {
	        // Check if lists are of the same size
	        if (crateQrList.size() != crateBarcodeList.size()) {
	            System.out.println("Error: QR list and Barcode list are not of the same size.");
	            return;
	        }
	
	       

	 
	  // Iterate over the lists and link each QR with its corresponding barcode
        for (int i = 0; i < crateQrList.size(); i++) {
            String qrCode = crateQrList.get(i);
            String barcode = crateBarcodeList.get(i);
            
//            crateQrList.size();
//            System.out.println(crateQrList);
//            crateBarcodeList.size();
//            System.out.println(crateBarcodeList);

            // Perform actions with QR code
            //scanQRCode(qrCode);
            Thread.sleep(1000);
            scancrateQRCode(qrCode);
	        System.out.println("Scanning QR code: " + qrCode);
	        
	        oneLinkSuccessText();
	        Thread.sleep(2000);
            scanNextButton.click();

            // Perform action with barcode
            //scanBarcode(barcode);
            scancrateBarcode(barcode);
	        System.out.println("Scanning barcode: " + barcode);
	        Thread.sleep(2000);
	        oneLinkSuccessText();
	        linkcrateButton.click();

        }
		
}
		@FindBy(xpath="//input[@value='0']")
		@CacheLookup
		public WebElement ScanCrateQRBarcode;
		
		@FindBy(xpath="//input[@value='scanner']")
	    @CacheLookup
	    public WebElement Select_crateScannerDevice;
		
		@FindBy(xpath="//*[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"]")
		@CacheLookup
		public WebElement EnterCrateQRCOde;
		
		
		public String CheckTextOF_CrateTextboxes(int i) {
			WebElement CrateTextboxes = ldriver.findElement(By.xpath("(//*[@class=\"MuiTypography-root MuiTypography-body1 css-q0ewr5\"])["+i+"]"));
			return CrateTextboxes.getText();
		}
		
		@FindBy(xpath="//*[text()='Close']")
		@CacheLookup
		public WebElement CrateCloseButton;
		
}

	   




 



	
