package com.smoothstack.evaluation;

import org.junit.Before;
import org.junit.Test;

public class PerformsOperationsTester {
	
	
	
	@Test
	public void isOdd() {
		int[] odds =  {5, 1, 4, 1, 8, 1, 25097, 1, 3453453, 1, 16};
		System.out.println("\nODDS: ");
		PerformsOperations.tester(odds);
	}
	
	@Test
	public void isPrime() {
		System.out.println("\nPRIMES: ");
		int[] primes =  {5, 2, 4, 2, 6, 2, 2, 2, 443, 2, 16};
		PerformsOperations.tester(primes);
	}
	
	@Test
	public void isPalidrome() {
		System.out.println("\nPALIDROMES: ");
		int[] primes =  {5, 3, 11, 3, 262, 3, 690096, 3, 443, 3, 18};
		PerformsOperations.tester(primes);
	}
	@Test
	public void isMixec() {
		int[] primes =  {5, 2, 11, 1, 262, 3, 690096, 1, 443, 2, 18};
		System.out.println("\nMIXED: ");
		PerformsOperations.tester(primes);
	}
}
