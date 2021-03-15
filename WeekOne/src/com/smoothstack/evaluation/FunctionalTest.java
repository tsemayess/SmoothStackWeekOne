package com.smoothstack.evaluation;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FunctionalTest {

	List<Integer> l1, l2;
	List <String> l3, l4;
	
	@Before
	public void start() {
		Integer[] i1 = {10, 304, 57, 2, 1958, 9};
		l1 = Arrays.asList(i1);
		
		Integer[] i2 = {};
		l2 = Arrays.asList(i2);
		
		String[] s1 = {"abc", "bbx", "xmarksstart", "xxx", "nothingbutnet", "xinterrxupted", "x space x"};
		l3 = Arrays.asList(s1);
		
		String[] s2 = {};
		l4 = Arrays.asList(s2);
	}
	
	@Test
	public void rightDigitHP() {
		Integer[] result = {0, 4, 7, 2, 8, 9};
		Integer[] result2 = {};
		
		assertEquals(Arrays.asList(result), Functional.rightDigit(l1));
		assertEquals(Arrays.asList(result2), Functional.doubling(l2));
		
		
	}
	
	@Test(expected = NullPointerException.class)
	public void rightDigitSP() {
		Functional.rightDigit(null);
		
	}
	
	@Test
	public void doublingHP() {
		Integer[] result = {20, 608, 114, 4, 3916, 18};
		Integer[] result2 = {};
		
		assertEquals(Arrays.asList(result), Functional.doubling(l1));
		assertEquals(Arrays.asList(result2), Functional.doubling(l2));
		
	}
	
	@Test(expected = NullPointerException.class)
	public void doublingSP() {
		Functional.doubling(null);
		
	}
	
	@Test
	public void noXHP() {
		String[] result = {"abc", "bb", "marksstart", "", "nothingbutnet", "interrupted", " space "};
		String[] result2 = {};
		assertEquals(Arrays.asList(result), Functional.noX(l3));
		assertEquals(Arrays.asList(result2), Functional.noX(l4));
		
	}
	
	@Test(expected = NullPointerException.class)
	public void noXSP() {
		Functional.noX(null);
		
	}
}
