 # Description : Admin App Users  page

Feature: Users Page
@tag81
Scenario: Navigating to Users page
Given Navigate to users page
When Enter the invlaid phone number "<phone number>"
And Click on searchicon 
And Click on Close button in dialog box

Examples:
      | phone number  |
      | 222222222222 |
      | 678900 |
      | 67898765555555 |
      | 67894444abc |
 
@tag82
Scenario: Search Users by name 
When Enter the invlaid Name "<name>"
And Click on searchicon 
And Click on Close button in dialog box
Examples:
      | name  |
      | shelllengineering|
      | John Doe |
      | shelly |
      | shell@in |
      | shell@yahoo  |
      
@tag83
Scenario: Search valid User by phone number
When Enter the valid Name/phone "<name/phone>"
And Click on searchicon 
And Validate the users 
Examples:
      | name/phone  |
      | 8248991404 |
      | 8248991405 |
      | 8248991404 |
      | 8807720777 |
      | noormohamed289055@gmail.com  |
      
      
 #########These test case edit the "noormohamed289055@gmail.com" user#####################
#@tag84
#Scenario: Edit the user name with invalid data
#When Enter the invalid Name "<name>"
#And Click on updateuser 
#Examples:
      #| name  |
      #||
      #| 1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890 |
 #
 #
#@tag85
#Scenario: Edit the user phone number with invalid data
#When Enter the invalid phone "<phone>"
#And Click on updateuser 
#Examples:
      #| phone  |
      #||
      #| 1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890 |
#
#@tag86
#Scenario: Edit the user mail with invalid data
#When Enter the invalid mail "<mail>"
#And Click on updateuser 
#Examples:
      #| mail  |
      #||
      #|noormohamed28905@gmail.com|
      #|noormohamed289055@gmail|
      #| 1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890 |
 #
#@tag87
#Scenario: Edit the user with valid data
#When Enter the valid name "<name>", phone "<phone>",and  email "<mail>"
#And Click on updateuser 
#Examples:
    #| name        | phone       | mail                   |
    #| saM    | 8248991405  | noormohamed289055@gmail.com   |
#
#@tag88
#Scenario: Edit the user active and influncer status
#When click on the user status toggle
#And click on the user influencer toggle
#And Click on make influencer button
#And Click on download referral code 
#
#
#@tag89
#Scenario: Edit/update gst and  the user b2b and notification and mail status and influncer status
#When click on b2b toggle button
#And Enter the bill name
#And Enter the gst number
#And Click on notification toggle
#And Click on postpaid mail toggle
#And Click on update button 
#
###########################  Make influncer request ###########################################
#
#@tag90
#Scenario: Search valid User and Make influncer request
#When Enter the valid Name/phone "<name/phone>"
#And Click on searchicon 
#And Click on make influencer button
#Examples:
      #| name/phone  |
      #| 8807720111 |
      #| 8807720222 |
      #| 8807720333 |

########################################  Redeem request  #####################################
######## Commenting this because of bug 

@tag93
Scenario: User Redeem request Send request without pan and no.of waterdrop
When click on Request to Redeem button

###### Commenting the line bcz the element is changing 
@tag93_
Scenario: User Redeem request Send request without pan and no.of waterdrop
#When Select the Bank Account number
When Select the ifsc "<ifsc>", bank "<bank>", pan "<pan>",bank "<bank>", acc "<acc>", reenteracc "<reenteracc>" and drops "<drops>"
And Click on verify button in request to redeem dialog box
And Click on send request button in request to redeem dialog box

Examples:
    | ifsc        | bank     | pan         | bank        | acc              | reenteracc       |drops|
    |             | Yes Bank | CLPPK8899Q  |  Yes Bank   |79979979932101021 |79979979932101021 |5    |
    | YESB0CMSNOC | Yes Bank |             |  Yes Bank   |79979979932101021 |79979979932101021 |5    |
    | YESB0CMSNOC | Yes Bank | CLPPK8899Q  |  Yes Bank   |                  |79979979932101021 |5    |
    | YESB0CMSNOC | Yes Bank | CLPPK8899Q  |  Yes Bank   |79979979932101021 |                  |5    |
    | YESB0CMSNOC | Yes Bank | CLPPK8899Q  |  Yes Bank   |79979979932101021 |79979979932101021 |     |
    | YESB0CMSNOC | Yes Bank | CLPPK8899Q  |  Yes Bank   |79979979932101021 |79979979932101021 |  5  |
        
        
        
#@tag91
#Scenario: User Redeem request cancel
#When click on Request to Redeem button
#And Click on cancel button in request to redeem dialog box


