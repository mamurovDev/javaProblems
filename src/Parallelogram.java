import java.util.Scanner;

class Parallelogram {
    protected double a;
    protected double b;
    protected double angle;

    // Parameterized constructor
    public Parallelogram(double a, double b, double angle) {
        this.a = a;
        this.b = b;
        this.angle = angle;
    }

    // Method to calculate perimeter
    public double perimeter() {
        return (a + b) * 2;
    }

    // Method to calculate area
    public double area() {
        return a * b * Math.sin(Math.toRadians(angle));
    }
}

// Adding 'extends' in the class header
class Rectangle extends Parallelogram {
    // Parameterized constructor with super() statement
    public Rectangle(double a, double b) {
        super(a, b, 90); // Rectangle has a fixed angle of 90 degrees
    }
}

// Adding 'extends' in the class header
class Rhombus extends Parallelogram {
    // Parameterized constructor with super() statement
    public Rhombus(double a, double angle) {
        super(a, a, angle); // Rhombus has equal sides, so b is set to a
    }
}

// Adding 'extends' in the class header
class Square extends Rectangle {
    // Parameterized constructor with super() statement
    public Square(double side) {
        super(side, side); // Square has equal sides, so both a and b are set to side
    }
}

class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double alpha = sc.nextDouble();

            // Create an array with 4 elements: parallelogram, rectangle, rhombus, square,
            // and initialize them with input values.
            Parallelogram parallelogram = new Parallelogram(a, b, alpha);
            Rectangle rectangle = new Rectangle(a, b);
            Rhombus rhombus = new Rhombus(a, alpha);
            Square square = new Square(a);

            // Calculate the sums of perimeters and areas of the array elements
            double perimeterSum = parallelogram.perimeter() + rectangle.perimeter() + rhombus.perimeter() + square.perimeter();
            double areaSum = parallelogram.area() + rectangle.area() + rhombus.area() + square.area();

            // Output them rounded to 3 decimal places through a space
            System.out.printf("%.3f %.3f%n", perimeterSum, areaSum);
        }
    }
}
