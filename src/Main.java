
public class Main {


    public static void swapMinAndMax(int[] a) {
        if (a == null || a.length < 2) {
            return;
        }

        int minIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            }
        }

        int temp = a[minIndex];
        a[minIndex] = a[maxIndex];
        a[maxIndex] = temp;
    }

}
