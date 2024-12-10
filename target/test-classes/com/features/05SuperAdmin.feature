#Author: Milind Ingale
#Keywords Summary :
#Feature: Super Admin page


Feature: Super Admin Page

@tag1
Scenario: Check Super Admin page Heading
Given Click on Super Admin page
Then Check Heading of Super Admin page
  
@tag2
Scenario: Check Role to Add textbox text
Then Check Roll to Add text

@tag3
Scenario: Check Full Name textbox text
Then Check Full Name text

@tag4
Scenario: Check Phone textbox text
Then Check Phone text

@tag5
Scenario: Check Email Address textbox text
Then Check Email Address text

@tag6
Scenario: Check Password textbox text
Then Check Password text


@wait
@tag7
Scenario Outline: Add Super Admin
Given Select Role Combobox
And Select role to Add
When Fill all Add User textboxes "<Full Name>", "<Phone>", "<Email Address>", "<Password>"
And Click on Add User button
Then Verify toast message "<Toast Message>"


Examples: 
         |    Full Name         |     Phone      |    Email Address                |    Password     |  Toast Message              |
         |                      |      77        |                                 |                 |  Please fill all Details    |
         | Milind Automation SA |  8390099134    |  milind8390099134@gmail.com     |   King007       |  Invalid Email Id.Only a book water team member can login. |
         | Milind Automation SA | 9146939609     |  milind8390099134@bookwater.com |   King007       |  Phone number already registered.Please try with another Phone Number.   |
         | Milind Automation SA | 8390099134     |  noormohamed.a@bookwater.com    |   King007       |  Email Id already registered.Please try with another Email Id.  |
         | Milind Automation SA | 8390099134     |  milind8390099134@bookwater.com |   King007       |  User Added Successfully   |
         
         
         
         
@wait
@tag8
Scenario Outline: Add Admin
Given Select Role Combobox
And Select Admin role to Add
When Fill all Add User textboxes "<Full Name>", "<Phone>", "<Email Address>", "<Password>"
And Click on Add User button
Then Verify toast message "<Toast Message>"


Examples: 
         |    Full Name         |     Phone      |    Email Address                |    Password     |  Toast Message              |
         |                      |      77        |                                 |                 |  Please fill all Details    |
         | Milind Automation A |  8390099135    |  milind8390099135@gmail.com     |   King007       |  Invalid Email Id.Only a book water team member can login. |
         | Milind Automation A | 9146939609     |  milind8390099135@bookwater.com |   King007       |  Phone number already registered.Please try with another Phone Number.   |
         | Milind Automation A | 8390099135     |  noormohamed.a@bookwater.com    |   King007       |  Email Id already registered.Please try with another Email Id.  |
         | Milind Automation A | 8390099135     |  milind8390099135@bookwater.com |   King007       |  User Added Successfully   |         

         
         
         
@wait
@tag10
Scenario Outline: Add WFSAdmin
Given Select Role Combobox
And Select WFSAdmin role to Add
When Fill all Add User textboxes "<Full Name>", "<Phone>", "<Email Address>", "<Password>"
And Click on Add User button
Then Verify toast message "<Toast Message>"


Examples: 
         |    Full Name         |     Phone      |    Email Address                |    Password     |  Toast Message              |
         |                      |      77        |                                 |                 |  Please fill all Details    |
         | Milind Automation WFSA |  8390099136    |  milind8390099136@gmail.com     |   King007       |  Invalid Email Id.Only a book water team member can login. |
         | Milind Automation WFSA | 9146939609     |  milind8390099136@bookwater.com |   King007       |  Phone number already registered.Please try with another Phone Number.   |
         | Milind Automation WFSA | 8390099136     |  noormohamed.a@bookwater.com    |   King007       |  Email Id already registered.Please try with another Email Id.  |
         | Milind Automation WFSA | 8390099136     |  milind8390099136@bookwater.com |   King007       |  User Added Successfully   |         
         
         
         



