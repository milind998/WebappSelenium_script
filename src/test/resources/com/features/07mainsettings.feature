#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
# (Comments)
#Sample Feature Definition Template

Feature: Main Settings page
@tag
@1
Scenario: Check Settings Page button title
Given Admin Home page
When Click on Setting page
Then Check Page title


@2
Scenario: Check common Settings tab
Given Click on common Settings tab
Then Check All tab text


@wait
@3
Scenario Outline: consumer can able to update Common Settings 

And Admin enter required field  "<Maximum discount allowed(In %)>","<Minimum water wallet amount>","<Water wallet recharge alert>","<Extra charges for single order>","<OTP Less Delivery Msg>","<Extra charges HSN code>", "<Extra charges CGST %>", "<Extra charges SGST %>"
When Click on update button
Then check Toast message "<Toast Message>"
 
Examples:
    | Maximum discount allowed(In %)| Minimum water wallet amount | Water wallet recharge alert | Extra charges for single order | OTP Less Delivery Msg                                          |Extra charges HSN code |Extra charges CGST % |Extra charges SGST % |        Toast Message           |
    |               00              |          00                 |          00                 |          00                    |    !@$%^^^&*!@$%^&                                             |      00               |          00         |         00          |         Invalid Input          |
    |               50              |          00                 |         0                   |          10                    |     123456                                                     |      00               |         00          |          00         |       Invalid Input            |
    |               99              |          100                |         100                 |          15                    | Opting out of OTP during the delivery process exposes you risks|   99698               |         9           |          9          | Updates settings successfully! |
 
 


 
 #@wait
 #@4
 #Scenario: Add slots tab
 #Given Click on Delivery Slots button
 #When Click on Add Slots button
 #And Add Slots tab text1
 #Then Add Slots tab text
    #
#
#
#@wait
#@5
#Scenario Outline: Add delivery Slot
#Given Admin fill data in textboxes "<Number Of Slots>", "<Delivery Slot Start Time>", "<Delivery Slot End Time>"
#When Click on ADD button
#Then check Toast message "<Toast Message>"
#
#Examples: 
     #| Number Of Slots | Delivery Slot Start Time | Delivery Slot End Time | Toast Message |
     #| 5               | 0600                     | 0900                   | Please do not repeate the time Or number of slots.|
     #| 45              |                          |                        | Please select/Enter Start Time and End Time  |
     #|                 | 1200                     | 1200                   | Fill all the fields                          |
     #| 6               | 13                       | 04                     | Selected Invalid Time                        |
     #|                 |                          |                        |  Fill all the fields                         |
     #| 5               | 0600                     | 0900                   | Delivery slot details updated successfully!! |
 

Scenario: User should able to verify Scanning settings text
Given Click on Block setting
When Click on Scanning button
Then Check AllB tab Text

Scenario: User Should able to Update scanning settings 
Given select each radio button and Click on ScanningUpdate button
Then Check Toast Message "Updates settings successfully!"


Scenario: User Should able to Block Payment Methods
Given Click on Block Payments button
When Click on Payment Methods button
Then Check Payment Methods text

@wait
Scenario: Block Paysharp UPI Payment Method
Given Select Payment method
When Enter Blocking reason
Then Click on Block Button

@wait
Scenario: Block Paysharp QR Payment Method
Given Select Payment method
When Enter Blocking reason
Then Click on Block Button

@wait
Scenario: Block Virtual Bank Payment Method
Given Select Payment method
When Enter Blocking reason
Then Click on Block Button

@wait
Scenario: Block RazorPay Payment Method
Given Select Payment method
When Enter Blocking reason
Then Click on Block Button

@wait
Scenario: Block Wallet Payment Method
Given Select Payment method
When Enter Blocking reason
Then Click on Block Button

@wait
Scenario: Block Paysharp Search UPI Payment Method
Given Select Payment method
When Enter Blocking reason
Then Click on Block Button

@wait
Scenario: Block All paysharp payments Payment Method
Given Select Payment method
When Enter Blocking reason
Then Click on Block Button 

