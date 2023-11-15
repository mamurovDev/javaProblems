import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float d = scanner.nextFloat();


        double result = roundToThreeDecimals(findMax(d - a, d -b, d - c));
        System.out.print(String.format("%.3f", result));
    }
    private static double roundToThreeDecimals(double value) {
        double scale = 1000;
        return (double) ((int) (value * scale)) / scale;
    }
    public static double findMax(double a, double b, double c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    };
}
