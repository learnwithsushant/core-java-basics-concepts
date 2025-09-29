package learn.core.java.concepts.TUFcode.Hashing;

import java.util.HashMap;
import java.util.Map;

public class BasicHashing {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10, 40, 20, 20};

        /*int result = findHighestOccurringElementUsingMap(arr);
        System.out.println("Highest Occurring Element: " + result);*/

        findHighestOccurringElementWithoutUsingMap(arr);
        
    }

    private static int findHighestOccurringElementWithoutUsingMap(int[] arr) {

        int maxSize = computeMaxNumer(arr);

        System.out.println("Max no. is >>>>>>>>"+maxSize);

        int hash[] = new int[maxSize+1];

        for(int j=0;j<hash.length;j++){
            hash[j]=0;
        }

        for(int i = 0; i<arr.length;i++){
            hash[arr[i]]++;
        }

        return 0;
    }

    private static int computeMaxNumer(int[] arr) {

        int max = 0;

        for(int i : arr){

            if(max < i){
                max = i;
            }
        }
        return max;
    }

    private static int findHighestOccurringElementUsingMap(int[] arr) {
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
