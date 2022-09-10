package data_structure.array;

import java.util.Arrays;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        int arr[][] = new int[3][]; //rows are mandatory for initialization
        System.out.println(Arrays.toString(arr));
        int a[][] = {{1, 2, 3}, {5, 6, 7}, {8, 9, 10}};
        System.out.println(Arrays.toString(a[0])+"\n"+Arrays.toString(a[1])+"\n"+Arrays.toString(a[2]));
        int a3[][][] = {{{1, 2}, {5, 6}, {8, 9}},{{2, 3}, {6, 7}, {9, 10}}};
        System.out.println(Arrays.toString(a3[0][1])+"\n"+Arrays.toString(a3[1][2])+"\n"+a3[1][1][0]);
    }
}
