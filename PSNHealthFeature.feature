Feature: PSN Health Status

Scenario: PSN Home Page loads
	
Scenario: PSN Health icon appears
	Given User is on the PSN Home Page	
	Then PSN green arrow icon appears in Header

Scenario: Account Management header/subtitle appears	 
	Given User is on the PSN Home Page
	Then Account Management header/subtitle appears
		
Scenario: Green status icon appears for Account Management	 
	Given User is on the PSN Home Page	
	When PSN Service page has loaded	
	Then Account Management header/subtitle green status icon appears

Scenario: Sign In header/subtitle appears	 
	Given User is on the PSN Home Page	
	When PSN Service page has loaded
	Then Sign In header/subtitle appears

Scenario: Green status icon appears for Sign In	 
	Given User is on the PSN Home Page	
	When PSN Service page has loaded
	Then Sign In header/subtitle green status icon appears
	
Scenario: Playstation Store header/subtitle appears     
	Given User is on the PSN Home Page	
	When PSN Service page has loaded
	Then Playstation Store header/subtitle appears

Scenario: Green status icon appears for Playstation Store	 
	Given User is on the PSN Home Page	
	When PSN Service page has loaded		
	Then Playstation Store header/subtitle green status icon appears
	
Scenario: Purchase header/subtitle appears
	Given User is on the PSN Home Page	
	When PSN Service page has loaded
    Then Purchase header/subtitle appears    

Scenario: Green status icon appears for Purchase	 
	Given User is on the PSN Home Page		
	When PSN Service page has loaded
	Then Purchase header/subtitle green status icon appears

	
