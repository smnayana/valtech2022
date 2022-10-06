package org.Simple.intrest.calculator;



public class SimpleIntrestImpl implements SimpleIntrest{
	
	private Arithmetic arithmetic = new ArithmeticImpl();

	    public int computeInterest(int prin,int roi,int time) {
	        return prin*roi*time/100;
	    }
}
