package com.example;

public class NumberClassifier {

    public static void classifyNumbers(int[] numbers) {
        for (int n : numbers) {
            if (n > 0) {
                if (n % 2 == 0) {
                    System.out.println(n + " là so duong chan");
                } else {
                    System.out.println(n + " là so duong le");
                }
            } else if (n < 0) {
                System.out.println(n + " là so am");
            } else {
                System.out.println("So 0");
            }
        }
    }
}