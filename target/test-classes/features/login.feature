Feature: Login into Orange hrm
@sit
Scenario Outline: Login into orange hrm

Given User is on Home Page 
And User enters "<username>" and "<password>"
Then Message displayed Login Successfully

Examples:
|username|password|  
|Admin   |admin123|
|Admin   |admin123|