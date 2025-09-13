package learn.core.java.concepts.TUFcode.basicMaths;

public class CountOfDigits {
    public static void main(String[] args) {
     int count =   countDigit(-65);
        System.out.println(" Count of numbers >>>"+ count);
    }

    private static int countDigit(int n) {

        if(n==0)
            return 1;
        else if (n<0) {
            n=n*-1;

        }

        int count = 0;

        while(n>0){
            n = n/10;
            ++count;
        }

        return count;
    }
}
