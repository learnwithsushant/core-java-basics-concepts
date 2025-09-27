package learn.core.java.concepts.TUFcode.basicaArrays;

public class CheckForSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 7};

        boolean isSorted = false;

        if(arr.length == 1)
            System.out.println(true);
        else if (arr.length == 2 && arr[0]== arr[1]) {
            System.out.println(true);
        }else
            for(int i=1;i<arr.length;i++){
                if(arr[i]>arr[i-1])
                    isSorted = true;
                else if((arr[i]==arr[i-1])){
                    isSorted = true;
                }
            }

        System.out.println(isSorted);

    }
}
