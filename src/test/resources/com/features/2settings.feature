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
## (Comments)
#Sample Feature Definition Template

Feature: Settings page
@tag
Scenario: Check Settings Page button title
Given Admin Home page
When Click on Setting page
Then Check Page title

@tag
Scenario: Check tabs on Settings page
Given Check Page title
When Check settings page tab is display
Then Check tab text

Scenario: Check common Settings tab
Given Click on common Settings tab
Then Check All tab text

#@wait
Scenario Outline: consumer can able to update Common Settings 
 Check Page title 
Given Admin enter required field  "<Maximum discount allowed(In %)>","<Minimum water wallet amount>","<Water wallet recharge alert>","<Extra charges for single order>","<OTP Less Delivery Msg>","<Extra charges HSN code>", "<Extra charges CGST %>", "<Extra charges SGST %>"
When Click on update button
Then check Toast message "<Toast Message>"
 
Examples:
    | Maximum discount allowed(In %)| Minimum water wallet amount | Water wallet recharge alert | Extra charges for single order | OTP Less Delivery Msg                                          |Extra charges HSN code |Extra charges CGST % |Extra charges SGST % |        Toast Message |
    |               00              |          00                 |          00                 |          00                    |    !@$%^^^&*!@$%^&                                             |      00               |          00         |         00          |         Invalid Input |
    |               50              |          00                 |         0                   |          10                    |     123456                                                     |      00               |         00          |          00         |       Invalid Input   |
    |               99              |          100                |         100                 |          15                    | Opting out of OTP during the delivery process exposes you risks|   99698               |         9           |          9          | successfully updated |
    
    
@wait
Scenario: Check Delivery Slots tab text
Given Click on Delivery Slots button
When Click on Add Slots button
And Add Slots tab text1
Then Add Slots tab text


@wait
Scenario Outline: Add delivery Slot
Given Admin fill data in textboxes "<Number Of Slots>", "<Delivery Slot Start Time>", "<Delivery Slot End Time>"
When Click on ADD button
Then check Toast message "<Toast Message>"

Examples: 
     | Number Of Slots | Delivery Slot Start Time | Delivery Slot End Time | Toast Message |
     | 5               | 0600                     | 0900                   | Please do not repeate the time Or number of slots.|
     | 45              |                          |                        | Please select/Enter Start Time and End Time  |
     |                 | 1200                     | 1200                   | Fill all the fields                          |
     | 6               | 13                       | 04                     | Selected Invalid Time                        |
     |                 |                          |                        |  Fill all the fields                         |
     | 5               | 0600                     | 0900                   | Delivery slot details updated successfully!! |
     
     
@Wait
Scenario: Check Time setting
Given Click on Block Time setting
Then Block Time tab text

@wait
Scenario Outline: User should able to Update Block Time setting
Given Click on clock textbox and enter time "<Start Time>", "<End Time>"
When Block Time Settings update button
Then check Toast message "<Toast Message>"

Examples:
          |Start Time | End Time | Toast Message        |
          |1050PM     | 1130PM   | successfully updated |
          |1222AM     | 3434PM   | Invalid Input        |
          
@wait
Scenario: Check Clock and select time
Given Click on Clock and select time
When Block Time Settings update button
Then check Toast message "successfully updated"


@wait
Scenario: Update Sold By Distributor
Given Click on Sold by tab
And Select Distributor 
When Click on Update button
Then Check successful toast message

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
         | Milind PVT LTD | AJRPI7125G | 22AAAAA0000A1Z5| Chennai, Tamil Nadu | successfully updated |



@Wait
Scenario: Check Referral setting
Given Click on Referral setting button
Then Referral Setting tab text


@wait
Scenario Outline: User can  able to update Referrer setting
Given Select Referral type
When admin enter data in referral setting field  "<Referal Water Drop Per Order>","<Referral Reward Limit>","<Rupee Value for Each Water Drop>"
And Referral Settings update button
Then Toast message "<Toast Message>"
 
