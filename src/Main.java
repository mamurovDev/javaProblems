import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(findMax(findMin(a,b), findMin(c, d)));

    }
    public static int findMax(int a,  int b){
        return a > b ? a : b;
    };
    public static int findMin(int a,  int b){
        return a < b ? a : b;
    };
}
