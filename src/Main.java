
public class Main {

    public static int getResult(int[] a) {
       int sum = 0;
       for (int i = 2; i < a.length; i++){
           if (isPrime(i)){
               sum += a[i];
           }
       }
       return sum;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
