package algorithms.binary_search;

public class ArrayFloorOfNo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 14, 16, 17, 24, 48};
        int target = 90;
        System.out.println(arr[floor(arr, target)]); //for target=1 array indexOutOfBound cuz it print that index
    }

    private static int floor(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            /* when while loop condition violated when the target
            not present b/w start and end [start target end],
            then -> [end start]; so end and start will become the
            floor(closest smaller) and ceil(closest greater) no. */
            if (target < arr[0]) {
                System.out.println("No floor");
                return 0;
            }
            int mid = (start + end) / 2;
            if (target == arr[mid]) { // finding target at mid
                return mid;
            }
            if (target < arr[mid]) { //search left of mid,
                end = mid - 1;//for every mid i.e. greater than target will execute this block; and index saves that mid-index
            } else {  //search right of mid
                start = mid + 1;
            }
        }
        return end; //if target is not found, the index is return
    }
}
