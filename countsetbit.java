public class countsetbit {
    public static void main(String[] args) {
        int num = 5;
        int count = 0;
        while (num > 0) {
            if((num&1) == 1) {
                count++;
            }
            num >>= 1;
        }
        System.out.println("The number of set bits is " + count);
    }
}
