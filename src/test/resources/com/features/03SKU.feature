#Author: Milind Ingale
#Keywords Summary :
#Feature: SKU page


Feature: SKU Page


@tag1
Scenario: Check SKU page heading 
Given Click on SKU page
Then check SKU page heading


#@tag2
#Scenario: Check Add Product Dialog box heading text
#Given Click on Add Product Button
#Then Check Heading text
#
#@wait
#@tag3
#Scenario: Check Text of Add Product textboxes
#Then Verify Add Product textboxes
  #
#@wait  
#@tag4
#Scenario Outline: Add Refill Product
#Given Click on Add Product Button
#Given Send values in textboxes "<Product Name>", "<Capacity>", "<Material>", "<Life Span>", "<SKU Quantity>", "<HSN Code>", "<CGST %>", "<SGST %>", "<IGST %>", "<Minimum Book Quantity>", "<Maximum Book Quantity>", "<Description>", "<MRP>", "<Sale Price>", "<Deposit>", "<Refund Amount>"
#When Select Refill type
#And Select Refund Type
#And Upload Image
#And Click on Add Products button
#Then Verify toast messages "<Toast Message>"
#
#Examples: 
  #| Product Name    | Capacity | Material | Life Span | SKU Quantity | HSN Code   | CGST % | SGST % | IGST % | Minimum Book Quantity | Maximum Book Quantity | Description                               | MRP | Sale Price | Deposit | Refund Amount | Toast Message                                         |
 #|                 |          |          |           |              |            |        |        |        |                       |                       | We are adding a new product by Automation.| 55  |   40       |   100   |    80         | body.name should NOT be shorter than 5 characters     |
 #| Automation 10ML |          |          |           |              |            |        |        |        |                       |                       | We are adding a new product by Automation.| 55  |   40       |   100   |    80         | body.capacity should NOT be shorter than 3 characters |
 #| Automation 10ML | 100 ML   |          |           |              |            |        |        |        |                       |                       | We are adding a new product by Automation.| 55  |   40       |   100   |    80         | body.material should NOT be shorter than 3 characters |
 #| Automation 10ML | 100 ML   | Gold     |           |              |            |        |        |        |                       |                       | We are adding a new product by Automation.| 55  |   40       |   100   |    80         | body.life_span should be number                       |    
 #| Automation 10ML | 100 ML   | Gold     |   0       |              |            |        |        |        |                       |                       | We are adding a new product by Automation.| 55  |   40       |   100   |    80         | body.life_span should be >= 1                         |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
 #| Automation 10ML | 100 ML   | Gold     | 20        |       2      |    43      |  12    |   12   |   12   |                       |                       | We are adding a new product by Automation.| 55  |   40       |   100   |    80         | body.hsn_code should NOT be shorter than 4 characters |                                    
 #| Automation 10ML | 100 ML   | Gold     | 20        |       2      |    4300    |        |   12   |   12   |                       |                       | We are adding a new product by Automation.| 55  |   40       |   100   |    80         | body.cgst_perc should be number                       |
 #| Automation 10ML | 100 ML   | Gold     | 20        |       2      |    4300    |  12    |        |   12   |                       |                       | We are adding a new product by Automation.| 55  |   40       |   100   |    80         | body.sgst_perc should be number                       |
 #| Automation 10ML | 100 ML   | Gold     | 20        |       2      |    4300    |  12    |   12   |        |                       |                       | We are adding a new product by Automation.| 55  |   40       |   100   |    80         | body.igst_perc should be number                       |
 #| Automation 10ML | 100 ML   | Gold     | 20        |       2      |    4300    |  12    |   12   |   12   |                       |                       | We are adding a new product by Automation.| 55  |   40       |   100   |    80         | body.min_book_qty should be number                    |
 #| Automation 10ML | 100 ML   | Gold     | 20        |       2      |    4300    |  12    |   12   |   12   |         0             |                       | We are adding a new product by Automation.| 55  |   40       |   100   |    80         | body.min_book_qty should be >= 1                      |
 #| Automation 10ML | 100 ML   | Gold     | 20        |       2      |    4300    |  12    |   12   |   12   |         2             |                       | We are adding a new product by Automation.| 55  |   40       |   100   |    80         | body.max_book_qty should be number                    |
 #| Automation 10ML | 100 ML   | Gold     | 20        |       2      |    4300    |  12    |   12   |   12   |         2             |           0           | We are adding a new product by Automation.| 55  |   40       |   100   |    80         | body.max_book_qty should be >= 1                      |
 #| Automation 10ML | 100 ML   | Gold     | 20        |       2      |    4300    |  12    |   12   |   12   |         2             |           10          | We are adding a new product by Automation.| 55  |   40       |   100   |    80         | Successfully added the new product!                   |
 #
 #
   #
