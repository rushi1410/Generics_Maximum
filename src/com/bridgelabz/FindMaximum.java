package com.bridgelabz;

public class FindMaximum<T extends Comparable<T>> {
	T a1, a2, a3;

	public FindMaximum(T a1, T a2, T a3) {
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}

	public T maximum() {
		return FindMaximum.maximum(a1, a2, a3);
	}

	public static <T extends Comparable<T>> T maximum(T a1, T a2, T a3) {
		T max = a1;
		if (a2.compareTo(max) > 0) {
			max = a2;;
		}
		if (a3.compareTo(max) > 0) {
			max = a3;
		}
		printMax(a1, a2, a3, max);
		return max;
	}

	public static String testMaximum(String a1, String a2, String a3) {
		String max = a1;
		if(a2.compareTo(max) > 0) {
			max = a2;
		}
		if(a3.compareTo(max) > 0) {
			max = a3;
		}
		printMax(a1, a2, a3, max);
		return max;
	}

	public static <T> void printMax(T a1, T a2, T a3, T max) {
		System.out.printf("Max of %s, %s and %s is %s\n",a1 , a2, a3, max);
	}

	public static void main(String[] args) {
		Integer a1Int = 21, a2Int = 98, a3Int = 43;
		Float a1F = 2.1f, a2F = 9.8f, a3F = 4.3f;
		String a1Str = "Apple", a2Str = "Peach", a3Str = "Banana";

		FindMaximum.testMaximum(a1Str, a2Str, a3Str);
		new FindMaximum(a1Int, a2Int, a3Int).maximum();
		new FindMaximum(a1F, a2F, a3F).maximum();
		new FindMaximum(a1Str, a2Str, a3Str).maximum();;
	}
}