package com.implementation;

import com.velocity.functionality.Division;

public class DivisionImpl implements Division {

	@Override
	public double div(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0) {
			throw new ArithmeticException("Do not Divide with zero");
		}
		return a/b;
	}

}
