package recursion;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sum(123));
    }

    private static int sum(int num) {
        if (num == 0) return 0;
        int lastDigit = num % 10;
        int remainingDigit = num / 10;
//        System.out.print(lastDigit);
        return lastDigit + sum(remainingDigit);
    }
}
