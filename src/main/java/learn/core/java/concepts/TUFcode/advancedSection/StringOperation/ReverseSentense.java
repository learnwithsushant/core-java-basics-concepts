package learn.core.java.concepts.TUFcode.advancedSection.StringOperation;

public class ReverseSentense {

    public static void main(String[] args) {
        String s= "I   have the     fastest      vector";

        System.out.println(reverseIt(s));

    }

    private static String reverseIt(String str){
        String[] postSplit = str.split("\\s+");

        if(postSplit.length==1){
            return postSplit[0].toString();
        }

        int start = 0, end = postSplit.length - 1;

        while(start<=end){

            String temp = postSplit[start];
            postSplit[start] = postSplit[end];
            postSplit[end] = temp;

            start+=1;
            end-=1;
        }

        String packStr = "";
        for(String temp: postSplit){

            packStr+=temp+" ";
        }

        return packStr;
    }
}
