# kneat-booking.com
This is the framwork created as a part of the Kneat automation challenge.
Below are the details of project structure and components:
 * src/main/java
      * common
        * CommonActions: This class contains the generic methods which we generally perform on the webpage
        * DriverManager: This class has the methods for creating and managing the webdriver instance
      * config:
        * globalParameters.properties: This file contains appication specific global parameters like url, beowser etc.
      * utilites
        * Utilities: This class has application specific uitility methods like reading config files etc.
        
 * src/test/java
      * executionEngine: 
        * TestRunner: This class is used for triggering the execution of the framework
      * features: Cucumber feature files for the test scenarios 
      * pom : Page Object Model classes for the each web page in the web application
      * steps : Cucumber Step Definitions based on the feature file to cover the test scenarios
        
        
        
      
        
 


