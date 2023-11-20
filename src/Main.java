import java.util.Arrays;
class Main {

    /**
     * @param a the given array, containing an even number of elements
     * @return max(a[0] + a[n - 1], ..., a[n/2 - 1] + a[n/2])
     */
    public static void compress(int[] a) {
        int n = a.length;

        // Create a temporary array to store the compressed result
        int[] result = new int[n];

        // Initialize indices for even and odd positions in the result array
        int evenIndex = 0;
        int oddIndex = n / 2;

        // Iterate through the original array and compress elements
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Even index, copy the element to the first half
                result[evenIndex++] = a[i];
            } else {
                // Odd index, replace with zero in the second half
                result[oddIndex++] = 0;
            }
        }

        // Copy the compressed result back to the original array
        System.arraycopy(result, 0, a, 0, n);
    }

}
