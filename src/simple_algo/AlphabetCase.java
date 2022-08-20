package simple_algo;

import java.util.Scanner;

public class AlphabetCase {
    public static void main(String[] a) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter word");
        char ab= scn.next().trim().charAt(0);
        if(ab>='a'&&ab<='z')
            System.out.println("Lowercase");
        else
            System.out.println("Uppercase");
    }
}
