package learn.core.java.concepts.TUFcode.advancedSection.Sorting;

import java.util.Arrays;

public class MergeSort {

    // Not working

    public static void main(String[] args) {

        int[] nums = {8, 9, 6, 5, 3, 7, 1, 8, 4, 5};

        divide(nums,0,nums.length-1);

    }

    public static void jointAndSort(int[] nums, int start,int mid, int end){

        int merge[] = new int[end-start+1];
        int left=start;
        int right = mid+1;
        int index = 0;

        while(left <= mid && right<=end){
            if(nums[left]<=nums[right]){
                merge[index++]=nums[left++];
            }else {
                merge[index++]=nums[right++];
            }
        }

        while(left<=mid){
            merge[index++]=nums[left++];
        }

        while(right<=end){
            merge[index++]=nums[right++];
        }

        for (int i = 0, j = 0;i< merge.length;i++){
            nums[j]=merge[i];
        }

        Arrays.stream(nums).forEach(System.out::println);

    }

    public static void divide(int[] nums, int start, int end){
        if(start>=end)
            return;

        int mid = start + (end-start)/2;
        divide(nums,start,mid);
        divide(nums,mid+1, end);
        jointAndSort(nums,start,mid,end);
    }
}
