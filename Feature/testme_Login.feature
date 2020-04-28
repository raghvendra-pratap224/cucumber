Feature: Login Test

Scenario Outline:− Successfull Login with valid Credentials

Given user is on home page

And Click on Login Link

When Enter "<email>" and "<password>" and click login

Then login should be successful

Examples: −

| email  | password  |
| pratiksha@test.com | pratiksha |
| rick@test.com | tester |
