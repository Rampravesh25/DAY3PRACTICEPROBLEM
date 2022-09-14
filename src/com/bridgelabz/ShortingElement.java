package com.bridgelabz;

import java.util.Arrays;

public class ShortingElement {
    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 50, 60, 70, 80, 50, 60, 30, 2};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
