

import java.util.*;

public class Sol {

    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        float r1,r2;
        float D=b*b-4*a*c;
        if (D > 0){
            System.out.print("Real and Distinct");
            r1=(float) ((-b+Math.sqrt(D))/(2*a));
            r2=(float) ((-b-Math.sqrt(D))/(2*a));
            System.out.println(String.format("%.2f %.2f",r1,r2));
        }
        else if (D == 0){
            System.out.print("Real and Equal");
        }
        else if (D < 0){
            System.out.print("Complex Roots");
        }
    }
}