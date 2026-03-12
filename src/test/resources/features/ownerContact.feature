@guest
Feature: Owner Contact Flow

Background:
Given user opens the NoBroker website
And user logs into application

Scenario: Get Owner Details or Schedule Visit

When user navigates to property page
And user clicks owner details or schedule button
Then screenshot should be captured