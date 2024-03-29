package _2BinarySearch;

import java.util.Arrays;

public class _1BinarySearch {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        int arr[] = {8,12,13,18,25};
        int target = 12;
        int ans = binarySearch(arr, target);
        System.out.println("Array: "+ Arrays.toString(arr));
        System.out.print("*"+target + "* is present at Index: ");
        System.out.println(ans);
        System.out.println("------------------------------------------------");
    }

    static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length -1;

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

        return -1;
    }
}
