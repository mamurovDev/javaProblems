import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double a = scanner.nextDouble();

        String result;

        if (a >= 0) {
            result = formatResult(square(a));
        } else {
            result = formatResult(fourthPower(a));
        }

        System.out.println(result);
    }

    public static double square(double number) {
        return number * number;
    }

    public static double fourthPower(double number) {
        double squared = number * number;
        return squared * squared;
    }

    public static String formatResult(double result) {
        String resultStr = String.format("%.3f", result);
        return resultStr;
    }
}