@wait
@tag12
Scenario Outline: Add Distributor
Given Select Role Combobox
And Select Distributor role to Add
When Fill all Add User textboxes "<Full Name>", "<Phone>", "<Email Address>", "<Password>"
And Click on Add User button
Then Verify toast message "<Toast Message>"


Examples: 
         |    Full Name         |     Phone      |    Email Address                |    Password     |  Toast Message              |
         |                      |      77        |                                 |                 |  Please fill all Details    |
         | Milind Automation D |  8390099136    |  milind8390099136@gmail.com     |   King007       |  Invalid Email Id.Only a book water team member can login. |
         | Milind Automation D | 9146939609     |  milind8390099136@bookwater.com |   King007       |  Phone number already registered.Please try with another Phone Number.   |
         | Milind Automation D | 8390099136     |  noormohamed.a@bookwater.com    |   King007       |  Email Id already registered.Please try with another Email Id.  |
         | Milind Automation D | 8390099137     |  milind8390099136@bookwater.com |   King007       |  User Added Successfully   |         
                                    
         
         
         
@wait
@tag13
Scenario Outline: Add Delivery Agent
Given Select Role Combobox
And Select Delivery Agent role to Add
When Fill all Add User textboxes "<Full Name>", "<Supplier Phone>", "<Phone>", "<Email Address>", "<Password>"
And Click on Add User button
Then Verify toast message "<Toast Message>"


Examples: 
         |    Full Name        | Supplier Phone  |    Phone       |    Email Address                |    Password     |  Toast Message              |
         |                     |                 |      77        |                                 |                 |  Please fill all Details    |
         | Milind Automation DA | 9146939609      |  9348493434    |   noormohamed.a@bookwater.com   |   King007       |  Email Id already registered.Please try with another Email Id. |
         | Milind Automation DA | 9146939609      | 9348493434     |  noormoham@bookwater.com        |   King007       |  Bookwater user can not registered!!   |
         | Milind Automation DA | 9146939609      | 9348493434     |  noormohamed.a@gmail.com        |   King007       |  Provided phone is not belongs to any supplier!  |
         | Milind Automation DA | 9146939607      | 9348493434     |  noormohamed.a@gmail.com        |   King007       |  User Added Successfully   |         
         
         
         
@wait
@tag14
Scenario Outline: Add Consumer
Given Select Role Combobox
And Select Consumer role to Add
When Fill all textboxes to add Consumer "<Full Name>", "<Referral Code>", "<Phone>", "<Email Address>", "<Password>"
And Click on Add User button
Then Verify toast message "<Toast Message>"


Examples: 
         |    Full Name        | Referral Code   |    Phone       |    Email Address                |    Password     |  Toast Message              |
         |                     |                 |      77        |                                 |                 |  Please fill all Details    |
         | Milind Automation C | 9146939609      |  8488488484    |   milindingle998@gmail.com      |   King007       |  Email Id already registered.Please try with another Email Id. |
         | Milind Automation C | 9146939609      | 9348493434     |  noormoham@bookwater.com        |   King007       |  Phone number already registered.Please try with another Phone Number. | 
         | Milind Automation C | 9146939609      | 9348493434     |  noormoham@bookwater.com        |   King007       |  Bookwater user can not registered!!   |
         | Milind Automation C | 9146939609      | 8488488484     |  noormoh.a@gmail.com            |   King007       |  Invalid referral code  |
         | Milind Automation C | MILIND9090      | 8488488484     |  noormoh.a@gmail.com            |   King007       |  User Added Successfully   |         
                  
                                    
          
                  
@wait
@tag15
Scenario Outline: Add SALESHEAD
Given Select Role Combobox
And Select SALESHEAD role to Add
When Fill all Add User textboxes "<Full Name>", "<Phone>", "<Email Address>", "<Password>"
And Click on Add User button
Then Verify toast message "<Toast Message>"