Examples:
   |Referal Water Drop Per Order|Referral Reward Limit|Rupee Value for Each Water Drop|  Toast Message                |
   |              55            |          2          |           1                   | No changes made , Kindly Make the changes and Update!! |
   |                 0000       |          00         |           00                  |  Data Successfully updated!!  |
   |              55            |                     |           1                   |Error in updating the data!!!  |
   |                            |         4           |          2                    | Error in updating the data!!! |
   |            55              |                     |                               | Please Fill All Details       |
   |                            |                     |                               | Please Fill All Details       |
   |                  55        |           2         |        1                      | Data Successfully updated!!   |
 

@wait
Scenario Outline: User can  able to update Referree setting
Given Select Referree type
When admin enter data in referral setting field  "<Referral Reward Limit>"
And Referral Settings update button
Then Toast message "<Toast Message>"
 
Examples:
   |Referral Reward Limit|  Toast Message                |
   |        2            | No changes made , Kindly Make the changes and Update!! |
   |          1          |  Data Successfully updated!!  |
   |                     | Error in updating the data!!! |
   |         0           | Data Successfully updated!!    |
   |           2         | Data Successfully updated!!   |
  
  
   
@wait
Scenario Outline: User can  able to update Influencer setting
Given Select Influencer type
When admin enter data in Influencer setting field  "<Referal Water Drop Per Order>", "<Rupee Value for Each Water Drop>"
And Influencer Settings update button
Then Toast message "<Toast Message>"
   
Examples:
   |Referal Water Drop Per Order|Rupee Value for Each Water Drop|  Toast Message                |
   |          55                |             2                 |   No changes made , Kindly Make the changes and Update!! |
   |                            |                               | Please Fill All Details       |
   |          55                |                               | Please Fill All Details       |
   |                            |              2                |Error in updating the data!!!  |
   |     3209485555             |         2345432134            |Error in updating the data!!!  |
   |     12345678               |         12345678              | Data Successfully updated!!   |
   |           0                |              0                | Data Successfully updated!!   |
   |          55                |              2                | Data Successfully updated!!   |   
   

#@wait
#Scenario: Click on Common service Area tab
#Given Close Main Settings tab
#Given Click on Consumer service area rate for all tab
#Then Tab text
#
#@wait
#Scenario Outline: Set Price for Common service area
#Given Enter "<Pincode>"
#When Select area "<Rate>"
#Then Check "<Toast Message>","<Rate>"
#
#Examples:
        #| Pincode  |  Rate  |   Toast Message    |
        #| 600008   |  30    |   Packaged Drinking water added |
        #| 600008   |        |    Fill all fields     |
        #
#@Wait
#Scenario: Click on Convenience Fee Setting
#Given Click on Convenience Fee Setting
#Then Print All Tab Text
#
#@wait
#Scenario Outline: consumer can able to update Convenience Fee Settings 
#Given Admin enter required field  "<Conv fee long term booking>", "<Conc fee single booking>", "<Conv fee CGST (%)>", "<Conv fee SGST (%)>","<Conv fee GST code>"
#When conFeeSetting update button
#Then check Toast message "<Toast Message>"
 #
#Examples:
    #|Conv fee long term booking| Conc fee single booking| Conv fee CGST (%)| Conv fee SGST (%) | Conv fee GST code | Toast Message |
    #| 00000000000              |   000000               |    000000        |   00000           |     00000         | successfully updated |
    #|      -234                |     -432               |       -454       |           -657    | fakeGSTcode       |    Invalid Input |
    #|     123                  |     4567               |       100        |           2065    |    abcdefgh       | Invalid Input |
    #|      3.50                |      0.00              |       9.00       |           9.00    |    99859          | successfully updated |
 #
#
#@Wait
#Scenario: Click on PWD Convenience Fee
#Given Click on PWD Convenience Fee
#Then Test All Tab Text
#
#
#@wait
#Scenario Outline: consumer can able to update PWD Convenience Fee 
#Given Admin enter required field  "<PWD Conv fee CGST>", "<PWD Conv fee SGST>", "<PWD Conv fee GST code>"
#When PWDconFee update button
#Then check Toast message "<Toast Message>"
 #
