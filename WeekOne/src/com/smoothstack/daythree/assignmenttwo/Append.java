package com.smoothstack.daythree.assignmenttwo;

import java.io.FileWriter;
import java.util.Scanner;

public class Append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (FileWriter writer = new FileWriter(args[0], true); 
				Scanner keyboard = new Scanner(System.in)) {
			System.out.println("Type what you would like to append to this file");
			
			writer.write("\n" + keyboard.nextLine());
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Cannot find file");
		} 

	}

}
