# Description : Admin App influencer page
# only "automation influencer" selected in the influencer list

Feature: Influencer page 

  #@tag2
  #Scenario: Accept influencers Request without entering validity dates 
  #Given Click on the influencer
  #When Select the Influencer tab
  #And Select Influencer Request dropdown
  #And Select the influencer request
  #
  #@tag3
  #Scenario: Rejecting  influencers Request without entering validity dates 
  #When Click on Requestlist
  #And Click on Reject
 #
  #@tag4
  #Scenario: Accept influencers Request without entering validity dates 
  #When Click on Requestlist
  #And Click on Accept 
  #And Click on Agree
  #And Click on Disagree
  #
  #@tag5
  #Scenario: Enter from date in request
  #When Enter the valid from date 
  #And Click on Accept
  #And Click on Agree
  #And Click on Disagree
  #
  #@tag6
  #Scenario:Enter to date in request
  #When Enter the valid to date 
  #And Click on Accept
  #And Click on Disagree
  #
  #@tag7
  #Scenario: to date
  #When Click on Accept
  #And Click on Agree
  #
  #@tag8
  #Scenario: influencer
  #When Select Influencer dropdown
  #And Select the influencer
  #And Click on Requestlist
  #And Click on update
 #
 #@tag9
 #Scenario: influencer update date
  #When Click on Requestlist
  #And Update the valid to date
  #And Click on update
     #
  #@tag10
  #Scenario: influencer deactivate
   #When Click on Requestlist   
   #And Click on Deactivate 
    #
  #@tag11
  #Scenario: influencer disabled
   #When Select Influencer dropdown
   #And  Select the influencer disabled
   #And Click on Requestlist
   #And Click on update
    #
  #@tag12
  #Scenario: from date
  #When Enter the valid from date
  #And Click on update
  #
  #@tag13
  #Scenario: to date
  #When Enter the valid to date
  #And Click on update
  #
  #@tag14
  #Scenario: influencer rejected
    #When Select Influencer dropdown
    #And  Select the influencer rejected
    #And Click on Requestlist
    #
  #@tag15
  #Scenario: to date  
  #When Update the valid to date
  #And Click on update
  #
  ################# this will again approve influencer request ######
  #@tag16
  #Scenario: Accept influencers Request for automation
  #When Select Influencer Request dropdown
  #And Select the influencer disabled
  #And Click on Requestlist
  #
  #
  #@tag17
  #Scenario: Accepting the ifluencer 
  #When Enter the valid from date
  #And Enter the valid to date 
  #And Click on Accept
  #And Click on Agree
 #
  #
   ###### Settlement request
  #@tag18
  #Scenario: Navigate to influencers Settlement Request
  #Given Click on the influencer
  #When Select the Influencer tab
  #And Select the Influencersettlement tab 
  #
  #####  This will Accept "automation influencer" user as influencer
  #@tag19
  #Scenario: Accept influencers Settlement Request
  #When Select the InfluencerSettlement list
  #And Click on Influencer Settlement Accept
  #
  #@tag20
  #Scenario: Settle influencers Settlement Request  
  #When Enter the TDS charge percentage
  #And Enter the Extra Charge percentage
  #And Upload the Payment receipt
  #And Click on Settle influencer button
  #
  ########This will Accept "automation influencer" user as influencer and reject settlement
  #@tag21
  #Scenario: Close influencers Settlement Request  
  #When Select the InfluencerSettlement list
  #And Click on Influencer Settlement Close  
#
  #@tag22
  #Scenario: Reject influencers Settlement Request  
  #When Select the InfluencerSettlement list
  #And Click on Influencer Settlement Reject
  #
  #@tag23
  #Scenario: Filter the settlement rejected influencers  
  #When Click on the InfluencerSettlement Filter
  #And Select Order by Desc
  #And Select Request rejected
  #And Click on settlement Filter
  #
  ######################### Settlement history
  #@tag24
  #Scenario Outline: Search the Invalid influencers  
  #When Click on the Settlement History
  #And Enter invalid influencer "<Phone number>"
  #And Click on settlement search button
  #And Clear the phone number
  #
  #Examples:
    #| Phone number |
    #| 123456479 |
    #| 664889997 |
    #| 824qwert |
    #| 8248991403 |
    #| 8248991405 |
#
 ################search  8248991404 as influencer req history
  #@tag25
  #Scenario: Search the valid influencers  
  #When Click on the Settlement History
  #And Enter valid influencer Phone number
  #And Click on settlement search button
  #
  #@tag26
  #Scenario: Download the payment receipt 
  #When Scroll Down to the influencer settlement details
  #And Download the Payment receipt of settlement
  #
  #@tag27
  #Scenario: Click on Notify  
  #When Click on influncer notify button
  #And Click on Submit notify button
  #
   #@tag28
  #Scenario: Enter the Issued from 
  #When Enter on Issued from data
  #And Click on Submit notify button
  #
  #@tag30
  #Scenario: Enter the payment mode 
  #When Enter on payment mode
  #And Select the influencer Address
  #
  #@tag31
  #Scenario: Enter the payment mode 
  #When Select the influencer bank Account
  #And Select the Notify date 
  #And Click on Submit notify button
 
