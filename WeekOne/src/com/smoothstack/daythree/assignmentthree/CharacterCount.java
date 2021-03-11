package com.smoothstack.daythree.assignmentthree;

import java.util.Scanner; 
import java.io.FileReader;
import java.io.BufferedReader;

public class CharacterCount {

	public static void main(String[] args) {
		
		try (Scanner keyboard = new Scanner(System.in); 
				FileReader reader = new FileReader(args[0])) {
			
			System.out.println("Which character would you like to count in the file specified?");
			Integer count = 0;
			Character c = keyboard.next().charAt(0);
			Integer b;
			
			while ((b = reader.read()) != -1) {
				if (b == c.charValue()) {
					count++;
				}
			}
			
			System.out.println("The character " + c + " appears in the file specified "  + count + " times" );
			
		} catch (Exception E) {
			System.out.println("File Not Found");
		}
	}

}
