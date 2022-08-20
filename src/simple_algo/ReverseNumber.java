package simple_algo;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int last_digit = 0, remaining_digit = num;
        while (remaining_digit != 0) {
            last_digit = remaining_digit % 10;
            remaining_digit = remaining_digit / 10;
            System.out.print(last_digit);
        }
    }
}
