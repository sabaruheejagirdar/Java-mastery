package _1LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,50,678,675, 324};
        int target = 675;

        System.out.print(linearSearch1(arr1, target, 1,4));

    }

    static int linearSearch1(int[] arr, int target, int start, int end) {
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}

