public class n {
    public static void main(String[] args) {
       int count = 0;
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if ((i + j) % 2 == 0)
            count++;
    }
}
System.out.println(count);

        
    }
}