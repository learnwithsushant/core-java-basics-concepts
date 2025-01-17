package learn.core.java.concepts.practicecollections.linkedin.learning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombiningTwoDataStructures {
    public static void main(String[] args) {

      //  demoCombiningTwoArrays();
        demoCombiningTwoLists();

    }

    private static void demoCombiningTwoLists() {

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7);

        // Combine lists using Streams, sort in descending order, and collect into a single list
        List<Integer> combinedList = Stream.concat(list1.stream(), list2.stream())
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());

        // Print the combined and sorted list
        System.out.println(combinedList);

    }

    private static void demoCombiningTwoArrays() {


        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {4, 5, 6, 7};
        // Combine arrays using Streams and lambda expressions
        Integer[] combinedArray = Stream.concat(Arrays.stream(array1), Arrays.stream(array2)) .toArray(Integer[]::new);
        // Print the combined array
        System.out.println(Arrays.toString(combinedArray));
    }


}
