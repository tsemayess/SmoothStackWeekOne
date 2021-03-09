package com.smoothstack.dayone.assignmentone;


/**
 * @author Tsemaye
 *
 */
public class NotesPyramid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//not necessary variables, but make program more flexible/customizable
		final int numOfPyramids = 4;
		final int numOfRows = 4;
		
		//prints 4 different pyramid types
		for(int i = 0; i < numOfPyramids; i++) {
			System.out.println("\n" + (i + 1) + ")");
			
			//prints period line at top if case odd
			if (i % 2 == 1) {
				for (int j = 0; j < (i + 9); j++) {
					System.out.print(". ");
				}
				System.out.println("");
			}
			
			//instructs how each pyramid should be printed by case
			switch (i) {
			
			case 0:
				for (int j = 0; j < numOfRows; j++) {
					for (int k = 0; k < j + 1; k++) {
						System.out.print("*");
					}
					System.out.println("");
				}
				break;

			case 1:
				for (int j = numOfRows; j > 0; j--) {
					for (int k = 0; k < j; k++) {
						System.out.print("*");
					}
					System.out.println("");
				}
				break;
				
			case 2:
				for (int j = 0; j < numOfRows; j++) {
					
					//does not print new line first round
					if (j != 0) {
						System.out.println("");
					}
					//adds spaces to center (i + 9) minus how far going left from center (j + 1)
					//(i + 9) - (j + 1) -> (i - j + 8)
					for (int k = 0; k < (i - j + 8); k++) {
						System.out.print(" ");
					}
					
					//number of stars to print
					for (int k = 0; k < 2*j + 1; k++) {
						System.out.print("*");
					}
				}
				System.out.println("");
				break;
				
			case 3:
				for (int j = numOfRows; j > 0; j--) {
					
					//does not print new line first round
					if (j != numOfRows) {
						System.out.println("");
					}
					
					//adds spaces to center (i + 9) minus how far going left from center (j + 1)
					//(i + 9) - (j + 1) -> (i - j + 8)
					for (int k = 0; k < (i - j + 8); k++) {
						System.out.print(" ");
					}
					
					//number of stars to print
					for (int k = 0; k < 2*j - 1; k++) {
						System.out.print("*");
					}
				}
				System.out.println("");
				break;
			}
			
			
			//prints the period line at end if case is even
			if (i % 2 == 0) {
				for (int j = 0; j < (i + 9); j++) {
					System.out.print(". ");
				}
				System.out.println("");
			}
		}
		
		
	}

}
