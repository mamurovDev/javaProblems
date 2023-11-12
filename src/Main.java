import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();
        boolean[] numbers = new boolean[3];
        numbers[0] = isMultipleOfK(a, k);
        numbers[1] = isMultipleOfK(b, k);
        numbers[2] = isMultipleOfK(c, k);

        for (boolean item : numbers){
            System.out.print(item + " ");
        }
    }


    public static boolean isMultipleOfK(int a, int k){
        return a % k == 0;
    }
}
