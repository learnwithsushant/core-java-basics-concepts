package learn.core.java.concepts.TUFcode.Recursion;

public class SumOfFirstNNumbers {

    static int sum = 0;
    public static void main(String[] args) {

        int n = 10;

        System.out.println("Recursive Name = "+sumOfNNumers(n));

    }

    private static int sumOfNNumers(int n) {

        System.out.println("Value of n = "+n);
        if(n==1)
            return 1;
        else
           return n+sumOfNNumers(n-1);
    }


}
