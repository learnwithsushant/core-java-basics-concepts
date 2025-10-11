package learn.core.java.concepts.TUFcode.Hashing;

public class SecondHighestOccuringElement {
    public static void main(String[] args) {

        int[] nums = {4, 4, 5, 5, 6, 7};

        int maxIndex = 0;


        for (int i : nums) {
            maxIndex = Math.max(maxIndex, i);
        }

        int hash[] = new int[maxIndex + 1];

        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }

        int maxHFC = 0, hFE = -1, maxsHFC= 0, shFE = -1;

       /* for (int i = 0; i < hash.length; i++) {

            int count = hash[i];

           // String temp = "| i: "+ i+ " | count: "+count + " | nums["+i+"]: " + nums[i]+ " |";

            if (count == 0)
                continue;

            if (count > maxHFC) {
                maxsHF = maxHFC;
                shFE = hFE;
                maxHFC = count;
                hFE = i;
            } else if (count == maxHFC && i < hFE) {
                hFE = i;
                ;
            } else if (count == maxsHF && i < shFE) {
                shFE = i;

            } else if (count > maxsHF) {
                maxsHF = count;
                shFE = i;

            }
        }*/

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
            } else if (count == maxHFC && i < shFE) {
                shFE = i;

            } else if (count<maxHFC && count> maxsHFC) {
                maxsHFC = count;
                shFE = i;

            }


        }

        System.out.println("Second Hightest Frequency = " + shFE);
    }
}
