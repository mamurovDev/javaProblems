import java.util.ArrayList;

class Main {



    public static void sort(int[] a, int k) {
        for (int i = 1; i <= k; i++) {
            int currentValue = a[i];
            int previousIndex = i - 1;

            while (previousIndex >= 0 && a[previousIndex] > currentValue) {
                a[previousIndex + 1] = a[previousIndex];
                previousIndex--;
            }
            a[previousIndex + 1] = currentValue;
        }
    }


}





