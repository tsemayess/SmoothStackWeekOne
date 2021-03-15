/**
 * 
 */
package com.smoothstack.evaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Tsemaye
 *
 */
public class RecursionsStream {

	/**
	 * creates new array so identical adjacent values are summed into a single
	 * number
	 * 
	 * @param a
	 * @return
	 */
	public static Integer[] sort(Integer[] a) {

		Iterator<Integer> s = Arrays.asList(a).stream().iterator();
		int sum = 0;
		int current = s.next();
		List<Integer> b = new LinkedList<>();

		while (s.hasNext()) {
			int next = s.next();
			sum += current;
			if (current != next) {
				b.add(sum);
				sum = 0;
			}
			current = next;
		}

		b.add(sum + current);

		for (int i : b.toArray(new Integer[b.size()])) {

		}

		return b.toArray(new Integer[b.size()]);

	}

	/**
	 * Helper method to check if numbers in the sorted array can add up to target number
	 * @param index
	 * @param nums
	 * @param target
	 * @return
	 */
	public static boolean groupSumLoop(int index, Integer[] nums, int target) {
		
		
		for (int i = index; i < nums.length; i++) {
			
			
			for (int j = i + 1; j < nums.length; j++) {	
				
				int sum = nums[i];
				if (sum == target) {
					return true;
				}
							
				for (int k = j; k < nums.length; k++) {
					sum += nums[k];
					
					if (sum == target) {
						return true;
					}
				}
				
			}
		}
		

		return false;
	}

	public static boolean groupSumClump(int index, Integer[] nums, int target) {
		return RecursionsStream.groupSumLoop(index, RecursionsStream.sort(nums), target);
	}

}
