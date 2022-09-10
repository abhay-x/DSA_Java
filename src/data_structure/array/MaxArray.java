package data_structure.array;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(max(arr));
    }

    private static int max(int[] arr) {
        int temp=arr[0];
        for (int i=0; i<arr.length;i++){
            if(temp<arr[i]){
                temp=arr[i];
            }
        }
        return temp;
    }
}
