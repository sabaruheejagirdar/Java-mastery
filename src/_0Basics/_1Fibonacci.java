package _0Basics;

import java.util.Scanner;

public class _1Fibonacci {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count<=n){
            int temp = b;
            b = b+ a;
            a = temp;
            count ++;
        }
        System.out.println(b);
    }
}
