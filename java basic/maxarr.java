import java.util.*;
public class maxarr {
    public static void main (String[] args){
	System.out.println("enter a size of array");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for (int i = 0; i < n; i++) {
        System.out.println("enter a element of array");
        arr[i] = sc.nextInt();
	}
	int max = arr[0];
    for (int i = 1; i < n; i++) {
        if (arr[i] > max) {
            if (arr[i] > max) {
            max = arr[i];
        }
    }
}
    sc.close();
    System.out.println("the maximum  second element in the array is: " + max);

}
}