package com.bridgelabz;

public class MinElementOfArray {
    public static void main(String[] args) {

        int[] arr = new int[]{40, 50, 80, 32, 45, 23, 12, 7, 5, 45};
        int minNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minNum > arr[i]) {
                minNum = arr[i];
            }
        }
        System.out.println(minNum);
    }
}
