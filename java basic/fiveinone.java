import java.util.Scanner;
public class fiveinone {

    static int add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers with space between them");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a + b;
    }
    static String prime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            return "Prime";
        } else {
            return "Not Prime";
        }
    }
    static int factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    static int fibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        return fibonacci(n);
    }

    static int fibonacci(int n) {
        int a = 0, b = 1, f=0;
        for (int i = 1; i <= n; i++) {
            f = a + b;
            a = b;
            b = f;
        }
        return f;
    }

    static int fun(int a, int b) {
        return a + b;
    }
    static int fun(int a) {
            return a * 2;
            }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:1 to 5 and 0 to exit");
        System.err.println("0. Exit\n1. Add\n2. Prime\n3. Factorial\n4. Fibonacci\n5. Method Overriding");
        int n = sc.nextInt(); 
        switch (n) {
            case 0:
                System.out.println("Exit");
                break;
            case 1:
                System.out.println("Sum: " + add());
                break;
            case 2:
                System.out.println("Prime: " + prime());
                break;
            case 3:
                System.out.println("Factorial: " + factorial());
                break;
            case 4:
                System.out.println("Fibonacci: " + fibonacci());
                break;
            case 5:
                System.out.println("Enter two numbers for method overriding with space between them");
                Scanner sc1 = new Scanner(System.in);
                int a = sc1.nextInt();
                int b = sc1.nextInt();
                System.out.print(fun(a) + " " + fun(a, b));
                break;
            
            default:
                System.out.println("Invalid input");
        }
    }
}

