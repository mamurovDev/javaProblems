import java.util.Scanner;

class Main {


        public static int compareRectangles(double x1, double y1, double x2, double y2) {
            double area1 = x1 * y1;
            double area2 = x2 * y2;

            if (area1 == area2) {
                return 0; // The areas are equal
            } else if (area1 > area2) {
                return 1; // Rectangle 1 has a greater area
            } else {
                return -1; // Rectangle 2 has a greater area
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double x1 = sc.nextDouble(); // Replace with the actual values for rectangle 1
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble(); // Replace with the actual values for rectangle 2
            double y2 = sc.nextDouble();

            int result = compareRectangles(x1, y1, x2, y2);
            System.out.println(result);
        }

}