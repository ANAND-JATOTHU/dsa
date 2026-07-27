import java.util.Scanner;


public class pal_res {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int o = n;
        int r = 0;
        while (n != 0) {
            int d = n % 10;
            r = r * 10 + d;
            n = n / 10;
        }
        if (r == o) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        System.out.println("Number of digits: " + countDigits(o));
        sc.close();
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
