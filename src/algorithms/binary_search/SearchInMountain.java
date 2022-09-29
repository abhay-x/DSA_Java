package algorithms.binary_search;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 34, 55, 66, 77, 44, 34, 23, 12};
        System.out.println(search(arr, 34));
    }

    private static int search(int[] arr, int target) {
        int peak = peak(arr);
        int st=0,end=peak;
        while (st<=end){
            int mid=(st+end)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target>arr[mid]){
                st=mid+1;
            }else {
                end=mid-1;
            }
        }
        st=peak+1;
        end=arr.length-1;
        while (st<=end){
            int mid=(st+end)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target<arr[mid]){
                st=mid+1;
            }else {
                end=mid-1;
            }
        }
        return 0;
    }

    private static int peak(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start != end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else { //if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return end;
    }
}
