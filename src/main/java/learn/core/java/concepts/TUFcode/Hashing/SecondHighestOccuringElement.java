package learn.core.java.concepts.TUFcode.Hashing;

public class SecondHighestOccuringElement {
    public static void main(String[] args) {

        int[] nums = {100, 200, 100, 200, 100};

        int maxIndex = 0;


        for (int i : nums) {
            maxIndex = Math.max(maxIndex, i);
        }

        int hash[] = new int[maxIndex + 1];

        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }

        int maxHFC = 0, hFE = -1, maxsHFC= 0, shFE = -1;

       for(int i : nums){
            int count = hash[i];

            String temp = "| i: "+ i+ " | count: "+count + " | hash["+i+"]: " + hash[i]+ " |";

            if(count>maxHFC){
                maxsHFC=maxHFC;
                maxHFC=count;
                shFE = hFE;
                hFE = i;
            } else if (count==maxHFC&&i<hFE) {
                hFE = i;
            } else if (count == maxsHFC && i < shFE) {
                shFE = i;

            } else if (count<maxHFC && count> maxsHFC) {
                maxsHFC = count;
                shFE = i;

            }


        }

        System.out.println("Second Hightest Frequency = " + shFE);
    }
}
