import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextLong();

        char mostSignificantDigit = findMostSignificantDigit(number);

        System.out.println(mostSignificantDigit);

        scanner.close();
    }

    private static char findMostSignificantDigit(long number) {
        String numberAsString = Long.toString(Math.abs(number));

        char mostSignificantDigit = numberAsString.charAt(0);

        return mostSignificantDigit;
    }
}
