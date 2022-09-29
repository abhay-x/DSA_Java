package algorithms.binary_search;

//mountain Array or Bitonic array, element first increase then decrease eg:[0,1,2,3,2,1,0]
public class ArrayMountainPeakIndex {
    public static void main(String[] args) {
        int[] arr = {0, 10, 67,68, 68, 55, 22, 11, 0};
        //linear search
        int start = 0, end = arr.length - 1;
        while (start != end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else{ //if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        System.out.println(arr[end]);
    }
}

