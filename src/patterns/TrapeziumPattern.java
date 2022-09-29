package patterns;

public class TrapeziumPattern {
    public static void main(String[] args) {
        int row=4,dig=row,st=1,en=20;
        for (int i = 0; i < row; i++) {
            for (int j = 1; j <= dig; j++) {
                System.out.print(st+"*");
                st++;
            }
            dig--;
            System.out.println();
            for (int j = 0; j <= i ; j++) {
                System.out.print("  ");
            }
        }
    }
}
