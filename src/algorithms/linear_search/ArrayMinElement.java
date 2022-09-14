package algorithms.linear_search;

public class ArrayMinElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(min(arr));
    }

    private static int min(int[] arr) {
        int temp=arr[0];
        for (int i=0; i<arr.length;i++){
            if(temp>arr[i]){
                temp=arr[i];
            }
        }
        return temp;
    }
}
