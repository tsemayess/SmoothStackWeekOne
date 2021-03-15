/**
 * 
 */
package com.smoothstack.evaluation;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Tsemaye
 *
 */
public class Recursion {

	/**
	 * creates new array so identical adjacent values are summed into a single number
	 * @param nums 
	 * @return
	 */
	public static Integer[] sort(Integer[] nums) {
		
		List<Integer> b = new LinkedList<>();
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {

			if (i == nums.length - 1) {
				b.add(sum + nums[i]);

			} else if (nums[i] == nums[i + 1]) {
				sum += nums[i];
			} else if (nums[i] != nums[i + 1]) {
				sum += nums[i];
				b.add(sum);
				sum = 0;
			}
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
	public static boolean groupSum(int index, Integer[] nums, int target) {
		
		
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
		return Recursion.groupSum(index, Recursion.sort(nums), target);
	}

}
