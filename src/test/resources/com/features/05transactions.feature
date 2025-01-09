#Author: Milind Ingale
#Keywords Summary :
#Feature : Transaction page


Feature: Transaction page

  @wait
  @tag1
  Scenario: Check Transaction page Heading
  Given Click on Transactions page
  Then Check Heading of transaction page
  
  @wait
  @tag2
  Scenario: Check Transaction Types
  Given Click on Transaction Type Combobox
  Then Check All Transaction type "ORDERS", "WATER-DROPS", "DEPOSIT", "WALLET"
  
  
  #@wait
  #@tag3
  #Scenario: Check Payment Methods
  #Given Click on Payment Methods Combobox
  #Then Check All Payment Methods "None", "WALLET", "RAZORPAY", "PAYSHARP+UPI"
  
  
  @wait
  @tag4
  Scenario: Check Payment Status
  Given Click on Payment Status Combobox
  Then Check All Payment Status "None", "SUCCESS", "REFUND", "FAILED"
  
  
  @wait
  @tag5
  Scenario: Check Search Type
  Given Click on Search Type Combobox
  Then Check All Search Types "Phone/Email", "Order ID", "Transaction ID"
  
  
  @wait
  @tag6
  Scenario: Check Payment Status text when transaction type is Water Drops
  Given Click on Transaction Type Combobox
  When Select Water Drops Transaction type
  And Click on Payment Status box
  Then Check All Payment Status "None", "REWARDED", "PROMO DISCOUNT", "CONSUMER PAID", "CASHBACK REWARDS", "MARKETING REWARDS"
  
  
  @wait
  @tag7
  Scenario: Check Payment status of Deposit Transaction type
  Given Click on Transaction Type Combobox
  When Select Deposit Transaction Type
  And Click on Deposit payment Status
  Then Check All Payment Status "None", "SUCCESS", "FAILED"
  
  
  @wait
  @tag8
  Scenario: Check Deposits Status
  Given Click on Transaction Type Combobox
  When Select Deposit Transaction Type
  And Check Deposits
  Then Check Filter with deposited and Un-Deposited "DEPOSITED", "UN-DEPOSITED"
  
  
  @wait
  @tag9
  Scenario: Check Table text
  Then Check table column text
  
  
  #@wait
  #@tag10
  #Scenario Outline: Check Data after search by Number
  #Given Enter User Number in textbox "<Number>"
  #And Click on Submit button
  #Then Check Data or Error Message 
  #
  #Examples:
  #| Number     |
  #| 9146939609 |
  #| 8484849423 |
  
  
  @wait 
  @tag10
  Scenario: Check Data after search by Order ID
  Given Select Start And End Date
  And Select Orders transaction type
  When Select Order ID search type
  And Enter Order ID
  And Click on Submit button
  Then Verify same order id
  
  
  @wait
  @tag11
  Scenario: Check table text of Water Drop Transaction type
  Given Select Water Drop transaction type
  When Click on Submit button
  Then Check water drops column text
  
  
  @wait
  @tag12
  Scenario: Check table text of Deposit transaction type
  Given Select Deposit Transaction Type for text
  When Click on Submit button
  Then Check Deposit transactions column text
  
  
  @wait
  @tag13
  Scenario: Count Success Payment Status Of Orders transaction type with Razorpay Payment method
  Given Select Order transaction type
  When Select Razorpay Payment method
  And Select Success payment status
  And Click on Submit button
  Then Count Success Payment status "SUCCESS"

 
 
  @wait
  @tag13
  Scenario: Count Failed Payment Status Of Orders transaction type with Razorpay Payment method
  Given Select Failed payment status
  And Click on Submit button
  Then Count Success Payment status "FAILED"
  
  
   
  #@tag14
  #Scenario: Count Refund Payment status of orders transaction type with razorpay payment method
  #Given Select Refund payment status
  #And Click on Submit buttons
  #Then Count Success Payment status "REFUND"
  
  
  @tag15
  Scenario: Check Transaction details by searching transaction ID
  Given Enter Transaction ID
  When Click on Submit buttons
  Then Check and Verify transaction Id
 
 
 
 
 
 