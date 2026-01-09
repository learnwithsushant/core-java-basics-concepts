package learn.core.java.concepts.TUFcode.advancedSection.Arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntersectionOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 9};
        int[] arr2 = {2, 3, 5, 6, 8, 9};

        // 1. Convert the second array to a Set for O(1) lookup time
        Set<Integer> set = Arrays.stream(arr2).boxed().collect(Collectors.toSet());

        // 2. Filter arr1 elements that exist in the set
        int[] intersection = Arrays.stream(arr1)
                .filter(set::contains) // Lambda/Method reference
                .distinct()            // Handle duplicates if necessary
                .toArray();

        System.out.println(Arrays.toString(intersection));
    }
}
