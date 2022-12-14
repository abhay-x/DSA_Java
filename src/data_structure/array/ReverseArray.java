package data_structure.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        SwapElements s = new SwapElements();
        //Two pointer method
        int i = 0, j = arr.length-1;
        while (i < j) {
            s.swap(arr, i, j);
            i++;
            j--;
        }
    }
}
