package com.StringCalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class StringCalculator {
	



	
	    @Test
	    public void testAddEmptyString() {
	        StringCalculatorTest calculator = new StringCalculatorTest();
	        assertEquals(0, calculator.add(""));
	    }

	    @Test
	    public void testAddSingleNumber() {
	        StringCalculatorTest calculator = new StringCalculatorTest();
	        assertEquals(1, calculator.add("1"));
	    }

	    @Test
	    public void testAddTwoNumbers() {
	        StringCalculatorTest calculator = new StringCalculatorTest();
	        assertEquals(3, calculator.add("1,2"));
	    }

	    @Test
	    public void testAddMultipleNumbers() {
	        StringCalculatorTest calculator = new StringCalculatorTest();
	        assertEquals(6, calculator.add("1,2,3"));
	    }

	    @Test
	    public void testAddWithNewlineDelimiter() {
	        StringCalculatorTest calculator = new StringCalculatorTest();
	        assertEquals(6, calculator.add("1\n2,3"));
	    }

	    @Test
	    public void testAddWithCustomDelimiter() {
	        StringCalculatorTest calculator = new StringCalculatorTest();
	        assertEquals(3, calculator.add("//;\n1;2"));
	    }

	    @Test
	    public void testAddWithNegativeNumbers() {
	        StringCalculator calculator = new StringCalculator();
	        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.add("1,-2,3,-4"));
	        assertEquals("negative numbers not allowed [-2, -4]", exception.getMessage());
	    }

		private Object add(String string) {
			
			return null;
		}
	 
		
	}
		




