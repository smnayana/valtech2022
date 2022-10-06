package org.Arithmetic.module;

import static org.junit.Assert.*;

import org.junit.Test;

import com.valtech.training.valtech_mainProject.Arithmetic;

public class ArithmeticImplTest {
	@Test
    public void testAdd() {
      Arithmetic a = new ArithmeticImpl();
     assertEquals(5, a.add(2, 3));
        assertEquals(5, a.add(3,2 ));
       assertEquals(3, a.add(0, 3));
       
  }
	@Test
  public void testSub() {
		 Arithmetic a = new ArithmeticImpl();
    assertEquals(5, a.sub(10, 5));
     assertEquals(4, a.sub(10, 6));
     assertEquals(3, a.sub(10, 7));
     
  }
	@Test
	public void testMul() {
		 Arithmetic a = new ArithmeticImpl();
     assertEquals(10, a.mul(5, 2));
	}
	
	@Test
	public void testdiv() {
    Arithmetic a = new ArithmeticImpl();
    assertEquals(0, a.div(2, 3));     
	}

}
