package com.company.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {-1, 0, 1, 2, 4, 10};
        System.out.println("Magic Index is " + new BinarySearch().search(array, 0, array.length - 1));
    }

    private int search(int[] arrA, int low, int high) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (mid == arrA[mid])
                return mid;
            if (mid > arrA[mid]) {
                return search(arrA, mid + 1, high);
            } else {
                return search(arrA, low, mid - 1);

            }
        }
        return -1;

    }
}
