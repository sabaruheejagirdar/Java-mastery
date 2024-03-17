package Basics;

public class _3PrimeChecker {
    public static void main(String[] args) {
        int num = 26;
        if (isPrime(num)){
            System.out.println(num + ": is PRIME");
        }else{
            System.out.println(num + ": is NOT PRIME");
        }
    }

    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        } else if (n == 2) {
            return true;
        } else if (n%2 == 0) {
            return false;
        }else{
            int sqrtN = (int) Math.sqrt(n);
            for(int i = 3; i<=sqrtN;i+=2){
                if(n%i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