@wait
Scenario: Remove Blocked payment methods
Given Click on Remove Button



Scenario: Check Block Booking type text
Given Click  on Booking button
When Click  on Block Booking type         
Then Check Block Booking type text

Scenario: Block Booking By Date Range
Given Select Date Range Block Booking type
When Select Date Range
And Enter Blocking reason
Then Click on Block Button

Scenario: Remove Blocked date range
Given Click on Remove Date Range Button



@wait
Scenario: Block Booking By Booking Type
Given Select Block Booking Type
When Select Order Type
And Enter Blocking reason
Then Click on Block Button

@wait
Scenario: Remove Blocked Booking Type
Given Click on Remove Button



@wait 
Scenario: Check Text of of Pincode tab
Given Click on Pincode tab
Then Check Pincode tab Text


@wait
Scenario: Block Booking By Pincodes
Given Select State
When Select district
And Select pincode
And Enter Blocking reason
Then Click on Block Button

@wait
Scenario: Remove Blocked Booking Type
Given Click on Remove Button

@wait
Scenario: Block Booking By Areas
Given Click on Area Combobox
And Enter Blocking reason
Then Click on Block Button

@wait
Scenario: Remove Blocked Booking Type
Given Click on Remove Button

@wait
Scenario: Block Booking By Districts
Given Click on District Combobox
And Enter Blocking reason
Then Click on Block Button

@wait
Scenario: Remove Blocked Booking Type
Given Click on Remove Button


@wait
Scenario: Block Booking By States
Given Click on State Combobox
And Enter Blocking reason
Then Click on Block Button

@wait
Scenario: Remove Blocked Booking Type
Given Click on Remove Button



@wait
Scenario: Block Booking By Countries
Given Click on Countries Combobox
And Enter Blocking reason
Then Click on Block Button

@wait
Scenario: Remove Blocked Booking Type
Given Click on Remove Button


@wait
Scenario Outline: User should able to Update Block Time setting
Given Click on clock textbox and enter time "<Start Time>", "<End Time>"
When Block Time Settings update button
Then check Toast message "<Toast Message>"

Examples:
          |Start Time | End Time | Toast Message        |
          |1050PM     | 1130PM   | Updates settings successfully! |
          |1222AM     | 3434PM   | Invalid Input        |
          |0900PM     | 1100PM   | Updates settings successfully! |
          
@wait
Scenario: Check Clock and select time
Given Click on Clock and select time
When Block Time Settings update button
Then check Toast message "Updates settings successfully!"


@wait
Scenario Outline: Block Auto Cancel
Given Click on Auto Cancel Button
When Enter Block reason "<Reason>"

Examples:
| Reason |
| !@$%^&(*)|
| 1234567890 |
| Block By Automation testing |

@wait
Scenario: Remove Blocked Booking Type
Given Click on Remove Button





@wait
Scenario: Update Sold By Distributor
Given Click on Sold by tab
And Select Distributor 
When Click on Update button
Then check toast messages "Toast Message"

@wait
Scenario: Update Sold By Bookwater
Given Click on BookWater button
Then Check all tab text

@wait
Scenario Outline: Check Sold By Bookwater Textboxes

Given Fill all textboxes "<Company Name>", "<PAN Number>", "<GST Number>", "<Address>"
When  Click on Update button
Then check toast messages "Toast Message"

Examples: 
         | Company Name   | PAN Number | GST Number     | Address             | Toast Message |
         | 774774         | uuuweuyuweu| yuweyuyuw      | yuweyuyuw           | Invalid Input |
         | Milind PVT LTD | 1234567899 | 1234567899     | Chennai, Tamil Nadu | Invalid Input |
         | Milind PVT LTD | AJRPI7125G | -83438938938   | -Chennai, Tamil Nadu| Invalid Input |
         | Milind PVT LTD | AJRPI7125G | 22AAAAA0000A1Z5| Chennai, Tamil Nadu | Updates settings successfully!|



