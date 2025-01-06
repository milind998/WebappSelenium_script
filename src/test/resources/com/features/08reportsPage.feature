# Description : Admin App Reports  page


Feature: Reports
@tag62
Scenario: Navigating to Reports page and download Orders report
Given Click on Reports page
When Select the Get Orders report from dropdown
And Click on download report

@tag63
Scenario: Download can age report
When Select the Get Can age report from dropdown
And Click on download report

@tag64
Scenario: Download Attendance report
When Select the Get Attendance report from dropdown
And Click on download report

@tag65
Scenario: Download trip report
Given Click on Reports page
When Select the Get Trip report from dropdown
And Click on download report

@tag66
Scenario: Download  Subscription report
When Select the Get Subscription report from dropdown
And Click on download report

@tag67
Scenario: Download Warehouse report
When Select the Get Warehouse report from dropdown
And Click on download report





####################this entire page ui is changed so nolonger it will work###########

#Feature: Reports
#@tag62
#Scenario: Navigating to Reports page
#Given Click on Reports page
#When Click on the Yesterday transaction tab
#And Click on Download yesterday report
#
#######current month reports#############
#@tag63
#Scenario: Downloading the Current month Report
#When Click on the Current month transaction tab
#And Click on Download current report
#
#@tag64
#Scenario: Downloading the Current month Report and pagination
#When Enter the page number 
#And Click on next
#And Click on prev
#And Click on Download current report
#
#@tag65
#Scenario: Filter the Current month Report desc
#When Click on Current month Filter button
#And Select descending radio button
#And Click on Submit
#
#Commenting the code bcoz its crashing
#@tag66
#Scenario: Filter the Current Year Report asc
#When Click on Current month Filter button
#And Select Ascending radio button
#And Click on Submit
#
#######current month reports#############
#
#@tag67
#Scenario: Downloading the Current year Report
#When Click on Current year Transcation tab
#And Click on Download current report
#
#@tag68
#Scenario: Downloading the Current Year Report and pagination
#When Enter the page number 
#And Click on next
#And Click on prev
#And Click on Download current report
#
#@tag69
#Scenario: Filter the Current Year Report desc
#When Click on Current month Filter button
#And Select descending radio button
#And Click on Submit
#
#Commenting the code bcoz its crashing
#@tag70
#Scenario: Filter the Current Year Report asc
#When Click on Current month Filter button
#And Select Ascending radio button
#And Click on Submit
#
#
########search by date and phone number############
#
#@tag72
#Scenario: Navigate to search by valid date tab
#When Click on search by date or phone button
#And Select the from date
#And Select the search report button 
#And Enter the page number 
#And Click on next
#And Click on prev
#And Click on Download current report
#
#@tag73
#Scenario: Filter the Current month Report desc
#When Click on Current month Filter button
#And Select descending radio button
#And Click on Submit
#
#Commenting the code bcoz its crashing
#@tag74
#Scenario: Filter the Current Year Report asc
#When Click on Current month Filter button
#And Select Ascending radio button
#And Click on Submit
#
#
#@tag75
#Scenario: Navigate to search by invalidvalid date tab
#When Select the to date
#And Select the search report button 
#
#@tag76
#Scenario: Navigate to search by invalid phone number
#When Click on search by date or phone button
#When Enter the phone number "<phone number>"
#And Click on search phone button
#
#
#Examples:
      #| phone number  |
      #| 2222222222 |
      #| 6789009876 |
      #| 6789876 |
     #
#
#@tag77
#Scenario: Navigate to search by valid phone number and download report
#When Enter the valid phone number 
#And Click on search phone button
#And Enter the page number 
#And Click on next
#And Click on prev
#And Click on Download current report
#
#
#@tag78
#Scenario: Filter the phone Report desc
#When Click on Current month Filter button
#And Select descending radio button
#And Click on Submit
#
#Commenting the code bcoz its crashing
#@tag79
#Scenario: Filter the phone Report desc asc
#When Click on Current month Filter button
#And Select Ascending radio button
#And Click on Submit
#
#
######################More#########################
#@tag80
#Scenario: Navigate to More tab
#When Click on More button
#And Select from the Reports dropdown
#And Click on Search report button









