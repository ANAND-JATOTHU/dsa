public class greatno2 {
    public static void main(String[] args) {
    int arr[]={7,7,7,7};
    boolean flag=false;
    int n=arr.length;
    int l=Integer.MIN_VALUE;
    int sl=Integer.MIN_VALUE;
        // Arrays.sort(arr);
    for (int i=0;i<n;i++){
        if (arr[i]>l){
            sl=l;
            l=arr[i];
            
        }
        else if (arr[i]>sl && arr[i]!=l){
            sl=arr[i];
            flag=true;
        }
    }
    if (flag==true)
    System.out.println(sl);
    else
    System.out.println("no second largest element");
}
}
