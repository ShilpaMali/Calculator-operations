package com.implementation;

import com.velocity.functionality.Average;

public class AverageImpl implements Average{

	@Override
	public double average(int[] numbers) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int a: numbers) {
			sum+=a;
		}
		return sum/numbers.length;
	}

}
