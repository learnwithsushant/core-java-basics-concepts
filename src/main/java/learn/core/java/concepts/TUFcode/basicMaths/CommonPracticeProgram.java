package learn.core.java.concepts.TUFcode.basicMaths;

public class CommonPracticeProgram {
    public static void main(String[] args) {
       // System.out.println("Factorial of given num >"+ calTheFactorial(5));
       // System.out.println("Check if armstrong >>>> "+isAmstrongNumber(370));
        System.out.println("Check perfect number >>>>>>"+checkPerfectNumber(28));
    }

    private static int calTheFactorial(int n) {
        int factorial = 1;

        if(n==0)
            return 0;

        for(int i = 1 ; i<=n;i++){
            factorial*=i;
        }
        return factorial;
    }

    private static boolean isAmstrongNumber(int n) {
        int temp = n,armStrong =0 ,numberOfDigits=0;

        // Count the number of digits
        int tempNum = n;
        while (tempNum != 0) {
            tempNum /= 10;
            numberOfDigits++;
        }

        while(temp>0){
            int lastDigit = temp%10;
            armStrong+=Math.pow(lastDigit,numberOfDigits);

            temp = temp/10;
        }
        System.out.println("armStrong value"+ armStrong);
        return armStrong == n;
    }

    private static boolean checkPerfectNumber(int n) {

        int sum = 0, temp = n;

        for (int i = 1; i < n - 1; i++) {

            if (n % i == 0) {
                sum += i;
            }

        }

        return sum == n;
    }

}
