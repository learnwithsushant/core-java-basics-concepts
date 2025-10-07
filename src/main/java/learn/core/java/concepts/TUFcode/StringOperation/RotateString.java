package learn.core.java.concepts.TUFcode.StringOperation;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde", goal = "deabc";

        System.out.println(checkForRotateString(s,goal));


    }

    private static boolean checkForRotateString(String s, String goal) {
        StringBuilder builder = new StringBuilder(s);

      if(builder.length()!=goal.length()){
          return false;
      } else if (builder.equals(goal)) {
          return true;

      } else  {

          for(int  i =0;i< s.length();i++){

              String temp = String.valueOf(builder.charAt(0));
              builder.deleteCharAt(0);
              builder.append(temp);

              if(builder.toString().equalsIgnoreCase(goal))
                  return true;

          }
      }

      return false;

    }
}
