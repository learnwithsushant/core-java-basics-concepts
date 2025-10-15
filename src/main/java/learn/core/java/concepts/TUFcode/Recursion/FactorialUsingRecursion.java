package learn.core.java.concepts.TUFcode.Recursion;

public class FactorialUsingRecursion {
    public static void main(String[] args) {

        System.out.println(getFactorial(5));

    }

    private static int getFactorial(int n) {

        System.out.println("Value of n = "+n);
        if(n==1)
            return 1;
        else
            return n*getFactorial(n-1);
    }
}
