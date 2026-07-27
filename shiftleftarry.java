import java.util.Scanner;
class shiftleftarry
{
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int temp;
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp; 
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
       //https://leetcode.com/problems/range-sum-query-immutable/submissions/1992497263/
    }
}