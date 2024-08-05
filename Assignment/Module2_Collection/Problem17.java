package com.collection_module2;

import java.util.ArrayList;
import java.util.List;

/* Write a Java program to extract a portion of an array list */
public class Problem17 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(50);
		a1.add(100);
		a1.add(150);
		a1.add(200);
		a1.add(250);
		System.out.println("Array : " + a1);
		
		List<Integer> a2 = a1.subList(2, 4);
		System.out.println(a2);
	}
}