#Examples:
    #|PWD Conv fee CGST | PWD Conv fee SGST | PWD Conv fee GST code | Toast Message        |
    #| 00000000000      |   000000          |      000000           | successfully updated |
    #|      -234        |     -432          |       -454            |   Invalid Input  |
    #|     123          |     4567          |       100             | successfully updated |
    #|      7.00        |      8.00         |       2201            | successfully updated |
 #
#
#@Wait
#Scenario: Check GST Details Page
#Given Click on GST Details
#Then Check All Tab Text
#
#
#@wait
#Scenario Outline: consumer can able to update GST details 
#Given admin enter data in required field  "<Extra charges HSN code>","<Extra charges CGST>","<Extra charges SGST>"
#When GST Details update button
#Then check Toast message "<Toast Message>"
 #
#Examples:
    #|Extra charges HSN code | Extra charges CGST | Extra charges SGST | Toast Message       |
    #| 00000000000           |   000000           |      000000        | successfully updated |
    #|      -234             |     -432           |       -454         |    Invalid Input |
    #|     123               |     4567           |       100          | successfully updated |
    #|      9968             |      9.00          |       9.00         | successfully updated |
    #
    #
#@Wait
#Scenario: Check Gate Way Fee Setting
#Given Click on Gate Way Fee Setting
#Then Print All tab text
#
#@wait
#Scenario Outline: consumer can able to update Gate Way Fee Setting
#Given admin enter data in required field  "<Gateway fee>","<Gateway fee CGST>","<Gateway fee SGST>","<Gateway fee GST code>"
#When Gate Way Fee Setting update button
#Then check Toast message "<Toast Message>"
 #
#Examples:
    #|Gateway fee | Gateway fee CGST | Gateway fee SGST | Gateway fee GST code | Toast Message       |
    #| 0000000000 |   000000         |      000000      |      00              | successfully updated |
    #|      -234  |     -432         |       -454       |     -734             | Invalid Input |
    #|     123    |     4567         |       100        |      834             | successfully updated |
    #|      0     |      9.00        |       9.00       |     997158           | successfully updated |
    #
    #
    #
#@Wait
#Scenario: Check Cancellation fee setting
#Given Click on Cancellation fee setting
#Then Cancellation Fee Setting tab text
#
#
#@wait
#Scenario Outline: consumer can  able to update Cancellation fee setting
#Given admin enter data in required field  "<Supplier cancel fee>", "<Consumer cancel fee>"
#When Cancellation fee setting update button
#Then check Toast message "<Toast Message>"
 #
#Examples:
    #|Supplier cancel fee | Consumer cancel fee | Toast Message |
    #|      -234          |     -432            | Invalid input |
    #|     123            |     4567            | successfully updated |
    #|      0             |      0              | successfully updated |
    #
#@Wait
#Scenario: Check Time setting
#Given Click on Time setting
#Then Time tab text
#
#
#@wait
#Scenario Outline: consumer can  able to Time setting
#Given admin enter data in required field  "<Supplier order acceptance intervel(minutes)>","<Consumer notify time>","<Consumer disable time>","<Distributor notify time>","<Distributor disable time>","<WFS notify time>","<WFS disable time>"
#When Time Settings update button
#Then check Toast message "<Toast Message>"
 #
#Examples:
   #|Supplier order acceptance intervel(minutes)|Consumer notify time|Consumer disable time|Distributor notify time|Distributor disable time|WFS notify time|WFS disable time| Toast Message |
   #|                 0000                      |          -12       |           00        |            123        |         9              |       0       |      0         | Invalid input |
   #|                  -12                      |           99       |        98           |             00        |         -12            |          123  |       -123     | Invalid input |
   #|                15                         |        5           |           5         |            4          |          4             |       6       |      2         | successfully updated |
   #





     
#@wait
#Scenario Outline: Set Delivery slot by Clock
#Given Admin add slots with fill textboxes "<Number Of Slots>", "<Delivery Slot Start Time>", "<Delivery Slot End Time>"
#When Click on Get Slots button
#Then Count Delivery slot
#
#Examples:
     #| Number Of Slots | Delivery Slot Start Time | Delivery Slot End Time | 
     #| 5               | 0600                     | 0900                   | 
     #| 45              | 1200                     | 1200                   |
     #| 6               | 13                       | 04                     | 
     #|                 |                          |                        | 
#
