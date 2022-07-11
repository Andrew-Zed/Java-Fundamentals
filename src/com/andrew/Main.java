package com.andrew;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//        Integer num1 = 1000, num2 = 1000;
//        System.out.println(num1 == num2);//1
//        Integer num3 = 20, num4 = 20;
//        System.out.println(num3 == num4);//2
//        System.out.println("Main 1");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int data = numbers.stream().reduce(0, (s, e) -> s + e);
        System.out.println("Data is: "+ data);

    }

    public static void main(String args) {

    }
}
