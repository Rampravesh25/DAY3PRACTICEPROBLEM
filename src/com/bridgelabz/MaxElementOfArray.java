package com.bridgelabz;

public class MaxElementOfArray {
    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 30, 40, 50, 78, 87, 40, 89, 20};
        int maxNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
        }
        System.out.println(maxNum);
    }
}
