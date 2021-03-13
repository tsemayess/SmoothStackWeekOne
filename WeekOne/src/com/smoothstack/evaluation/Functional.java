package com.smoothstack.evaluation;

import java.util.List;
import java.util.stream.Stream;

public class Functional {
	
	public Integer[] multiply(List<Integer> l) {
		Stream<Integer> stream = l.stream().map(i -> i % 10);
		return stream.toArray(Integer[]::new);
	}

}
