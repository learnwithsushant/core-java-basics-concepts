package learn.core.java.concepts.TUFcode.StringOperation;

import java.util.HashMap;
import java.util.Map;

public class isometricStringTest {

    public static void main(String[] args) {
        String s = "paper", t = "title";

        System.out.println(checkForIsometricString(s,t));
    }

    private static boolean checkForIsometricString(String s, String t) {
        if(s.length()!=t.length())
            return false;

        else{

            Map<Character, Character> mappedCharacter = new HashMap<>();

            for(int i = 0;i<s.length();i++){
                 char key = s.charAt(i);
                 char value = t.charAt(i);

                 if(!mappedCharacter.containsKey(key)){
                     if(!mappedCharacter.containsValue(value)){
                         mappedCharacter.put(key,value);
                     }else
                         return false;
                 }else {
                     if(mappedCharacter.get(key)!=value)
                         return false;
                 }

            }

        }
            return true;
    }
}
