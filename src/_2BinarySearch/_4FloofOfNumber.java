package _2BinarySearch;

import java.util.Arrays;

public class _4FloofOfNumber {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        int arr[] = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = floorOfNumber(arr, target);

        System.out.println("Array: "+Arrays.toString(arr));
        System.out.print("Floor of Number *" + target + "* is: ");
        System.out.println(arr[ans]);
        System.out.print("------------------------------------------------");
    }

    static int floorOfNumber(int[] arr, int target){
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

        return end;
    }
}