#@wait
#@tag5
#Scenario Outline: Edit Product
#Given Click on Added Product
#When Update any data from textbox  "<Life Span>", "<SKU Quantity>", "<HSN Code>", "<CGST %>", "<SGST %>", "<IGST %>", "<Minimum Book Quantity>", "<Maximum Book Quantity>"
#And Click on Update Button
#Then Verify toast message "Successfully updated the product details!"
                #
#Examples: 
 #|Life Span  | SKU Quantity |  HSN Code  | CGST % |  SGST %  | IGST % | Minimum Book Quantity | Maximum Book Quantity |                                    
 #| 30        |       4      |    2200     |  15    |   15     |   15   |         4             |           100         |  
 #
 #
 #
#@wait
#@tag6
#Scenario: Update QR product into QR-Less Product
#Given Click on Added Product
#When Click on radio button of Product without QR/Barcode 
#And Click on Update Button
#Then Verify toast message "Successfully updated the product details!"    
#
#
#@wait
#@tag7
#Scenario Outline: Change Refill product into One time Sale
#Given Click on Added Product
#When Click on One time sale product button
#And Fill One time sale textboxes "<MRP>", "<Sale Price>", "<Refund Amount>"
#And Click on Update Button
#Then Verify toast message "<Toast Message>"
#
#Examples: 
#| MRP | Sale Price | Refund Amount | Toast Message |   
#| 0   |    2       |    3          | body.one_time_sale.mrp should be >= 1 |               
#| 1   |   2        | 3             |  MRP of the Product must be greater or equals to Selling Price & Shouldn't be 0! |
#| 85  |    75      |      60       | Successfully updated the product details! |
#
#
#
#@wait
#@tag8
#Scenario: Change one time sale product into Refill and one time sale both
#Given Click on Added Product
#When Click on Both Button
#And Click on Update Button
#Then Verify toast message "Successfully updated the product details!"    
#
#
#
#@wait
#@tag9
#Scenario: Check Products Table text
#Then Verify Products table text
#
#
#@wait
#@tag10
#Scenario: Check Download document button
#Given Click on Download button
#Then Verify toast message "Successfully downloaded"
#
#####################/////////////////////////////////////////////////////////////////////////////////////////////////
#
#@wait
#@tag11
#Scenario: Check tab text of Product QR/Barcode details
#Given Click on Product QRBarcode details tab
#When Click on Generate QRBarcode button
#And Click on Generate QRBarcode combobox
#Then Verify combobox text
#
#
#@wait
#@tag12
#Scenario: To test admin able generate qr for 20 liter product
#Given Generate qr barcode option
#When Click generate qr barcode tab
#When Select qr for product
#And Select twenty liter product
#And Enter Quantity for generate qr "2"
#And Enter Batch id "2"
#And Enter Manufacturer Name "Atomation enginner"
#And Enter Manufacturer address "Chennai Tamil Nadu"
#And Click on Generate
#Then Verify toast message after generated as "Successfully generated Barcode/QR ID Series"
#
#
#@tag13
#Scenario: Verify Newly generated qr number is display
#Given Generate qr barcode option
#When Click generate qr barcode tab
#Then Newly generated qr number is display
#
#
#@wait
#@tag14 
#Scenario: To test able generate barcode
#Given Generate qr barcode option
#When Click generate qr barcode tab
#When Select generate Barcode for product
#And Enter Quantity for generate barcode "2"
#And Click on Generate
#Then Verify toast message after generated as "Successfully generated Barcode/QR ID Series"
#
#
#@tag15
#Scenario: Verify Newly generated barcode number is display
#Given Generate qr barcode option
#When Click generate qr barcode tab
#And Click on filter qr barcode list
#When Filter qr_Barcode DialogBox Open
#And Select Barcode radio Button
#And Select Newly Generated radio Button
#And Click on Submit Button to filter
#Then Newly barcode qr number is display
#
#
#@tag16
#Scenario: To test able Re-generate QRcode
#Given Click on Generate QRBarcode combobox
#When Select ReGenerate QR code
#And Enter Quantity for Regenerate qr "2"
#And Click on Generate
#Then Verify toast message after generated as "Successfully Re-Generated QR Code IDs Sereis"
#
#
#@wait
#@tag17
#Scenario: Verify Regenerated QR code 
#Given Click on filter qr barcode list
#When Filter qr_Barcode DialogBox Open
#And Select QRcode radio Button
#And Select ReGenerated radio Button
#And Click on Submit Button to filter
#Then Regenerated qr number is display
#
#
#@tag18
#Scenario: Test able to Regenerate Barcode
#Given Click on Generate QRBarcode combobox
#When Select ReGenerate Bar code 
#And Enter Quantity for Regenerate qr "2"
#And Click on Generate
#Then Verify toast message after generated as "Successfully Re-Generated Bar Code IDs Sereis"
#
#
#
#@wait
#@tag19
#Scenario: Verify Regenerated QR code 
#Given Click on filter qr barcode list
#When Filter qr_Barcode DialogBox Open
#And Select Bar code radio Button
#And Select ReGenerated radio Button
#And Click on Submit Button to filter
#Then Regenerated Bar number is display
#
#
#@tag20
#Scenario: Verify Device text to Link QR and Barcode
#Given Click on Link QR Code tab
#Then Check Device Text
#
#
#@tag21
#Scenario: To test wfs Incharge should not allow to link invalid qr and barcode
#Given Click on link qr code Tab
#And Click on link qr and barcode button
#And scan first invalid qr "BAT0046876"
#When First qr scan successfully message display
#And Click on next button
#And scan first inavlid barcode "EC006464778"
#When Two of two scanned Successfully message display
#And Click on Link Button
#Then verify invalid qr and barcode toast messaage as "Invalid QR/Barcode, Please Scan a Valid QR/Barcode!!!"
#
#
#@tag22
#Scenario: To test link newly generated qr with barcode
#Given Click on link qr code Tab
#And Click on link qr and barcode button
#And Link all qr with all barcode
#Then Verify successfully link message as "Successfully Linked QR and Barcode"
#
#
#@wait
#@tag23
#Scenario Outline: Link Invalid QR code with system
#Given Click on Link only QR code tab
#When Enter invalid QR id "<QR code>"
#Then Verify successfully link message as "<Toast Message>"
#
#Examples:
#| QR code             | Toast Message |
#| Link qr with system | Invalid QR/Barcode, Please Scan a Valid QR/Barcode!!! |
#| BW2Q00239           | Invalid BarCode, Please Contact BookWater Technical Suporrt!!! |
#| EC18803             | Please scan avalid QR Code!  |
#
#
#
#@wait
#@tag24
#Scenario: Link Only QR code with system
#Given Click on Link only QR code tab
#And Link qr with system
#Then Verify successfully link message as "Successfully Linked QR and Barcode" 
#
#
#@wait
#@tag25
#Scenario: Scan invalid QR Code And check Container details
#Given Click on Product QRBarcode details tab
#Given Click on Scan QR code tab
#When Click on Scanner device radio button
#And Enter QR code id to scan "BWBCR613512"
#Then Verify successfully link message as "Unable to fetch container owner details"
#
#
#@tag26
#Scenario: Scan valid QR Code And check Container details
#Given Click on Scan QR code tab
#When Click on Scanner device radio button
#And Enter Valid QR code id to scan "BW1Q00639"
#Then Verify container details text




