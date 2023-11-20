
public class Main {


    public static int[] getResult(int a[], int k) {
        int[] result = new int[k];
        int count = 0;

        for (int i = 0; i < a.length && count < k; i++) {
            if (a[i] > 0) {
                result[count] = a[i];
                count++;
            }
        }

        return result;
    }
}
