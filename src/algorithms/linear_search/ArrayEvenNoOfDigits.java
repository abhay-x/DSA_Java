package algorithms.linear_search;

//search no that containing even no of digit in the given array
public class ArrayEvenNoOfDigits {
    public static void main(String[] args) {
        int[] arr = {12, 0,344, -8479, 233, 84};
        int[] digits;
        int count = 0;
        for (int i : arr) {
            if (even(i)) {
                count++;
            }
        }
        System.out.println("Total even no of digit: " + count);
    }

    private static boolean even(int i) {
        if (i < 0) i = i * -1;
        return ((int)(Math.log10(i))+1)%2==0;

//        if (i==0) return false;
//        String s=i+"";
//        if(s.length()%2==0) {
//            System.out.println(s);
//            return true;
//        }
//        return false;

//        int count = 0;
//        int r = 0, dividend = i, divisor = 10;
//        while (dividend != 0) { //56
//            // r = dividend % divisor; //56%10=6
//            dividend = dividend / divisor; //56/10=5
//            count++;
//        }
//        if (count % 2 == 0) {
//            System.out.println(i);
//            return true;
//        }
//        return false;
    }
}
