package learn.core.java.concepts.TUFcode.basicMaths;

public class CountOfOddDigits {
    public static void main(String[] args) {
        int count =   countDigit(-65);
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
}
