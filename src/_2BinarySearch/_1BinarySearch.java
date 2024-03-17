package _2BinarySearch;

public class _1BinarySearch {
    public static void main(String[] args) {
        System.out.println("ans");
        int arr[] = {8,7,6,5,2};
        int target = 2;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
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
