public class Superfactorial {
    int n=0;
    // public class SuperFactorial {
        // int n=0;
        public int fact(int n) {
            if(n==0) {
                return 1;
            }
            
            return n*fact(n-1);
        }
        public int superfact(int n) {
            if(n==0) {
                return 1;
            }
            
            return fact(n)*superfact(n-1);
        }
    // }
    public static void main(String[] args) {
        Superfactorial f=new Superfactorial();
        // SuperFactorial sf=f.new SuperFactorial();
        int result=f.superfact(4);
        System.out.println(result);
        
    }
}
