package patterns;

public class InvertedPyramidStar {
    public static void main(String[] args) {
        int l = 9;
        for (int i = 0; i <= 5; i++) {
            for (int k = i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= l; j++) {
                System.out.print("*");
            }
            l -= 2;
            System.out.println();
        }
    }
}
//*********
// *******
//  *****
//   ***
//    *