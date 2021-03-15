package com.smoothstack.evaluation;

import java.util.function.Function;



public class PerformsOperations {
			
	public static Function<Integer, String> isOdd() {
		return (i) -> {
			if (i % 2 == 1 ) {
				return "ODD";
			} else {
				return "EVEN";
			}
		};
	}
	
	public static Function<Integer, String> isPrime() {
		return (i) -> {
			for (int j = 2; j < i / 2 + 1; j ++) {
				if (i % j == 0) {
					return "COMPOSITE";
				}
			}
			
			return "PRIME";
		};
	}
	
	public static Function<Integer, String> isPalidrome() {
		return (i) -> {
			int og = i;
			int reverse = 0;
			for (int j = 0; j < Math.log10(og); j++) {
				int r = i % 10;
				reverse = (reverse *10) + r;
				i = i/10; 
			}
			if (reverse == og) {
				return "PALIDROME";
			} else {
				return "NOT PALIDROME";
			}
		};
	}
	
	public static void tester(int[] t) throws IndexOutOfBoundsException, NullPointerException {
		for (int i = 0; i < t[0]; i++) {
			switch (t[i*2 + 1]) {
				case 1:
					System.out.println(PerformsOperations.choose(PerformsOperations.isOdd(), t[i * 2 + 2]));
					break;
				case 2:
					System.out.println(PerformsOperations.choose(PerformsOperations.isPrime(), t[i * 2 + 2]));
					break;
				case 3:
					System.out.println(PerformsOperations.choose(PerformsOperations.isPalidrome(), t[i * 2 + 2]));
					break;
			}
		}
		
		
	}
	
	private static String choose(Function<Integer, String> a, int n ) {
		return a.apply(n);
	}
	
	
}
