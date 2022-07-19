package com.bridgelabz;

public class FindMaximum {
	public static Integer maxOfInteger(Integer a1, Integer a2, Integer a3) {
		int max = a1;
		if (a2.compareTo(max) > 0)
			max = a2;
		if (a3.compareTo(max) > 0)
			max = a3;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("The Maximum Value Between The Three Integer is: " + maxOfInteger(21,98,43));
	}
}