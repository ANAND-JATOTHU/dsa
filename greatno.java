public class greatno {
    public static void main(String[] args) {
        int arr[] = {-10,-1,-2, -30, 50, 50, 50};
    //     int n=arr.length;
    //     Arrays.sort(arr);
    //     System.out.println("The greatest number is: " + arr[n-1]);
    
    // int max = arr[0];
    // or
    int max = Integer.MIN_VALUE;

for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}

System.out.println(max);
    }
}
