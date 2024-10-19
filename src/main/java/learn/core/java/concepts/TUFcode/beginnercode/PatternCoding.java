package learn.core.java.concepts.TUFcode.beginnercode;

public class PatternCoding {

    public static void main(String[] args) {

        pattern8(5);

     //   pattern9(2);
    }

    private static void pattern8(int n) {

        for(int i=0;i<n;i++){
            for(int j=i;j>0;j--){
                System.out.print(" ");
            }
            for(int k = 0;k<((2*n-1)-(2*i));k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern9(int rownum) {

        /*for(int r=rownum;r>1;r--){
            for(int c=1;c<r;c++){
                System.out.print("+");
            }
            for(int p = 1;p>r-1;p--){
                System.out.print("*");
            }

            System.out.println();
        }*/

        for(int r=0;r<rownum;r++){
            for(int p1=1;p1<rownum-r;p1++){
                System.out.print(" ");
            }
            for(int p2 = 1;p2<=r+(r+1);p2++){
                System.out.print("*");
            }

            /*if(r==rownum-1){

            }else*/ System.out.println();

        }
        for(int r=1;r<=rownum;r++){
            for(int p1=1;p1<r;p1++){
                System.out.print(" ");

            }
            for(int p2 = ((rownum*2)-r);p2>=r;p2--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