Examples: 
         |    Full Name         |     Phone      |    Email Address                |    Password     |  Toast Message              |
         |                      |      77        |                                 |                 |  Please fill all Details    |
         | Milind Automation SH |  8390099143    |  milind8390099143@gmail.com     |   King007       |  Invalid Email Id.Only a book water team member can login. |
         | Milind Automation SH | 9146939609     |  milind8390099143@bookwater.com |   King007       |  Phone number already registered.Please try with another Phone Number.   |
         | Milind Automation SH | 8390099143     |  noormohamed.a@bookwater.com    |   King007       |  Email Id already registered.Please try with another Email Id.  |
         | Milind Automation SH | 8390099143     |  milind8390099143@bookwater.com |   King007       |  User Added Successfully   |         
          
          
          
@wait
@tag16
Scenario Outline: Add SALES
Given Select Role Combobox
And Select SALES role to Add
When Fill all Add User textboxes "<Full Name>", "<Phone>", "<Email Address>", "<Password>"
And Click on Add User button
Then Verify toast message "<Toast Message>"


Examples: 
         |    Full Name         |     Phone      |    Email Address                |    Password     |  Toast Message              |
         |                      |      77        |                                 |                 |  Please fill all Details    |
         | Milind Automation S |  8390099144    |  milind8390099144@gmail.com     |   King007       |  Invalid Email Id.Only a book water team member can login. |
         | Milind Automation S | 9146939609     |  milind8390099144@bookwater.com |   King007       |  Phone number already registered.Please try with another Phone Number.   |
         | Milind Automation S | 8390099144     |  noormohamed.a@bookwater.com    |   King007       |  Email Id already registered.Please try with another Email Id.  |
         | Milind Automation S | 8390099144     |  milind8390099144@bookwater.com |   King007       |  User Added Successfully   |         
                    
                    
                    
@wait
@tag17
Scenario Outline: Add CSHEAD
Given Select Role Combobox
And Select CSHEAD role to Add
When Fill all Add User textboxes "<Full Name>", "<Phone>", "<Email Address>", "<Password>"
And Click on Add User button
Then Verify toast message "<Toast Message>"


Examples: 
         |    Full Name         |     Phone      |    Email Address                |    Password     |  Toast Message              |
         |                      |      77        |                                 |                 |  Please fill all Details    |
         | Milind Automation CH |  8390099145    |  milind8390099145@gmail.com     |   King007       |  Invalid Email Id.Only a book water team member can login. |
         | Milind Automation CH | 9146939609     |  milind8390099145@bookwater.com |   King007       |  Phone number already registered.Please try with another Phone Number.   |
         | Milind Automation CH | 8390099145     |  noormohamed.a@bookwater.com    |   King007       |  Email Id already registered.Please try with another Email Id.  |
         | Milind Automation CH | 8390099145     |  milind8390099145@bookwater.com |   King007       |  User Added Successfully   |         
                                        
  
  
  
  
@wait
@tag18
Scenario Outline: Add CS
Given Select Role Combobox
And Select CS role to Add
When Fill all Add User textboxes "<Full Name>", "<Phone>", "<Email Address>", "<Password>"
And Click on Add User button
Then Verify toast message "<Toast Message>"


Examples: 
         |    Full Name         |     Phone      |    Email Address                |    Password     |  Toast Message              |
         |                      |      77        |                                 |                 |  Please fill all Details    |
         | Milind Automation CS |  8390099146    |  milind8390099146@gmail.com     |   King007       |  Invalid Email Id.Only a book water team member can login. |
         | Milind Automation CS | 9146939609     |  milind8390099146@bookwater.com |   King007       |  Phone number already registered.Please try with another Phone Number.   |
         | Milind Automation CS | 8390099146     |  noormohamed.a@bookwater.com    |   King007       |  Email Id already registered.Please try with another Email Id.  |
         | Milind Automation CS | 8390099146     |  milind8390099146@bookwater.com |   King007       |  User Added Successfully   |         
      
      
      
