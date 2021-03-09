/**
 * 
 */
package com.smoothstack.dayone.assignmenttwo;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author Tsemaye
 *
 */
public class RandomNumberGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random generator = new Random();
		int randomNumber = generator.nextInt(100) + 1;
		int lives = 5;
		int guess = 0;
		boolean win = false;
		Scanner keyboard = new Scanner(System.in);
		
		//ADD Instructions
		System.out.println("Try and Guess the magic number. Or at least guess a number"
				+ "that is 10 greater or 10 fewer than it. The number is between 1 and 100.");
		
		//5 Round Game Play
		while (lives > 0 || !win) {
			
			guess = keyboard.nextInt();
				
			//Check guess is in bounds
			if (guess < 1 || guess > 100) {
				System.out.println("Number is not between 1 and 100. Please reenter guess. Lives"							+ " Remaining: " + lives);
					
			//Winning guess
			} else if (guess >= randomNumber - 10 && guess <= randomNumber + 10) {
						
				System.out.println("You win! The mystery number is: " + randomNumber);
				win  = true;
				
			//last guess	
			} else if (lives == 1) {
						
				System.out.println("Sorry, you did not guess the number you guessed  or guess a number "
						+ "10 greater or fewer than the number. The mystery number is: " + randomNumber);					
			//losing guess	
			} else {
						
				lives--;
				System.out.println("Sorry, the number you guessed is not the number or 10 greater or "
					+ "fewer than the number. Lives Remaining: " + lives);
				}	
		}
		
		keyboard.close();
		System.exit(0);
	}

}
