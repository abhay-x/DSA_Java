package algorithms.binary_search;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 666, 677, 6667, 0, 1, 2};
        int pivot = findPivot(arr);
        System.out.println(arr[pivot]);
        int target = 33, result = 0;
        if (pivot == -1) {
            result = binarySearch(arr, 0, arr.length, target);
        } else if (target == arr[pivot]) {
            System.out.println("target found at index: " + pivot);
        } else if (target < arr[pivot]) {
            result = binarySearch(arr, 0, pivot - 1, target);
        } else {
            result = binarySearch(arr, pivot + 1, arr.length, target);
        }
        System.out.println(result);
    }

    private static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    private static int findPivot(int[] arr) {
        int start = 0, end = arr.length - 1, pivot = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid != arr.length - 1 && arr[mid] > arr[mid + 1]) {
                pivot = mid;
                break;
            }
            if (mid != 0 && arr[mid] < arr[mid - 1]) {
                pivot = mid - 1;
                break;
            }
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return pivot;
    }

}
