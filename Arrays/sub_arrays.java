public class sub_arrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int n=arr.length;
        int k=0;
        for (int i=0;i<n;i++){
            for (int j=i; j<n;j++){
                for (k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");

                }
                System.out.println("");
            }
            System.out.println();
        }
    }
}
