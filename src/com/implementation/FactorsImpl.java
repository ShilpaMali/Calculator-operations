package com.implementation;

import com.velocity.functionality.Factors;

public class FactorsImpl implements Factors{

	@Override
	public void getFactors(int a) {
		// TODO Auto-generated method stub
		 System.out.print("Factors of " + a + ": ");
	        for (int i = 1; i <= a; i++) {
	            if (a % i == 0) {
	                System.out.print(i + " ");
	            }
	        }
	       
		
	}

}
