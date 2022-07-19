package com.bridgelabz;

public class FindMaximum {
	public static float maxOfFloat(Float f1, Float f2, Float f3) {
		float max = f1;
		if (f2.compareTo(max) > 0)
			max = f2;
		if (f3.compareTo(max) > 0)
			max = f3;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("The Maximum Value Between The Three Float is: " + maxOfFloat(2.1f,9.8f,4.3f));
	}
}