# ################################   =====================Crate Details=======================


@tag26
Scenario: Check Crate Details table text
Given Click on Crate Details Button
Then Check Crate Details of table text


@tag27
Scenario: Check Add Crate text
Given Click on Add Crate button
Then Check Crate textboxes

@wait
@tag28
Scenario Outline: Add Crate
Given Enter Data to add crate "<Crate Name>", "<Crate Capacity>", "<Price>", "<HSN Code>", "<CGST %>", "<SGST %>", "<IGST %>", "<Description>"
When Upload Crate Image
And Click on Add Crate Buttons
Then Verify successfully toast message as "<Toast Message>" 

Examples: 
| Crate Name           | Crate Capacity | Price | HSN Code | CGST % | SGST % | IGST % |  Description                 |  Toast Message |
|                      |       6        |  200  |  0803    |  10    |  10    |   10   |  Crate By Automation Testing | body/name must NOT have fewer than 5 characters |
| Crate    Automation  |      6         |  200  |  0803    |   0    |   10   |    10  | Crate By Automation Testing  | Crate already available! |


@wait
@tag29
Scenario Outline: Edit Crate
Given Click on Added Crate
When Update any data from textbox  "<Crate Capacity>", "<Price>", "<CGST %>", "<SGST %>", "<IGST %>",
And Click on Update Button
Then Verify toast message "Successfully updated the crate details!"
                
