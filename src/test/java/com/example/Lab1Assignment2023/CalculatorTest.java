package com.example.Lab1Assignment2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
@SpringBootApplication
class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator(); //Arrange - setup our test object etc
    }

    @Test
     void testAdd() {
        int a = -1;
        int b = -2;
        int expectedValue = -3;
        int actualValue = Calculator.add(a,b);

        // Assert - check if actual value is equal to expected value
        Assertions.assertEquals(expectedValue,actualValue);

    }


    @Test
    void testSubtract() {
        int a = -1;
        int b = -2;
        int expectedValue = 1;
        int actualValue = calculator.subtract(a,b);

        Assertions.assertEquals(expectedValue,actualValue);
    }


    @Test
    void testMultiply() {

        int a = 1;
        int b = 9;
        int expectedValue = 9;
        int actualValue = calculator.multiply(a,b);

        Assertions.assertEquals(expectedValue,actualValue);
    }


    @Test
    void testDivide() {

        int a = 8;
        int b = -2;
        int expectedValue = -4;
        double actualValue = calculator.divide(a,b);

        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    void testDivideByZero() {

      Exception ex =  Assertions.assertThrows(IllegalArgumentException.class,() -> calculator.divide(10,0));

      String expectedMessage ="Divide by 0";
      String actualMessage = ex.getMessage();

      // extra assert
        Assertions.assertEquals(expectedMessage,actualMessage);

    }

    @Test
    void testSquareRootOf() {

        int expectedValue = 3;
        double actualValue = calculator.squareRootOf(9);

        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    void testGetArea() {

        double expectedValue = 12.57;
        double actualValue = calculator.getArea(2);

        Assertions.assertEquals(expectedValue,actualValue);

    }

    @Test
    void testGetCircumference() {

        double expectedValue = 12.57;
        double actualValue = calculator.getCircumference(2);

        Assertions.assertEquals(expectedValue,actualValue);
    }
}