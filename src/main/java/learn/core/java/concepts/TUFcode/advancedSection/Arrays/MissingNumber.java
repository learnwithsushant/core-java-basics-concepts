package learn.core.java.concepts.TUFcode.advancedSection.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 1, 4};

        int size = nums.length;

        int sumOfNNumbers = (size*(size+1))/2;

        int sumOfElement = 0;

        for(int i : nums)
            sumOfElement+=i;

        System.out.println("Missing number: "+(sumOfNNumbers-sumOfElement));



    }
}
