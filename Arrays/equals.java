
import java.lang.reflect.Array;

public class equals {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        // Using Arrays.equals() method to compare the two arrays
        // if (arr1==arr2) {
        //     System.out.println("Arrays are equal.");
        // }
        // else {
        //     System.out.println("Arrays are not equal.");
        // }


        // if (arr1.length != arr2.length) {
        //     System.out.println("Arrays are not equal.");
        //     return;
        // }

        if (Arrrays.equals(arr1, arr2)) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
        // or 
        boolean isEqual = java.util.Arrays.equals(arr1, arr2);
        System.out.println("Are the two arrays equal? " + isEqual);
    }
}
