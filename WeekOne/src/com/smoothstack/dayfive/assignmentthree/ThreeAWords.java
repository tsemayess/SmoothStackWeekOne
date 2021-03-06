/**
 * 
 */
package com.smoothstack.dayfive.assignmentthree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.IntFunction;

/**
 * @author Tsemaye
 *
 */
public class ThreeAWords {

	public List<String> filter(List<String> l) throws NullPointerException {

		
		return Arrays.asList(l.stream().filter(p -> p.charAt(0) == 'a' && p.length() == 3).toArray(String[]::new));	

	}

	@Override
	public boolean equals(Object e) {
		
		return this.hashCode() == e.hashCode();
		
	}
	
	@Override
	public int hashCode() {
		return 19;
		
	}

}
