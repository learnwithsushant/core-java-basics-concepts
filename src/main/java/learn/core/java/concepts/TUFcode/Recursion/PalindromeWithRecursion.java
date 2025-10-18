package learn.core.java.concepts.TUFcode.Recursion;

import java.util.List;

public class PalindromeWithRecursion {
    static StringBuilder reverseString ;
    public static void main(String[] args) {

        String normalStr = "aeiou";

        reverseString = new StringBuilder(normalStr);

        reverseString(0,normalStr.length()-1,reverseString);

        System.out.println("Check for boolean "+reverseString.toString().equals(normalStr));

    }

    private static void reverseString(int start, int end, StringBuilder builder){
        // Base case
        if (start >= end) return;

        // Swap characters at left and right positions
        char temp = builder.charAt(start);
        builder.setCharAt(start,builder.charAt(end));
        builder.setCharAt(end,temp);


        // Recursive call with updated indices
        reverseString(start + 1, end - 1,builder);

    }
}
