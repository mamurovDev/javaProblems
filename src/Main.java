import java.util.Arrays;
class Main {

    /**
     * @param a the given array, containing an even number of elements
     * @return max(a[0] + a[n - 1], ..., a[n/2 - 1] + a[n/2])
     */
    public static int getResult(int[] a) {
        if (a.length == 0) {
            // Handle the case of an empty array
            return 0;
        }

        // Find the minimum element in the array
        int minElement = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < minElement) {
                minElement = a[i];
            }
        }

        // Count the number of elements greater than the minimum element
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > minElement) {
                count++;
            }
        }

        return count;
    }

}
