import java.util.Scanner;
public class sum_sub_max_arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int k=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
        int sum=0;
        for (int j=i;j<arr.length;j++){
            sum+=arr[j];
            if (sum>k){
                k=sum;
            }
        }
        System.out.println("the sum of the subarray starting at index "+i+" is: "+sum);
        }
        System.out.println("the maximum sum of any subarray is: "+k);
    }
}
