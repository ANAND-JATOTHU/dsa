
public class sort0and1 {
    public static void main(String[] args) {
        int[]arr= {0,1,0,1,0,1,0,1};
        int n=arr.length;
        int l=0;
        int r=n-1;

        //using sorting method o(nlogn)
        // Arrays.sort(arr);


        //or 

        // using two pointer method o(n)

        //     while (l <= r) {
            
        //     if (arr[l] == 0) {
        //         l++;
        //     } 
            
        //     else if (arr[r] == 1) {
        //         r--;
        //     } 
            
        //     else {
        //         int temp = arr[l];
        //         arr[l] = arr[r];
        //         arr[r] = temp;
        //         l++;
        //         r--;
        //     }
        // }


        //or
        // using two pointer method o(n)
        // while(l<r){
        //     while(arr[l]==0 && l<r){
        //         l++;
        //     }
        //     while(arr[r]==1 && l<r){
        //         r--;
        //     }
        //     if(l<r){
        //         int temp=arr[l];
        //         arr[l]=arr[r];
        //         arr[r]=temp;
        //         l++;
        //         r--;
        //     }
        // }


        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    
}}

