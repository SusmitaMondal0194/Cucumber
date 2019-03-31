Feature: Reg
@tag
Scenario Outline: registration

Given Application is launched
When First Name "<firstname>" and Last Name "<lastname>" and Phone <"phone">
Then Registration successful

Examples: Valid input

|firstname|lastname|phone|
|Susm|Mon|"9876545678"|
|Susmita|Mondal|"5678930372"|
