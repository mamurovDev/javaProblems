
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(); // Replace with your value for 'a'
        double b = scanner.nextDouble(); // Replace with your value for 'b'
        double x = scanner.nextDouble(); // Replace with your value for 'x'

        // Test Case 1
        double result1 = calculateAndRoundAbsoluteValue(a, b, x);
        System.out.printf("%.3f%n", result1);

    }

    public static double calculateAndRoundAbsoluteValue(double a, double b, double x) {
        double result = a * x + b;

        if (result < 0) {
            result = -result;
        }

        double roundedResult = roundToThreeDecimalPlaces(result);
        return roundedResult;
    }

    public static double roundToThreeDecimalPlaces(double num) {
        double multiplier = 1000.0;
        double roundedNum = num * multiplier;

        roundedNum += (num < 0) ? -0.5 : 0.5;

        int roundedInt = (int) roundedNum;

        return roundedInt / multiplier;
    }

}
