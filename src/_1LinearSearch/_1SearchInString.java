package _1LinearSearch;
import java.util.Arrays;

public class _1SearchInString {
    public static void main(String[] args) {
        String name = "Saba";
        char target = 'S';

        boolean type1 = search1(name, target);
//        System.out.println(type1);

        boolean type2 = search2(name, target);
        System.out.println(type2);
    }

    static boolean search1(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char target) {
//        System.out.print("HI"+str); -> Saba
//        System.out.print("HI"+str.toCharArray());-> [C@4c873330
//        System.out.print("HI" + Arrays.toString(str)); //-> [S, a, b, a]
//        System.out.print("HI"+(Arrays.toString(str.toCharArray()))); -> [S, a, b, a]
        for(char ch : str.toCharArray()){
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
