import java.util.Scanner;
public class Main {
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();


        for (int i = 1; i <= m; i ++){
            if (m % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}