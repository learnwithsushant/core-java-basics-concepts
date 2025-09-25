package learn.core.java.concepts.TUFcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BasicArray {
    public static void main(String[] args) {
        sumOfArrayElements();
        sumOfArrayElementsUsingStreams();
    }

    private static void sumOfArrayElements(){
        int arr[] = {1, 2, 3, 4, 5},sum =0;

        for(int j : arr){
            sum+=j;
        }

        System.out.println(sum);
    }

    private static void sumOfArrayElementsUsingStreams(){
        int[] arr = {10, 20, 30, 40, 50};

        int sum = IntStream.range(0, arr.length)   // stream of indices 0..len-1
                .filter(i -> i % 2 != 0) // keep only odd indices
                .map(i -> arr[i])        // map index -> value
                .sum();                  // sum them

        System.out.println("Sum of odd index elements = " + sum);
    }
}
