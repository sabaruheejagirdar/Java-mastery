package Basics;

import java.util.Arrays;
import java.util.Scanner;


public class _5twoDArray {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][2];
        Scanner in = new Scanner(System.in);

//      Take the array from input
        for(int row = 0; row < arr1.length; row++){
            for(int col = 0; col < arr1[row].length; col++){
                arr1[row][col]= in.nextInt();
            }
        }

//        Display the array in output
        /*
        for(int row = 0; row < arr1.length; row++){
            for(int col = 0; col< arr1[row].length; col++){
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println("");
        }*/

//        Approach 2

        for(int row = 0; row < arr1.length; row++){
            int[] rowww = new int[5] ;
            System.out.println(rowww[2]);
            System.out.println(Arrays.toString(arr1[row]));
        }
//        Approach3: forEach
//        for (int[] row : arr1){
//            for (int num1 : row){
//                System.out.print(num1);
//            }
//            System.out.println();
//        }
    }
}