@Wait
Scenario: Check Referral setting
Given Click on Referral setting button
Then Referral Setting tab text


@wait
Scenario Outline: User can  able to update Referrer setting
Given Select Sign UP
When admin enter data in Sign UP field  "<Water drops for referrer>","<Water drops for referee>"
And Referral Setting update button
Then Toast message "<Toast Message>"
 
Examples:
   |Water drops for referrer    |Water drops for referee|  Toast Message                |
   |              55            |          2            | There were no changes made for updating the referral configurations! |
   |              0000          |          00           |  Successfully configured referral settings!  |
   | 554444444444444            |   434343434343434     |Unable to update the referral settings! |
   |               0             |         4             | Successfully configured referral settings! |
   |                  55        |           2           | Successfully configured referral settings!   |
 


@wait
Scenario: Check Consumer Referee & Referrer and Influencer rewards text
Given Select Order Completion tab button
Then Check Referee & Referrer and Influencer rewards text


@wait
Scenario Outline: Consumer Referee & Referrer rewards after Order Completion
Given Enter data "<Referrer Reward Limit>", "<Referee Reward Limit>", "<Water Drops Per Order>", "<Worth Of Each Water Drop>", "<Water drops per order>","<Worth of each waterdrop>"
When Order Completion Update Button
Then Toast message "<Toast Message>"

Examples:
|Referrer Reward Limit | Referee Reward Limit | Water Drops Per Order | Worth Of Each Water Drop | Water drops per order | Worth of each waterdrop | Toast Message  |
| 3                    |        2             |          55           |        1                 |        11             |            5            |  There were no changes made for updating the referral configurations! |
|      1               |       1              |          45           |        2                 |        10             |            2            |  Successfully configured referral settings! |
| 3                    |        2             |          55           |        1                 |        11             |            1           |  Successfully configured referral settings! |


@Wait
Scenario: Click on Convenience Fee Setting
Given Click on Convenience Fee Setting
Then Print All Tab Text

@wait
Scenario Outline: consumer can able to update Convenience Fee Settings 
Given Admin enter required field  "<Conv fee long term booking>", "<Conc fee single booking>", "<Conv fee CGST (%)>", "<Conv fee SGST (%)>","<Conv fee GST code>"
When conFeeSetting update button
Then check Toast message "<Toast Message>"
 
Examples:
    |Conv fee long term booking| Conc fee single booking| Conv fee CGST (%)| Conv fee SGST (%) | Conv fee GST code | Toast Message |
    | 00000000000              |   000000               |    000000        |   00000           |     00000         | Updates settings successfully! |
    |      -234                |     -432               |       -454       |           -657    | fakeGSTcode       |    Invalid Input |
    |     123                  |     4567               |       100        |           2065    |    abcdefgh       | Invalid Input |
    |      3.50                |      0.00              |       9.00       |           9.00    |    99859          | Updates settings successfully! |
 



    
@Wait
Scenario: Check Time setting
Given Click on Time setting
Then Time tab text


@wait
Scenario Outline: consumer can  able to Time setting
Given admin enter data in required field  "<Supplier order acceptance intervel(minutes)>","<Consumer notify time>","<Consumer disable time>","<Distributor notify time>","<Distributor disable time>","<WFS notify time>","<WFS disable time>"
When Time Settings update button
Then check Toast message "<Toast Message>"
 
Examples:
   |Supplier order acceptance intervel(minutes)|Consumer notify time|Consumer disable time|Distributor notify time|Distributor disable time|WFS notify time|WFS disable time| Toast Message |
   |                 0000                      |          -12       |           00        |            123        |         9              |       0       |      0         | Invalid input |
   |                  -12                      |           99       |        98           |             00        |         -12            |          123  |       -123     | Invalid input |
   |                15                         |        5           |           5         |            4          |          4             |       6       |      2         | Updates settings successfully! |



@wait 
Scenario: Click on Settlement Settings
Given Click on Settlement Settings button
Then Check Settlement Settings text



