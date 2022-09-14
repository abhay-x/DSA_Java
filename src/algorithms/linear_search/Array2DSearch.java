package algorithms.linear_search;

public class Array2DSearch {
    public static void main(String[] args) {
        int[][] arr = {     //new int[][] {} -> not mandatory
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10},
        };
        int target = 10;
        System.out.println(search(arr,target));
    }

    private static String search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return row + 1 + "," + (col + 1);
                }
            }
        }
        return "Not Found";
    }
}
