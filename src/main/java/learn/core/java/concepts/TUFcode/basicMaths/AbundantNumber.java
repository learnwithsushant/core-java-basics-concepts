package learn.core.java.concepts.TUFcode.basicMaths;

public class AbundantNumber {
    public static void main(String[] args) {
        int num = 12;

        boolean isAbundant = isAbundantNumber(num);

        System.out.println("is it a abundant number: "+isAbundant);
    }
    static boolean isAbundantNumber(int num){

        int sum = 0;

        for(int i = 1; i<num;i++){
            if(num%i==0){
                sum+=i;
            }

        }
        if(sum>num){
           return true;
        }else
            return false;

    }
}
