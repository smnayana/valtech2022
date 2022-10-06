package com.valtech.training.maven_example;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticImplTest {
	
	@Test
	public void testDiv() {
		Arthemetic a = new ArithmeticImpl();
		assertEquals(2, a.div(6, 3));
		try {
			a.div(3, 0);
			fail("Arithmetic Expection was excepted with divided by zero");
		}
		catch (ArithmeticException ae) {
		
		}
	}

	@Test
	public void test() {
		Arthemetic a = new ArithmeticImpl();
		assertEquals(5, a.add(2, 3));
        assertEquals(5, a.add(3, 2));
        assertEquals(3, a.add(0, 3));
        assertEquals(3, a.add(3, 0));
        assertEquals(5, a.add(-2, 7));
        assertEquals(5, a.add(7, -2));
        assertEquals(0, a.add(0, 0));
	}

}
