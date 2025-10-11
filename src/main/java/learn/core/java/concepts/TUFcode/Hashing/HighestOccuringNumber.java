package learn.core.java.concepts.TUFcode.Hashing;

public class HighestOccuringNumber {
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 3, 3};

        int maxIndex = 0;


        for(int i : nums){
            maxIndex = Math.max(maxIndex,i);
        }

        int hash[] = new int[maxIndex+1];

        for(int i=0; i< nums.length;i++){
            hash[nums[i]]++;
        }

        int maxFreq = 0, mostfrequentelement = -1;

        for(int i=0; i<hash.length;i++){

            if(hash[i]>maxFreq){
                maxFreq=hash[i];
                mostfrequentelement=i;
            }
        }

        System.out.println("Hightest Frequency = "+ mostfrequentelement);
    }
}
