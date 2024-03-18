package _2BinarySearch;

import java.util.Arrays;

public class _2OrderAgnostic_Decreasing_BS {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        int[] arr = {64,55,48,12,9,6};
        int target = 12;

        boolean isAsc = arr[0] < arr[arr.length-1];
        int ans = oa_bs(arr, target, isAsc);

        System.out.println("Array: "+ Arrays.toString(arr));
        System.out.print("*"+target + "* is present at Index: ");
        System.out.println(ans);
        System.out.println("------------------------------------------------");
    }

    static int oa_bs(int[] arr, int target, boolean isAsc){
        int start =0;
        int end = arr.length -1;

        while(start <= end){
            int middle = (start + end)/2;

            if (target == arr[middle]) {
                return middle;
            }

            if(isAsc){
                if(target < arr[middle]){
                    end = middle - 1;
                } else if (target> arr[middle]) {
                    start = middle + 1;
                }
            }else{
                if(target > arr[middle]){
                    end = middle - 1;
                } else if (target< arr[middle]) {
                    start = middle + 1;
                }
            }
        }

        return -1;
    }
}
