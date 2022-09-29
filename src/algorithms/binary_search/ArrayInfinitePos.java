package algorithms.binary_search;

// find element position in an infinite array
// not allowed to use array.length
public class ArrayInfinitePos {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int start = 0, end = 1; //starting with array size of 2
        int target = 12;
        while (target > end) {
                int temp = end + 1;
                end += (end - (start - 1)) * 2; //prev arr size=start-1,now arr size=(end-(start-1))
                start = temp;
        }
        System.out.println(search(arr, target, start, end));
    }

    private static int search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2; //to avoid int range exceed use: mid=start+(end-start)/2;
            if (arr[mid] == target) { // finding if target at mid
                return mid;
            }
            if (target > arr[mid]) { //search right of mid,
                start = mid + 1;
            } else { //search left of mid
                end = mid - 1;
            }
        }
        return end; //if element not found end will contain -1
    }
}
