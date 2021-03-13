package com.smoothstack.dayfive.assignmentthree;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ThreeAWordsTest {
	ThreeAWords a, b;
	List<String> l1, l2, l3;
	
	@Before 
	public void create() {
		a = new ThreeAWords();
		b = new ThreeAWords();
		
		String[] s1 = {"ace", "beauty", "cue", "alphabet", "ooo", "aah"};
		String[] s2 = {"hello", "goodbye", "dog", "alphabet", "accelerate", "cat"};
		l1 = Arrays.asList(s1);
		l2 = Arrays.asList(s2);
		l3 = null;
	}
	
	@Test
	public void hashCodeHP() {
		assertEquals(19, a.hashCode());
	}

	@Test
	public void equalsHP() {
		assert(a.equals(b));
		assert(b.equals(a));
	}
	
	@Test
	public void equalsSP() {
		
		assert(!a.equals("hello"));
	}
	
	@Test
	public void filterHP() {
		String[] result = {"ace", "aah"}; 
		assert(result.length == a.filter(l1).size() && a.filter(l1).containsAll(Arrays.asList(result)));
				
	}
	
	@Test
	public void filterSP() {
		String[] result = {}; 
		assert(result.length == a.filter(l2).size() && a.filter(l2).containsAll(Arrays.asList(result)));
				
	}
	
	@Test(expected = NullPointerException.class)
	public void filterSPNull() {
		String[] result = {}; 
		assert(result.length == a.filter(l3).size() && a.filter(l3).containsAll(Arrays.asList(result)));
				
	}
	
	
}
