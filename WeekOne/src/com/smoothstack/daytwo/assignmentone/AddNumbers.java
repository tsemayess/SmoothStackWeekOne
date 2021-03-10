/**
 * 
 */
package com.smoothstack.daytwo.assignmentone;

/**
 * @author Tsemaye
 *
 */
public class AddNumbers {

	/**
	 * @param args numbers to be summed together
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			double sum = 0;
			for (String i: args) {
				sum += Double.parseDouble(i.toString());
			}
			System.out.println("The sum of these numbers is: " + sum);
		}

		catch (Exception e) {
			System.out.println("The values you have entered are not all numberic.");
		}

	}

}
