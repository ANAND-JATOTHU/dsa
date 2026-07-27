public class isprime {
    public static void main(String[] args) {
        int num=4;
        boolean flag=false;
        for (int i=2;i*i<=num;i++){
            if (num%i==0){
                flag=true;
                break;
            }
        }
        if (flag==false)
            System.out.println(num+" is prime");
        else
            System.out.println(num+" is not prime");
    }
}
