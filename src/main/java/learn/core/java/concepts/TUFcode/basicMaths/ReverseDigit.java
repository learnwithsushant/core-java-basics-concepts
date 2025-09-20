package learn.core.java.concepts.TUFcode.basicMaths;

import java.util.stream.IntStream;

public class ReverseDigit {
    public static void main(String[] args) {
        int number = 4568;
        int revNumber = reverseDigitNormalWay(number);
        System.out.println(revNumber);
        System.out.println(reverseDigitLambdaWay(-9874));
    }

    private static int reverseDigitNormalWay(int n) {
        int revNum = 0;

        while(n>0){
            int lastDigit = n%10;
            revNum = revNum*10+lastDigit;
            n = n/10;
        }
        return revNum;
    }

    private static int reverseDigitLambdaWay(int n) {
        int sign = n < 0 ? -1 : 1;   // store original sign
        n = Math.abs(n);             // work only with positive digits

        int reversed = IntStream.iterate(n, x -> x > 0, x -> x / 10)
                .map(x -> x % 10) // extract digits
                .reduce(0, (rev, d) -> rev * 10 + d);

        return reversed * sign; // restore sign at the end
    }

    private static boolean ispalindrome(int n){
        int temp = n;
        int revNum = 0;

        while(temp>0){
            int lastDigit = temp%10;
            revNum = revNum*10+lastDigit;
            temp = temp/10;
        }

        if(revNum==n)
            return true;
        else
          return false;

    }
}
