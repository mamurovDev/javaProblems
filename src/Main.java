import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if ( (h >= 0  && h < 24) && (m < 60 && m >= 0)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