Examples: 
 |Crate Capacity  | Price          | CGST % |  SGST %  | IGST % |                                     
 | 12             |       250      |  15    |   15     |   15   |
  

@wait
@tag30
Scenario: Download Crate Image
Given Click on Download button of Crate
Then Verify toast message "Successfully downloaded"   
 
 
@tag31
Scenario: Check Heading text of Filter Options
Given Click on Filter Option
Then Check Heading Of Filters


@tag32
Scenario: Check Sorting By Ascending and Descending order
Then Check Crates Name in ascending form


@tag33
Scenario: Check QR Barcode Details table text
Given Click on QR Barcode details tab
Then Check QR Barcode Details Table column text

@tag34
Scenario: check textboxes of generate Crate dialog box
Given Click on Generate Radio Button
When Click on Generate QR Barcode button
Then Check Textboxes text of Generate QR Barcode 

@tag35
Scenario Outline: Generate QR Bacode for crate
Given Select Generated Crate
When Send Data to create QR or Barcode in textboxes "<Quantity>", "<Company Name>", "<Owner Name>", "<Owner Phone>", "<Line 1>", "<Line 2>", "<Landmark>", "<Area>", "<State>", "<Country>", "<Pincode>", "<Gst Number>", "<PAN Number>"
And Click on Generate Button
Then Check Successful toast message of Crate "Successfully created the QR/Barcode series for crates!"

Examples:
 |Quantity | Company Name | Owner Name          | Owner Phone | Line 1   | Line 2      | Landmark | Area      | State     | Country | Pincode | Gst Number     | PAN Number |
 | 2       |  Automation  | Automation Engineer | 9146939609  | Bookwater| Raheja Tower| Near LIC | Anna Salai| Tamilnadu | India   | 603103  | 22AAAAA0000A1Z5| JIDSJ4343H |



@tag36
Scenario: Verify Newly generated QRcode of Crate number is display
Given Click on filter Of Crate qr barcode list
When Click on Is ReGenerated dropdown
And Select Newly Generated
And click on QR barcode DropDown
And Select QR code option
And Clicks on Filter option
Then Newly Generated qrcode number is display


@tag37
Scenario: Verify Newly generated BarCode of Crate number is display
Given Click on filter Of Crate qr barcode list
When Click on Is ReGenerated dropdown
And Select Newly Generated
And click on QR barcode DropDown
And Select Bar code option
And Clicks on Filter option
Then Newly Generated Barcode number is display


@wait
@tag38
Scenario: To test linking of newly generated Crate qr with barcode
Given Click on link radio button
And Link all Crate qr with all barcode
Then Verify successfully link message as "Successfully created the QR/Barcode details record for crates!"



@wait
@tag39
Scenario: Scan invalid Crate QR Code And check Container details
Given Click on Scan Crate QR code radio button
When Click on crate Scanner device radio button
And Enter crate QR code id to scan "BWQCR613614"
Then Verify successfully link message as "Crate details not found, please scan a valid crate or contact bookwater support"


@tag40
Scenario: Scan valid QR Code And check Container details
Given Click on Scan Crate QR code radio button
When Click on crate Scanner device radio button
And Enter crate QR code id to scan "BWQCR613503"
Then Verify crate details text
