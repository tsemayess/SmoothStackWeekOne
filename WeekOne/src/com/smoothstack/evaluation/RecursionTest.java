package com.smoothstack.evaluation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionTest {


	
	@Test
	public void groupSumClump() {
		int[] a = { 2, 4, 6, 8 };
		int[] b = { 2, 8, 4, 4 };
		int[] c = { 1, 7, 7, 5 };

		assert(Recursion.groupSumClump(0, a, 10));
		assert(!Recursion.groupSumClump(0, b, 19));
		assert(Recursion.groupSumClump(0, c, 19));

	}
	
	@Test(expected = NullPointerException.class)
	public void nullList() {
		Recursion.groupSumClump(0, null, 10);
	}
	
	@Test(expected = NullPointerException.class)
	public void emptyList() {
		int[] a = {};
		Recursion.groupSumClump(0, a, 0);
	}
}
