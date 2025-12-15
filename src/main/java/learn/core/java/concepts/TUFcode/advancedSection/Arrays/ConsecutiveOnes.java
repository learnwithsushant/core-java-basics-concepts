package learn.core.java.concepts.TUFcode.advancedSection.Arrays;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        int num[] = {1, 1, 0, 0, 1, 1, 1, 0};

            int count = 0,longest = 0;

            for(int i: num){
                if(i==1){
                    ++count;
                    if(count>longest)
                        longest=count;

                }else
                    count =0;

            }

        System.out.println("Consecutive no. of 1's :: "+longest);

    }

}
