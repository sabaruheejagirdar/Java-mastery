package Basics;

import java.util.Arrays;

public class _6Swap {
    public static void main(String[] args) {
        int[] arr = {1,2};
//        swapNum(arr, 1, 3);
//        System.out.print(Arrays.toString(arr));
//        output - [1, 9, 7, 5, 12]

//        REVERSE ARRAY
        reverseArray(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            swapNum(arr, start, end);
            start += 1;
            end -= 1;
        }
    }

    static void swapNum(int arr[], int index1, int index2){
        int  temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
