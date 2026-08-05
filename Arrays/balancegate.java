class balancegate{
    public static void main(String[] args) {
        String s="";
        String res=balanced(s);
        System.out.println(res);
    }
    static String balanced(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                c++;
            }else if(s.charAt(i)==')'){
                c--;
            }
            if(c<0){
                return "Not Balanced";
            }
        }
        if(c==0){
            return "Balanced";
        }else{
            return "Not Balanced";
        }
    }
}