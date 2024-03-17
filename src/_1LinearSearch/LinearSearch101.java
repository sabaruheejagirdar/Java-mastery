package _1LinearSearch;

public class LinearSearch101 {
    public static void main(String[] args) {
        int[] num = {10,20,30,22,12};

        int type1 = linearSearch1(num, 34);
//        System.out.println(type1);

        Integer type2 = linearSearch2(num, 3222);
        System.out.println(type2);

    }

    /* Type-1 search in the array: return the index if item found
        otherwise if item not found return -1*/
    static int linearSearch1(int[] arr, int target) {
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }


    /* Type-2 search in the array: return the ELEMENT itself if item found
        otherwise if item not found return not found*/
    static Integer linearSearch2(int[] arr, int target) {
        for(int num: arr){
            if(num == target){
                return target;
            }
        }
        return Integer.MAX_VALUE;
    }


}
