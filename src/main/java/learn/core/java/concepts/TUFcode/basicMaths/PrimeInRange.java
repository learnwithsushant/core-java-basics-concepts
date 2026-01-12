package learn.core.java.concepts.TUFcode.basicMaths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static learn.core.java.concepts.TUFcode.basicMaths.PrimeNumber.checkForPrime;

public class PrimeInRange {

    /*  You are given an 2D array queries of dimension n*2.
        The queries[i] represents a range from queries[i][0] to queries[i][1] (include the end points).
        Return the count of prime numbers present in between each range in queries array.*/


    public static void main(String[] args) {

        ArrayList<int[]> queries = new ArrayList<>();
        int[] a = {1, 10} , b = {10, 20};
        queries.add(a);
        queries.add(b);





        List primeNumber = new ArrayList<Integer>();

        for(int[] j : queries){
            int count = 0;
            for(int i = j[0];i<=j[1];i++){
                if(checkForPrime(i)){
                   ++count;
                }


            }
            primeNumber.add(count);
        }



        primeNumber.stream().forEach(System.out::println);
    }

    static  boolean checkForPrime(int n){
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
