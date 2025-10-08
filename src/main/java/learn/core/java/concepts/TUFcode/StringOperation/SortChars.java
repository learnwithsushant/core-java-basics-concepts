package learn.core.java.concepts.TUFcode.StringOperation;

import java.util.*;

public class SortChars {
    public static void main(String[] args) {
        /*String  s = "bbccddaaa";

        Map<Character,Integer> freQArray = new LinkedHashMap<>();

        for(char c : s.toCharArray()){
            freQArray.put(c,freQArray.getOrDefault(c,0)+1);
        }

        System.out.println(freQArray.toString());
*/

        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 5);
        map.put('b', 2);
        map.put('c', 8);
        map.put('d', 1);

        // Convert entry set to list
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort list by value descending
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> e1, Map.Entry<Character, Integer> e2) {
                return e2.getValue().compareTo(e1.getValue()); // descending
            }
        });

        // Put into LinkedHashMap to maintain order
        Map<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Sorted Map (Descending): " + sortedMap);
    }

    }
