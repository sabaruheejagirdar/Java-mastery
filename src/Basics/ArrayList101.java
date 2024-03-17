package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList101 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> intArray1 = new ArrayList<>();

        intArray1.add(10);
        intArray1.add(20);
        intArray1.add(30);
        intArray1.add(40);
        intArray1.add(50);

        intArray1.set(1,8000);
        intArray1.remove(2);
        System.out.println(intArray1.contains(10));
        System.out.println(intArray1);

        Integer[] array2 = {5, 6, 7};
        ArrayList<Integer> intArray2 = new ArrayList<>(Arrays.asList(array2));
        System.out.println("Next..." + intArray2);

//        Multidimensional
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
//list2-> []

//        Initialisation
        for(int i = 0; i<3; i++){
            list2.add(new ArrayList<>());
        }
//list2 -> [[], [], []]
        System.out.println(list2.get(1).add(1000000));
        System.out.println(list2);

        for(int i = 0; i<3; i++){
            for(int j =0; j<3;j++){
                list2.get(i).add(in.nextInt());
/*              1 2 3 4 5 6 7 8 9
                list2.get(0).add(1); [1]
                list2.get(0).add(2); [1,2]
                list2.get(0).add(3); [1,2,3]

                list2.get(1).add(4); [1000,4]
                list2.get(1).add(5); [1000,4,5]
                list2.get(1).add(6); [1000,4,5,6]

                list2.get(2).add(7); [7]
                list2.get(2).add(8); [7,8]
                list2.get(2).add(9); [7,8,9]

 */

            }
        }
        System.out.println(list2);
    }
}
