import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        int c = (a < b) ? 7 : 8;
        scanner.close();
        System.out.println(a + " " +  b);
        System.out.print(c);
    }
}