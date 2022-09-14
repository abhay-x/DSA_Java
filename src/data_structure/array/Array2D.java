package data_structure.array;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = {     //new int[][] {} -> not mandatory
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10},
        };
        int target = 10;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    System.out.println(row + 1 + "," + (col + 1));
                    break;
                }
            }
        }
    }
}
