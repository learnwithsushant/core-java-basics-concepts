package learn.core.java.concepts.TUFcode.StringOperation;

public class Palindrome {
    public static void main(String[] args) {
        String s = "Aa", palindrome = "";



       /* for(int i = s.length()-1 ;i>=0;i--){
            palindrome+=s.charAt(i);
        }*/

         palindrome = new StringBuilder(s).reverse().toString();

        System.out.println("check string >> "+palindrome);

        if(s.contains(palindrome))
            System.out.println("True");
        else
            System.out.println("False");


    }
}
