package com.smoothstack.evaluation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Functional {
	
	public static List<Integer> rightDigit(List<Integer> l) throws NullPointerException {
		return Arrays.asList(l.stream().map(i -> i % 10).toArray(Integer[]::new));
	}
	
	public static List<Integer> doubling(List<Integer> l) throws NullPointerException  {
		return Arrays.asList(l.stream().map(i -> i * 2).toArray(Integer[]::new));
	}
	
	public static List<String> noX(List<String> l) throws NullPointerException {
		return Arrays.asList(l.stream().map(i -> i.replaceAll("x", "")).toArray(String[]::new));
	}
	
	

}
