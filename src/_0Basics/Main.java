package _0Basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        System.out.println("hola!");
//        System.out.println(input.nextLine());

        int a = 10;
        int b = 20;


        System.out.println(a+":"+ b);
        System.out.println(swap(a,b));

    }

    static int swap(int a, int b){
        int temp = a;
        a = b;
        b = a;

        return a;
    }
}