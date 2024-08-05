package com.collection_module2;

import java.util.ArrayList;

/* Write a Java program to update specific array element by given element. */
public class Problem5 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(50);
        a1.add(100);
        a1.add(150);
        a1.add(200);
        a1.add(250);
        System.out.println(a1);

        a1.set(2, 55);
        System.out.println(a1);
    }
}
