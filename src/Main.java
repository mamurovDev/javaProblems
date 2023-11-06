import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a * a <= b * b) {
            System.out.println(a);;
        } else {
            System.out.println(b);;
        }
        scanner.close();
    }


}