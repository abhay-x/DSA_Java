package algorithms.binary_search;

import java.util.Arrays;

//Start and end position of element in array
public class ArrayStEndPos {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    private static int[] search(int[] arr, int target) {
        int firstPos = findIndex(arr, target, true);
        int lastPos = findIndex(arr, target, false);
        return new int[]{firstPos, lastPos};
    }

    private static int findIndex(int[] arr, int target, boolean pos) {
        int start = 0, end = arr.length - 1, index = -1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (target == arr[mid]) {
                index = mid; //if target found at mid then it might be possible ans
                if (pos) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {//if (target > arr[mid]) { //if target > arr[mid]
                start = mid + 1;
            }
        }
        return index;
    }
}

//    private static int[] search(int[] arr, int target) {
//        int start = 0, end = arr.length - 1;
//        int st = 100, en = 0;
//        while (start <= end) {
//            int mid = (start + end) / 2;
//            if (arr[mid] == target) {
//                if (st > mid) st = mid; //saving the lowest index of target
//            }
//            if (arr[mid] >= target) {
//                end = mid - 1;
//            } else start = mid + 1;
//        }
//        start = 0;
//        end = arr.length - 1;
//        while (start <= end) {
//            int mid = (start + end) / 2;
//            if (arr[mid] == target) {
//                if (en < mid) en = mid; //saving the highest index of target
//            }
//            if (arr[mid] > target) {
//                end = mid - 1;
//            } else start = mid + 1;
//        }
//        return new int[]{st, en};
//    }