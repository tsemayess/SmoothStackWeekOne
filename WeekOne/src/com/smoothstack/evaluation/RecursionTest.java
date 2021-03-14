package com.smoothstack.evaluation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionTest {

	
//	@Test
//	public void sortHP() {
//		int[] a = {2, 4, 4, 6, 8};
//		int[] r = {2, 8, 6, 8, 0};
//		
//		Recursion.sort(a);
//		
//	}
	
	

	/*
	 * @Test public void groupSum() { int[] a = {2, 4, 6, 8};
	 * 
	 * Recursion.groupSum(0, a, 40);
	 * 
	 * }
	 */

	@Test
	public void groupSum() {
		Integer[] a = { 2, 4, 6, 8 };
		Integer[] b = { 2, 4, 4, 8 };
		Integer[] c = { 1, 7, 7, 5 };

		Recursion.groupSumClump(0, a, 40);
		Recursion.groupSumClump(0, c, 15);

	}
}
