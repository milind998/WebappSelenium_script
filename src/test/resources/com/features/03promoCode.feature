#Author: Milind Ingale
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

Feature: Promo Code Tab
  #@tag1
  #Scenario: Click on Promo Code tab from settings
  #Given Admin Home page
  #When Click on Setting page
  #And Click on Promo Code Tab
  #Then Check Promo Code tab text
  
  #@tag2
  Scenario: Check Promo Code table Heading text
  Given Click on Promo Code Tab
  Then check promo code table text
  
  
  @tag3
  Scenario: Check Pagination on Promo Code tab
  Given Click on Next Page button
  Then Verify last Page text
  
  
  @tag4
  Scenario: Check heading of Add Promo Code dialog box
  Given Click on Add Promo Code button
  Then Check Heading of dialog box
  
  
  @tag5
  Scenario: Check text of textboxes
  Then verify text of textboxes
  
  @wait
  @tag6
  Scenario Outline: Add Promo Code by Single Use Promo Code type and cashback water drops offer type
  Given Enter Values in textbox "<Promo Label>","<Minimum order Price>", "<Promo Offer Value>", "<Validity In Days>","<Validity In Hours>","<Promo Disclaimer>"
  When Click on ADD promo button
  Then check Toast message "<Toast Message>"
  
  Examples:
  |Promo Label | Minimum order Price | Promo Offer Value | Validity In Days | Validity In Hours | Promo Disclaimer | Toast Message |
  |   Automation testing |           |                   |        2         |       24          |    Automation testing | Fill all the fields|
  |   Single Use  cashback water drops promo code | 100       |      10           |        2         |       24          |    Automation testing | Created promo code successfully|
  
  
  
  @wait
  @tag7
  Scenario: Delete Promo Code
  Given Click on Promo Code
  When Click On Delete Button
  And Click on Agree button
  Then check Toast message "Successfully updated promo code"
  
  
 @wait
  @tag8
  Scenario Outline: Add Promo Code by Single Use Promo Code type and Percentage Discount offer type
  Given Click on Add Promo Code
  And Enter Values in textboxes "<Promo Label>", "<Minimum order Price>", "<Promo Offer Value>", "<Validity In Days>","<Validity In Hours>","<Promo Disclaimer>"
  When Click on ADD
  And Click on Close
  Then check Toast message "<Toast Message>"
  
  Examples:
  | Promo Label                        | Minimum order Price   | Promo Offer Value | Validity In Days | Validity In Hours | Promo Disclaimer       | Toast Message |
  |                                    |                       |                   |                  |                   |                        | Fill all the fields |
  | Single Use Percentage Discount Promo Code    |       100             |      10           |        2         |       24          |    Automation testings | Created promo code successfully|
  
  
  @wait
  @tag9
  Scenario Outline: Add Promo Code by Single Use Promo Code type and Price Discount offer type
  Given Click on Add Promo Code
  And Enter Values in promocode textboxes "<Promo Label>", "<Minimum order Price>", "<Promo Offer Value>", "<Validity In Days>","<Validity In Hours>","<Promo Disclaimer>"
  When Click on ADD
  And Click on Close
  Then check Toast message "<Toast Message>"
  
  Examples:
  | Promo Label                        | Minimum order Price   | Promo Offer Value | Validity In Days | Validity In Hours | Promo Disclaimer       | Toast Message |
  |                                    |                       |                   |                  |                   |                        | Fill all the fields |
  | Single Use Price Discount Promo Code         |       100             |      10           |        2         |       24          |    Automation testings | Created promo code successfully|
  
  
  
  @wait
  @tag10
  Scenario Outline: Add Promo Code by Multi Use Promo Code type and cashback water drops offer type
  Given Click on Add Promo Code
  And Enter Values in promocode textboxes "<Promo Label>", "<Minimum order Price>", "<Promo Offer Value>", "<Max Usage Limit>", "<Validity In Days>","<Validity In Hours>","<Promo Disclaimer>"
  When Click on ADD
  And Click on Close button
  Then check Toast message "<Toast Message>"
  
  Examples:
  | Promo Label                        | Minimum order Price   | Promo Offer Value | Max Usage Limit  | Validity In Days | Validity In Hours | Promo Disclaimer       | Toast Message |
  |                                    |                       |                   |                  |                  |                   |                        | Fill all the fields |
  |  Multi Use  cashback water drops Promo Code  |       100             |      10           |       2          |        2         |       24          |    Automation testings | Created promo code successfully|
  
  
  @wait
  @tag11
  Scenario: Delete Promo Code
  Given Click on multi use Cashback Water Drop Promo Code
  When Click On Delete Button
  And Click on Agree button
  Then check Toast message "Successfully updated promo code"
  
  
  
  @wait
  @tag12
  Scenario Outline: Add Promo Code by Multi Use Promo Code type and Percentage Discount offer type
  Given Click on Add Promo Code
  And Enter Values in promocode textboxes Percentage Discount "<Promo Label>", "<Minimum order Price>", "<Promo Offer Value>", "<Max Usage Limit>", "<Validity In Days>","<Validity In Hours>","<Promo Disclaimer>"
  When Click on ADD
  And Click on Close button
  Then check Toast message "<Toast Message>"
  
  Examples:
  | Promo Label                        | Minimum order Price   | Promo Offer Value | Max Usage Limit  | Validity In Days | Validity In Hours | Promo Disclaimer       | Toast Message |
  |                                    |                       |                   |                  |                  |                   |                        | Fill all the fields |
  |  Multi Use Percentage Discount Promo Code |       100             |      10           |       2          |        2         |       24          |    Automation testings | Created promo code successfully|
  
  
  @wait
  @tag13
  Scenario: Delete Promo Code
  Given Click on multi use percentage discount Promo Code
  When Click On Delete Button
  And Click on Agree button
  Then check Toast message "Successfully updated promo code"
  
  
  
  @wait
  @tag14
  Scenario Outline: Add Promo Code by Multi Use Promo Code type and Price Discount offer type
  Given Click on Add Promo Code
  And Enter Values in promocode textboxes Price Discount "<Promo Label>", "<Minimum order Price>", "<Promo Offer Value>", "<Max Usage Limit>", "<Validity In Days>","<Validity In Hours>","<Promo Disclaimer>"
  When Click on ADD
  And Click on Close button
  Then check Toast message "<Toast Message>"
  
  Examples:
  | Promo Label                        | Minimum order Price   | Promo Offer Value | Max Usage Limit  | Validity In Days | Validity In Hours | Promo Disclaimer       | Toast Message |
  |                                    |                       |                   |                  |                  |                   |                        | Fill all the fields |
  |  Multi Use Price Discount Promo Code |       100             |      10           |       2          |        2         |       24          |    Automation testings | Created promo code successfully|
  
  
  
  @wait
  @tag15
  Scenario: Delete Promo Code
  Given Click on multi use price discount Promo Code
  When Click On Delete Button
  And Click on Agree button
  Then check Toast message "Successfully updated promo code"
  
  
  @wait
  @tag16
  Scenario Outline: Add Promo Code by Cumulative Coupon Code type and Cashback Water Drop offer type
  Given Click on Add Promo Code
  And Enter Values in Cumulative Coupon Cashback Water Drop Promo Code "<Promo Label>", "<Minimum order Price>", "<Promo Offer Value>", "<Max Usage Limit>", "<Validity In Days>","<Validity In Hours>","<Promo Disclaimer>"
  When Click on ADD
  And Click on Close button
  Then check Toast message "<Toast Message>"
  
  Examples:
  | Promo Label                        | Minimum order Price   | Promo Offer Value | Max Usage Limit  | Validity In Days | Validity In Hours | Promo Disclaimer       | Toast Message |
  |                                    |                       |                   |                  |                  |                   |                        | Fill all the fields |
  |  Cumulative Coupon Cashback Water Drop Promo Code |       100             |      10           |       2          |        2         |       24          |    Automation testings | Created promo code successfully|
  
  @wait
  @tag17
  Scenario: Delete Promo Code
  Given Click on Cumulative Coupon Cashback Water Drop Promo Code
  When Click On Delete Button
  And Click on Agree button
  Then check Toast message "Successfully updated promo code"
  
  
  
  @wait
  @tag18
  Scenario Outline: Add Promo Code by Cumulative Coupon Promo Code type and Percentage Discount offer type
  Given Click on Add Promo Code
  And Enter Values in Cumulative Coupon promocode textboxes Percentage Discount "<Promo Label>", "<Minimum order Price>", "<Promo Offer Value>", "<Max Usage Limit>", "<Validity In Days>","<Validity In Hours>","<Promo Disclaimer>"
  When Click on ADD
  And Click on Close button
  Then check Toast message "<Toast Message>"
  
  Examples:
  | Promo Label                        | Minimum order Price   | Promo Offer Value | Max Usage Limit  | Validity In Days | Validity In Hours | Promo Disclaimer       | Toast Message |
  |                                    |                       |                   |                  |                  |                   |                        | Fill all the fields |
  |  Cumulative Coupon Percentage Discount Promo Code |       100             |      10           |       2          |        2         |       24          |    Automation testings | Created promo code successfully|
  
  
  @wait
  @tag19
  Scenario: Delete Promo Code
  Given Click on Cumulative Coupon percentage discount Promo Code
  When Click On Delete Button
  And Click on Agree button
  Then check Toast message "Successfully updated promo code"
  
  
  
  @wait
  @tag20
  Scenario Outline: Add Promo Code by Cumulative Coupon Promo Code type and Price Discount offer type
  Given Click on Add Promo Code
  And Enter Values in Cumulative Coupon promocode textboxes Price Discount "<Promo Label>", "<Minimum order Price>", "<Promo Offer Value>", "<Max Usage Limit>", "<Validity In Days>","<Validity In Hours>","<Promo Disclaimer>"
  When Click on ADD
  And Click on Close button
  Then check Toast message "<Toast Message>"
  
  Examples:
  | Promo Label                        | Minimum order Price   | Promo Offer Value | Max Usage Limit  | Validity In Days | Validity In Hours | Promo Disclaimer       | Toast Message |
  |                                    |                       |                   |                  |                  |                   |                        | Fill all the fields |
  |  Cumulative Coupon Price Discount Promo Code |       100             |      10           |       2          |        2         |       24          |    Automation testings | Created promo code successfully|
  
  
  
  @wait
  @tag21
  Scenario: Delete Promo Code
  Given Click on Cumulative Coupon price discount Promo Code
  When Click On Delete Button
  And Click on Agree button
  Then check Toast message "Successfully updated promo code"
  
  
  
  @wait
  @tag22
  Scenario Outline: Add Promo Code by Wallet Recharge Coupon Code type and Cashback Water Drop offer type
  Given Click on Add Promo Code
  And Enter Values in Wallet Recharge Coupon Cashback Water Drop Promo Code "<Promo Label>", "<Minimum order Price>", "<Promo Offer Value>", "<Max Usage Limit>", "<Validity In Days>","<Validity In Hours>","<Promo Disclaimer>"
  When Click on ADD
  And Click on Close button
  Then check Toast message "<Toast Message>"
  
  Examples:
  | Promo Label                        | Minimum order Price   | Promo Offer Value | Max Usage Limit  | Validity In Days | Validity In Hours | Promo Disclaimer       | Toast Message |
  |                                    |                       |                   |                  |                  |                   |                        | Fill all the fields |
  |  Wallet Recharge Coupon Cashback Water Drop Promo Code |       100             |      10           |       2          |        2         |       24          |    Automation testings | Created promo code successfully|
  
  @wait
  @tag23
  Scenario: Delete Promo Code
  Given Click on Wallet Recharge Coupon Cashback Water Drop Promo Code
  When Click On Delete Button
  And Click on Agree button
  Then check Toast message "Successfully updated promo code"
  
  
  
  @wait
  @tag24
  Scenario Outline: Add Promo Code by Wallet Recharge Coupon Promo Code type and Percentage Discount offer type
  Given Click on Add Promo Code
  And Enter Values in Wallet Recharge Coupon promocode textboxes Percentage Discount "<Promo Label>", "<Minimum order Price>", "<Promo Offer Value>", "<Max Usage Limit>", "<Validity In Days>","<Validity In Hours>","<Promo Disclaimer>"
  When Click on ADD
  And Click on Close button
  Then check Toast message "<Toast Message>"
  
  Examples:
  | Promo Label                        | Minimum order Price   | Promo Offer Value | Max Usage Limit  | Validity In Days | Validity In Hours | Promo Disclaimer       | Toast Message |
  |                                    |                       |                   |                  |                  |                   |                        | Fill all the fields |
  |  Wallet Recharge Coupon Percentage Discount Promo Code |       100             |      10           |       2          |        2         |       24          |    Automation testings | Created promo code successfully|
  
  
  @wait
  @tag25
  Scenario: Delete Promo Code
  Given Click on Wallet Recharge Coupon percentage discount Promo Code
  When Click On Delete Button
  And Click on Agree button
  Then check Toast message "Successfully updated promo code"
  
  
  
  @wait
  @tag26
  Scenario Outline: Add Promo Code by Wallet Recharge Coupon Promo Code type and Price Discount offer type
  Given Click on Add Promo Code
  And Enter Values in Wallet Recharge Coupon promocode textboxes Price Discount "<Promo Label>", "<Minimum order Price>", "<Promo Offer Value>", "<Max Usage Limit>", "<Validity In Days>","<Validity In Hours>","<Promo Disclaimer>"
  When Click on ADD
  And Click on Close button
  Then check Toast message "<Toast Message>"
  
  Examples:
  | Promo Label                        | Minimum order Price   | Promo Offer Value | Max Usage Limit  | Validity In Days | Validity In Hours | Promo Disclaimer       | Toast Message |
  |                                    |                       |                   |                  |                  |                   |                        | Fill all the fields |
  |  Wallet Recharge Coupon Price Discount Promo Code |       100             |      10           |       2          |        2         |       24          |    Automation testings | Created promo code successfully|
  
  
  
  @wait
  @tag27
  Scenario: Delete Promo Code
  Given Click on Wallet Recharge Coupon price discount Promo Code
  When Click On Delete Button
  And Click on Agree button
  Then check Toast message "Successfully updated promo code"
  
  
  
  @wait
  @tag28
  Scenario Outline: Add Promo Code by Start Date and End Date
  Given Click on Add Promo Code
  And Enter Values in textbox Start Date and End Date "<Promo Label>","<Minimum order Price>", "<Promo Offer Value>","<Max Usage Limit>","<Promo Valid Start Date>", "<Promo valid End Date>","<Promo Disclaimer>"
  When Click on ADD
  And Click on Close button
  Then check Toast message "<Toast Message>"
  
  Examples:
  | Promo Label                        | Minimum order Price   | Promo Offer Value | Max Usage Limit  | Promo Valid Start Date | Promo valid End Date |  Promo Disclaimer       | Toast Message |
  |    Promo Code With Start Date      |                       |                   |                  |       12345678         |   77690595            |                         | Fill all the fields |
  |    Promo Code With end Date        | 100                   |      10           |       2          |        91469396        |       83900992        |     Automation testings | Error in creating Promo codes.Contact Technical support. |
  
  
  
  
  @wait
  @tag29
  Scenario Outline: Add Promo Code by Select Start Date and End Date from Calender
  Given Click on Add Promo Code 
  And Enter Values in textbox Start Date and End Date "<Promo Label>","<Minimum order Price>", "<Promo Offer Value>","<Max Usage Limit>","<Promo Disclaimer>"
  And Select Start Date
  And Select End Date
  When Click on ADD
  And Click on Close button
  Then check Toast message "<Toast Message>"
  
  Examples:
  | Promo Label                        | Minimum order Price   | Promo Offer Value | Max Usage Limit  |  Promo Disclaimer       | Toast Message |
  |    Promo Code With Calender        |     200               |     10            |    2             |     Automation testing  | Created promo code successfully |
  
  
  
  @wait
  @tag30
  Scenario: Delete Promo Code
  Given Click on Promo Code With Calender 
  When Click On Delete Button
  And Click on Agree button
  Then check Toast message "Successfully updated promo code"
  
  
  @wait
  @tag31
  Scenario: Check Data is available on page otherwise show error message
  Then Check Data is available on page
  
  
  





    
  
  #@tag5
  #Scenario: Check Dialog box close button is clickable
  #Given Click on Add Promo Code button
  #Then Click on Close button
  
  #@tag4
  #Scenario: Check Back Button functionality of promo code
  #Given Click on Back button
  #Then Check main page text
