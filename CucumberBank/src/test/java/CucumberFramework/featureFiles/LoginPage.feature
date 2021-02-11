Feature:
Scenario:
Given open "http://demo.guru99.com/v4/" url
And add username "mngr307337" 
And add password "YnabUtY"
Then click loginbutton

# Scenario for data entry
Scenario:
Given open "http://demo.guru99.com/v4/manager/addcustomerpage.php" data_entry
And enter name "Niraj" name
And enter date "12/20/2020"date
And enter address "2200 Bedford Rd" Address
And enter city "Fort worth" city
And enter state "Texas" state
And pin "761311" pin
And mobileno "6116116161" mobileNo
And email "raj_raj2009@yahoo.com" email
And enter password "abc" pass
Then click loginbutton for custEntry
#Thanks
