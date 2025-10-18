package learn.core.java.concepts.TUFcode.Recursion;

public class PrimeWithRecursion {
    public static void main(String[] args) {

        System.out.println("Check prime no. "+ checkForPrime(2,7));
    }

    private static boolean checkForPrime(int i, int n){

        if(i==n){
            return true;
        }

        if(n%i==0)
            return false;

        return checkForPrime(i+1,n);

    }
}
