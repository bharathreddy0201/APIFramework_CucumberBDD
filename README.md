# APIFramework_CucumberBDD
A simple API automation framework using Cucumber BDD and RestAssured .

# Automation Setup guidelines :
1) Make sure that Maven, Java (v1.8), Selenium server are installed in the system.
2) Check out GitHub repo into any IDE (preferred Eclipse).
3) Basic commands to run tests - open terminal and go to project directory and run command : mvn clean install.
4) After test build, check for the cucumber reports in the target folder from the project repo.
5) i have created logging mechanism,each request and response body will gets logged and  can be viewed in looging.txt file.

## Key features of framework used :
1.	Framework : Cucumber BDD ,RestAssured Java .
2.	Java : most convenient programming language for me.
3.	Maven: For build management purpose, a common structure can be maintained very easily .
4.	Selenium: Open source, most convenient browser UI automation tool .
5.	Log4J  : Logging framework for the logging the status .
6.	Cucumber Reports : For better documentation, it has been chosen over other reporting tools .

# Reasons for choosing the framework : Cucumber BDD & RestAssured :
1.	According to cucumber BDD, we can easily craeate the scripts for every business feature, this will keep code clean and easy to understand and maintain.
2.	Lot of Code optimization is possible which is also implemented in my framework.
3.	Single feature file will also solve the purpose of manual testing.
4.	Even non technical like business analyst also can understand easily seeing the feature file.
5.	Any change in script can easily be implemented, updated and maintained into the framework and Classes.
6.  Easily Scalable approach.
7. RestAssured using java can be easily integrated with the cucumber BDD.


# PreRequisities :
1.	Download Eclipse .
2.	Download Jdk and latest maven files .
3.	Set Java path and maven .
4.	Import the files into your workspace and set build path .
5.	Run As Maven clean and maven install .
6.	Code is ready for testing .

# Automation Testing Scenarios :
Below are the list of API test scenario's given as part of testing .
# src/main/java : 
1.	Packages -> POJO : POJOs are used for increasing the readability and re-usability of a program and Using concept of serilization and deserialization .

# src/test/java : 
1.	Packages -> feature : This package has all the feature files for each functality.
2.	Packages -> resources : Have utility class file,API resouces class file, global properties etc.
3.	Packages -> StepDefination : The code implementation of the feature files can be found here.
4.	Packages -> TestRuner : This package contains the main class file which connects feature class files and step defination class file.


# Reporting :
1.	The Logging framework messages will be stored in the loggging.txt file .

# Task Requirements :
1.	Task 1 : To write the different test cases for the address  scenario validation .(Refer Address_Validation_Scenario.xlsx)
2.	Task 2 : Creation of automation test for Search functionality (Refer to Src folder ) .

# How to Run the Test from Eclipse IDE  :
1. Extract the project files .
2. Right click on the project -> Maven -> Update Project
3. Once project is build 
4. Right click on the project -> Run as -> Junit Test (or)
5. Right click on the Test(cucumber.options/TestRunner.java) -> Run as -> JUnit Test .
  
# How to Run the Test from CMD  :
1. Get to the project directionary from the CMD .
2. Use Maven Coammands to run ( mvn clean install) .



