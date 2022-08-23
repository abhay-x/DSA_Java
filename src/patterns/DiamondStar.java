package patterns;

public class DiamondStar {
    public static void main(String[] args) {
        int row=9,star = 1, spaces = row-1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=spaces; j++) {
                System.out.print(" ");
            }
            for (int j =1 ; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            if(spaces>i){
                spaces--;
                star+=2;
            }
            if(spaces<i)
            {
                spaces++;
                star-=2;
            }
        }
    }
}
//        *
//       ***
//      *****
//     *******
//    *********
//     *******
//      *****
//       ***
//        *

