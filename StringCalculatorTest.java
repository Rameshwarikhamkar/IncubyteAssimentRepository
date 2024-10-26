package com.StringCalulator.Kata;


import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class StringCalculatorTest {
    @Test
    public void testAddEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void testAddSingleNumber() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"));
    }

    @Test
    public void testAddTwoNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("1,2"));
    }

    @Test
    public void testAddMultipleNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1,2,3"));
    }

    @Test
    public void testAddWithNewlineDelimiter() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1\n2,3"));
    }

    @Test
    public void testAddWithCustomDelimiter() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("//;\n1;2"));
    }

    @Test
    public void testAddWithNegativeNumbers() {
        StringCalculator calculator = new StringCalculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.add("1,-2,3,-4"));
        assertEquals("negative numbers not allowed [-2, -4]", exception.getMessage());
    }
    public static void main(String[] args) {
		StringCalculatorTest st=new StringCalculatorTest();
		st.testAddEmptyString();
		st.testAddMultipleNumbers();
		st.testAddSingleNumber();
		st.testAddTwoNumbers();
		st.testAddWithCustomDelimiter();
		st.testAddWithNegativeNumbers();
		st.testAddWithNewlineDelimiter();
	}
}
	


