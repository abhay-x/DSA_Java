package simple_algo;

import java.util.Arrays;
import java.util.Scanner;

public class InfiniteInput {
    public static void main(String[] args) {
        input (2,1,3,4,5,5,6,4,5);
    }

    private static void input(int ...v) {
        System.out.println("Enter num");
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(v));
    }
}
