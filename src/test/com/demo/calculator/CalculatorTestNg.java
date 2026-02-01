package com.demo.calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTestNg {

    private Calculator calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddPositiveNumbers() {
        double result = calculator.add(5.0, 3.0);
        Assert.assertEquals(result, 8.0, "5.0 + 3.0 should equal 8.0");
    }

    @Test
    public void testAddNegativeNumbers() {
        double result = calculator.add(-5.0, -3.0);
        Assert.assertEquals(result, -8.0, "-5.0 + -3.0 should equal -8.0");
    }

    @Test
    public void testAddMixedNumbers() {
        double result = calculator.add(5.0, -3.0);
        Assert.assertEquals(result, 2.0, "5.0 + -3.0 should equal 2.0");
    }

    @Test
    public void testAddZero() {
        double result = calculator.add(5.0, 0.0);
        Assert.assertEquals(result, 5.0, "5.0 + 0.0 should equal 5.0");
    }

    @Test
    public void testAddDecimals() {
        double result = calculator.add(2.5, 3.7);
        Assert.assertEquals(result, 6.2, 0.0001, "2.5 + 3.7 should equal 6.2");
    }

    @Test
    public void testSubtract() {
        double result = calculator.subtract();
        Assert.assertEquals(result, 0.0, "subtract() should return 0.0");
    }

    @Test
    public void testDivide() {
        double result = calculator.divide();
        Assert.assertEquals(result, 0.0, "divide() should return 0.0");
    }

    @Test
    public void testMultiply() {
        double result = calculator.multiply();
        Assert.assertEquals(result, 0.0, "multiply() should return 0.0");
    }
}