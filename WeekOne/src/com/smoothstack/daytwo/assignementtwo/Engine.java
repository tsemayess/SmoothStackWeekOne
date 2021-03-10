/**
 * 
 */
package com.smoothstack.daytwo.assignementtwo;

import java.lang.reflect.Array;

import com.smoothstack.daytwo.assignementtwo.*;

/**
 * @author Tsemaye
 *
 */
public class Engine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[][] a = { { 1.0, 3.0, 9.0, 14.0, 17.0 }, { 1.0, 8.0, 6.0, 5.0, 4.0 }, { 7.0, 5.0, 6.0, 9.0, 4.0 } };
		Double[][] b = { { 1.8, 3.2, 9.4 }, { 1.1, 8.1, 6.2, 5.9 }, { 7.2, 19.8, 6.0, 9.1, 4.2 } };

		ArraySearch searchA = new ArraySearch(a);
		ArraySearch searchB = new ArraySearch(b);

		System.out.println("Array A \nMax number in array is: " + searchA.getMax() + "\nMax number position is: "
				+ searchA.getMaxRow() + " " + searchA.getMaxColumn());

		System.out.println("\nArray B \nMax number in array is: " + searchB.getMax() + "\nMax number position is: "
				+ searchB.getMaxRow() + " " + searchB.getMaxColumn());
		System.exit(0);

	}

}
