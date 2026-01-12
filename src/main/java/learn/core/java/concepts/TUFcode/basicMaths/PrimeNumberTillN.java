package learn.core.java.concepts.TUFcode.basicMaths;

import java.util.ArrayList;
import java.util.List;

import static learn.core.java.concepts.TUFcode.basicMaths.PrimeNumber.checkForPrime;

public class PrimeNumberTillN {

    public static void main(String[] args) {

        int  n =96;
        List primeNumber = new ArrayList<Integer>();
        for(int i = 1;i<=n;i++){
            if(checkForPrime(i)){
                primeNumber.add(i);
            }


        }
        primeNumber.stream().forEach(System.out::println);


    }
}
