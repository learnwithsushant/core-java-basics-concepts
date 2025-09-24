package learn.core.java.concepts.TUFcode.basicMaths;

import java.util.Arrays;

public class DivisorOfNumber {

    public static void main(String[] args) {

        int n =  15;

        String divisor = "";

        for(int i = 1; i<=n;i++){
            if(n%i==0){
                divisor+=i+" ";
            }

        }



        int divisorArr[] = Arrays.stream(divisor.trim().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i : divisorArr){
            System.out.println(i);
        }

    }
}
