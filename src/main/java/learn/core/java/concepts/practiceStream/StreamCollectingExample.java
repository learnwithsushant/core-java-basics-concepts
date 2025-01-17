package learn.core.java.concepts.practiceStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectingExample {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "streams");
        // Using Streams to group words by their length
        Map<Integer, List<String>> groupedByLength = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);
        // Output: {5=[hello, world], 4=[java], 7=[streams]}
    }

}
