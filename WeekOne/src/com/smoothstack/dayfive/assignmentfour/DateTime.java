package com.smoothstack.dayfive.assignmentfour;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateTime {

	public void monthsLength(int y) {
		
		for (Month m: Month.values()) {
			System.out.println(m.getDisplayName(TextStyle.FULL, Locale.ENGLISH) + ": " + m.length(y % 4 == 0));
		}
	}
}
