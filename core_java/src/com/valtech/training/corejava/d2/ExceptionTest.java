package com.valtech.training.corejava.d2;

public class ExceptionTest {
	public int div( int a, int b)throws Exception {
	//if (b==100) throw new Exception("B is 100 Invalid value");
		return a/b;
		
	}
	
	public int calculateSimpleInterest(int p,int r,int t) {
		try {
			return div(p*t*r,100);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Exception occoured");
		} finally {
			System.out.println("this code will always be excetued.....");
		}
		return 0;
	}
	public static void main(String[] args) {
		ExceptionTest test =new ExceptionTest();
		int interest = test.calculateSimpleInterest(100,12, 12);
		System.out.println(interest);
		
	}

}