@wait
@tag19
Scenario Outline: Add CS Lead
Given Select Role Combobox
And Select CS Lead role to Add
When Fill all Add User textboxes "<Full Name>", "<Phone>", "<Email Address>", "<Password>"
And Click on Add User button
Then Verify toast message "<Toast Message>"


Examples: 
         |    Full Name          |     Phone      |    Email Address                |    Password     |  Toast Message              |
         |                       |      77        |                                 |                 |  Please fill all Details    |
         | Milind Automation CSL |  8390099147    |  milind8390099147@gmail.com     |   King007       |  Invalid Email Id.Only a book water team member can login. |
         | Milind Automation CSL | 9146939609     |  milind8390099147@bookwater.com |   King007       |  Phone number already registered.Please try with another Phone Number.   |
         | Milind Automation CSL | 8390099147     |  noormohamed.a@bookwater.com    |   King007       |  Email Id already registered.Please try with another Email Id.  |
         | Milind Automation CSL | 8390099147     |  milind8390099147@bookwater.com |   King007       |  User Added Successfully   |         
            
@wait
@tag20
Scenario Outline: Add OPS Head
Given Select Role Combobox
And Select OPS Head role to Add
When Fill all Add User textboxes "<Full Name>", "<Phone>", "<Email Address>", "<Password>"
And Click on Add User button
Then Verify toast message "<Toast Message>"


Examples: 
         |    Full Name            |     Phone      |    Email Address                |    Password     |  Toast Message              |
         |                         |      77        |                                 |                 |  Please fill all Details    |
         | Milind Automation OPS H |  8390099148    |  milind8390099148@gmail.com     |   King007       |  Invalid Email Id.Only a book water team member can login. |
         | Milind Automation OPS H | 9146939609     |  milind8390099148@bookwater.com |   King007       |  Phone number already registered.Please try with another Phone Number.   |
         | Milind Automation OPS H | 8390099148     |  noormohamed.a@bookwater.com    |   King007       |  Email Id already registered.Please try with another Email Id.  |
         | Milind Automation OPS H | 8390099148     |  milind8390099148@bookwater.com |   King007       |  User Added Successfully   |         
            
            
            
@wait
@tag20
Scenario Outline: Add OPS
Given Select Role Combobox
And Select OPS role to Add
When Fill all Add User textboxes "<Full Name>", "<Phone>", "<Email Address>", "<Password>"
And Click on Add User button
Then Verify toast message "<Toast Message>"


Examples: 
         |    Full Name            |     Phone      |    Email Address                |    Password     |  Toast Message              |
         |                         |      77        |                                 |                 |  Please fill all Details    |
         | Milind Automation OPS  |  8390099149    |  milind8390099149@gmail.com     |   King007       |  Invalid Email Id.Only a book water team member can login. |
         | Milind Automation OPS  | 9146939609     |  milind8390099149@bookwater.com |   King007       |  Phone number already registered.Please try with another Phone Number.   |
         | Milind Automation OPS  | 8390099149     |  noormohamed.a@bookwater.com    |   King007       |  Email Id already registered.Please try with another Email Id.  |
         | Milind Automation OPS  | 8390099149     |  milind8390099149@bookwater.com |   King007       |  User Added Successfully   |         
                        
            
      

@wait
@tag20
Scenario Outline: Add Inventory ML
Given Select Role Combobox
And Select Inventory ML role to Add
When Fill all Add User textboxes "<Full Name>", "<Phone>", "<Email Address>", "<Password>"
And Click on Add User button
Then Verify toast message "<Toast Message>"


