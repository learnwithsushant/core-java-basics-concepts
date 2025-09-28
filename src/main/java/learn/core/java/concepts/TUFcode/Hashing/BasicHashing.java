package learn.core.java.concepts.TUFcode.Hashing;

import java.util.HashMap;
import java.util.Map;

public class BasicHashing {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10, 40, 20, 20};

        int result = findHighestOccurringElement(arr);
        System.out.println("Highest Occurring Element: " + result);
    }

    private static int findHighestOccurringElement(int[] arr) {
        // Step 1: Count frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
        }

        // Step 2: Find element with maximum frequency
        int maxCount = 0;
        int maxElement = -1;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        return maxElement;
    }
}
