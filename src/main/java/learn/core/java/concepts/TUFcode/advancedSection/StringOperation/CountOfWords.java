package learn.core.java.concepts.TUFcode.advancedSection.StringOperation;


import java.util.Arrays;

public class CountOfWords {

    public static void main(String[] args) {

        System.out.println(" Lenght of string: "+countWords(" No of Words are "));

    }

    public static int countWords(String s) {
        // Your code goes here
        if(s.equals(" ") || s.length()==0 || s==null)
            return 0;

        long wordCount = Arrays.stream(s.trim().split("\\s+"))
                .filter(word -> !word.isEmpty())
                .count();

        return (int) wordCount;





    }
}
