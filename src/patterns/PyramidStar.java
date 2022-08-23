package patterns;

public class PyramidStar {
    public static void main(String[] args) {
        int star = 1;
        for (int i = 4; i >= 0; i--) {
            for (int k = i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            star += 2;
            System.out.println();
        }
    }
}
//    *
//   ***
//  *****
// *******
//*********

