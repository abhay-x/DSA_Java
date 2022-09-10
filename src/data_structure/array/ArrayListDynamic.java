package data_structure.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Dynamic array size no need to specify
public class ArrayListDynamic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(2); //dont give primitive int, give wrapper class Integer
        list.add(55);
        list.add(44);
        list.add(55);
        System.out.println(list.contains(55));
        list.set(0, 22);
        System.out.println(list); //internally it convert into toString
        list.remove(1);
        System.out.println(list.get(2));

        //multidimensional
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        //initialization
        for (int i = 0; i < 3; i++) {
            list1.add(new ArrayList<>());//add arraylist to index 0,1,2 ,list1 expect arraylist input
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1.get(i).add(in.nextInt());//add 3 integer at i index arraylist, add method append the array
            }
        }
        System.out.println(list1.get(0));
        System.out.println(list1);

    }

}
