import java.util.*;
public class l977 {
    public static void main(String[] args) {
        // In o(n log n) time complexity
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[5];
        int n = arr1.length;
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i] * arr1[i];
        }
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // In O(n) time complexity

        // int n = nums.length;
        // int[] res = new int[n];
        
        // int left = 0;
        // int right = n - 1;
        // int index = n - 1; 
        
        // while (left <= right) {
        //     int leftSquare = nums[left] * nums[left];
        //     int rightSquare = nums[right] * nums[right];
            
        //     if (leftSquare > rightSquare) {
        //         res[index] = leftSquare;
        //         left++;
        //     } else {
        //         res[index] = rightSquare;
        //         right--;
        //     }
        //     index--; 
        // }
        
        // return res;

    

}}
