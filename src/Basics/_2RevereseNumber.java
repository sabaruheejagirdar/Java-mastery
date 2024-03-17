package Basics;

import java.util.Scanner;

public class _2RevereseNumber {
    public static void main(String[] args) {
       int num = 123456;
       int ans = 0;

       while (num > 0){
           int rem = num % 10;
//           rem = 6     | 5    | 4     | 3     | 2     | 1
           num = num /10;
//           num = 12345 | 1234 | 123   | 12    | 1     | 0
           ans = ans * 10 + rem;
//           ans = 6     | 65   | 654   | 6543  | 65432 | 654321
       }
        System.out.print(ans);
    }
}
