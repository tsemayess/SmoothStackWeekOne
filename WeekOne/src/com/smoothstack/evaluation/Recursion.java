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
	private static Integer[] sort(Integer[] nums) {
		
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
	 * Helper method to check if numbers in the sorted array can add up to target
	 * number
	 * 
	 * @param index
	 * @param nums
	 * @param target
	 * @return
	 */
	private static boolean groupSum(int index, Integer[] nums, int target, int startsum) {

		if (startsum == target) {
			return true;
		}

		int sum = 0;
		
		for (int i = index; i < nums.length; i++) {
			sum = startsum + nums[i];


			if (sum == target) {
				return true;
			} else if (sum < target) {


				if (groupSum(i + 1, nums, target, sum)) {
					return true;
				}

			}

		}

		return false;

	}
	

	
	public static boolean groupSumClump(int index, Integer[] nums, int target) throws NullPointerException {
		if (nums.length == 0) {
			throw new NullPointerException();
		}
		return Recursion.groupSum(index, Recursion.sort(nums), target, 0);
	}

}
