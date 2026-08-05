public class stringoverlapping {
    public static void main(String[] args) {
        int k=4;
        String s="abcdefgh";
        String res=overlapping(s,k);
        System.out.println(res);
    }
    static String overlapping(String s, int k) {
        int n=s.length();
        for (int i=0;i<n-k+1;i++){
            // if(i<=k){
            //     continue;
            // }
            // else{
                String res=s.substring(i,k+i);
                System.out.print(res+" ");
            // }

        }
        return "";
    }
}
