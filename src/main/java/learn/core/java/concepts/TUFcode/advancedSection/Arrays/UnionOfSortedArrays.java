package learn.core.java.concepts.TUFcode.advancedSection.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class UnionOfSortedArrays {

    public static void main(String[] args) {
        int[] num1 = {3, 4, 6, 7, 9, }, num2 = {1, 5, 7, 8, 8};

       int[] unionArray = IntStream.concat(Arrays.stream(num1), Arrays.stream(num2))
                .distinct() // Removes duplicates
                .sorted()   // Ensures result is sorted
                .toArray();

        Arrays.stream(unionArray).forEach(System.out::print);
    }
}
