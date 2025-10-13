package learn.core.java.concepts.TUFcode.Hashing;

public class SumOfHighestAndLowestFrequencies {

    public static void main(String[] args) {

        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
        int highestFreq = getHighestFrequency(nums);

        System.out.println("Max"+highestFreq);

        int low = getLowestFrequency(nums);

        System.out.println("Low"+low);
    }

    private static int getHighestFrequency(int[] nums) {

        int hash[] = computeFrequency(nums);

        int maxFreq = 0, mostfrequentelement = -1;

        for (int i = 0; i < hash.length; i++) {

            if (hash[i] > maxFreq) {
                maxFreq = hash[i];
                mostfrequentelement = i;
            }
        }

       return maxFreq;
    }

    private static int[] computeFrequency(int[] nums){
        int maxIndex = 0;


        for (int i : nums) {
            maxIndex = Math.max(maxIndex, i);
        }

        int hash[] = new int[maxIndex + 1];

        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }
        for(int j : hash){
            System.out.print(j);
        }

        return hash;
    }

    private static int getLowestFrequency(int[] nums) {

        int hash[] = computeFrequency(nums);

        int minFreq = nums.length, mostfrequentelement = -1;

        for (int i = 0; i < hash.length; i++) {

            if (hash[i] !=0 && hash[i] < minFreq) {
                minFreq = hash[i];
                mostfrequentelement = i;
            }
        }

        return minFreq;
    }
}
