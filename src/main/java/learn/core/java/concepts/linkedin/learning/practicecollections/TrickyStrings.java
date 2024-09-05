package learn.core.java.concepts.linkedin.learning.practicecollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TrickyStrings {
    public static void main(String[] args) {

   //     System.out.println("Count of words statement > "+countOfWords("One Two One two one two", "one"));

        reverseOrderList(Arrays.asList(2,3,5,6,7,8,9,10));
    }

    public static int countOfWords(String statement, String word){
        String clearUpString = statement.replaceAll("\\.","");

        return (int) Arrays.stream(clearUpString.split(" ")).filter(w->w.equalsIgnoreCase(word)).count();
    }

    public static void reverseOrderList(List<Integer> list){
        Collections.reverse(list);
        System.out.println(""+list);

    }
}
