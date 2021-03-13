/**
 * 
 */
package com.smoothstack.dayfive.assignment1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Tsemaye
 *
 */
public class Lambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String[] array = new String[10];
		String[] array = { "hi", "envelope", "coding", "smoothstack", "wiley", "love", "Emelia Earhart" };
		List<String> list = Arrays.asList(array);


		Collections.sort(list, shortest());
		System.out.print("Orderd By Shortest: ");
		list.forEach(s -> System.out.print(s + " "));

		Collections.sort(list, longest());
		System.out.print("\nOrderd By Longest: ");
		list.forEach(s -> System.out.print(s + " "));

		Collections.sort(list, alphabetically());
		System.out.print("\nOrderd Alpahbetically: ");
		list.forEach(s -> System.out.print(s + " "));

		Collections.sort(list, eFirst());
		System.out.print("\nOrderd By E then Rest: ");
		list.forEach(s -> System.out.print(s + " "));
	}

	public static Comparator<String> shortest() {
		return (s1, s2) -> s1.length() - s2.length();
	}
	
	public static Comparator<String> longest() {
		return  (s1, s2) -> s2.length() - s1.length();
	}
	
	public static Comparator<String> alphabetically() {
		return  (s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase());
	}
	
	public static Comparator<String> eFirst() {
		return (s1, s2) -> {

			if ((s1.toLowerCase().charAt(0) == 'e' && s2.toLowerCase().charAt(0) == 'e')
					|| (s1.toLowerCase().charAt(0) != 'e' && s2.toLowerCase().charAt(0) != 'e')) {
				return s1.toLowerCase().compareTo(s2.toLowerCase());
			} else if (s1.toLowerCase().charAt(0) == 'e') {
				return -1;
			} else {
				return 1;
			}

		};
	}
	

}
