import java.util.Scanner;

class Demo {


    public static boolean isPrime(int n) {
        if (n < 1) {
            throw new IllegalArgumentException(n + " is not a natural number");
        }

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        for (String arg : args) {
//            // TODO: Delete line below and write your own solution.
//            System.out.println("Not implemented");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println(isPrime(sc.nextInt()));
        sc.close();
    }
}