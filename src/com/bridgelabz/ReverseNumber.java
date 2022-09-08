package com.bridgelabz;

public class ReverseNumber {
    public static void main(String[] args) {
        double[] arr = new double[]{10.00, 20.00, 45.20, 45.00};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
