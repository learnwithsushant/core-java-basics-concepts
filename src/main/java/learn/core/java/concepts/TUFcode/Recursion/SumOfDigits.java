package learn.core.java.concepts.TUFcode.Recursion;

public class SumOfDigits {

    public static void main(String[] args) {


        System.out.println("Sum of Digits: "+sumOfDigits(3214));

    }

    private static int sumOfDigits(int num){
        if(num<10)
            return num;
        int sum = 0;

        while(num !=0){

            sum = sum + (num%10);
            num = num/10;
        }

        return sumOfDigits(sum);
    }
}
