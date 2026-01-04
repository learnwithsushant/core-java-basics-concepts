package learn.core.java.concepts.TUFcode.advancedSection.Arrays;

import java.util.Arrays;

public class MoreZeroToEnd {
    public static void main(String[] args) {


        int [] nums = {1,0,2,3,4,0,0,0,7,8,9};

        int j = -1;

        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }

        if(j!=nums.length){

            for(int i = j+1;i<nums.length;i++){

                if(nums[i]!=0){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]= temp;
                    j++;
                }

            }

        }



        Arrays.stream(nums).forEach(System.out::print);
    }
}
