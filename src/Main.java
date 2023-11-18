import java.util.Scanner;
public class Main {
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long factor = 1;
       int a = 1;
        for (long i = n; i  > 0 ; i--){
            factor = factor * i;
        }

        System.out.println(factor);
    }
}