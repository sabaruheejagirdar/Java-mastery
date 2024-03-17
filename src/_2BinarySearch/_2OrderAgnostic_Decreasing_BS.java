package _2BinarySearch;

public class _2OrderAgnostic_Decreasing_BS {
    public static void main(String[] args) {
         int[] arr = {8,7,6,5,4};
         int[] arr2 = {19,84,105,206};
         int target = 84;

         boolean isAsc = arr[0] < arr[arr.length-1];

         int ans = oa_bs(arr2, target, isAsc);
         System.out.println(ans);

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
