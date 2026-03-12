
@search
Feature: Property Search

Scenario: Search 2BHK house in Pune

Given user opens the NoBroker website
When user selects city as Pune
And user selects BHK type as 2 BHK
And user searches property in Pune
Then search results should be displayed