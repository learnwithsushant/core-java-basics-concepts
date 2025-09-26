package learn.core.java.concepts.TUFcode.basicaArrays;

public class CheckForSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        boolean isSorted = false;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1])
                isSorted = true;
            else
                System.out.println(false);
        }
        System.out.println(isSorted);
    }
}
