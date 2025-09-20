package learn.core.java.concepts.TUFcode.basicMaths;

public class LargestDigit {
    public static void main(String[] args) {
        System.out.println("Largest Digit >>>"+ getLargestDigit(12345));
    }

    private static int getLargestDigit(int n) {
        int largestDigit = 0;

        while(n>0){
            int lastDigit = n%10;
            largestDigit = lastDigit > largestDigit ? lastDigit : largestDigit;
            n = n/10;
        }
        return largestDigit;
    }
}
