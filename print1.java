public class print1 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int d = add(a,b);
        System.out.println(d);
    }
    
    public static int add(int a, int b) {
        int c = a + b;
        System.out.println(c);
        return c;
    }
}