package learn.core.java.concepts.TUFcode.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckForSortedArrayUsingRecursion {


    /*public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 7};

        boolean isSorted = false;

        if(arr.length == 1)
            System.out.println(true);
        else if (arr.length == 2 && arr[0]== arr[1]) {
            System.out.println(true);
        }else
            for(int i=1;i<arr.length;i++){
                if(arr[i]>arr[i-1])
                    isSorted = true;
                else if((arr[i]==arr[i-1])){
                    isSorted = true;
                }
            }

        System.out.println(isSorted);

    }*/

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 7};

        ArrayList<Integer> integerListB = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("is array Sorted "+isSortedArray(0,1,integerListB));

    }

    private static boolean isSortedArray(int start, int next, ArrayList<Integer> nums){
        if(nums.size() == 1)
            return true;
        else if (nums.size() == 2 && nums.get(0)>nums.get(1)) {
            return false;
        }else if((next==nums.size()-1)&&(nums.get(start)<nums.get(next))){
            return true;

        }else if((next<=nums.size()-1)&&(nums.get(start)>nums.get(next))){
            return false;
        }
            return isSortedArray(next,next+1,nums);
    }


}
