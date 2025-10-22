package learn.core.java.concepts.TUFcode.Recursion;

public class Fibonachi {

    public static void main(String[] args) {
        System.out.println(" Fibonachi of 6 is"+ calculateFibonachi(6));
    }

    private static int calculateFibonachi(int num){

        // Base cases: F(0) = 0, F(1) = 1
        if (num == 0) return 0;
        if (num == 1) return 1;
        // Recursive case: F(n) = F(n-1) + F(n-2) // not an optimal solution
        return calculateFibonachi(num - 1) + calculateFibonachi(num - 2);

    }
}
