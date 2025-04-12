package learn.core.java.concepts.TUFcode.beginnercode;

public class PatternCoding {

    public static void main(String[] args) {
        //pattern3(5);
       // pattern4(5);

        //   pattern8(5);
        //   pattern9(2);
        //   pattern10(5);
        //  pattern11(6);
        //  pattern12(5);
        //pattern13(4);
      //  pattern14(5);
     //   pattern15(5);
      //  pattern16(5);
      //  pattern17(5);
        pattern18(5);

    }

    private static void pattern18(int n) {
        char alpha = (char) ('A' + n -1);
  //      System.out.println(alpha);

        for(int i = 0;i<n;i++){

            char ch = (char)(alpha - i);

            for(;ch<=alpha;ch++){

                System.out.print(ch + " ");

            }
            System.out.println();

        }

       /* for(int i = 0;i<n;i++){

            for(int j = 0 ; j<i; j++){
                aplha--;
            }

            for(int j = 0 ; j<=i; j++){
                System.out.print(aplha++ + " ");
            }
            System.out.println("");
        }*/
    }

    private static void pattern17(int n) {




        for(int i = 1 ; i<=n;i++){
            char alph1 = 'A';
            for(int j=n;j>=1;j--){

                if(j<=i){
                    System.out.print(alph1++);
                }else System.out.print(" ");

            }
            --alph1;
            for(int k=1;k<n;k++){

                if(k<i){
                    System.out.print(--alph1);
                }
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {

        char printAlph = 'A';

        for(int i = 0;i<n;i++){

            for(int j = 0 ; j<=i; j++){
                System.out.print(printAlph);

            }
            printAlph++;
            System.out.println("");


        }

    }
    private static void pattern14(int n) {

        char alph = 'A';

        for(int i = 0;i<n;i++){
            char printAlph = alph;
            for(int j = 0 ; j<=i; j++){
                System.out.print(printAlph);
                printAlph++;
            }
            System.out.println("");


        }
    }

    public static void pattern15(int n) {
        char alph = 'A';
        for(int i=n;i>0;i--){
            char printAlph = alph;
            for(int j=i;j>0;j--){
                System.out.print(printAlph);
                printAlph++;
            }
            System.out.println("");
        }

    }
    private static void pattern13(int n) {

        int counter = 1;

        for(int i = 0;i<n;i++){
            for(int j = 0 ; j<=i; j++){
                System.out.print(counter++);
            }

            System.out.println(" ");
        }


    }

    private static void pattern4(int n) {

        for(int i = 1;i<=n;i++){
            for(int j = 1 ; j<=i; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    private static void pattern3(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }


    private static void pattern12(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) System.out.print(j);
                else System.out.print(" ");
            }
            for (int j = n; j >= 1; j--) {
                if (j <= i) System.out.print(j);
                else System.out.print(" ");
            }

            System.out.println("");
        }
    }

    private static void pattern11(int n) {
        for (int i = 0; i < n; i++) {
            int start = 0;
            if (i % 2 == 0) {
                start = 1;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println("");
        }
    }

    private static void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    private static void pattern8(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < ((2 * n - 1) - (2 * i)); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern9(int rownum) {

        for (int r = 0; r < rownum; r++) {
            for (int p1 = 1; p1 < rownum - r; p1++) {
                System.out.print(" ");
            }
            for (int p2 = 1; p2 <= r + (r + 1); p2++) {
                System.out.print("*");
            }

            /*if(r==rownum-1){

            }else*/
            System.out.println();

        }
        for (int r = 1; r <= rownum; r++) {
            for (int p1 = 1; p1 < r; p1++) {
                System.out.print(" ");

            }
            for (int p2 = ((rownum * 2) - r); p2 >= r; p2--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
