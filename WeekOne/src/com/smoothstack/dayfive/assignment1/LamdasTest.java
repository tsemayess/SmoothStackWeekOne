/**
 * 
 */
package com.smoothstack.dayfive.assignment1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * @author Tsemaye
 *
 */
public class LamdasTest {

	@Test
	public void shortestHP() {
		String[] s = new String[]{"aang", "katara", "zuko", "azula", "sokka", "sukki", "general iroh", "toph beifong"};
		String[] r =  new String[] {"aang", "zuko", "azula", "sokka", "sukki", "katara", "general iroh", "toph beifong"};
				
		List<String> l = Arrays.asList(s);
		
		Collections.sort(l, Lambdas.shortest());
		
		assertEquals(r, l.toArray());

	}

	@Test
	public void shortestHPSame() {
		String[] s = new String[]{"t", "s", "e", "m", "a", "y", "e"};
		String[] r =  new String[] {"t", "s", "e", "m", "a", "y", "e"};
				
		List<String> l = Arrays.asList(s);
		
		Collections.sort(l, Lambdas.shortest());
		assertEquals(r, l.toArray());
		
	}
	
	@Test
	public void longestHP() {
		String[] s = new String[]{"aang", "katara", "zuko", "azula", "sokka", "sukki", "general iroh", "toph beifong"};
		String[] r =  new String[] {"general iroh", "toph beifong", "katara", "azula", "sokka", "sukki",  "aang", "zuko"};
				
		List<String> l = Arrays.asList(s);
		
		Collections.sort(l, Lambdas.longest());
		assertEquals(r, l.toArray());
		
	}
	
	@Test
	public void longestHPSame() {
		String[] s = new String[]{"t", "s", "e", "m", "a", "y", "e"};
		String[] r =  new String[] {"t", "s", "e", "m", "a", "y", "e"};
				
		List<String> l = Arrays.asList(s);
		
		Collections.sort(l, Lambdas.longest());
		assertEquals(r, l.toArray());
		
	}
	
	@Test
	public void alphabeticallyHPAllLetters() {
		String[] s = new String[]{"aang", "katara", "zuko", "azula", "sokka", "sukki", "general iroh", "toph beifong", "toph"};
		String[] r =  new String[] {"aang", "azula", "general iroh", "katara", "sokka", "sukki", "toph", "toph beifong", "zuko"};
				
		List<String> l = Arrays.asList(s);
		
		Collections.sort(l, Lambdas.alphabetically());
		assertEquals(r, l.toArray());
		
	}
	
	@Test
	public void alphabeticallyHPNumbers() {
		String[] s = new String[]{"day 1", "day 2", "day 3", "day 10", "day 11", "day 4", "day 30", "1 day", "2 days", "3 days"};
		String[] r =  new String[] {"1 day", "2 days", "3 days", "day 1", "day 10", "day 11", "day 2", "day 3", "day 30", "day 4"};
				
		List<String> l = Arrays.asList(s);
		
		Collections.sort(l, Lambdas.alphabetically());
		assertEquals(r, l.toArray());
		
	}
	
	@Test
	public void alphabeticallyHPMix() {
		String[] s = new String[]{"day 1", "day 2", "3 days", "10 days", "day 11", "day AA", "a day", "two days"};
		String[] r =  new String[] {"10 days", "3 days", "a day", "day 1", "day 11", "day 2", "day AA", "two days"};
				
		List<String> l = Arrays.asList(s);
		
		Collections.sort(l, Lambdas.alphabetically());
		assertEquals(r, l.toArray());
		
	}
	
	@Test
	public void eFirstHPMultipleE() {
		String[] s = new String[]{"day 1", "day 2", "3 days", "10 days", "day 11", "day AA", "a day", "two days", 
				"Emily in Paris", "extravagant", "Esports", "elegant"};
		
		String[] r =  new String[] { "elegant", "Emily in Paris", "Esports", "extravagant", "10 days", "3 days", 
				"a day", "day 1", "day 11", "day 2", "day AA", "two days"};
				
		List<String> l = Arrays.asList(s);
		
		Collections.sort(l, Lambdas.eFirst());
		assertEquals(r, l.toArray());
		
	}
	
	
	@Test
	public void eFirstHPMixNoE() {
		String[] s = new String[]{"day 1", "day 2", "3 days", "10 days", "day 11", "day AA", "a day", "two days"};
		String[] r =  new String[] {"10 days", "3 days", "a day", "day 1", "day 11", "day 2", "day AA", "two days"};
				
		List<String> l = Arrays.asList(s);
		
		Collections.sort(l, Lambdas.eFirst());
		assertEquals(r, l.toArray());
		
	}
	
	
	

}
