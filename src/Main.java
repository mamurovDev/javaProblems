import java.util.ArrayList;

class Main {



    public static void sort(int[] a, int k) {
        if (a == null || a.length <= 1 || k <= 0 || k >= a.length) {
            // Invalid input, do nothing
            return;
        }

        for (int i = 0; i < k; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }

}
