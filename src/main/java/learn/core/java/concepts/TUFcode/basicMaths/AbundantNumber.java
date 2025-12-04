package learn.core.java.concepts.TUFcode.basicMaths;

public class AbundantNumber {
    public static void main(String[] args) {
        int num = 12, sum = 0;

        for(int i = 1; i<num;i++){
            if(num%i==0){
                sum+=i;
            }

        }
        if(sum>num){
            System.out.println("Is Abundant");
        }else
            System.out.println("Not Abundant");
    }
}
