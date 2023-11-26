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
    
# Question:
  
  _"Which tests are important to have, important changes in the program, what was challenging in the task?"_

# Answer:
  
  _"Tbh this was a challenge! Creating tests according to the requirements was an unnecessary struggle.
  I started out by creating all tests that I presumed were needed to fullfill the assignment. 
  After countless hours I trashed everything and started it all over again.
  
  Why? 
  
  One of the details regarding the assignment was to only do the least amount of refactoring necessary to make the code functional. While trying to keep as much of the original code as possible I realised that a lot of the tests I have had developed weren't even going to run e.g. testing invalid datatypes, null values and exceptions. 
  So there is no input, null, exception, input or dataType testing done in this final version, only output and boundary testing.
  
  The class provided includes no getters or setters except one getter for a list including all prime numbers found between the interval used during initiation of a Prime object. The constructor accepts nothing else except two int values and on top of that a Prime object is always constructed no matter what invalid int values are being used. Therefore I found that testing constructor functionality is only possible by checking if the list is null or not.
  
  Boundary and output testing with valid data type was quite straight forward. Turning all those tests from red to green was a simple step by step procedure.
  Some minor refactoring, run test, green? Take on next red test.
  
  So to summaries:
      -"Which tests are important to have?"
      _
  
  
# Test Overview 

  class ValidValueTests:
  
    testEquilateralTriangle(): Tests an equilateral triangle with values 2, 2, 2.
    testScaleneTriangle(): Tests a scalene triangle with values 3, 4, 5.
    testIsoscelesTriangle(): Tests an isosceles triangle with values 3, 3, 4.
    testValidUserInput(): Tests user input with values 3, 4, 5.
    
  class InvalidValueTests:
  
    testNotATriangle(): Tests with invalid values for a triangle (1, 2, 3).
    testValidUserInputInvalidLength(): Tests user input with too many values (3, 4, 5, 6).
    
  class NumberFormatExceptionTests:
  
    testInvalidUserInputNumberFormatException(): Tests user input with invalid data types (x, y, z).
    
  class ConstructorTests:
  
    testStringConstructor(): Tests the constructor with a string array for a scalene triangle (3, 4, 5).
    testStringConstructorFaultyValueAmount(): Tests the constructor with an incorrect length of values (3, 4, 5, 0).
    testNegativeLengths(): Tests the constructor with negative values (-1, -2, -3).
    testInvalidStringConstructor(): Tests the constructor with invalid data types (a, b, c).
    testEmptyConstructor(): Tests the constructor with empty input.

# Test result

  ![printscreen of test result](https://github.com/rugsmunny/JAVA22-TDD-Miniprojekt1-Karim-Sendesni/assets/49041363/9394e829-03b1-44c0-b7d4-8f0224ddbf8a)
