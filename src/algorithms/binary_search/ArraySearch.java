package algorithms.binary_search;

public class ArraySearch {
    public static void main(String[] args) {
        //work for sorted array
        //1.take middle, 2.target >mid search right else left
        int[] arr = {-4, -2, 7, 8, 9, 33, 55, 77, 88, 887}; //array should be sorted
        int[] arr1 = {90,77,33,23,21,15,-4};
        int[] arr2 = {2, 3, 4, 14, 16, 17, 24, 48};
        int target = 1;
        System.out.println(binarySearch(arr2, target));
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end]; //order Agnostic Binary search, check whether array is asc or dec
        while (start <= end) {
            int mid = (start + end) / 2; //to avoid int range exceed use: mid=start+(end-start)/2;
            if (arr[mid] == target) { // finding if target at mid
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) { //search right of mid,
                    start = mid + 1;
                } else { //search left of mid
                    end = mid - 1;
                }
            }else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return end;
    }
}
