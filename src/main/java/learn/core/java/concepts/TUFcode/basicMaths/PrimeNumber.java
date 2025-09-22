package learn.core.java.concepts.TUFcode.basicMaths;

public class PrimeNumber {
    public static void main(String[] args) {

        int count =0, n =96;
        for(int i = 1;i<=n;i++){
            if(checkForPrime(i)){
                ++count;
            }


        }
        System.out.println("No. of Prime numbers >>> "+count);
    }

    private static  boolean checkForPrime(int n){
        if (n <= 1) {
            return false;
        }
        // 2 is the only even prime number
        if (n == 2) {
            return true;
        }
        // Even numbers greater than 2 are not prime
        if (n % 2 == 0) {
            return false;
        }
        // Check for divisibility by odd numbers from 3 up to the square root of num
        // We only need to check up to the square root because if a number 'n' has a divisor 'd' greater than its square root,
        // then it must also have a divisor 'n/d' which is less than its square root.
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false; // Found a divisor, so it's not prime
            }
        }
        return true;
    }
}
