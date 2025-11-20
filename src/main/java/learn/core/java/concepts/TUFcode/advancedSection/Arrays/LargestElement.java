package learn.core.java.concepts.TUFcode.advancedSection.Arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class LargestElement {

    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 34, 89, 23, 67};

        // Using IntStream and lambda
        OptionalInt max = Arrays.stream(numbers)
                .max();  // internally uses a comparator-like lambda

        if (max.isPresent()) {
            System.out.println("Largest element: " + max.getAsInt());
        } else {
            System.out.println("Array is empty!");
        }
    }
}
