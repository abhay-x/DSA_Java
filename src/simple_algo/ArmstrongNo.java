package simple_algo;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dig =sc.nextInt();
        printArmstrong(dig);
    }

    private static void printArmstrong(int dig) {
        int no=0;
        while (no != dig) {
            int ans = 0, tno = no;
            while (tno != 0) {
                ans += Math.pow(tno % 10, 3);
                tno = tno / 10;
            }
            if (ans == no)
                System.out.print(no+" ");
            no++;
        }
    }


}
