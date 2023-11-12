import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double[] numbers = {x1, x2, y1};
        int countOfNegatives = 0;
        for (double num : numbers) {
           if (num < 0){
               countOfNegatives += 1;
           }
        }
        System.out.println(countOfNegatives);
    }
}
