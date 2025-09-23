package learn.core.java.concepts.TUFcode.basicMaths;

public class GCDofTwoNumbers {
    public static void main(String[] args) {
        System.out.println("GCD of two numbers is by normal Way >>"+calculateGCDByNormalWay(8,24));

        System.out.println("GCD of two numbers is by reverse Way >>"+calculateGCDByReverseWay(15,90));


        System.out.println("GCD of two numbers is by Euclidean Algorithm >>"+calculateByEuclideanAlgorithm(88,12));
    }

    private static int calculateGCDByNormalWay(int n1,int n2){
        int largest = 1;
        for(int i = 2 ; i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                largest = i;
            }
        }
        return largest;
    }

    private static int calculateGCDByReverseWay(int n1,int n2){
        int largest = 1;
        for(int i = Math.min(n1,n2) ; i >= 1 ;i--){
            if(n1%i==0 && n2%i==0){
                return i;

            }
        }
        return largest;
    }

    private static int calculateByEuclideanAlgorithm(int n1, int n2){

        while(n1!=0 && n2!=0){
            if(n1>n2)
                n1 = n1%n2;
            else
                n2 = n2%n1;


        }

        if(n2==0)
            return n1;
        else
            return n2;
    }
}
