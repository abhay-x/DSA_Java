package data_structure.array;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int res = search(arr, 6);
        if (res == -1) System.out.println("not found");
        else System.out.println("at index:" + (res+1)
        );
    }

    private static int search(int[] arr, int no) {
        if (arr.length==0) return -1; //length is variable not fn
        for (int i = 0; i < arr.length - 1; i++) {
            if (no == arr[i]) return i;
        }
        return -1;
    }
}
