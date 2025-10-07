package learn.core.java.concepts.TUFcode.StringOperation;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "abcde", goal = "deabc";

        System.out.println(checkanagram(s,goal));
    }

    private static boolean checkanagram(String s, String goal){

        char [] s1 = s.toCharArray();
        char [] s2 = goal.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        if(s.length()!=goal.length()){
            return false;
        } else if (new String(s1).equals(new String(s2))) {
            return true;
        }
return false;
    }
}
