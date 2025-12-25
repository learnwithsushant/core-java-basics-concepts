package learn.core.java.concepts.TUFcode.advancedSection.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestStream {

    public static void main(String[] args) {

        int[] arr = {12, 45, 67, 23, 89, 67};

        int secondLargest = Arrays.stream(arr)
                .boxed()                                // convert int → Integer
                .distinct()                             // remove duplicates
                .sorted(Comparator.reverseOrder())       // sort descending
                .skip(1)                                 // skip largest to get the second largest
                .findFirst()                             // get next one!
                //.orElseThrow(() -> new RuntimeException("No second largest"));
                .orElse(-1);

        System.out.println("Second Largest: " + secondLargest);
    }
    }
