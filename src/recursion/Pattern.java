package recursion;

public class Pattern {
    public static void main(String[] args) {
        pattern3(4);
    }

    private static void pattern(int row) {
        if (row == 0) return;
        pattern(row - 1);
        for (int i = 1; i <= row; i++) {
            System.out.print(i);
        }
        System.out.println();
    }

    private static void pattern1(int row) {
        if (row==0)return;
        for (int i = 1; i <= row; i++) {
            System.out.print(i);
        }
        System.out.println();
        pattern1(row-1);
    }

    private static void pattern3(int row) {
        if (row == 1) {
            System.out.println(1);
            return;
        }
        for (int i = 1; i <= row; i++) {
            System.out.print(i);
        }
        System.out.println();
        pattern3(row-1);
        for (int i = 1; i <= row; i++) {
            System.out.print(i);
        }
        System.out.println();
    }

}
