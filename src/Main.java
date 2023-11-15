import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double smallest = findSmallest(a, b, c);
        double largest = findLargest(a, b, c);
        double sum = (smallest + largest);
        double roundedValue = roundToThreeDecimals(sum);

        System.out.printf("%.3f%n", roundedValue);

        scanner.close();
    }

    private static double roundToThreeDecimals(double value) {
        double scale = 1000.0;
        return (double) ((int) (value * scale)) / scale;
    }
    private static double findSmallest(double a, double b, double c) {
        return (a <= b && a <= c) ? a : ((b <= a && b <= c) ? b : c);
    }
    private static double findLargest(double a, double b, double c) {
        return (a >= b && a >= c) ? a : ((b >= a && b >= c) ? b : c);
    }
}