###########################################################################
   #Banner type creation 
 @tag32
  Scenario: Adding Banner Type
  Given Click on the influencer
  When Select the Banners tab
  And  Click on Banner Type 
  And Click on AddBannertype button
  And Enter Banner Type Name
  And Click to Enable Bannertype
  And Click on Add
  
#################### Banners creation
############# given and when need to removed
@tag33
 Scenario: Add New Banners and Selecting banner type
  When Click on Banners
  And Click on Addbanners button
  And Select the Banner type
  And Click on Add banner
 
 @tag34
 Scenario: Add New Banners and Entering message
  When Enter Banner Message
  And Click on Add banner
  
  @tag35
  Scenario: Add New Banners and Entering Expiry 
  When Enter banner Header
  And Click on Add banner
  
  @tag36
  Scenario: Add New Banners and Entering Expiry 
  When Enter Expiry hour
  And Click on Add banner
  
  @tag37
  Scenario: Add New Banners and Entering display order
  When Enter Display order
  And Click on Add banner
  
  @tag38
  Scenario: Add New Banners and Enabling the toggle
  When Click Disable to Enable
  And Click on Add banner
  
  @tag39
  Scenario: Add New Banners and uploading small image
  When Upload image for small screensize
  And Click on Add banner
  
  @tag40
  Scenario: Add New Banners and uploading max image
  When Upload image for max screensize
  And Click on Add banner
  
  @tag41
  Scenario: Add New Banners and app page
  When Click on App Page
  And Click on Add banner
  


 #filter
  @tag42
  Scenario: Filter disabled banners
  Given Click on the influencer
  When Select the Banners tab
  And Click on Banners
  When Click on Filter button
  And Click on descending
  And Click on Disabled
  And Click on filter
  
  @tag43
  Scenario: Select Disabled banner
  When Click on Disabled list
  And Click on EditFilter
  
  @tag44
  Scenario: Filter enabled banners
  When Click on Filter button
  And Click on ascending
  And Click on Enabled
  And Click on filter
  
  @tag45
  Scenario: Filter enabled banners
  When Click on Filter button
  And Click on descending
  And Click on Enabled
  And Click on filter
  
  
  #this need to be checked
  @tag46
  Scenario: Adding Banner Type
  When Click on Banner Type 
  And Click on AddBannertype button
  And Enter Banner Type Name
  And Click to Enable Bannertype
  And Click on Add

  
 @tag47
  Scenario: Filter enabled banner type by asc
  Given Click on the influencer
  When Select the Banners tab
  And  Click on Banner Type 
  And Click on Banner type Filter button
  And Click on Asc 
  And Click on Enabled banner type
  And Click on Filter banner type
  
  
  @tag48
  Scenario: Filter disabled banner type by Asc
  When Click on Banner type Filter button
  And Click on Asc 
  And Click on Disabled banner type
  And Click on Filter banner type
  
    @tag49
  Scenario: Filter disabled banner type by Desc
  When Click on Banner type Filter button
  And Click on Desc 
  And Click on Disabled banner type
  And Click on Filter banner type
  
   
 @tag50
  Scenario: Filter disabled banner type by Desc
  When Click on Banner type Filter button
  And Click on Desc 
  And Click on Enabled banner type
  And Click on Filter banner type
  
  
  @tag51
  Scenario: Disable the Banner type 
  When Click on Banner type List
  And Click on Close buttons
  
  @tag52
  Scenario: Disable the Banner type 
  When Click on Banner type List
  And Click on the Disable toggle button of the Banner type
  And Click on Update Banner type

  ##########################################################################
   #lost can notify distibutor
 @tag53
  Scenario: Navigating to Distributor Lost Can 
  Given Click on the influencer
  When Select the Lost can tab
  And Click on Lost can Filter
  And Select the Distributor radio button
  And Click on Apply button
  
  
  @tag54
  Scenario: Click on Notify and Disable can without selecting the list
  When Click on Notify button
  And Click Disable can button
  
   #--uncomment the notify buuton
  @tag55
  Scenario: Click on Notify and Disable can selecting the list
  When Select the user from the list to send notification
  And Click on Notify button
  And Click Disable can button
  
  
  @tag56
  Scenario: Navigating to Consumer Lost Can 
  When Click on Lost can Filter
  And Select the Consumer radio button
  And Click on Apply button
  
  
  @tag57
  Scenario: Click on Notify and Disable can without selecting the list
  When Click on Notify button
  And Click Disable can button
  
   #--uncomment the notify button
  @tag58
  Scenario: Click on Notify and Disable can selecting the list
  When Select the user from the list to send notification
  And Click on Notify button
  And Click Disable can button
  
  @tag59
  Scenario: Navigating to WFS Lost Can 
  When Click on Lost can Filter
  And Select the WFS radio button
  And Click on Apply button
  
  
  @tag60
  Scenario: Click on Notify and Disable can without selecting the list
  When Click on Notify button
  And Click Disable can button
  
   #--uncomment the notify button
  @tag61
  Scenario: Click on Notify and Disable can selecting the list
  When Select the user from the list to send notification
  And Click on Notify button
  And Click Disable can button
  
  