# JAVA22-TDD-Miniprojekt2-Karim-Sendesni
| School assignment | TDD | JUnit5 |

_Second mini project in the TDD course. The assignment was to create all necessary tests for the code provided by our educator._

# Assignment
_Create all necessary tests by implementing the red-green-refactor concept._

# Requirements
    Code with at least 80% test coverage.
    The main method does not need to be tested (coverage must still be at least 80%).
    The code should be organized into at least two packages, main and test.
    Tests should include (if needed):
      Boundary testing
      Null values
      Exceptions
      Input
      Output
      Data Types
    Use the Annotations @DisplayName and @Test.
    Feel free to use other Annotations as well.
    There should be a test method for each test case.
    
    Console Print Methods:
    Implement two methods, printCount() and printSum(), for convenient console output.
    
# Question:
  
  _"Which tests are important to have, important changes in the program, what was challenging in the task?"_

# Answer:
  
  _"Tbh this was a challenge! Creating tests according to the requirements was an unnecessary struggle.
  I started out by creating all tests that I presumed were needed to fullfill the assignment. 
  After countless hours I trashed everything and started it all over again._
  
  Why? 
  
  _One of the details regarding the assignment was to only do the least amount of refactoring necessary to make the code functional. While trying to keep as much of the original code as possible I realised that a lot of the tests I have had developed weren't even going to run e.g. testing invalid datatypes and exceptions. 
  So there is no input, exception, input or dataType testing done in this final version, only null, output and boundary testing._
  
  _The class provided includes no getters or setters except one getter for a list including all prime numbers found between the interval used during initiation of a Prime object. The constructor accepts nothing else except two int values and on top of that a Prime object is always constructed no matter what invalid int values are being used. Therefore I found that testing constructor functionality is only possible by checking if the list is null or not._
  
  _Boundary and output testing with valid data type was quite straight forward. Turning all those tests from red to green was a simple step by step procedure.
  Some minor refactoring, run test, green? Take on next red test._
  
  So to summarize it all:
  
  -"Which tests are important to have?"
  _Boundary, output and null. These are the tests that will assure that the 'program' functioning according to the requirements._
          
  -"Important changes in the program?"
    
  _Added three print methods: printCount(), printSum() and printError(), all private since that seemed to be the theme of the class.
  Created isValidInitiationValues() to ensure that no calculations are run unless the values are within stated limits.
  Both methods numIsPrime() and calculatePrimes() where in need of some serious refactoring but i tried to keep the 
  solutions as close to the 'intended way' as much as possible._
      
  - "What was challenging in the task?
  _Creating tests for an already messed up program according to what seemed to be, unreachable requirements. But I am looking forward to the feedback in the hopes of learning something new._
  
  
# Test Overview 

  class OutputTest:
  
    testPrintInvalidBoundary()
    testPrintValidBoundary()
    
  class ConstructorTest:
  
    testConstructorInvalidBoundary()
    testConstructorValidBoundary()
    
  class LogicTest:

    testLogicValidBoundaryCount()
    testLogicInvalidBoundaryCount() 
    testLogicInvalidBoundarySum() 
    testLogicValidBoundarySum() 

# Test result

  ![printscreen of test result](https://github.com/rugsmunny/JAVA22-TDD-Miniprojekt2-Karim-Sendesni/assets/49041363/4f6ee5a2-5142-4160-9276-d07670bc0c67)
