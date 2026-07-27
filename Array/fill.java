import java.util.*;
class fill {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Arrays.fill(arr, 1);
        for (int i=0;i<10;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
