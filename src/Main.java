
public class Main {


    public static int getResult(int k, int a[]) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                result = result + a[i];
            }
        }
        return result;
    }
}
