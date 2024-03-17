package Basics;

public class _7MaxValueArray {
    public static void main(String[] args) {
        int[] arr = {10, 3, 7, 2};
        System.out.print(maxArr(arr));
    }

    static int maxArr(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
