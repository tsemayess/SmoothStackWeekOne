package com.smoothstack.dayfive.assignmenttwo;

import java.util.List;
import java.util.stream.Stream;

public class EvenOdd {

	private List<Integer> list;

	EvenOdd(List<Integer> l) {
		this.list = l;
	}

	public String getEvenOdd() {


		Stream<String> stream = list.stream().map(t -> {
			if (t % 2 == 0) {
				return "e" + t.toString() + ", ";

			} else {
				return "o" + t.toString() + ", ";
			}
		});
		
		String sum = "";
		for (Object o: stream.toArray()) {
			sum += o;
		}
		
		return sum.substring(0, sum.length() - 2);

	}
	

	@Override
	public boolean equals(Object e) {

		return this.hashCode() == e.hashCode();

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null ? 0 : list.hashCode()));
		return result;

	}
}
