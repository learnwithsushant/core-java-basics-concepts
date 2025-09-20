package learn.core.java.concepts.TUFcode.basicMaths;

import java.util.stream.IntStream;

public class CountOfOddDigits {
    public static void main(String[] args) {
        int count =   countDigitWithLambda(-698754635);
        System.out.println(" Count of numbers >>>"+ count);
    }

        private static int countDigit(int n) {

            if(n==0)
                return n;
            else if (n<0) {
                n=n*-1;

            }

            int countOfOddDigits = 0;

            while(n>0){
               int lastDigit = n%10;
               if(lastDigit%2!=0)
                   ++countOfOddDigits;
               n=n/10;


            }

            return countOfOddDigits;
        }

    private static int countDigitWithLambda(int n) {
        n = Math.abs(n); // handle negatives

        return (int) IntStream
                .iterate(n, x -> x > 0, x -> x / 10) // keep dividing until 0
                .map(x -> x % 10)  // extract last digit
                .filter(d -> d % 2 != 0) // keep odd digits
                .count(); // count them
    }
}
