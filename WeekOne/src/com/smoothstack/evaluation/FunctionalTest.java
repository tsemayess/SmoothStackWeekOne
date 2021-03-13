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
		
		String[] s1 = {"abc", "bbx", "xmarksstart", "xxx", "nothingbutnet", "xinterrxupted", "x space x"};
		l3 = Arrays.asList(s1);
	}
	
	@Test
	public void rightDigitHP() {
		Integer[] result = {0, 4, 7, 2, 8, 9};
		assertEquals(Arrays.asList(result), Functional.rightDigit(l1));
		
	}
	
	@Test(expected = NullPointerException.class)
	public void rightDigitSP() {
		Functional.rightDigit(null);
		
	}
	
	@Test
	public void doublingHP() {
		Integer[] result = {20, 608, 114, 4, 3916, 18};
		assertEquals(Arrays.asList(result), Functional.doubling(l1));
		
	}
	
	@Test(expected = NullPointerException.class)
	public void doublingSP() {
		Functional.doubling(null);
		
	}
	
	@Test
	public void noXHP() {
		String[] result = {"abc", "bb", "marksstart", "", "nothingbutnet", "interrupted", " space "};
		assertEquals(Arrays.asList(result), Functional.noX(l3));
		
	}
	
	@Test(expected = NullPointerException.class)
	public void noXSP() {
		Functional.noX(null);
		
	}
}
