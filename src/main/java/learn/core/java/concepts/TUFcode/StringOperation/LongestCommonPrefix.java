package learn.core.java.concepts.TUFcode.StringOperation;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String [] arr = {"test","test","test" };
        System.out.println(hasLongestCommonprefix(arr));
    }

    private static String hasLongestCommonprefix(String[] arr) {

        Arrays.sort(arr);
        StringBuilder prefix = new StringBuilder();

        if(arr.length == 1)
            return arr[0];
        else {
            char [] first = arr[0].toCharArray();
            char [] last = arr[arr.length-1].toCharArray();

            int index = first.length<last.length ? first.length : last.length;

            for(int i = 0; i< index ; i++){
                if(first[i]!=last[i])
                    break;
                prefix.append(first[i]);
            }

        }





            return prefix.toString();
    }
}
