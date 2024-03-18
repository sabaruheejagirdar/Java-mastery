package __Leetcode__.BinarySearch;
import java.util.Arrays;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
                        //Example 1:
//Input: letters = ["c","f","j"], target = "a"      //Output: "c"
                        //Example 2:
//Input: letters = ["c","f","j"], target = "c"      //Output: "f"


public class _3_744_nextGreatestLetter {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        char arr[] = {'c','f','j'};
        char target = 'f';
        char ans = nextGreatestLetter(arr, target);

        System.out.println("Array: "+ Arrays.toString(arr));
        System.out.print("Ceil(Index) of Number *" + target + "* is: ");
        System.out.println(ans);
        System.out.println("------------------------------------------------");
    }
//    public char nextGreatestLetter(char[] letters, char target)
    static char nextGreatestLetter(char[] letters, char target){
        int start =0;
        int end = letters.length -1;


        while(start <= end){
            int middle = (start + end)/2;

            if(target < letters[middle]){
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return letters[start % letters.length];
    }
}
