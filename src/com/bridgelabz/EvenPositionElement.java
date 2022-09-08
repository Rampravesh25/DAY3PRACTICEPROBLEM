package com.bridgelabz;

public class EvenPositionElement {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50, 78, 87, 40, 89, 20};
        System.out.println("Even Position Element:");

        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }
}
