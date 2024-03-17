package Leetcode;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
//1295. Find Numbers with Even Number of Digits
//Input: nums = [12,345,2,6,7896]
//Output: 2
public class _1_1295_FindEvenNumbersOfDigits {
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};

        System.out.println(findNumbers(nums));

        System.out.println("Number of digits:"+_optimize_findNumbers(12354));

    }

    static public int _optimize_findNumbers(int num){
        return (int)(Math.log10(num)) + 1;
    }

    static public int findNumbers(int[] nums) {
        int evenDigitCount = 0;
        for(int num:nums){
            int count = 0;
            while(num > 0){
                count += 1;
                num = num / 10;
//                num -> 2 | 0
            }
            if(count%2 == 0){
                evenDigitCount += 1;
            }
        }
        return evenDigitCount;
    }
}
