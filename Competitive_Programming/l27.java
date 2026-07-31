

public class l27 {
    

    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int[] res=new int[n];
        int k=0;
        // int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                res[k++]=nums[i];
                // c++;
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=res[i];
        }
    return k;
    }

    public static void main(String[] args) {
        l27 obj=new l27();
        int[] nums={3,2,2,3};
        int val=3;
        int k=obj.removeElement(nums,val);
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
