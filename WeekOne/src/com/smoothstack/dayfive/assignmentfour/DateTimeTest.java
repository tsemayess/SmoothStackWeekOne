package com.smoothstack.dayfive.assignmentfour;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Before;
import org.junit.Test;

public class DateTimeTest {
	
	DateTime datetime;
	
	@Before
	public void create() {
		datetime = new DateTime();
	}

	@Test
	public void monthsHP() {
		datetime.monthsLength(2000);
	}
	
	@Test
	public void mondaysHP() {
		datetime.mondays(Month.APRIL);
	}
	
	@Test
	public void freakyFriday() {
		assert(datetime.freakyFriday(LocalDate.of(2017, Month.OCTOBER, 13)));
		assert(!datetime.freakyFriday(LocalDate.of(2021, Month.MARCH, 13)));
	}
}

