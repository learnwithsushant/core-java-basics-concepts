package learn.core.java.concepts.practicecollections.linkedin.learning;

import java.util.*;
import java.util.stream.Collectors;

public class TrickyCollectionProblems {
    public static void main(String[] args) {

   //     System.out.println("Count of words statement > "+countOfWords("One Two One two one two", "one"));

   //     reverseOrderList(Arrays.asList(2,3,5,6,7,8,9,10));

   //     System.out.println("Average >"+calculateMean(Arrays.asList(-1,23,11,34,4,21)));

   //     System.out.println("Words less than 5 char >"+returnWordsLessThan5char("I am a hard worker coder and developed my coding skills with lots of efforts"));

  //      System.out.println("Index with required sum> "+ returnIndices(Arrays.asList(0,1,5,3,3,2,4),6));

       printPattern2(4);

        removeStr();

    }

    public static int countOfWords(String statement, String word){
        String clearUpString = statement.replaceAll("\\.","");

        return (int) Arrays.stream(clearUpString.split(" ")).filter(w->w.equalsIgnoreCase(word)).count();
    }

    public static void reverseOrderList(List<Integer> list){
        Collections.reverse(list);
        System.out.println(""+list);

    }

    public static double calculateMean(List<Integer> list){

       return list.stream().reduce(0,Integer::sum) /(double) list.size();

    }

    public static List<String> returnWordsLessThan5char(String sentence){

        String formatSentence = sentence.replaceAll("\\, \\.","");

        return Arrays.stream(formatSentence.split("\\s+")).filter(s->s.length()<5).collect(Collectors.toList());

    }

    public static Set<Integer> returnIndices(List<Integer> list,int sum){

        Set<Integer> indexes = new HashSet<>();

        Map<Integer,Integer> sourceMap = new HashMap<>();

        for (int i = 0; i< list.size();i++){
            sourceMap.put(list.get(i),i);
        }

        for (int i = 0; i< list.size();i++){
            int targetIndex = sum-list.get(i);
            if(sourceMap.containsKey(targetIndex) && sourceMap.get(targetIndex)!=i){
                indexes.add(i);
                indexes.add(sourceMap.get(targetIndex));
            }
        }
        return indexes;
    }

    public static void printPattern1(int n){

        for(int i = 1 ; i<=n;i++){
            for(int j=n;j>=1;j--){
                if(j<=i){
                    System.out.print("*");
                }else System.out.print(" ");

            }
            for(int k=1;k<n;k++){
                if(k<i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    public static void printPattern2(int n){

        for(int i=0;i<n;i++){
           for(int j=i;j>0;j--){
               System.out.print(" ");
           }
           for(int k = 0;k<((2*n-1)-(2*i));k++){
               System.out.print("*");
           }
            System.out.println();
        }

    }

    public static void removeStr(){
        List<String> rawString = Arrays.asList("somethingabc","noabc","qwabcvd","abcdefg");

        rawString.stream().filter(e->e.endsWith("abc")).forEach(System.out::println);
    }
}
