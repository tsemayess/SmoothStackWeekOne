package com.smoothstack.dayfive.assignmenttwo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class EvenOddTest {
	List<Integer> l1, l2, l3, l4, l5, l6;
	EvenOdd eo;
	
	@Before
	public void setLists() {
		Integer[] l1 = {};  
		Integer[] l2 = {6, 5, 4, 3, 2, 1};
		Integer[] l3 = {1, 2, 3, 4, 5, 6};
		Integer[] l4 = {1, 2, 3, 4, 5, 6};
		
		this.l1 = Arrays.asList(l1);
		this.l2 = Arrays.asList(l2);
		this.l3 = Arrays.asList(l3);
		this.l4 = Arrays.asList(l4);
		l5 = null;
		l6 = null;
		
		eo = null;
	}
	
	@Test
	public void getEvenOddHP() {
		eo = new EvenOdd(l4);
		String result = ("o1, e2, o3, e4, o5, e6");
		assertEquals(result, eo.getEvenOdd());
		System.out.println(eo.getEvenOdd());
		
	}

	@Test
	public void hashCodeSPIdentical() {
		EvenOdd i1 = new EvenOdd(l3);
		EvenOdd i2 = new EvenOdd(l4);
		assertEquals(i1.hashCode(), i2.hashCode());
	}
	
	@Test
	public void hashCodeFPIdentical() {
		EvenOdd i1 = new EvenOdd(l2);
		EvenOdd i2 = new EvenOdd(l3);
		assertNotEquals(i1.hashCode(), i2.hashCode());
	}
	
	@Test
	public void hashCodeHPNull() {
		EvenOdd i1 = new EvenOdd(l5);
		EvenOdd i2 = new EvenOdd(l6);
		assertEquals(i1.hashCode(), i2.hashCode());
		assertEquals(31, i1.hashCode());
	}
	
	@Test 
	public void equalsHPs() {
		EvenOdd one = new EvenOdd(l5);
		EvenOdd two = new EvenOdd(l6);
		EvenOdd three = null;
		
		assert(one.equals(two));
		assert(two.equals(one));
	}
	
	@Test 
	public void equalsFPs() {
		EvenOdd one = new EvenOdd(l2);
		EvenOdd two = new EvenOdd(l3);
		EvenOdd three = null;
		
		assert(!one.equals(two));
		assert(!two.equals(one));
	}
	
	
}
