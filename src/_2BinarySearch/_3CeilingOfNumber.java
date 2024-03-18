package _2BinarySearch;

import java.util.Arrays;

public class _3CeilingOfNumber {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        int arr[] = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceilingOfNumber(arr, target);

        System.out.println("Array: "+ Arrays.toString(arr));
        System.out.print("Ceil(Index) of Number *" + target + "* is: ");
        System.out.println(ans);
        System.out.println("------------------------------------------------");
    }

    static int ceilingOfNumber(int[] arr, int target){
        int start =0;
        int end = arr.length -1;

        if(target> arr[arr.length - 1]){
            return -1;
        }

        while(start <= end){
            int middle = (start + end)/2;

            if(target < arr[middle]){
                end = middle - 1;
            } else if (target> arr[middle]) {
                start = middle + 1;
            } else if (target == arr[middle]) {
                return middle;
            }
        }

        return start;
    }
}
