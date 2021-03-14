package com.smoothstack.evaluation;

import java.util.function.Function;



public class PerformsOperations {
			
	public Function<Integer, String> isOdd() {
		return (i) -> {
			if (i % 2 == 1 ) {
				return "ODD";
			} else {
				return "EVEN";
			}
		};
	}
	
	public Function<Integer, String> isPrime() {
		return (i) -> {
			for (int j = 1; j < 1 / 2; j ++) {
				if (i % j == 0) {
					return "COMPOSITE";
				}
			}
			return "PRIME";
		};
	}
	
	public Function<Integer, String> isPalidrome() {
		return (i) -> {
			int og = i;
			int reverse = 0;
			for (int j = 0; j < Math.log10(i) + 1; j++) {
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
	
	
}
