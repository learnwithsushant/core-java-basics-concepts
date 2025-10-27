package learn.core.java.concepts.TUFcode.advancedSection.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 4, 1, 1,2,0};

        Arrays.stream(bubbleSort(nums)).forEach(System.out::println);

    }

    private static int[] bubbleSort(int[] nums){

            int size = nums.length;
            for(int i =size-1;i>=0;i--){
                boolean isSorted = false;
                for(int j = 0;j<=i-1;j++){

                    if(nums[j+1]<nums[j]){
                        int temp = nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                        isSorted=true;
                    }
                }
                if(!isSorted){
                    break;
                }
            }
            return nums;



    }
}
