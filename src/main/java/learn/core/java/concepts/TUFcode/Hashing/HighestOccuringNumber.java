package learn.core.java.concepts.TUFcode.Hashing;

public class HighestOccuringNumber {
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 3, 3};

        int maxIndex = 0;


        for(int i : nums){
            maxIndex = Math.max(maxIndex,i);
        }

        int hash[] = new int[maxIndex+1];

        for(int i=0; i<maxIndex;i++){
            hash[nums[i]]++;
        }

        int maxCount = 0, elt = -1;

        for(int i=0; i<maxIndex;i++){
            if(hash[i]>maxCount){
                maxCount=hash[i];
                elt=i;
            }
        }

        System.out.println("Hightest Frequency = "+elt);
    }
}