Examples: 
         |    Full Name           |     Phone      |    Email Address                |    Password     |  Toast Message              |
         |                        |      77        |                                 |                 |  Please fill all Details    |
         | Milind Automation  IML |  8390099150    |  milind8390099150@gmail.com     |   King007       |  Invalid Email Id.Only a book water team member can login. |
         | Milind Automation  IML | 9146939609     |  milind8390099150@bookwater.com |   King007       |  Phone number already registered.Please try with another Phone Number.   |
         | Milind Automation  IML | 8390099150     |  noormohamed.a@bookwater.com    |   King007       |  Email Id already registered.Please try with another Email Id.  |
         | Milind Automation  IML | 8390099150     |  milind8390099150@bookwater.com |   King007       |  User Added Successfully   |         
                              
                              
                              
                              
@wait
@tag21
Scenario Outline: Add Finance Head
Given Select Role Combobox
And Select Finance Head role to Add
When Fill all Add User textboxes "<Full Name>", "<Phone>", "<Email Address>", "<Password>"
And Click on Add User button
Then Verify toast message "<Toast Message>"


Examples: 
         |    Full Name          |     Phone      |    Email Address                |    Password     |  Toast Message              |
         |                       |      77        |                                 |                 |  Please fill all Details    |
         | Milind Automation  FH |  8390099151    |  milind8390099151@gmail.com     |   King007       |  Invalid Email Id.Only a book water team member can login. |
         | Milind Automation  FH | 9146939609     |  milind8390099151@bookwater.com |   King007       |  Phone number already registered.Please try with another Phone Number.   |
         | Milind Automation  FH | 8390099151     |  noormohamed.a@bookwater.com    |   King007       |  Email Id already registered.Please try with another Email Id.  |
         | Milind Automation  FH | 8390099151     |  milind8390099151@bookwater.com |   King007       |  User Added Successfully   |         
                                                            
      
      
      
@wait
@tag22
Scenario Outline: Add Finance
Given Select Role Combobox
And Select Finance role to Add
When Fill all Add User textboxes "<Full Name>", "<Phone>", "<Email Address>", "<Password>"
And Click on Add User button
Then Verify toast message "<Toast Message>"


Examples: 
         |    Full Name          |     Phone      |    Email Address                |    Password     |  Toast Message              |
         |                       |      77        |                                 |                 |  Please fill all Details    |
         | Milind Automation  F |  8390099152    |  milind8390099152@gmail.com     |   King007       |  Invalid Email Id.Only a book water team member can login. |
         | Milind Automation  F | 9146939609     |  milind8390099152@bookwater.com |   King007       |  Phone number already registered.Please try with another Phone Number.   |
         | Milind Automation  F | 8390099152     |  noormohamed.a@bookwater.com    |   King007       |  Email Id already registered.Please try with another Email Id.  |
         | Milind Automation  F | 8390099152     |  milind8390099152@bookwater.com |   King007       |  User Added Successfully   |         
                                                                  
     
     
@wait
@tag22
Scenario Outline: Add QAHEAD
Given Select Role Combobox
And Select QAHEAD role to Add
When Fill all Add User textboxes "<Full Name>", "<Phone>", "<Email Address>", "<Password>"
And Click on Add User button
Then Verify toast message "<Toast Message>"


Examples: 
         |    Full Name          |     Phone      |    Email Address                |    Password     |  Toast Message              |
         |                       |      77        |                                 |                 |  Please fill all Details    |
         | Milind Automation  QH |  8390099153    |  milind8390099153@gmail.com     |   King007       |  Invalid Email Id.Only a book water team member can login. |
         | Milind Automation  QH | 9146939609     |  milind8390099153@bookwater.com |   King007       |  Phone number already registered.Please try with another Phone Number.   |
         | Milind Automation  QH | 8390099153     |  noormohamed.a@bookwater.com    |   King007       |  Email Id already registered.Please try with another Email Id.  |
         | Milind Automation  QH | 8390099153     |  milind8390099153@bookwater.com |   King007       |  User Added Successfully   |         
                  
                  
                  
