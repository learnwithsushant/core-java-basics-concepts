package learn.core.java.concepts.TUFcode.advancedSection.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3,8,9,5,4,1,7,9};

        nums = selectionSort(nums);

        Arrays.stream(nums).forEach(System.out::println);
    }
    
    private static int[] selectionSort(int[] nums){
        int size = nums.length;
        for(int i = 0; i<=size-2;i++){
            int min = i;
            for(int j = i+1;j<=size-1;j++){
                
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min]=temp;
        }

        return nums;
    }


}
