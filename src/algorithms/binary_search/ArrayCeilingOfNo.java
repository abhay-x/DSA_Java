package algorithms.binary_search;

//find the closest element that is greater or equal to target.
public class ArrayCeilingOfNo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 14, 16, 17, 24, 48};
        int target = 45;
        System.out.println(arr[ceiling(arr, target)]);
    }

    private static int ceiling(int[] arr, int target) {
        /* when while loop condition violated when the target
        not present b/w start and end [start target end],
        then -> [end start]; so end and start will become the
        floor(closest smaller) and ceil(closest greater) no. */
        if (target > arr[arr.length - 1]) {
            System.out.println("No ceiling");
            return 0;
        }
        int start = 0, end = arr.length - 1, index = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) { // finding target at mid
                return mid;
            }
            if (target < arr[mid]) { //search left of mid,
                end = mid - 1;
                index = mid; //for every mid i.e. greater than target will execute this block; and index saves that mid-index
            } else {  //search right of mid
                start = mid + 1;
            }
        }
//        return start; //or
        return index; //if target is not found, the index is return
    }
}
