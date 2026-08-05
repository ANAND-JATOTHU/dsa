class max_sub_arrays {
    public static void main(String[] args) {
	int arr[]={1,2,3,4};
	int n=arr.length;
	int sum=0;
	int maxsum=0;
	for(int i=0;i<n;i++)
	{
	for(int j=i;j<n;j++)
	{   sum=0;
	    for(int k=i;k<=j;k++)
	    {
	    System.out.print(arr[k]+" ");
	        sum=sum+arr[k];
	    }
	        if(sum>maxsum)
	        maxsum=sum;
	        System.out.print("--->"+sum);
	        System.out.println();
	    }
	}
	System.out.println(maxsum);
	
	}
}