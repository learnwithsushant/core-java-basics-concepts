package learn.core.java.concepts.TUFcode.Recursion;

public class SumOfArraysElements {
    public static void main(String[] args) {
        int[] nums = {5, 8, 1};
        System.out.println("Sum of arrays = "+sumOfArrayElements(0,nums.length,nums));

    }

    private static int sumOfArrayElements(int index,int size,int[] nums){

        if(index >= size)
            return 0;
        else
            return nums[index] + sumOfArrayElements(++index,size,nums);


    }
}
