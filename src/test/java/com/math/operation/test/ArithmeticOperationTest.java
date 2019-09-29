package com.math.operation.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.math.operation.ArithmeticOperations;

public class ArithmeticOperationTest {

	@Test
	public void testAdd()
	{	
		ArithmeticOperations operations = new ArithmeticOperations();
		Integer actual = operations.add(2, 6);
		Integer expected = 8;
		assertEquals(expected, actual);	
	}

}