#@tag92
#Scenario: User Redeem request Send request without pan and no.of waterdrop
#When click on Request to Redeem button
#And Click on send request button in request to redeem dialog box
#And Click on cancel button in request to redeem dialog box
#


################## User custom price ######################################        
@tag94
Scenario: User custom price settings
When click on product button
And Click on close button in product dialog box
    
###############one time use
@tag95
Scenario: Edit User custom price settings for one time use
When click on product button
And Select the product from dropdown
And Click on add product button
And Select the one time toggle button
And Enter the Values of deposit "<deposit>", mrp "<mrp>", refundtype "<refundtype>",refundamount "<refundamount>",and sp "<sp>"
And Click on the update button

Examples:
    | deposit  | mrp | refundtype | refundamount | sp  | 
    |       150| 70  | WALLET     |  65          |65   |
    |       100| 65  | WALLET     |  60          |55   |
    |       100| 65  | WALLET     |  65          |50   |
    


################Refill use

@tag96
Scenario: Edit User custom price settings Refill
When click on product button
And Select the product from dropdown
And Click on add product button
And Select the Refill toggle button
And Enter the Values of refill deposit "<deposit>", mrp "<mrp>", refundtype "<refundtype>",refundamount "<refundamount>",and sp "<sp>"
And Click on the update button


Examples:
    | deposit  | mrp | refundtype | refundamount | sp  | 
    |       150| 70  | WALLET     |  65          |65   |
    |       100| 65  | WALLET     |  60          |55   |
    |       100| 65  | WALLET     |  65          |50   |

##########Both
@tag97
Scenario: Edit User custom price settings both
When click on product button
And Select the product from dropdown
And Click on add product button
And Select the Both toggle button
And Enter the Values of deposit "<deposit>", mrp "<mrp>", refundtype "<refundtype>",refundamount "<refundamount>", sp "<sp>", R_deposit "<R_deposit>", R_mrp "<R_mrp>", R_refundtype "<R_refundtype>",R_refundamount "<R_refundamount>",and R_sp "<R_sp>"
And Click on the update button


Examples:
    | deposit  | mrp | refundtype | refundamount | sp  | R_deposit  | R_mrp | R_refundtype | R_refundamount | R_sp | 
    |       150| 70  | WALLET     |  65          |65   |       150  | 70    | WALLET       |  65            |65   |
    |       100| 65  | WALLET     |  60          |55   |      100   | 65    | WALLET       |  60            |55   |
    |       100| 65  | WALLET     |  65          |50   |      100   | 65    | WALLET       |  65            |50   |
    

######################## Address Custom Price##########################################

############# one time use address custom price
@tag97
Scenario: Set Addresscustom price settings One time sale and close
When Select the Address to set custom price
And Click on the product details button
And Click on close button in product dialog box

@tag98
Scenario: Set Addresscustom price settings One time sale
When Click on the product details button
And Select the product from dropdown
And Click on add product button
And Select the one time toggle button
And Enter the Values of deposit "<deposit>", mrp "<mrp>", refundtype "<refundtype>",refundamount "<refundamount>",and sp "<sp>"
And Click on the update button

Examples:
    | deposit  | mrp | refundtype | refundamount | sp  | 
    |       150| 70  | WALLET     |  65          |65   |
    |       100| 65  | WALLET     |  60          |55   |
    |       100| 65  | WALLET     |  65          |50   |

#################### Refill sale address custom price
@tag99
Scenario: Set the Address level custom price settings for Refill sale
When Click on the product details button
And Select the product from dropdown
And Click on add product button
And Select the Refill toggle button
And Enter the Values of refill deposit "<deposit>", mrp "<mrp>", refundtype "<refundtype>",refundamount "<refundamount>",and sp "<sp>"
And Click on the update button


Examples:
    | deposit  | mrp | refundtype | refundamount | sp  | 
    |       150| 70  | WALLET     |  65          |65   |
    |       100| 65  | WALLET     |  60          |55   |
    |       100| 65  | WALLET     |  65          |50   |
    
    
#########Both one time and refill
@tag100
Scenario: Update the User Address custom price settings for both one time and refill
When Click on the product details button
And Select the product from dropdown
And Click on add product button
And Select the Both toggle button
And Enter the Values of deposit "<deposit>", mrp "<mrp>", refundtype "<refundtype>",refundamount "<refundamount>", sp "<sp>", R_deposit "<R_deposit>", R_mrp "<R_mrp>", R_refundtype "<R_refundtype>",R_refundamount "<R_refundamount>",and R_sp "<R_sp>"
And Click on the update button


