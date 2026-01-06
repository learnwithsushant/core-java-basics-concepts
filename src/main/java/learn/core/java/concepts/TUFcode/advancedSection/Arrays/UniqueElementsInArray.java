package learn.core.java.concepts.TUFcode.advancedSection.Arrays;

public class UniqueElementsInArray {
    public static void main(String[] args) {
        int[] nums = {0,2,4,4,5,7,7,8,9,9};

        int i = 0;

        for(int j = 1;j< nums.length;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }

        System.out.println("Unique elemnts in array :"+i+1);
    }
}
