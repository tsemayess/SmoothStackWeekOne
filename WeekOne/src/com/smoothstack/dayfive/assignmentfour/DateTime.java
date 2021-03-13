package com.smoothstack.dayfive.assignmentfour;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class DateTime {

	public void monthsLength(int y) {

		System.out.println("\n\nLengths of months in " + y + ":");
		for (Month m : Month.values()) {
			System.out
					.println(m.getDisplayName(TextStyle.SHORT, Locale.ENGLISH) + ": " + m.length(Year.of(y).isLeap()));
		}
	}

	public void mondays(Month m) {
		LocalDate date = LocalDate.of(Year.now().getValue(), m, 1);

		System.out.println("Mondays in " + m.getDisplayName(TextStyle.FULL, Locale.ENGLISH) + " of this Year");

		while (date.getMonth() == m) {
			if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
				System.out.print(date.toString() + "  ");
				date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			} else {
				date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			}

		}
	}
	
	public boolean freakyFriday(LocalDate d) {
		if (d.getDayOfWeek() == DayOfWeek.FRIDAY && d.getDayOfMonth() == 13) {
		
			return true;
		} 
		
		return false;
	}
}
