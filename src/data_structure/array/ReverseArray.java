package data_structure.array;

import java.util.Arrays;

import data_structure.array.SwapArray;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        SwapArray s = new SwapArray();
        int i = 0, j = arr.length-1;
        while (i < j) {
            s.swap(arr, i, j);
            i++;
            j--;
        }
    }
}
