package learn.core.java.concepts.TUFcode.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseStringUsingRecursion {
    static List<Character> reverse = new ArrayList<>();
    public static void main(String[] args) {

        // ArrayList<Character> s
        Character[] charArray = {'h', 'e', 'l', 'l', 'o'};

        reverse = Arrays.asList(charArray);


            swapString(0,reverse.size(),reverse);
    }



    private static void swapString(int start,int end,List<Character> charList){
        // Base case
        if (start >= end) return;

        // Swap characters at left and right positions
        char temp = charList.get(start);
        charList.set(start, charList.get(end));
        charList.set(end, temp);

        // Recursive call with updated indices
        swapString(start + 1, end - 1,charList);

    }
}
