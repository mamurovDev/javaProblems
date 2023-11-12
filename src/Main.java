import java.util.Scanner;

public class Main {

    public static double distanceToOrigin(double x, double y) {
        return x * x + y * y;
    }

    public static int compareDistances(double x1, double y1, double x2, double y2) {
        double distanceA = distanceToOrigin(x1, y1);
        double distanceB = distanceToOrigin(x2, y2);

        if (distanceA == distanceB) {
            return 0;
        } else if (distanceA < distanceB) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();

            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();

            int result = compareDistances(x1, y1, x2, y2);

            System.out.println(result);


        scanner.close();
    }
}
