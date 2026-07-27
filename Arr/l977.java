import java.util.*;
public class l977 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[5];
        int n = arr1.length;
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i] * arr1[i];
        }
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    

}}
