package simple_algo;

import java.util.Arrays;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        search (2,1,3,4,5,5,6,4,5);
    }

    private static void search(int ...v) {
        System.out.println("Enter num");
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(v));
        System.out.println(v[0]);
        int a= sc.nextInt();



    }
}
