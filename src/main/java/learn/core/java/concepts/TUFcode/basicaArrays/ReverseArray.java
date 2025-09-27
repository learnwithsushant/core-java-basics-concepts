package learn.core.java.concepts.TUFcode.basicaArrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int length = arr.length, temp = 0 ;
        int left = 0, right = length -1;

        while (left<right){

            temp = arr[left];
            arr[left]=arr[right];
            arr[right] = temp;

            ++left;
            --right;
        }

        for(int i : arr){
            System.out.print(i);
        }

    }

}
