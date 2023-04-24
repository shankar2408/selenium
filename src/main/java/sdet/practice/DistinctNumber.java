package sdet.practice;

import java.util.Arrays;

import org.junit.Test;

public class DistinctNumber {
	
	/*
	 * Question here !!
	 * Find distinct number
	 */

	@Test // +ve
	public void example1() {
		int arr[]= {1,2,3,3,3,4,9};
		bruteForce(arr);
		

	}

	@Test // edge
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 
	 * 
	 */

	private void bruteForce(int[] num) {
		if(num.length<=1) {
			System.out.println(Arrays.toString(num));
		}
		
		for(int i=0; i<num.length-1; i++) {
			if(num[i]!=num[i+1]) {
				System.out.println(num[i]);
			}
				
			
		}
		System.out.println(num[num.length-1]);

	}

	private void twoPointer() {

	}

}



