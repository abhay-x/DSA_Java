package data_structure.array;

//Maximum Subarray
public class Kadane_algo {
    public static void main(String[] args) {
        int nums[] = {-2, -3, -4, -1, -2, -1, -5, -3};
        int sum = 0, max=nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);


//        for (int i = 0; i < arr.length ; i++) {
//            if(sum<arr[i]){
//                sum=arr[i];
//            }
//            int t=0;
//            for (int j = i; j < arr.length; j++) {
//                t+=arr[j];
//                if(sum<t){
//                    sum=t;
//                }
//            }
////            System.out.println(t);
//        }
    }
}
