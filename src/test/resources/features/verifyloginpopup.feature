@guest
Feature: Contact Owner Flow

Scenario: Verify login popup when clicking Contact Owner

Given user opens the NoBroker website
When user selects city as Pune
And user selects BHK type as 2 BHK
And user searches property in Pune
And user clicks contact owner button
Then login popup should appear
And login popup screenshot should be captured