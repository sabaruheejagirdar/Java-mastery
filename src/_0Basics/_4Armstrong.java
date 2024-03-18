package _0Basics;

public class _4Armstrong {
    public static void main(String[] args) {
//        153 = 1 + 25 + 27 = 153 => Armstrong number
        int num = 153;
        if (isArmstrong(num)) {
            System.out.println(num+ ":Armstrong");
        }else{
            System.out.println("Not an Armstrong");
        }

//        Print all 3 digit armstrongs
        for(int i=100; i<1000;i++){
            if(isArmstrong(i)){
                System.out.println("Armstrong: "+i);
            }
        }
    }

    public static boolean isArmstrong(int num){
        int temp = num;
        int sum = 0;

        while(temp>0){
            int rem = temp % 10;
            int cube = rem * rem * rem;
            sum += cube;
            temp = temp/10;
        }

        if (num == sum) {
           return true;
        }
        return false;
    }
}
   /* public static boolean isArmstrong(int n){
        String numStr = String.valueOf(n);
        int sum = 0;
        for(int i = 0; i < numStr.length();i++){
//            System.out.print(numStr.charAt(i));
            int num = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(num,3);
        }

        if(sum == n){
            return true;
        }
        return  false;
    }*/

