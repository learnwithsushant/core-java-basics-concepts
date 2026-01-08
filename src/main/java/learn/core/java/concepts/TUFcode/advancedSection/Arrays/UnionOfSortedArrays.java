package learn.core.java.concepts.TUFcode.advancedSection.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOfSortedArrays {

    public static void main(String[] args) {
        int[] num1 = {3, 4, 6, 7, 9, }, num2 = {1, 5, 7, 8, 8};

        Set union= new HashSet<Integer>();

        for(int i: num1)
            union.add(i);

        for(int i: num2)
            union.add(i);

        int[] intArray = union.stream().mapToInt(i -> (int) i).toArray();

        Arrays.stream(intArray).forEach(System.out::print);
    }
}