Examples:
    | deposit  | mrp | refundtype | refundamount | sp  | R_deposit  | R_mrp | R_refundtype | R_refundamount | R_sp | 
    |       150| 70  | WALLET     |  65          |65   |       150  | 70    | WALLET       |  65            |65   |
    |       100| 65  | WALLET     |  60          |55   |      100   | 65    | WALLET       |  60            |55   |
    |       100| 65  | WALLET     |  65          |50   |      100   | 65    | WALLET       |  65            |50   |
     



######################### Add water drops########################################
#
#@tag101
#Scenario: Clicking close Waterdrop button
#Given Scroll to top of the page 
#When Click on the Add Waterdrop button
#And Click on close button in waterdrop dialog  
#
#@tag102
#Scenario: Clicking add with empty fields
#When Click on the Add Waterdrop button
#And Click on Add button waterdrop dialog 
#
#
#@tag103
#Scenario: Clicking add without reason field
#When Click on the Add Waterdrop button
#And Enter the Waterdrop count
#And Click on Add button waterdrop dialog 
#
#@tag104
#Scenario: Clicking add without waterdrop field
#When Click on the Add Waterdrop button
#And Enter the Reason for Adding waterdrop
#And Click on Add button waterdrop dialog 
#
#@tag105
#Scenario: Adding water drop to user
#When Click on the Add Waterdrop button
#And Enter the Waterdrop "<Waterdrop>"
#And Enter the Reason for Adding waterdrop
#And Click on Add button waterdrop dialog 
#
#Examples:
   #| Waterdrop | 
   #|0|
   #|999999999999999999999999999 | 
   #| 2| 
#
#########################Reduce wallet amount########################################
#@tag106
#Scenario: Clicking close Reduce wallet amount button
#When Click on the Reduce wallet amount button
#And Click on close button in Reduce wallet amount dialog  
#
#@tag107
#Scenario: Clicking add with empty fields Reduce wallet amount dialog
#When Click on the Reduce wallet amount button
#And Click on Add button Reduce wallet amount dialog 
#
#@tag108
#Scenario: Clicking add without reason field Reduce wallet amount dialog
#When Click on the Reduce wallet amount button
#And Enter the Wallet amount 
#And Click on Add button Reduce wallet amount dialog 
#
#@tag109
#Scenario: Clicking add without wallet amount field
#When Click on the Reduce wallet amount button
#And Enter the Reason for reducing  wallet amount
#And Click on Add button Reduce wallet amount dialog 
#
#@tag110
#Scenario: Reducing wallet amount to user
#When Click on the Reduce wallet amount button
#And Enter the wallet "<wallet>", reason "<reason>" and transactionid "<transactionid>"
#And Click on Add button Reduce wallet amount dialog 
#
#Examples:
   #| wallet | reason             | transactionid | 
   #|1       |                    |               |
   #|        | Automation testing |               |
   #|1       |                    | Testing id    |
   #|9999999 | Automation testing | Testing id    |
   #|0       | Automation testing | Testing id    |
   #
   #
#
#@tag111
#Scenario: Reducing wallet amount to user
#When Click on the Reduce wallet amount button
#And Enter the wallet "<wallet>", reason "<reason>" and transactionid "<transactionid>"
#And Click on Add button Reduce wallet amount dialog 
#
#Examples:
   #| wallet | reason             | transactionid |   
   #|.00     | Automation testing | Testing id    |
   #|.000001 | Automation testing | Testing id    |
   #|.50     | Automation testing | Testing id    |
   #|1       | Automation testing | Testing id    |
#
#
#
############### Add Undeposit stock for user ###############################

@tag112
Scenario: Add undeposited stock without selecting product
Given Scroll to top of the page
When Click on the Add deposit button
And Select the Undeposited radio button
And Click on submit in add deposit dialog box

@tag113
Scenario: Add undeposited stock without quantity
When Select the product from dropdown
And Enter the Quantity "0"
And Click on submit in add deposit dialog box

@tag114
Scenario: Add  undeposited stock
#When Select the product from dropdown
When Select the Address from dropdown
And Enter the Quantity "1"
And Click on submit in add deposit dialog box

######### Add deposited stock for user ###############################

@tag115
Scenario: Add Deposited stock without selecting product
When Click on the Add deposit button
And Select the Deposited radio button
And Click on submit in add deposit dialog box

@tag116
Scenario: Add deposited stock without quantity
When Select the product from dropdown
And Select the Address from dropdown
And Enter the Quantity in deposit qty "1"
And Click on submit in add deposit dialog box


############################### Reduce the Deposit stock ###########################

@tag117
Scenario: Reduce the Deposited stock
When Select the product update stock from dropdown 
And Click on the refund deposit
And Click on the minimum button
And Click on the maximum button
And Click on refund button in dialog box