@wait
@tag22
Scenario Outline: Add QA
Given Select Role Combobox
And Select QA role to Add
When Fill all Add User textboxes "<Full Name>", "<Phone>", "<Email Address>", "<Password>"
And Click on Add User button
Then Verify toast message "<Toast Message>"


Examples: 
         |    Full Name          |     Phone      |    Email Address                |    Password     |  Toast Message              |
         |                       |      77        |                                 |                 |  Please fill all Details    |
         | Milind Automation  QA |  8390099154    |  milind8390099154@gmail.com     |   King007       |  Invalid Email Id.Only a book water team member can login. |
         | Milind Automation  QA | 9146939609     |  milind8390099154@bookwater.com |   King007       |  Phone number already registered.Please try with another Phone Number.   |
         | Milind Automation  QA | 8390099154     |  noormohamed.a@bookwater.com    |   King007       |  Email Id already registered.Please try with another Email Id.  |
         | Milind Automation  QA | 8390099154     |  milind8390099154@bookwater.com |   King007       |  User Added Successfully   |
         
         
         
         
@wait
@tag23
Scenario: Check Roles List text
Then Check Roles_List text


@wait
@tag23
Scenario: Check Active Users text
Then Check Active_Users text
           
           
           
@wait
@tag24
Scenario: Check textboxes of Active Users
Given Click on Active Users button
And Select any Role
And Send data in Search Name box
When Send data in Search Email Box
Then Verify Active Users text "Search Name", "Select role to add", "Search Email"      



@wait
@tag25
Scenario: Check Table text
Given Click on Active Users button
Then Verify Table text of Active users


@wait
@tag26
  Scenario Outline: Check Role in table
  Given Click on Role Button
  When Select Role "<Role>"
  Then Count Super Admin Role "<Count Role>"
  
  Examples: 
  | Role          | Count Role           |
  | BW-SUPERADMIN | Super Admin          |
  | BW-ADMIN      | Admin                |
  | BW-WFSADMIN   | WaterFilling Station |
  | BW-DISTRIBUTOR| Distributor          |
  | BW-DELIVERYAGENT | Delivey Agent     |
  | BW-CONSUMER   | Consumer             |
  | BW-CSHEAD     | Customer Support Head|
  | BW-CS         | Customer Support     |
  | BW-OPSHEAD    | Operation Head       |
  | BW-FINANCEHEAD| Finance Head         |
  | BW-FINANCE    | Finance              |
  | BW-QAHEAD     | QA HEAD              |
  #| BW-QA         | QA                   |
  
  
@wait
@tag27
Scenario: Search by Name
Given Click on Search by Name textbox
When Enter User Name
And Click on Search Button
Then Verify User name in table 


@wait
@tag28
Scenario: Search by Email
Given Click on Search by Email textbox
When Enter Email id
And Click on Search
Then Verify User Email id in table
  
  

@wait
@tag29
Scenario Outline: Delete all Added Users
Given Click on Super Admin page
Given Click on Active Users button
Given Click on Search by Name textbox
When Enter User Name "<Name>"
And Click on Search Button
And Click on View Details button
And Click on Delete Button
And Click Confirm button to Delete
Then Verify toast message "Deleted User from system successfully!"

Examples:
| Name                   | 
| Milind Automation SA   | 
| Milind Automation A    | 
| Milind Automation WFSA |
#| Milind Automation D    |
| Milind Automation DA   |
#| Milind Automation C    | 
| Milind Automation SH   |
| Milind Automation S    |
| Milind Automation CH   |
| Milind Automation CS   |
| Milind Automation CSL  |
| Milind Automation OPS H|
| Milind Automation OPS  |
| Milind Automation  IML  |
| Milind Automation  FH   |
| Milind Automation  F    |
| Milind Automation  QH   |
| Milind Automation  QA    |

                                                                                                                                                                     