@wait
Scenario Outline: Update Settlement Settings
Given Enter Data in Settlemetn Settings "<Distributor Settlement Price>", "<Base Watercan Price>", "<Filling Station Settlement Price>"
When Click on Settlement Settings Update Button
Then check Toast message "<Toast Message>"

Examples:
|  Distributor Settlement Price  | Base Watercan Price  |  Filling Station Settlement Price  |    Toast Message                      |
|                                |                      |                                    | Error in reducing the wallet amount!  |
|    1234                        |   435                |       465                          |     Updates settings successfully!    |
|    2                           |    45                |            20                      |    Updates settings successfully!     |

@Wait 
Scenario: Click on PWD Convenience Fee
Given Click on PWD Convenience Fee
Then Test All Tab Text


@wait
Scenario Outline: consumer can able to update PWD Convenience Fee 
Given Admin enter required field  "<PWD Conv fee CGST>", "<PWD Conv fee SGST>", "<PWD Conv fee GST code>"
When PWDconFee update button
Then check Toast message "<Toast Message>"
 
Examples:
    |PWD Conv fee CGST | PWD Conv fee SGST | PWD Conv fee GST code | Toast Message        |
    | 00000000000      |   000000          |      000000           | Updates settings successfully! |
    |      -234        |     -432          |       -454            |   Invalid Input  |
    |     123          |     4567          |       100             | Updates settings successfully! |
    |      7.00        |      8.00         |       2201            | Updates settings successfully! |
 



@Wait
Scenario: Check Cancellation fee setting
Given Click on Cancellation fee setting
Then Cancellation Fee Setting tab text


@wait
Scenario Outline: consumer can  able to update Cancellation fee setting
Given admin enter data in required field  "<Supplier cancel fee>", "<Consumer cancel fee>"
When Cancellation fee setting update button
Then check Toast message "<Toast Message>"
 
Examples:
    |Supplier cancel fee | Consumer cancel fee | Toast Message |
    |      -234          |     -432            | Invalid input |
    |     123            |     4567            | Updates settings successfully! |
    |      0             |      0              | Updates settings successfully! |
    
     
     
     
@wait
Scenario: Check Force App Update
Given Click on Force Consumer App Update
Then Check All Radio button text

@wait
Scenario Outline: Check Consumer android app Force Update is mandatory
Given Fill Textboxes to make Update mandatory for android "<Android Current Version>", "<Message>", "<Header>"
When Click on Radio Button of Update is mandatory in android
When Update Button of Force Consumer App
Then check Toast message "Updated Successfully."

Examples:
| Android Current Version | Message                                | Header |
| 0.1.135                 | !@$%^&()                              | UPDATE |
| 0.1.136                 | Update Android App for latest features | Please Update |



@wait
Scenario: Update Force App tour setting in Android
Given Click on Radio Button of Update Force App tour setting in Android
When Update Button of Force Consumer App
Then check Toast message "Updated Successfully."

@wait
Scenario Outline: Check IOS app Force Update is mandatory
Given Fill Textboxes to make Update mandatory for IOS "<Current Version>", "<Message>", "<Header>"
When Click on Radio Button of Update is mandatory in IOS
When Update Button of Force Consumer App
Then check Toast message "Updated Successfully."

Examples:
|  Current Version        | Message                                | Header |
| 0.1.1                   | !@$%^&()                              | UPDATE |
| 0.1.2                   | Update IOS App for latest features     | Please Update |



@wait
Scenario: Update Force App tour setting in IOS
Given Click on Radio Button of Update Force App tour setting in IOS
When Update Button of Force Consumer App
Then check Toast message "Updated Successfully."



@wait
Scenario Outline: Check Web app Force Update is mandatory
Given Fill Textboxes to make Update mandatory for WEBAPP "<Current Version>"
When Click on Radio Button of Update is mandatory in WEBAPP
When Update Button of Force Consumer App
Then check Toast message "Updated Successfully."

Examples:
|  Current Version        | 
| 0.0.149                 | 
| 0.0.150                 | 
