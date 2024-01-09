# ZerocodeTrial

# Project Name
This is a trial project for testing (API /Load / DB) using Zerocode framework

# Zerocode framework:
Zerocode is a modern lightweight, simple and extensible open-source framework for writing test intentions in simple JSON or YAML format that facilitates both declarative configuration and automation.

Zerocode framework is written in Java and support Integration test level.  

# Zerocode framework Github link:
https://github.com/authorjapps/zerocode

# Main test scenarios covered in the repo:
-API :  
Validate on Create new user cases  
Validate on retrieve all user data  
Validate on login user cases( with/out token)  
Validate on assign new book for a user using token value  

-DB:   
We applying "Data/value" type of testing by:-  
Validate result for user who buy book (using token value)

-Load Performance:   
Applying load test for (single/multiple) methods using below classes:-  
1)ZerocodeLoadRunner(for single scenario)  
2)ZerocodeMultiLoadRunner(for multiple scenario)  

# Getting started :
For local development:  
You have setup DB / swagger API Locally and add local info at properities file  
Also you need to add plugin "Zerocode helper" at your IDE (Eclipse / IntelliJ) that will suggestion for keyword template   
You can check below link for more details:  
https://github.com/authorjapps/zerocode/wiki/Getting-Started

