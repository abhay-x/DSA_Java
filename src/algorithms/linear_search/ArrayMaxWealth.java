package algorithms.linear_search;

import java.util.Arrays;

//find the sum of row which is greatest
public class ArrayMaxWealth {
    public static void main(String[] args) {
        int[][] arr={
                {5,9}, //c1 wealth
                {7,3,15}  //c2 wealth
        };
        int[] customers=new int[arr.length];
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                customers[i]+=arr[i][j];
            }
            if(max<customers[i]) max=customers[i];
        }
        System.out.println(Arrays.toString(customers));
        System.out.println("Max wealth: "+max);
    }
}
