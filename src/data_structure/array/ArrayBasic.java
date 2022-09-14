package data_structure.array;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        int[] arr; //declaration, arr get memory in stack
        arr = new int[5]; // initialization with size*, obj is created in heap and referenced to arr
        arr[0]=1;
        arr[1]=2;
        int arr1[] = {1, 2, 3, 4, 5};
        change(arr1);//arr1 contains reference of object
        System.out.println(Arrays.toString(arr)+" length:"+arr.length+"\n"+Arrays.toString(arr1)+" length:"+arr1.length);
    }
    static void change(int st[]){
        st[0]=88;
    }
}

//DMA
//may not continous, mem allocation is handled by jvm