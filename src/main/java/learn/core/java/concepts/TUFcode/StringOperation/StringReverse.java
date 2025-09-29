package learn.core.java.concepts.TUFcode.StringOperation;

import java.util.Arrays;
import java.util.List;

public class StringReverse {
    public static void main(String[] args) {


        List<Character> s = Arrays.asList('a','e','i','o','u','p');

        int leftIndex = 0, rightIndex = s.size()-1;

        while(leftIndex<rightIndex){

            char temp = s.get(rightIndex);
            s.set(rightIndex,s.get(leftIndex));
            s.set(leftIndex,temp);

            leftIndex++;
            rightIndex--;


        }

        System.out.println(s.toString());

    }
}
