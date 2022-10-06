package org.Simple.intrest.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleIntrestImplTest {

	@Test
	 public void test() {
        SimpleIntrest si = new SimpleIntrestImpl();
        assertEquals(12,si.computeInterest(600, 2, 1));
    }
	}


