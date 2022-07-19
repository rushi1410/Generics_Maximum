package com.bridgelabz;

public class FindMaximum<T extends Comparable<T>> {

	T a1, a2, a3, a4, a5;

	public FindMaximum(T a1, T a2, T a3, T a4, T a5 ) {
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
		this.a5 = a5;
	}

	public static <T extends Comparable<T>> T maxOfValues(T a1, T a2, T a3, T a4, T a5) {
		T max = a1;
		if (a2.compareTo(max) > 0)
			max = a2;
		if (a3.compareTo(max) > 0)
			max = a3;
		if (a4.compareTo(max) > 0)
			max = a4;
		if (a5.compareTo(max) > 0)
			max = a5;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Find Maximun Problem Using Generics \n");
		System.out.println("The maximum value between the three integer is : " + maxOfValues(21, 98, 43, 17, 58)+ "\n");
		System.out.println("The maximum value between the three float is : " + maxOfValues(2.1f, 9.8f, 4.3f, 1.7f, 5.8f) + "\n");
		System.out.println("The maximum value between the three string is : " + maxOfValues("Apple","Peach","Banana","Pineapple","Mango"));
	}
}